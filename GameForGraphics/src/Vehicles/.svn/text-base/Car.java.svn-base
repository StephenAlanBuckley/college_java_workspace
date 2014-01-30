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

public abstract class Car extends Vehicle {

	private final int NO_MOVE = 0;
	private final int MOVE_FORWARD = 1;
	private final int MOVE_BACKWARD = 2;
	private final int ROTATE_LEFT = 1;
	private final int ROTATE_RIGHT = 2;
	
	
	private SketchupModelJAXB car;
	private Eye eye;
	private Game game;
	private GLCanvas canvas;
	private float moveDirection = 90;
	private double xLoc,yLoc,zLoc;
	private double cameraDistance;
	private double moveSpeed;
	private double acceleration;
	private double accelerationRate;
	private int forwardMotion, rotateMotion;
	private int maxSpeed;
	private int maxAccel;
	private int rotateSpeed;
	
	public Car(Game game, GLCanvas canvas, Eye eye, GL2 gl, GLU glu, 
		double xLoc, double yLoc, double zLoc,
		int maxSpeed, int maxAccel, int rotateSpeed, double accelerationRate,
		SketchupModelJAXB car)
	{

		this.eye = eye;		
		this.game = game;
		this.canvas = canvas;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.zLoc = zLoc;
		
		cameraDistance = 40;
		moveSpeed = 0;
		acceleration = 0;
		
		rotateMotion = NO_MOVE;
		forwardMotion = NO_MOVE;
		
		this.car = car;
		this.rotateSpeed = rotateSpeed;
		this.maxSpeed = maxSpeed;
		this.maxAccel = maxAccel;
		this.accelerationRate = acceleration;

		
	}
	
	public void draw(GL2 gl, GLU glu) {
		drawStill(gl, glu);
        update(gl,glu);
	}

	@Override
	public Point3D getLocation() {
		return new Point3D(xLoc, yLoc, zLoc);
	}

	@Override
	public void stopListening() {
		canvas.removeKeyListener(this);
		canvas.removeMouseListener(this);
		canvas.removeMouseMotionListener(this);
		canvas.removeMouseWheelListener(this);
	}

	@Override
	public void startListening() {
		canvas.addKeyListener(this);
		canvas.addMouseListener(this);
		canvas.addMouseMotionListener(this);
		canvas.addMouseWheelListener(this);
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
		
		case KeyEvent.VK_SHIFT: {moveSpeed = moveSpeed/2;}
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
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawStill(GL2 gl, GLU glu) {
		gl.glPushMatrix();
			gl.glTranslated(xLoc, 0, zLoc);
			gl.glRotatef(-moveDirection+90,0,1,0);
			car.draw(gl,glu); 
      	gl.glPopMatrix();
	}
	
	private void update(GL2 gl, GLU glu) {
		
	    this.updateLoc();
	    this.updateEyeLocation();
	    
	}

	public void updateLoc(){
		
		xLoc = xLoc+Math.cos(Math.toRadians(-moveDirection))*moveSpeed;
		zLoc = zLoc-Math.sin(Math.toRadians(-moveDirection))*moveSpeed;
		
		//System.out.println("ForwardMotion:" + forwardMotion + " " + acceleration + " " + moveSpeed);
		switch (forwardMotion) {
		case MOVE_FORWARD: 
		{
			if (acceleration<0)
				acceleration = 0;
			
			if (acceleration < maxAccel)
				acceleration += accelerationRate;
			
			if (moveSpeed<maxSpeed)
				moveSpeed += acceleration;
		}
		break;		
		case MOVE_BACKWARD: 
		{
			if (acceleration>0)
				acceleration = 0;
			
			if (acceleration > -maxAccel)
				acceleration -= accelerationRate;
			
			if (moveSpeed>-maxSpeed)
				moveSpeed += acceleration;				
		}	
		break;
		case NO_MOVE:
		{
			acceleration = acceleration*9/10;
			moveSpeed = moveSpeed*9/10;
		}
		default:
			break;
		}
	
		switch (rotateMotion) {
		case ROTATE_LEFT: moveDirection-=rotateSpeed;
		break;
		case ROTATE_RIGHT: moveDirection+=rotateSpeed;
		break;
		default:
			break;
		}
	}
	public void updateEyeLocation(){
		eye.setTilt(0);
		eye.setDirection(-moveDirection);
		eye.setX(xLoc+Math.cos(Math.toRadians((moveDirection+180)))*cameraDistance);
		eye.setY(yLoc+15);
		eye.setZ(zLoc+Math.sin(Math.toRadians((moveDirection+180)))*cameraDistance);
	}
	
	public Eye getEyeLocation() {
		return eye;
	}

}
