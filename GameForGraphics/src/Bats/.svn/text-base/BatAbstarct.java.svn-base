package Bats;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public abstract class BatAbstarct {
	
	protected double t = 0;
	
	protected float coorX;
	protected float coorY;
	protected float coorZ;
	
	protected double speed = 1.2;
	protected double wingFlap = .01;
	protected double hopHeight = .005;
	protected float angle;
	
	protected float toggle = -1;
	
	protected GLUquadric quadric;
	
	protected FlyBehavior fb;
	
	protected float newcoorX;
	protected float newcoorY;
	protected float newcoorZ;
	protected float playX;
	protected float playY;
	protected float playZ;
	protected boolean attack;
	
	public abstract void draw(GL2 gl, GLU glu);
	
	public double getSpeed() { return speed; }
	
	public void setSpeed(double s) { speed = s; }
	
	public double getWingSpeed() { return wingFlap; }
	
	public void setWingSpeed(double w) { wingFlap = w; }
	
	public float getDirection() { return angle; }
	
	public void setDirection(float a) { angle = a; }
	
	public float getX() { return coorX; }
	
	public void setX(float x) { coorX = x; }
	
	public float getY() { return coorY; }
	
	public void setY(float y) { coorY = y; }
	
	public float getZ() { return coorZ; }
	
	public void setZ(float z) { coorZ = z; }
	
	public void setLocation(float x, float y, float z) {
		coorX = x;
		coorY = y;
		coorZ = z;
	}
	
	public void setPlayLocation(float eyeX, float eyeY, float eyeZ){
		playX = eyeX;
		playY = eyeY;
		playZ = eyeZ;
	}
	
	public abstract void healthTracker();
	public void setBehavior(FlyBehavior fb) {
		this.fb = fb;
	}
	public abstract void move();

}
