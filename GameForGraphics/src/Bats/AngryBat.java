package Bats;


import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;


public class AngryBat implements Bats{

	private double t = 0;
	
	private float coorX;
	private float coorY;
	private float coorZ;
	private float playX;
	private float playY;
	private float playZ;
	private boolean attack;
	
	private double wingFlap = .01;
	private float angle;
	private FlyBehavior fb;
	private int health = 1;
	private boolean isFleeing = false;
	
	
	private GLUquadric quadric;
	
	public AngryBat(GLU glu, double x, double y, double z, double direction) {
		coorX = (float)x;
		coorY = (float)y;
		coorZ = (float)z;
		angle = (float)direction;
		fb = new ApproatchPlayerAngry();
		
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE,
														// GLU_FILL,
														// GLU_SILHOUETTE
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or
														// GLU_SMOOTH
		glu.gluQuadricTexture(quadric, false); // use true to generate texture
												// coordinates
	}
	
	public void draw(GL2 gl, GLU glu) {
		gl.glPushMatrix();
		gl.glTranslatef(coorX, coorY, coorZ);
		gl.glRotatef(angle, 0f, 1f, 0f);
		gl.glScalef(3,3,3);
		drawBat(gl,glu);
		gl.glPopMatrix();
	}
	
	public void move() {
		t += wingFlap;
		
		fb.setPlayer(playX, playY, playZ);
		fb.setBat(coorX, coorY, coorZ);
		fb.move();
		coorX = fb.getX();
		coorY = fb.getY();
		coorZ = fb.getZ();
		angle = fb.getAngle();
		attack = fb.getAttack();
		health += fb.healing();
		setBehavior(new ApproatchPlayerAngry());
	}
	

	
	private void drawBat(GL2 gl, GLU glu){
		gl.glColor3f(1, 0, 0);
		drawBody(gl,glu);
		
		gl.glPushMatrix();
		gl.glTranslatef(-.2f, 0, 0);
		gl.glRotatef(90f, 0f, 1f, 0f);
		drawWings(gl);
		gl.glPopMatrix();
		
		gl.glColor3f(1, 0, 0);
		gl.glPushMatrix();
		gl.glTranslatef(-1.4f, 0, 0);
		drawHead(gl,glu);
		gl.glPopMatrix();
		
	}
	
	private void drawBody(GL2 gl, GLU glu){
		gl.glPushMatrix();
		gl.glScalef(4,.75f,.75f);
		glu.gluSphere(quadric,  .4, 10, 10);
		gl.glPopMatrix();
	}
	
	private void drawWings(GL2 gl){
		gl.glColor3f(1, 0, 0);
		
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
		if(attack){
			gl.glColor3f(0, 0, 0);
		}else{
		gl.glColor3f(1, 0, 0);}
		glu.gluSphere(quadric,  .3, 10, 10);
		
		
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
	public void setPlayLocation(float x, float y, float z){
		this.playX = x;
		this.playY = y;
		this.playZ = z;
	}



	@Override
	public void setBehavior(FlyBehavior fb) {
		// TODO Auto-generated method stub
		this.fb = fb;
	}


	@Override
	public void healthTracker(int life) {
		// TODO Auto-generated method stub
	    health = health - life;
	}

	@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		if(health > 0){
			return false;
		}else{
		return true;}
	}

	@Override
	public int attacking() {
		// TODO Auto-generated method stub
		return 4;
	}

	
}
