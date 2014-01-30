package Buildings;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import com.jogamp.opengl.util.texture.Texture;

public class Heavybag {

		private float x,y,z;
		private GL2 gl;
		private GLU glu;
		private static GLUquadric quadric;
		private static GLUquadric bagquadric;
		private static Texture bag;
		
		public Heavybag(GL2 gl, GLU glu, float x, float y, float z){
	        if(bag==null){
	        bag = Building.setupTexture(gl,"melvinbag.png");
	        quadric = glu.gluNewQuadric();
	        bagquadric= glu.gluNewQuadric();
	        glu.gluQuadricTexture(bagquadric, true);
	        }
	    	this.x=x;
			this.y=y;
			this.z=z;
		}

	public void draw(GL2 gl, GLU glu){
        this.gl=gl;
        this.glu=glu;
		gl.glPushMatrix();
		gl.glTranslatef(x, y, z);
		frame();
		bag(0,0,0);
		bag(5,0,0);
		bag(10,0,0);
		gl.glPopMatrix();
	}
	
	private void frame(){
		gl.glPushMatrix();
		gl.glColor3f(0, 0, 0);
		gl.glPushMatrix();
		//Draw Left leg of stand
		gl.glTranslatef(0,1,0);
        gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
		glu.gluDisk(quadric, 1, .5, 10	, 5);
		glu.gluCylinder(quadric, .6, .6, 12, 5, 1);
		gl.glPopMatrix();
		//Draw Right leg of stand
		gl.glPushMatrix();
		gl.glTranslatef(16,1,0);
        gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
		glu.gluDisk(quadric, 1, .5, 10	, 5);
		glu.gluCylinder(quadric, .6, .6, 12, 5, 1);
		gl.glPopMatrix();
		gl.glTranslated(0, 12, 0);
		gl.glRotatef(90, 0, 1, 0);
		glu.gluCylinder(quadric, .6, .6, 16, 5, 1);
		gl.glPopMatrix();
	}
	
	private void bag(float x, float y, float z){
		 gl.glEnable(GL2.GL_TEXTURE_2D);
		 bag.bind();
		gl.glPushMatrix();
		gl.glTranslatef(x, y, z);
		gl.glPushMatrix();
		gl.glColor3f(0, 1, 0);
		gl.glTranslatef(3, 3, 0);
		gl.glRotatef(-90, 1, 0, 0);
		glu.gluCylinder(bagquadric, 1.5, 1.5, 6, 5, 1);
        gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glTranslatef(0, 0, 6);
    	gl.glColor4f(.78f, .78f, .78f, .02f);
		glu.gluCylinder(quadric, .2, .2, 3, 5, 1);
		gl.glPopMatrix();
		gl.glPopMatrix();
	}
}