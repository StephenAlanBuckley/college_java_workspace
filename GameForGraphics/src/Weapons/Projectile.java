package Weapons;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Projectile {

	private double x,y,z,direction,tilt,speed, dx, dy, dz; 
	private GLUquadric quadric =null;
	private static final float UPPER_RANGE = 400;
	private static final float LOWER_RANGE = 400;
	private static final float SPEED = 5f;
	
	
	
	public Projectile(double x, double y, double z, double direction, double tilt)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
		this.tilt = tilt;
		speed = SPEED;
		
		dx = Math.cos(Math.toRadians(direction)) * speed; // * speed * Math.cos(Math.toRadians(tilt)) * speed;
		dy = Math.sin(Math.toRadians(tilt)) * speed; //* speed; problem with this
		dz = -Math.sin(Math.toRadians(direction)) * speed; //* speed * Math.cos(Math.toRadians(tilt)) * speed;
		 
		
		
	}
	 public void move()
	 {
		 x = x+dx;
		 y = y+dy;
		 z = z+dz;
	 }
	 public boolean notActive()
	 {
		 return false;
		 /*
		 if(x > UPPER_RANGE || x < LOWER_RANGE || y > UPPER_RANGE || y < LOWER_RANGE || z > UPPER_RANGE || z < LOWER_RANGE )
			 return true;
		 else 
			 return false;
			 */
	 }
	 // check to see if it hit a bat return null if hit something
	 public void hitSomething()
	 {
		 
	 }
	
	 public void draw(GL2 gl, GLU glu)
	 {
			gl.glPushMatrix();
	       	gl.glTranslated(x,y,z);
	       	gl.glColor3f(1f,1f,0);
	        if(quadric==null){
	   		 	quadric = glu.gluNewQuadric();
	   		 	glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
	   		 	glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
	   		 	glu.gluQuadricTexture  (quadric, false);        // false, or true to generate texture coordinates
	        }
	       	glu.gluSphere(quadric, .1, 10, 10);
	        
	       	gl.glPopMatrix();
	 }
	 
	 public double getX(){
		 return x;
	 }
	 public double getY(){
		 return y;
	 }
	 public double getZ(){
		 return z;
	 }
	
	
}
