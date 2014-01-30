package Bats;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import com.jogamp.opengl.util.texture.Texture;

import Buildings.Point3D;

public class Bat {
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
	protected Point3D color;
	protected Texture texture;
	protected float[] coefs;
	protected float[] coeft;
	protected FlyBehavior fb;
	protected float newcoorX;
	protected float newcoorY;
	protected float newcoorZ;
	protected float playX;
	protected float playY;
	protected float playZ;
	protected boolean attack;
	
	public Bat(GLU glu, double x, double y, double z, double direction, Point3D color) { //use point fields to specify RGB
		coorX = (float)x;
		coorY = (float)y;
		coorZ = (float)z;
		angle = (float)direction;
		this.color=color;
		
		
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE,
														// GLU_FILL,
														// GLU_SILHOUETTE
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or
														// GLU_SMOOTH
		glu.gluQuadricTexture(quadric, false); // use true to generate texture
												// coordinates
	}
	
	public Bat(GLU glu, double x, double y, double z, double direction, Texture texture, float[] s, float[]t) { //pass in a texture with Building.setup and pass in coeffcients
		coorX = (float)x;
		coorY = (float)y;
		coorZ = (float)z;
		angle = (float)direction;
		this.texture=texture;
		this.coefs=s;
		this.coeft=t;
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE,
														// GLU_FILL,
														// GLU_SILHOUETTE
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or
														// GLU_SMOOTH
		glu.gluQuadricTexture(quadric, true); // use true to generate texture
												// coordinates
	}
	
	public void draw(GL2 gl, GLU glu) {
		gl.glPushMatrix();
		gl.glTranslatef(coorX, coorY, coorZ);
		gl.glRotatef(angle, 0f, 1f, 0f);
		gl.glScalef(4,4,4);
		drawBat(gl,glu);
		gl.glPopMatrix();
		
		move();
	}
	
	private void move() {
		t += wingFlap;
		coorY += (45*Math.sin(2*Math.PI*t)) * hopHeight; 
		
		if (coorX > 120 || coorX < -20 || coorZ < -120 || coorZ > 20) {
			toggle = -1*toggle;
			angle += 180;
		}
		coorX = (float) (coorX + toggle*Math.cos(Math.toRadians(angle)*speed));
		coorZ = (float) (coorZ - toggle*Math.sin(Math.toRadians(angle))*speed);
	}
	
	private void drawBat(GL2 gl, GLU glu){
		if(texture==null){
		gl.glColor3d(color.getX(), color.getY(), color.getZ());
		drawBody(gl,glu);
		
		gl.glPushMatrix();
		gl.glTranslatef(-.2f, 0, 0);
		gl.glRotatef(90f, 0f, 1f, 0f);
		drawWings(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glTranslatef(-1.4f, 0, 0);
		drawHead(gl,glu);
		drawHeadFeatures(gl,glu);
		gl.glPopMatrix();
		}
		else{ //If BAT IS TO BE TEXTURED
			gl.glEnable(GL2.GL_TEXTURE_2D);
			texture.bind();
		    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coefs, 0);
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coeft, 0);    
			drawBody(gl,glu);
			
			gl.glPushMatrix();
			gl.glTranslatef(-.2f, 0, 0);
			gl.glRotatef(90f, 0f, 1f, 0f);
			drawWings(gl);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
			gl.glTranslatef(-1.4f, 0, 0);
			drawHead(gl,glu);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		    gl.glDisable(GL2.GL_TEXTURE_2D);
			drawHeadFeatures(gl,glu);
			gl.glPopMatrix();
		
		}
			
		
	}
	
	private void drawBody(GL2 gl, GLU glu){
		gl.glPushMatrix();
		gl.glScalef(4,.75f,.75f);
		glu.gluSphere(quadric,  .4, 10, 10);
		gl.glPopMatrix();
	}
	
	private void drawWings(GL2 gl){		
		double nearAngle = (45*Math.sin(2*Math.PI*t));
		double farAngle = 45 + (45*Math.sin(2*Math.PI*(t+.5)));
		
		gl.glPushMatrix();
		gl.glRotatef((float)nearAngle,0,0,1);
		drawLeftWing(gl);
		drawLeftMovingWingTip(gl,farAngle);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glRotatef((float)-nearAngle,0,0,1);
		drawRightWing(gl);
		drawRightMovingWingTip(gl,-farAngle);
		gl.glPopMatrix();
	}
	
	private void drawLeftWing(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		//left
		//rectangle
		gl.glVertex3f(0, 0, 0);
		gl.glVertex3f(-.5f, 0, -1);
		gl.glVertex3f(-2, 0, -.5f);
		gl.glVertex3f(-2, 0, 0);
		gl.glEnd();
		
		gl.glBegin(GL2.GL_TRIANGLES);
		//left
		//2nd triangle
		gl.glVertex3f(-1.5f, 0, .75f);
		gl.glVertex3f(-1, 0, 0);
		gl.glVertex3f(-2, 0, 0);
		//3rd triangle
		gl.glVertex3f(0, 0, .5f);
		gl.glVertex3f(0, 0, 0);
		gl.glVertex3f(-1, 0, 0);
		//4th triangle
		gl.glEnd();
	}
	
	private void drawRightWing(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		//right
		//rectangle
		gl.glVertex3f(0, 0, 0);
		gl.glVertex3f(.5f, 0, -1);
		gl.glVertex3f(2, 0, -.5f);
		gl.glVertex3f(2, 0, 0);
		gl.glEnd();
		
		gl.glBegin(GL2.GL_TRIANGLES);
		//right
		//2nd triangle
		gl.glVertex3f(1.5f, 0, .75f);
		gl.glVertex3f(1, 0, 0);
		gl.glVertex3f(2, 0, 0);
		//3rd triangle
		gl.glVertex3f(0, 0, .5f);
		gl.glVertex3f(0, 0, 0);
		gl.glVertex3f(1, 0, 0);
		gl.glEnd();
	}
	
	private void drawLeftMovingWingTip(GL2 gl, double angle) {
		gl.glPushMatrix();
		gl.glTranslatef(-2, 0, 0);
		gl.glRotatef((float)angle,0,0,1);
		gl.glTranslatef(2, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		//left 1st triangle     moving
		gl.glVertex3f(-2.75f, 0, 1);
		gl.glVertex3f(-2, 0, 0);
		gl.glVertex3f(-2, 0, -.5f);
		gl.glVertex3f(-2.75f, 0, -.5f);
		gl.glEnd();
		gl.glPopMatrix();
	}
	
	private void drawRightMovingWingTip(GL2 gl, double angle) {
		gl.glPushMatrix();
		gl.glTranslatef(2, 0, 0);
		gl.glRotatef((float)angle,0,0,1);
		gl.glTranslatef(-2, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		//right 1st triangle     moving
		gl.glVertex3f(2.75f, 0, 1);
		gl.glVertex3f(2, 0, 0);
		gl.glVertex3f(2, 0, -.5f);
		gl.glVertex3f(2.75f, 0, -.5f);
		gl.glEnd();
		gl.glPopMatrix();
	}
	
	private void drawHead(GL2 gl, GLU glu){
		//head
		glu.gluSphere(quadric,  .3, 10, 10);}
	
	private void drawHeadFeatures(GL2 gl, GLU glu){	
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_TRIANGLES);
		//ears
		//right
		//1st triangle
		gl.glVertex3f(.2f, .2f,-.1f);
		gl.glVertex3f(0, .2f, 0);
		gl.glVertex3f(0, .4f, -.1f);
		//2nd triangle
		gl.glVertex3f(.2f, .2f,-.1f);
		gl.glVertex3f(0, .2f, -.2f);
		gl.glVertex3f(0, .4f, -.1f);
		//3rd triangle
		gl.glVertex3f(0, .2f, -.2f);
		gl.glVertex3f(0, .2f, 0);
		gl.glVertex3f(0, .4f, -.1f);
		//inside triangle
		gl.glColor3f(1, 1, 1);
		gl.glVertex3f(-.01f, .2f, -.2f);
		gl.glVertex3f(-.01f, .2f, 0);
		gl.glVertex3f(-.01f, .35f, -.1f);	
		gl.glColor3f(0, 0, 0);
		//left
		gl.glVertex3f(.2f, .2f,.1f);
		gl.glVertex3f(0, .2f, 0);
		gl.glVertex3f(0, .4f, .1f);
		//2nd triangle
		gl.glVertex3f(.2f, .2f,.1f);
		gl.glVertex3f(0, .2f, .2f);
		gl.glVertex3f(0, .4f, .1f);
		//3rd triangle
		gl.glVertex3f(0, .2f, .2f);
		gl.glVertex3f(0, .2f, 0);
		gl.glVertex3f(0, .4f, .1f);
		//inside triangle
		gl.glColor3f(1, 1, 1);
		gl.glVertex3f(-.01f, .2f, .2f);
		gl.glVertex3f(-.01f, .2f, 0);
		gl.glVertex3f(-.01f, .35f, .1f);
		
		//teeth
		gl.glColor3f(1, 1, 1);
		gl.glVertex3f(-.31f, 0f, .08f);
		gl.glVertex3f(-.31f, 0f, .1f);
		gl.glVertex3f(-.31f, -.13f, .09f);
		
		gl.glVertex3f(-.31f, 0f, -.08f);
		gl.glVertex3f(-.31f, 0f, -.1f);
		gl.glVertex3f(-.31f, -.13f, -.09f);
		
		gl.glEnd();
		
		//left eye
		gl.glPushMatrix();
		gl.glTranslatef(-.25f, .1f, -.1f);
		glu.gluSphere(quadric,  .02, 10, 10);
		gl.glPopMatrix();

		//right eye
		gl.glPushMatrix();
		gl.glTranslatef(-.25f, .1f, .1f);
		glu.gluSphere(quadric,  .02, 10, 10);
		gl.glPopMatrix();
	}


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
	
	public void healthTracker(){ 
		
	}
	public void setBehavior(FlyBehavior fb) {
		this.fb = fb;
	}
}
