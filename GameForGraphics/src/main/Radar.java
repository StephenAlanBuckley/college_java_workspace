package main;

import java.util.List;
import java.util.Map;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

import net.VisualPlayer;
import Bats.Bat;
import Bats.Bats;
import Buildings.Point3D;
import Movement.Eye;
import PowerUps.PowerUps;
import Vehicles.Vehicle;
import Weapons.Turret;

public class Radar implements GLEventListener{
	private GLU glu = new GLU();
	private Map<String, VisualPlayer> onlinePlayers;
	private Player player;
	private List<Bats> bats;
	private PowerUps[] powerups;
	private PowerUps[] locos;
	private Turret[] turrets;
	private List<Vehicle> vehicles;

	public Radar(Map<String, VisualPlayer> onlinePlayers, Player player, List<Bats> bats, PowerUps[] powerups, Turret[] turrets, List<Vehicle> vechiles) {
		this.onlinePlayers = onlinePlayers;
		this.player = player;
		this.bats = bats;
		this.powerups = powerups;
		this.turrets = turrets;
		this.vehicles = vehicles;
		locos = new PowerUps[powerups.length];
		for(int i = 0; i<powerups.length; i++){
			if(powerups[i] != null && powerups[i].lokoPwp){
				this.locos[i] = powerups[i];
			}
		}
	}
	
	@Override
	public void init(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		gl.setSwapInterval(1); // for animation synchronized to refresh rate
		gl.glClearColor(0f, 0f, 0f, 1f); // black background
		gl.glEnable(GL2.GL_DEPTH_TEST);

	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		
		Eye eye = player.getEyeLocation();
		double x = eye.getX();
		double z = eye.getZ();
		
		int width = drawable.getWidth();
		int height = drawable.getHeight();
		
		gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho((x-width/2), (x+width/2), (z-height/2), (z+height/2), -1f, +1f);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
        
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);		
		gl.glLoadIdentity();
		
		gl.glPointSize(10f);
		
		//gl.glPushMatrix();
		//gl.glRotatef(player.getEyeLocation().getDirection(), 0,1,0);
		gl.glBegin(GL2.GL_POINTS);

			// draw visual players
			if (onlinePlayers != null) {
				gl.glColor3f(1f, 0f, 0f);
				for (VisualPlayer p : onlinePlayers.values()) {
					Point3D point = p.getLocation();
					gl.glVertex2d(point.getX(), point.getZ());
				}
			}
			
			//draw bats
			gl.glColor3f(0f,1f,0f);
			for(Bats b : bats) {
				gl.glVertex2f(b.getX(), b.getZ());
			}
			
			//draw powerups
			gl.glColor3f(1f,1f,0f);
			for (int i = 0; i < powerups.length; i++) {
				if(powerups[i] != null && !powerups[i].nullFlag()) {
					gl.glVertex2d(powerups[i].getX(), powerups[i].getZ());
				}
			}
			
			//draw 4loco!
			gl.glColor3f(1f,1f,1f);
			for (int i = 0; i < locos.length; i++) {
				if(locos[i] != null && !locos[i].nullFlag()) {
					gl.glVertex2d(locos[i].getX(), locos[i].getZ());
				}
			}
			
			//draw turrets
			gl.glColor3f(1f,0f,1f);
			for (int i = 0; i <turrets.length; i++) {
				if(turrets[i] != null) {
					gl.glVertex2d(turrets[i].getX(), turrets[i].getZ());
				}
			}
			
			/*
			//draw vehicles
			gl.glColor3f(.5f,.5f,.5f);
			for (Vehicle v : vehicles) {
				Point3D p = v.getLocation();
				gl.glVertex2d(p.getX(), p.getZ());
			}
			*/
			
			//draw player
			gl.glColor3f(0f,0f,1f);
			gl.glVertex2d(x, z);
			
		gl.glEnd();
		//gl.glPopMatrix();

		int error = gl.glGetError();
		if (error != GL2.GL_NO_ERROR) {
			System.out.println("OpenGL Error: " + glu.gluErrorString(error));
			System.exit(1);
		}
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		System.out.println("Reshaping Radar to " + width + "x" + height);
		
		GL2 gl = drawable.getGL().getGL2();
	      //gl.glViewport(x, y, width, height); // not necessary, jogl does this prior
	        gl.glMatrixMode(GL2.GL_PROJECTION);
	        gl.glLoadIdentity();
	        gl.glOrtho(0f, 150f, 0f, 150f, -1f, +1f);
	        gl.glMatrixMode(GL2.GL_MODELVIEW);
	        gl.glLoadIdentity();
	}

}
