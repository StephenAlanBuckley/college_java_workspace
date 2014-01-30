package Buildings;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class BoxingRing {

	private static GLUquadric quadric;
	private float x, y, z;
	private static final float pilonwidth = .8f;
	private static final float pilonheight = 6;
	private static final float ropewidth = .2f;
	private static final float ropelength = 15;
	private GL2 gl;
	private GLU glu;

	public BoxingRing(GL2 gl, GLU glu, float x, float y, float z) {
		if(quadric==null)
		quadric = glu.gluNewQuadric();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void draw(GL2 gl, GLU glu) {
        this.gl = gl;
        this.glu = glu;
		gl.glPushMatrix();
		gl.glTranslatef(x, y, z);
		pilons();
		ropes();
		gl.glRotatef(-90, 0, 1, 0);
		ropes();
		gl.glTranslatef(-ropelength, 0, 0);
		ropes();
		gl.glRotatef(-90, 0, 1, 0);
		gl.glTranslatef(-ropelength, 0, 0);
		ropes();
		gl.glPopMatrix();

	}

	protected void pilons() {
		gl.glColor4f(.78f, .78f, .78f, .02f);
		gl.glPushMatrix();
		gl.glRotatef(-90, 1, 0, 0);
		glu.gluCylinder(quadric, pilonwidth, pilonwidth, pilonheight, 10, 1);
		gl.glTranslatef(ropelength, 0, 0);
		glu.gluCylinder(quadric, pilonwidth, pilonwidth, pilonheight, 10, 1);
		gl.glTranslatef(0, ropelength, 0);
		glu.gluCylinder(quadric, pilonwidth, pilonwidth, pilonheight, 10, 1);
		gl.glTranslatef(-ropelength, 0, 0);
		glu.gluCylinder(quadric, pilonwidth, pilonwidth, pilonheight, 10, 1);
		gl.glPopMatrix();
	}

	protected void ropes() {
		gl.glPushMatrix();
		gl.glTranslatef(0, 0, -ropelength);
		gl.glPushMatrix();
		gl.glColor3f(1, 0, 0);
		gl.glTranslatef(0, 1.5f, 0);
		glu.gluCylinder(quadric, ropewidth, ropewidth, ropelength, 10, 1);
		gl.glTranslatef(0, 1.5f, 0);
		glu.gluCylinder(quadric, ropewidth, ropewidth, ropelength, 10, 1);
		gl.glTranslatef(0, 1.5f, 0);
		glu.gluCylinder(quadric, ropewidth, ropewidth, ropelength, 10, 1);
		gl.glPopMatrix();
		gl.glPopMatrix();
	}

}
