package net;

import java.util.StringTokenizer;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import Buildings.Point3D;

public class MoveableDynamicObj extends DynamicObject{

private Point3D location;
private GLUquadric quadric;

	
	public MoveableDynamicObj() {
		super();
		this.type = "moveable";
		
	}

	public MoveableDynamicObj(String objID) {
		super(objID);
		this.type = "moveable";
	}

	public void draw(GL2 gl, GLU glu, GLUquadric quadric)
	{
		gl.glPushMatrix();
			gl.glTranslated(location.getX(), location.getY(), location.getZ());
			glu.gluSphere(quadric, 1, 10, 10);
		gl.glPopMatrix();
	}

	@Override
	void discoverAction(String act, StringTokenizer in) {
		if(act.equals("move")){
			this.runAction(new Moved(this), in);
		}
		
	}
	
	public void setLocation(double x, double y, double z){
		if(location == null)
		{
			location = new Point3D(x, y, z);
		}
		else
		{
			location.setX(x);
			location.setY(y);
			location.setZ(z);
		}
	}
	
	@Override
	void sendCurrentState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setState(StringTokenizer in) {
		// TODO Auto-generated method stub
		
	}
	
	
}