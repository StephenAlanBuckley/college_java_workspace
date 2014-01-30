package net;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import Buildings.Point3D;

public class VisualPlayer 
{
	private Point3D location;
	
	public VisualPlayer(Point3D location)
	{
		this.location = location;
	}
	
	public void draw(GL2 gl, GLU glu, GLUquadric quadric)
	{
		gl.glPushMatrix();
			gl.glTranslated(location.getX()+10, location.getY(), location.getZ()+10);
			glu.gluSphere(quadric, 1, 10, 10);
		gl.glPopMatrix();
	}
	
	public void updateLocation(Point3D location)
	{
		this.location = location;
	}
	
	public Point3D getLocation() { return location; }
}
