/*
   CS333 Game
   Fall 2010
 */

package main;



import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.BroadcastServer;
import net.ClientListener;
import net.ClientSpeaker;
import net.DynamicObject;
import net.DynamicObjectEncoder;
import net.HandshakeClient;
import net.VisualPlayer;
import Bats.Bat;
import Bats.BatManager;
import Bats.Bats;
import Buildings.BaldoniBuilding;
import Buildings.Building;
import Buildings.CerboneBuilding;
import Buildings.ChengBuilding;
import Buildings.ColeBuilding;
import Buildings.DeMaioBuilding;
import Buildings.DonnellyBuilding;
import Buildings.EndresBuilding;
import Buildings.EpsteinBuilding;
import Buildings.FothergillBuilding;
import Buildings.GolderBuilding;
import Buildings.HernandezBuilding;
import Buildings.JengBuilding;
import Buildings.JungBuilding;
import Buildings.JungBuildings;
import Buildings.KayeBuilding;
import Buildings.KeemonBuilding;
import Buildings.KieltykaBuilding;
import Buildings.LuoBuilding;
import Buildings.MahonBuilding;
import Buildings.MahonTower;
import Buildings.MartinBuilding;
import Buildings.MccannBuilding;
import Buildings.MecheryBuilding;
import Buildings.MelvinTower;
import Buildings.ParkBuilding;
import Buildings.PerryBuilding;
import Buildings.Point3D;
import Buildings.RusBuilding;
import Buildings.Step;
import Buildings.StephanBuilding;
import Buildings.TextureHandler;
import Buildings.WestBuilding;
import Buildings.ZhangBuilding;
import Environment.CityGrid;
import Environment.SkyBox;
import Movement.ControlBehavior;
import Movement.Eye;
import Movement.EyeController;
import Movement.LookBehavior;
import PowerUps.Ammo;
import PowerUps.FourLoko;
import PowerUps.FreezeItem;
import PowerUps.HealthPack;
import PowerUps.HiddenPowerup;
import PowerUps.PowerUps;
import PowerUps.Star;
import Vehicles.Vehicle;
import Vehicles.VehicleSpawner;
import Weapons.ProjectileManager;
import Weapons.ProjectileObserver;
import Weapons.Turret;
import Weapons.Weapon;

import com.jogamp.opengl.util.FPSAnimator;

public class Game implements GLEventListener, ComponentListener, PlayerObserver, ProjectileObserver{
	private long startTime = System.nanoTime();
	private long elapsedTime=0;
	private List<Building> buildings = new LinkedList<Building>();
	private GLU glu = new GLU();
	private Player player;
	private Eye eye;
	private GLCanvas canvas;
	private GLCanvas mapCanvas;
	private JTextField status = new JTextField(10);
	private GameFrame mainFrame;
	private boolean init = true, online = false; // used to only init buildings once
	private ControlBehavior cb;
	private LookBehavior lb;
	private List<Bats> bats = new LinkedList<Bats>();
	private List<BatObserver> batObservers = new LinkedList<BatObserver>();
	private ClientListener listener;
	public ClientSpeaker speaker;
	private Map<String, DynamicObject> onlineObjects = Collections.synchronizedMap(new HashMap<String, DynamicObject>());
	private Map<String, VisualPlayer> onlinePlayers = null; //Will become deprecated
	private String id;
	private SkyBox skyBox;
	private GLUquadric quadric;
	private Turret[] turrets;
	public Sounds gameSounds;
	private Game game;
	private List<Vehicle> vehicleList = new LinkedList<Vehicle>();
	private EyeController eyeController;
	private ArrayList<Step> stepList = new ArrayList<Step>();
	private BroadcastServer b_server = new BroadcastServer();
	private BatManager batManage;

	private ProjectileManager  projectileManager = new ProjectileManager();

	private CityGrid cityGrid;

	
	//LEAVE THIS ALONE DAMN IT. IT MUST BE CHECKED OUTSIDE OF INIT TO NOT BREAK GAME COMPATIBILITY WITH LINUX
	//ALSO THIS BEHAVIOUR IS MORE LIKE AN ACTUAL GAME INSTEAD OF HALF LOADING THE HUD.
	private int response = JOptionPane.showConfirmDialog(null, "Do you want to play online?", "Networking", JOptionPane.YES_NO_OPTION);

	
	private PowerUps[] powerUps;
	private static final int NUM_POWERUPS = 11;
	private static final double PI = 3.14;
	private int[] xPU = {100, 200, 200, 200, 200, 300, 400, 400, 400,400}, 
				  yPU = {3, 3, 3, 3 ,3, 3, 3, 3, 3, 3}, 
				  zPU = {100, 200, 300, 400, 450, 100, 200, 300, 400, 450};
	private boolean fourLokoActive = false;
	private double drunk = 0;

	
	private int canvasHeight;
	private int canvasWidth;
	private boolean mapIsVisible = false;
	
	private boolean changeScene = false;
	private boolean nightSceneOn = false;
	
	private boolean fireWeapon = false;
	
	//we can change this number when bats are added and killed
	private int numBats = 0;

	
	//User Collision Stuff
	private UserCollision userC;
	private boolean firstDraw;
	
	public void init(GLAutoDrawable drawable) {
		// drawable.setGL(new DebugGL2(drawable.getGL().getGL2())); // to do
		// error check upon every GL call. Slow but useful.
	
		long initStartTime = System.currentTimeMillis();

		GL2 gl = drawable.getGL().getGL2();
		gl.setSwapInterval(1); // for animation synchronized to refresh rate
		gl.glClearColor(.6f, .6f, 1f, 1f); // sky blue background
		gl.glEnable(GL2.GL_DEPTH_TEST);

		gl.glTexEnvf(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE,
				GL2.GL_REPLACE); // or GL_MODULATE
		gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST); // or
																		// GL_FASTEST
		eye = player.getEyeLocation();
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL);
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE); 
		glu.gluQuadricTexture(quadric, false);
		if(response == JOptionPane.YES_OPTION)
		{
			System.out.println("Attempting to set up network...");
			online = true;
			id = HandshakeClient.getIDFromServer();
			System.out.println("Got ID: "+id);
			onlinePlayers = Collections.synchronizedMap(new HashMap<String, VisualPlayer>()); //Will be deprecated
			System.out.println("Empty map created...");
			//listener = new ClientListener(this);
			//listener.run();
			//System.out.println("Listener running...");
			speaker = new ClientSpeaker();
			System.out.println("Speaker created...\nNetwork setup complete.");
		}
		if (init) {
			init = false;
			
			TextureHandler.retrieveTextureHash();
			System.out.println("made skybox");
			skyBox = new SkyBox(gl, glu);

			Runtime.getRuntime().addShutdownHook(new Shutdown(buildings));	
			
			player.setDefaultWeapon();
			
			  // buildings.add(new StPetersBuilding(gl, glu)); // REALLY SLOW!  Just for testing, don't use for real.

			
			  buildings.add(new MelvinTower(gl, glu, 5, eye,25,0.1f,75)); 
			  buildings.add(new LuoBuilding(gl, glu));			 
			  buildings.add(new ColeBuilding(gl, glu));
			  buildings.add(new MccannBuilding(gl,glu)); 
			  buildings.add(new WestBuilding(gl, glu));
			  buildings.add(new MartinBuilding(gl, glu)); 
			  buildings.add(new ZhangBuilding(gl, glu)); 
			  buildings.add(new EndresBuilding(gl,glu)); 
			  buildings.add(new MahonBuilding(gl, glu)); 
			  buildings.add(new MahonTower(gl, glu)); 
			  buildings.add(new KayeBuilding(gl, glu));
			  buildings.add(new PerryBuilding(gl, glu)); 
			  buildings.add(new BaldoniBuilding(gl, glu)); 
			  buildings.add(new KeemonBuilding(gl, glu)); 
			  buildings.add(new ChengBuilding(gl, glu)); 
			  buildings.add(new MecheryBuilding(gl, glu));  
			  buildings.add(new DonnellyBuilding(gl, glu)); 
			  buildings.add(new JungBuildings(gl,glu)); 
			  buildings.add(new JungBuilding(gl, glu));
			  buildings.add(new JengBuilding(gl, glu)); 
			  buildings.add(new GolderBuilding(gl, glu));  
			  buildings.add(new StephanBuilding(gl,glu)); 
			  buildings.add(new DeMaioBuilding(gl, glu));
			  buildings.add(new ParkBuilding(gl, glu)); 
			  buildings.add(new RusBuilding(gl, glu)); 
			  buildings.add(new CerboneBuilding(gl, glu)); 
			  buildings.add(new FothergillBuilding(gl, glu));
			  buildings.add(new EpsteinBuilding(gl, glu));  
			  buildings.add(new HernandezBuilding(gl, glu));
			  buildings.add(new KieltykaBuilding(gl, glu));
			  cityGrid=new CityGrid(buildings,stepList);
			  powerUps = new PowerUps[NUM_POWERUPS];
			
			//this.mainFrame.getDim() returns the size of meniu portion of frame
//			int [] a = this.mainFrame.getDim();
//			for( int i : a)
//				System.out.println("YO: " + i);
			
			
		}
		
//		//collision stuff
//		userC = new UserCollision(this.mainFrame.getWidth(), this.mainFrame.getHeight(), this.mainFrame.getDim());
		
		
		
		VehicleSpawner.spawnVehicles(vehicleList, this, canvas, eye, gl, glu);
		eyeController = player;
		
		gameSounds = new Sounds(); //Will break if you comment this out!
		
		
		
		///If this is causing you problems, e-mail me: golderd@bc.edu so I can fix it. It's worked on multiple machines.
		turrets = new Turret[5];
		SketchupModelJAXB t= new SketchupModelJAXB("turret.dae", gl, glu);
		turrets[0]=new Turret(player, t, 143,58,0,glu,gl, gameSounds, quadric);
		turrets[1]=new Turret(player, t,203,101,0,glu,gl, gameSounds, quadric);
		turrets[2]=new Turret(player, t,200,292,0,glu,gl, gameSounds, quadric);
		turrets[3]=new Turret(player, t,298,298,0,glu,gl, gameSounds, quadric);
		turrets[4]=new Turret(player, t,376,399,0,glu,gl, gameSounds, quadric);
		
		//bat object init
		batManage = new BatManager(player, 600, 500);
		batManage.addBatObserver(mainFrame);
		bats = batManage.getBats();
		projectileManager.addProjectileObserver(this);
		
		
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("nux") || os.contains("mac")) {
			mainFrame.initRadarCanvas();
		}
		
		long initTime = System.currentTimeMillis()-initStartTime;
		System.out.println("Init time: " + initTime/1000f + " seconds");
	}

	private long time = System.currentTimeMillis();
	private int frameCount = 0;
	private int reportIntervalFrames = 100; // calculate frame rate every this
											// many frames

	public void display(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
			
		//User Collision
		//Look down, draw, and read buffer
		gl.glViewport(0, 0, canvasWidth, canvasHeight); 
		
		// Shouldn't clear the color buffer on single-buffer systems.
		// Since we're drawing the entire window, it should be OK.
		// Let me know if not clearing the color buffer causes problems (Ames)
		gl.glClear(/*GL.GL_COLOR_BUFFER_BIT |*/ GL.GL_DEPTH_BUFFER_BIT);
		
		// Find which buffer is currently in use.  There are a few cases where
		// this is not the back buffer.
		int[] currentBuffer = new int[1];
		gl.glGetIntegerv(GL2.GL_DRAW_BUFFER, currentBuffer, 0);
		
		gl.glDrawBuffer(GL2.GL_NONE);//only draw to depth buffer
		gl.glLoadIdentity();
		glu.gluLookAt(eye.getX(), eye.getY(), eye.getZ(), // eye location
				eye.getLookX(), 0, eye.getLookZ(), // looks down
				0.f, 1.f, 0.f); // the "up" direction
		firstDraw = true;
//		System.out.println("First draw");
		
		// comment out to turn collision detection off, frame rate will increase but its an important but of game to have.
		drawScene(gl, glu);
		userC.readBuff(gl);
		firstDraw = false;
//		System.out.println("2nd draw");
		//regular draw
		gl.glViewport(0, 0, canvasWidth, canvasHeight); 
		gl.glDrawBuffer(currentBuffer[0]); // restore the one that was in effect
		gl.glClear(GL.GL_DEPTH_BUFFER_BIT);		
		gl.glLoadIdentity();

		if(fourLokoActive){//When affected by Four Loko power-up, eye movements will changes.
			glu.gluLookAt(eye.getX(), eye.getY(), eye.getZ(),
					eye.getLookX(), eye.getLookY(), eye.getLookZ(), 
					Math.sin(PI*drunk)-.6, 1.f, 0);
			drunk+=.008;
			
		}
		else{
			glu.gluLookAt(eye.getX(), eye.getY(), eye.getZ(), // eye location
				eye.getLookX(), eye.getLookY(), eye.getLookZ(), // point to
																// look
																// through
				0.f, 1.f, 0.f); // the "up" direction
		}
		if (changeScene) {
			turnOnNightSceneInternal(nightSceneOn, gl);
		}
		skyBox.draw(gl,glu,eye);
		drawScene(gl, glu);
		
		eyeController.draw(gl,glu);
		
		dealWithPowerUps(gl, glu);	
		
		
		if (fireWeapon) {
			fireWeapon = false;
			handleWeaponShot(gl, glu);
		}
		
		//update bat location and makes it interact with player location
		batManage.setPlayLocation(eye);
		batManage.startRandomize(gl, glu);
		batManage.draw(gl, glu);
		batManage.attackPlayer();

		
		
		
		if (frameCount++ % reportIntervalFrames == 0) {
			long currentTime = System.currentTimeMillis();
			float framesPerSecond = (float) reportIntervalFrames
					/ (currentTime - time) * 1000f;
			time = currentTime;
			status.setText("Frames/sec: " + (int) framesPerSecond);
			mainFrame.setFramesPerSecond((int) framesPerSecond);
			System.out.println("Frames/sec: " + (int) framesPerSecond);
		}

		int error = gl.glGetError(); // check for errors, once per frame
		if (error != GL2.GL_NO_ERROR)
			System.out.println("OpenGL Error: " + glu.gluErrorString(error));
		if (mapIsVisible) {
			paintMapCanvas(gl, glu);
		}
		if(elapsedTime == 0)
			elapsedTime=System.nanoTime();
//		this.mainFrame.printDim();
//		System.out.println("Total Loading Time: " + ((elapsedTime - startTime)/1000000000 ));
		projectileManager.updateProjectiles(gl, glu);
		checkGameOver();
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width,
			int height) {
		GL2 gl = drawable.getGL().getGL2();
		System.out.println("Reshaping to " + width + "x" + height);
		
		//collision stuff
		userC = new UserCollision(width, height);
		
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		glu.gluPerspective(70., (float) width / height, .1, 1000.); // fov,
																	// aspect,
																	// near-clip,
																	// far clip
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		canvasHeight = height;
		canvasWidth = width;
	
		
		
	}

	public void dispose(GLAutoDrawable drawable) { /*
													 * ignore, nothing needed
													 * here
													 */
	}

	private void drawScene(GL2 gl, GLU glu) {
		cityGrid.draw(gl,glu,eye);
		for(int i=0; i<=turrets.length;i++)
			turretUpdate(turrets[i]);

		for (int i = 0; i< powerUps.length - 1; i++)  {
			if(powerUps[i] != null)
			powerUps[i].draw(gl, glu);
		}
		
		for (Vehicle veh: vehicleList)
		{
			veh.drawStill(gl, glu);
		}
		
		if(online)
		{
			drawDynamicObjects(gl, glu);
			b_server.broadcastData(DynamicObjectEncoder.toPacket("moveable", "move", id, eye.getPoint()));
		}
	}
	
	private void turretUpdate(Turret turret) {

		double zdiff = turret.getZ()-eye.getZ();
		if (zdiff>0)
			turret.setDirection(90+Math.toDegrees(Math.atan((turret.getX()-eye.getX())/(turret.getZ()-eye.getZ()))));
		else
			turret.setDirection(-90+Math.toDegrees(Math.atan((turret.getX()-eye.getX())/(turret.getZ()-eye.getZ()))));
	
		if(Math.abs(eye.getX()-turret.getX())<30 && Math.abs(eye.getZ()-turret.getZ())<30){
			turret.activate();
		}
		else
			turret.deactivate();
		turret.update(eye);
		
	}
	public boolean checkCollision(int dir)
	{
		if(dir==1)
			return userC.collisionHere(Direction.FORWARD);
		else if(dir==2)
			return userC.collisionHere(Direction.BACKWARD);
		else if(dir==6)
			return userC.collisionHere(Direction.LEFT);
		else if(dir==7)
			return userC.collisionHere(Direction.RIGHT);
		
		return false;
	}
	private void dealWithPowerUps(GL2 gl, GLU glu){
		fourLokoActive = false;
		for (int i = 0; i< powerUps.length - 1; i++) {
			if(powerUps[i] != null){
				powerUps[i].pickedUp(gameSounds);
				powerUps[i].effects();
				if(powerUps[i].getLokoActive()){
					fourLokoActive = true;
				}
				if(powerUps[i].nullFlag()){

					powerUps[i] = null;
				}
			}
			if(powerUps[i] == null && frameCount % 400 == 0){//respawn every 400 frames
				double rand = Math.random();
				//if(rand <= .6)//for testing one power up at a time only.
					//powerUps[i] = new FourLoko(xPU[i],yPU[i],zPU[i], player, gl, glu);
				if(rand <= .2)
					powerUps[i] = new FourLoko(xPU[i],yPU[i],zPU[i], player, gl, glu);
				else if(rand > .2 && rand <= .4)
					powerUps[i] = new Ammo(xPU[i],yPU[i],zPU[i], player, gl, glu);
				else if(rand > .4 && rand <= .6)
					powerUps[i] = new FreezeItem(xPU[i],yPU[i],zPU[i], player, gl, glu);
				else if(rand > .6 && rand <= .8)
					powerUps[i] = new HealthPack(xPU[i],yPU[i],zPU[i], player, gl, glu);
				else if(rand > .8 && rand <= 1)
					powerUps[i] = new Star(xPU[i],yPU[i],zPU[i], player, gl, glu);
				else if(rand > .9 && rand <= 1)
					powerUps[i] = new HiddenPowerup(xPU[i],yPU[i],zPU[i], player, gl, glu);
			}
		}
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	public void updateOnlinePlayers(Map<String, VisualPlayer> players) //Seems superfluous
	{
		//Seems superfluous
			onlinePlayers = players;
			System.out.println("Players updated");
	}
	
	public Map<String, VisualPlayer> getOnlinePlayers() //Will be deprecated
	{
		return onlinePlayers;
	}
	
	public Map<String, DynamicObject> getOnlineObjects()
	{
		return onlineObjects;
	}
	
	public void drawOnlinePlayers(GL2 gl, GLU glu)
	{
			for(VisualPlayer player : onlinePlayers.values())
				player.draw(gl, glu, quadric);
	}
	
	public void drawDynamicObjects(GL2 gl, GLU glu)
	{
		//System.out.println("Dynobj");
		for(String obj : onlineObjects.keySet())
		{
			if(!obj.equals(id))
				onlineObjects.get(obj).draw(gl, glu, quadric);
			//System.out.println("Drew object");
		}
	}

	private void paintMapCanvas(GL2 gl, GLU glu) {
		gl.glClear(GL2.GL_DEPTH_BUFFER_BIT);
		gl.glViewport(canvasWidth - 150, 0, 150, 150);
		gl.glLoadIdentity();
		glu.gluLookAt(eye.getX(), 300, eye.getZ(), // eye location
				eye.getX(), 0, eye.getZ(), // point to look through
				0.f, 0.f, 1.f); // the "up" direction

		drawScene(gl, glu);
	}

	public GLCanvas getCanvas() {
		return canvas; 
	}
	
	public GLU getGLU()
	{
		return glu;
	}
	
	public List<Bats> getBats() { return bats; }
	
	public ArrayList<Step> stepList() { return stepList; }
	
	public PowerUps[] getPowerups() { return powerUps; }
	
	public Turret[] getTurrets() { return turrets; }
	
	public List<Vehicle> getVehicles() { return vehicleList; }
	
	private void turnOnNightSceneInternal(boolean turnOn, GL2 gl) {
		if (turnOn) {
			skyBox.loadNightTexture(gl);
		} else {
			skyBox.loadDayTexture(gl);
		}
		changeScene = false;
	}
	public void turnOnNightScene(boolean turnOn) {
		nightSceneOn = turnOn;
		changeScene = true;
	}
	
	public void fireWeapon() {
		fireWeapon = true;
		
	}
	
	public void reloadWeapon() {
		mainFrame.updateBulletCount();
	}

	/*
	 * This method would handle a weapon shot and if the shot hit a bat or other
	 * creature.
	 */
	private void handleWeaponShot(GL2 gl, GLU glu) {
		System.out.println("Shot Fired!!");
		gameSounds.gunshot.play();
		player.fireWeapon();
		
	}
	
	private void checkGameOver(){
		int health = player.getHealth();
		if(health == 0)
			gameOver();
		//should be uncommented once there is a list of bats to check for all bats killed
		//if(bats.isEmpty())
		//	gameOver();
		
	}
	
	public void gameOver(){ 
		int r = JOptionPane.showConfirmDialog(null, "Game Over! Would you like to play again?", "Game Over", JOptionPane.YES_NO_OPTION);
		if(r == JOptionPane.YES_OPTION)
			player.setHealth(100);
			//needs to create a new list of bats
		else
			gameSounds.endSounds();
			System.exit(0);
			
			
	}
	
	public static void main(String args[]) {
		//this try catch is for running the game from a jar, if an error occurs, then the game is not running from the jar
		try {
			getNecessaryJOGLFiles();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		GLProfile.initSingleton();
		System.setProperty("sun.awt.noerasebackground", "true");
		Game game = new Game();

		GLCapabilities capabilities = new GLCapabilities(null);
		System.out.println("Default   capabilities: " + capabilities);
		capabilities.setDepthBits(16); // at least 16 bits of depth buffer
										// required (24 would be nicer...)
		// capabilities.setStencilBits(1); // at least 1 stencil bit desired. If
		// this causes a crash, let Prof Ames know
		System.out.println("Requested capabilities: " + capabilities);
		game.canvas = new GLCanvas(capabilities);

		
		game.player = new Player(game, game.canvas, new Eye(255,5,450));
		game.player.addPlayerObserver(game);
		game.setControlBehavior(game.player.getControlBehavior());
		game.setLookBehavior(game.player.getLookBehavior());
		
		game.canvas.addGLEventListener(game);
		
		game.canvas.addComponentListener(game);
		game.canvas.setPreferredSize(new Dimension(550, 550));

		game.mainFrame = new GameFrame(game,game.canvas, "The Project");
		
		game.mainFrame.addCanvas(game.canvas);
		game.mainFrame.addCheatsObserver(game.player);
		game.player.addPlayerObserver(game.mainFrame);
		game.addBatObserver(game.mainFrame);
		game.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// mainFrame.pack();
		game.mainFrame.setVisible(true);
		FPSAnimator fpsAnimator= new FPSAnimator(game.canvas, 60);
		fpsAnimator.start();
		game.canvas.requestFocus(); // so key clicks come here
		new ClientListener(game).run();
	}

	@Override
	public void componentHidden(ComponentEvent e) {
	}

	@Override
	public void componentMoved(ComponentEvent e) {
	}

	@Override
	public void componentResized(ComponentEvent e) {
		if (canvas.getSize().getWidth() < canvas.getPreferredSize().getWidth()
				|| canvas.getSize().getHeight() < canvas.getPreferredSize()
						.getHeight()) {
			mainFrame.pack();
		}
	}

	@Override
	public void componentShown(ComponentEvent e) {
	}

	public ControlBehavior getControlBehavior() {
		return cb;
	}
	
	public LookBehavior getLookBehavior() {
		return lb;
	}

	public void setControlBehavior(ControlBehavior cb) {
		this.cb = cb;
	}
	
	public void setLookBehavior(LookBehavior lb)
	{
		this.lb = lb;
	}

	public int getFrameCount() {
		return frameCount;
	}
	
	public void addBatObserver(BatObserver obs){
		batObservers.add(obs);
		obs.updateBatCount(numBats);
	}

	@Override
	public void updateWeaponChange(Weapon w) {
	}
	
	@Override
	public void updateBulletCount() {
	}

	@Override
	public void updateWeaponFired() {
	}

	@Override
	public void updateHealth(int health) {
	}

	@Override
	public void updateControlBehavior(ControlBehavior cb) {
		this.cb = cb;
	}
	
	public void mapSetVisible(boolean turnOn) {
		mapIsVisible = turnOn;
	}
	
	public boolean mapIsVisible() {
		return mapIsVisible;
	}
	
	public static void getNecessaryJOGLFiles() throws Exception {
		/*
		 * We need to decide if the game is being run from a jar or not
		 */
		if (!Game.class.getResource("Game.class").toString().startsWith("jar")) {
			System.out.println("This file is not running from the jar");
			return;
		}
		String[] jogl = null;
		String[] mac = {	"libgluegen-rt.jnilib", "libjogl_desktop.jnilib", "libjogl_gl2es12.jnilib", "libnativewindow_awt.jnilib", "libnewt.jnilib" };
		String[] linux = {	"libgluegen-rt.so",	"libjogl_desktop.so", "libjogl_gl2es12.so", "libnativewindow_awt.so", "libnativewindow_x11.so", "libnewt.so" };
		String[] windows = {	"gluegen-rt.dll","jogl_desktop.dll", "jogl_gl2es12.dll", "nativewindow_awt.dll", "newt.dll" };
		
		String os = System.getProperty("os.name").toLowerCase();
		
		if (os.contains("nux")) {
			jogl = linux;
		} else if (os.contains("mac")) {
			jogl = mac;
		} else if (!os.contains("nux") && !os.contains("mac")) {
			jogl = windows;
		} else {
			System.out.println("The os name assumptions are wrong");
			System.exit(1);
		}
		
		String dir = System.getProperty("user.dir");

		String libraries = System.getProperty("java.library.path");
		System.setProperty("java.library.path", libraries + File.pathSeparator + dir);
		libraries = System.getProperty("java.library.path");
		String[] libs = libraries.split(":");
		for (int i = 0; i <libs.length; i++) {
			System.out.println("Path: " + libs[i]);
			File f = new File(libs[i]);
			if (f.canWrite()) {
				dir = libs[i];
				break;
			}
		}
		for (int i = 0; i < jogl.length; i++) {
			getFile(jogl[i], dir);
		}
	}
	
	public static void getFile(String name, String dir) throws Exception {
		File f = new File(dir + "/" + name);
		System.out.println("File Path  : " + f.getPath());
		if (f.exists()) {
			//do nothing
		} else if (f.createNewFile()) {
			f.deleteOnExit();
			System.out.println("New file created:  " + f.getPath());
		}
		f.mkdirs();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
		BufferedInputStream bis = new BufferedInputStream(is);
		OutputStream os = new BufferedOutputStream(new FileOutputStream(f));
		
		byte[] data = new byte[1024];
		int count = 0;
		while ((count = bis.read(data)) != -1) {
			os.write(data, 0, count);
		}
		
		bis.close();
		is.close();
		os.close();
		System.out.println("Created: " + f.getPath());
	}
	
	public void enterVehicle() {
		Double proximityDist = 200.;
		Vehicle closestVehicle = null;
		Double closestDistance = Double.MAX_VALUE;
		
		for(Vehicle veh: vehicleList){

			if(eye.getPoint().calcDistance(veh.getLocation())<Math.min(closestDistance,proximityDist)){
				
				closestDistance = eye.getPoint().calcDistance(veh.getLocation());
				closestVehicle = veh;
			}
		}
		if(closestVehicle!=null){
			eyeController.stopListening();
			eyeController = closestVehicle;
			eyeController.startListening();
			vehicleList.remove(closestVehicle);
		}
	}
	
	public void exitVehicle(Vehicle veh){
		eyeController.stopListening();
		eyeController = player;
		Point3D nearbyLoc = new Point3D(veh.getLocation().getX()+5,5,veh.getLocation().getZ());
		player.setEyeLocation(nearbyLoc);
		eyeController.startListening();
		vehicleList.add(veh);	
	}

	@Override
	public void updateProjectile(double x, double y, double z) {
		// TODO Auto-generated method stub
		batManage.updateProjectile(x, y, z);
	}
	
}