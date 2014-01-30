package Vehicles;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.media.opengl.GL2;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

import main.Game;
import main.SketchupModelJAXB;

import Buildings.Point3D;
import Movement.Eye;
import Movement.WalkingBehavior;

public class MetalGear extends Vehicle {

	private final int NO_MOVE = 0;
	private final int MOVE_FORWARD = 1;
	private final int MOVE_BACKWARD = 2;
	private final int ROTATE_LEFT = 1;
	private final int ROTATE_RIGHT = 2;

	private int centerX, centerY;
	private static SketchupModelJAXB leftLeg;
	private static SketchupModelJAXB rightLeg;
	private static SketchupModelJAXB upperBody;
	private static SketchupModelJAXB lowerBody;
	private static SketchupModelJAXB middleBody;
	private Eye eye;
	private Game game;
	private GLCanvas canvas;
	private float tilt = 0;
	private float lookDirection = 90;
	private float moveDirection= 90;
	private double xLoc,yLoc,zLoc;
	private double cameraDistance;
	private double moveSpeed = 1;
	private double rotateSpeed = 1;
	private int forwardMotion, rotateMotion;
	private Robot robot;
	private boolean ignoreMouse;
	private Cursor invisibleCursor;
	private double t;
	
	public MetalGear(Game game, GLCanvas canvas, Eye eye, GL2 gl, GLU glu, double xLoc, double yLoc, double zLoc)
	{
		t=0;
		
		this.eye = eye;		
		this.game = game;
		this.canvas = canvas;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.zLoc = zLoc;
		
		cameraDistance = 40;
		
		centerX = 300;
		centerY = 300;
		rotateMotion = NO_MOVE;
		forwardMotion = NO_MOVE;
		
		leftLeg = new SketchupModelJAXB("luoRobot1LeftLeg.dae", gl, glu);
		rightLeg = new SketchupModelJAXB("luoRobot1RightLeg.dae", gl, glu);
		upperBody = new SketchupModelJAXB("luoRobot1UpperBody.dae", gl, glu);
		lowerBody = new SketchupModelJAXB("luoRobot1LowerBody.dae", gl, glu);
		middleBody = new SketchupModelJAXB("luoRobot1MiddleBody.dae", gl, glu);
		
		//set up invisible cursor
		byte[]imageByte=new byte[0];  
		Point myPoint=new Point(0,0);
		Image cursorImage=Toolkit.getDefaultToolkit().createImage(imageByte);
		invisibleCursor=Toolkit.getDefaultToolkit().createCustomCursor(cursorImage,myPoint,"cursor");
		canvas.setCursor(invisibleCursor);
		
		ignoreMouse = false;
		
		try{
			robot = new Robot();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void update(GL2 gl, GLU glu) {
		
		t=t+2;
	    this.updateLoc();
	    this.updateEyeLocation();
	    
	}

	public void updateLoc(){
		
		switch (forwardMotion) {
		case MOVE_FORWARD: 
		{
			xLoc = xLoc-Math.cos(Math.toRadians(moveDirection)*moveSpeed);
			zLoc = zLoc+Math.sin(Math.toRadians(moveDirection)*moveSpeed);
		}
		break;		
		case MOVE_BACKWARD: 
		{
			xLoc = xLoc+Math.cos(Math.toRadians(moveDirection)*moveSpeed);
			zLoc = zLoc-Math.sin(Math.toRadians(moveDirection)*moveSpeed);
		}	
		break;
		default:
			break;
		}
	
		switch (rotateMotion) {
		case ROTATE_LEFT: moveDirection++;
		break;
		case ROTATE_RIGHT: moveDirection--;
		break;
		default:
			break;
		}
	}
	public void updateEyeLocation(){

		eye.setTilt(tilt);
		eye.setDirection(-lookDirection);
		eye.setX(xLoc+Math.cos(Math.toRadians(lookDirection+180))*cameraDistance);
		eye.setY(yLoc+15-Math.sin(Math.toRadians(tilt))*cameraDistance/2);
		eye.setZ(zLoc+Math.sin(Math.toRadians(lookDirection+180))*cameraDistance);
	}
	
	public Eye getEyeLocation() {
		return eye;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		// forward
		case KeyEvent.VK_W:     forwardMotion = MOVE_FORWARD;
		break;

		// back
		case KeyEvent.VK_S:     forwardMotion = MOVE_BACKWARD;
		break;

		// strafe left
		case KeyEvent.VK_A:     rotateMotion = ROTATE_LEFT;
		break;

		// strafe right
		case KeyEvent.VK_D:     rotateMotion = ROTATE_RIGHT;
		break;
		
		case KeyEvent.VK_E:     game.exitVehicle(this);	
		break;
		// exit
		case KeyEvent.VK_ESCAPE: System.exit(0);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		// forward
		case KeyEvent.VK_W:     if (forwardMotion == MOVE_FORWARD) forwardMotion = NO_MOVE;
		break;

		// back
		case KeyEvent.VK_S:     if (forwardMotion == MOVE_BACKWARD) forwardMotion = NO_MOVE;
		break;

		// strafe left
		case KeyEvent.VK_A:     if (rotateMotion == ROTATE_LEFT) rotateMotion = NO_MOVE;
		break;

		// strafe right
		case KeyEvent.VK_D:     if (rotateMotion == ROTATE_RIGHT) rotateMotion = NO_MOVE;
		break;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(arg0.getButton() == MouseEvent.BUTTON3 || (arg0.isControlDown() && arg0.getButton() == MouseEvent.BUTTON1)){
			ignoreMouse = !ignoreMouse;
			if (!ignoreMouse)
				canvas.setCursor(invisibleCursor);
			else 
				canvas.setCursor(Cursor.getDefaultCursor());
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (!ignoreMouse) 
		{
			int dx = e.getXOnScreen() - centerX;
			lookDirection = (lookDirection + dx) % 360;
			
			
			int dy = e.getYOnScreen() - centerY;

			tilt = tilt-dy;
			if(tilt>45)
				tilt = 45;
			else if(tilt<-45)
				tilt = -45;
			//System.out.println(tilt);
			robot.mouseMove(centerX, centerY);
		}
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	public void draw(GL2 gl, GLU glu) {
		drawStill(gl, glu);
        update(gl,glu);
	}
	
	public void drawStill(GL2 gl, GLU glu) {

		gl.glPushMatrix(); 
        gl.glTranslated(xLoc, yLoc+8, zLoc);
        gl.glScalef(0.7f, 0.7f, 0.7f);
	        gl.glPushMatrix();
	    	  gl.glRotatef(-(lookDirection-90), 0, 1, 0);
		      	gl.glRotatef(-4*tilt/5,1,0,0);
		      	upperBody.draw(gl,glu);
		      	middleBody.draw(gl, glu);   
	        gl.glPopMatrix();

	        gl.glPushMatrix();
	          	gl.glRotatef(moveDirection-90, 0, 1, 0);
		      	lowerBody.draw(gl,glu);
		      	gl.glPushMatrix();
		      		if((forwardMotion!=NO_MOVE||rotateMotion!=NO_MOVE))
		      			gl.glRotated(Math.cos(Math.toRadians(t))*25, 1, 0, 0);
		      		leftLeg.draw(gl, glu);
		      	gl.glPopMatrix();
		      	
		      	gl.glPushMatrix();
	      		if((forwardMotion!=NO_MOVE||rotateMotion!=NO_MOVE))
	      			gl.glRotated(Math.sin(Math.toRadians(t))*25, 1, 0, 0);
		      		rightLeg.draw(gl,glu);
		      	gl.glPopMatrix();
	        gl.glPopMatrix();
        gl.glPopMatrix();
        
	}

	public Point3D getLocation() {
		return new Point3D(xLoc, yLoc, zLoc);
	}

	public void startListening() {
		canvas.addKeyListener(this);
		canvas.addMouseListener(this);
		canvas.addMouseMotionListener(this);
		canvas.addMouseWheelListener(this);
	}
	
	public void stopListening() {
		canvas.removeKeyListener(this);
		canvas.removeMouseListener(this);
		canvas.removeMouseMotionListener(this);
		canvas.removeMouseWheelListener(this);
	}

}
