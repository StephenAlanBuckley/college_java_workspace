package Buildings;
//Hanyin Cheng, Graphics, Game Scene

import java.awt.Font;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.Hanyinbench;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


public class ChengBuilding extends Building {

	private static GLUquadric quadric; // to control properties of quadric-based objects here
	private static Texture brickTexture;
	private static Texture roofTexture;
	private static Texture grassTexture;
	private static Hanyinbench myWidget;
	private TextRenderer renderer;

	public ChengBuilding(GL2 gl, GLU glu) {
	    renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		//Edit by Melvin Ross
		if(quadric==null){
		myWidget = new Hanyinbench(gl, glu);
		
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
		glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
		glu.gluQuadricTexture  (quadric, false);        // false, or true to generate texture coordinates

		brickTexture = setupTexture(gl, "bricks.png");
		roofTexture = setupTexture(gl, "chengroof.png");
		grassTexture = setupTexture(gl, "chenggrass.png");
		}
	}
	   public void drawMoving(GL2 gl, GLU glu) {
	        	     // Cheng Building Text
	             gl.glPushMatrix();
	                 gl.glRotated(180, 0, 1, 0);
	                 gl.glTranslated(-49, 10, -19.5);
	                 renderer.begin3DRendering();
	                 renderer.setColor(1, 1, 1, 1);
	                 renderer.draw3D("Rocky V", 0f, 0f,0, .25f*1f/9);
	                 renderer.end3DRendering();
	          gl.glPopMatrix();

	    }


	@Override
	public void draw(GL2 gl, GLU glu) {

	      
	    
		
		gl.glPushMatrix();
	    	gl.glTranslatef(28.0f, 0f, 38.2f);
	    	myWidget.draw(gl, glu);
    	gl.glPopMatrix();
		
		
// ------Draw Grass
		gl.glEnable(GL2.GL_TEXTURE_2D);
			grassTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,2f); gl.glVertex3f(0,  0, 0);
			gl.glTexCoord2f(3f,2f); gl.glVertex3f( 100,  0, 0);
			gl.glTexCoord2f(3f,0f); gl.glVertex3f( 100, 0, 100);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 100);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);

// -----Draw front and back of roof
		gl.glEnable(GL2.GL_TEXTURE_2D);
		roofTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = {0.05f,0,0,0};
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = {0,0.05f,0,0};
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL.GL_TRIANGLES);
	
			gl.glVertex3f(20, 21, 80);
			gl.glVertex3f(80, 21, 80);
			gl.glVertex3f(50, 61, 30);
	
			gl.glVertex3f(20, 21, 20);
			gl.glVertex3f(80, 21, 20);
			gl.glVertex3f(50, 61, 30);

		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

// -----Draw Sides of the roof
		gl.glEnable(GL2.GL_TEXTURE_2D);
		roofTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_ssss = {0,0,0.05f,0};
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_ssss, 0);
		float[] coef_tttt = {0,0.05f,0,0};
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tttt, 0);
		gl.glBegin(GL.GL_TRIANGLES);
	
			gl.glVertex3f(20, 21, 20);
			gl.glVertex3f(20, 21, 80);
			gl.glVertex3f(50, 61, 30);
	
			gl.glVertex3f(80, 21, 20);
			gl.glVertex3f(80, 21, 80);
			gl.glVertex3f(50, 61, 30);

		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);	        

// -----Draw front and back of the walls
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_sss = {.2f,0,0,0};
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sss, 0);
		float[] coef_ttt = {0,0.2f,0,1};
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_ttt, 0);
		gl.glBegin(GL2.GL_QUADS);
			// South Left Piece
			gl.glVertex3f(20,  0, 80);
			gl.glVertex3f(50,  0, 80);
			gl.glVertex3f(50, 7, 80);
			gl.glVertex3f(20, 7, 80);
	
			// South Right Piece
			gl.glVertex3f(60,  0, 80);
			gl.glVertex3f(80,  0, 80);
			gl.glVertex3f(80, 7, 80);
			gl.glVertex3f(60, 7, 80);
	
			// South Center Piece
			gl.glVertex3f(20,  7, 80);
			gl.glVertex3f(80,  7, 80);
			gl.glVertex3f(80, 21, 80);
			gl.glVertex3f(20, 21, 80);
	
			// Wall North
			gl.glVertex3f(20,  0, 20);
			gl.glVertex3f(40,  0, 20);
			gl.glVertex3f(40, 7, 20);
			gl.glVertex3f(20, 7, 20);
	
			gl.glVertex3f(50,  0, 20);
			gl.glVertex3f(80,  0, 20);
			gl.glVertex3f(80, 7, 20);
			gl.glVertex3f(50, 7, 20);
	
			gl.glVertex3f(20,  7, 20);
			gl.glVertex3f(80,  7, 20);
			gl.glVertex3f(80, 21, 20);
			gl.glVertex3f(20, 21, 20);

		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		
// -----Draw sides of walls 
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_ss = {0,0,0.2f,0};
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_ss, 0);
		float[] coef_tt = {0,0.2f,0,0};
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tt, 0);
		gl.glBegin(GL2.GL_QUADS);

			//Wall East
			gl.glVertex3f(80,  0, 80);
			gl.glVertex3f(80,  0, 20);
			gl.glVertex3f(80, 21, 20);
			gl.glVertex3f(80, 21, 80);
	
			// Wall West
			gl.glVertex3f(20,  0, 20);
			gl.glVertex3f(20,  21,20);
			gl.glVertex3f(20, 21, 80);
			gl.glVertex3f(20, 0, 80);

		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		
// ------Draw Table
		// Leg #1
		gl.glPushMatrix();
        	gl.glTranslatef(50f, 0f, 50f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            
            glu.gluCylinder(quadric, 0.3, .3, 3., 10, 1);
        gl.glPopMatrix();
        // Leg #2
        gl.glPushMatrix();
        	gl.glTranslatef(55f, 0f, 55f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, 0.3, .3, 3., 10, 1);
        gl.glPopMatrix();
        // Leg #3
        gl.glPushMatrix();
        	gl.glTranslatef(50f, 0f, 55f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, 0.3, .3, 3., 10, 1);
        gl.glPopMatrix();
        // Leg #4
        gl.glPushMatrix();
        	gl.glTranslatef(55f, 0f, 50f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, 0.3, .3, 3., 10, 1);
        gl.glPopMatrix();
        // Table Top
        gl.glColor3f(.7f, 0.1f, .2f);
        gl.glPushMatrix();
        	gl.glTranslatef(52.5f, 3f, 52.5f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, 5, 5, 1, 10, 1);
        gl.glPopMatrix();
        
// ------Draw Bar Bell
        // Draw rod
        gl.glColor3f(.7f, 0.1f, .2f);
        gl.glPushMatrix();
        	gl.glTranslatef(30.5f, 5.7f, 52.5f);
            gl.glRotatef(-180f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, 0.07, 0.07, 12, 10, 1);
        gl.glPopMatrix();
        // Draw weight #1
        gl.glColor3f(0f, 0f, 0f);
        gl.glPushMatrix();
        	gl.glTranslatef(30.5f, 5.65f, 51.5f);
        	glu.gluDisk(quadric, 0.07, 2., 10, 10);
        gl.glPopMatrix();
     // Draw weight #2
        gl.glColor3f(0f, 0f, 0f);
        gl.glPushMatrix();
        	gl.glTranslatef(30.5f, 5.65f, 41.5f);
        	glu.gluDisk(quadric, 0.07, 2., 10, 10);
        gl.glPopMatrix();
	}
}
