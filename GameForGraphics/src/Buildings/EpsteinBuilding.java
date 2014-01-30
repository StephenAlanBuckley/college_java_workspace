package Buildings;


import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.EpsteinPlants;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


public class EpsteinBuilding extends Building {
	private static GLUquadric quadric; // to control properties of quadric-based objects
	private static GLUquadric sphereQuadric; // for Signorile's head
	private static Texture grassTexture;
	private static Texture redwoodTexture;     // bricks
	private static Texture hayTexture;
	private static Texture shingleTexture;
	private static Texture yellowwoodTexture;
	private static Texture autowoodTexture;
	private static Texture cowTexture;
	private static Texture cowheadTexture;
	private static Texture farmerTexture;
	private static EpsteinPlants cacti;
	private TextRenderer renderer;

	
	public EpsteinBuilding(GL2 gl, GLU glu){
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		if(quadric==null){
		quadric = glu.gluNewQuadric();

		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
		glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
		glu.gluQuadricTexture  (quadric, false);        // use true to generate texture coordinates

		sphereQuadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(sphereQuadric, GLU.GLU_FILL);
		glu.gluQuadricNormals  (sphereQuadric, GLU.GLU_NONE);
		glu.gluQuadricTexture  (sphereQuadric, true); // for Signorile's head
		redwoodTexture     = setupTexture(gl, "redwood.png");
		grassTexture = setupTexture(gl, "grass.png");
		hayTexture =setupTexture(gl, "hay.png");
		shingleTexture =setupTexture (gl, "shingles.png");
		yellowwoodTexture =setupTexture (gl, "yellowwood.png");
		autowoodTexture =setupTexture (gl, "autowood.png");
		cowTexture =setupTexture (gl, "cow.png");
		cowheadTexture = setupTexture (gl, "cowhead.png");
		farmerTexture  = setupTexture (gl, "farmer.png");
		cacti = new EpsteinPlants(gl, glu);
		}
	}
	public void drawMoving(GL2 gl, GLU glu) {
	       // Epstein Building Text
        gl.glPushMatrix();
        	gl.glRotated(180, 0, 1, 0);
        	gl.glRotated(270, 1, 0, 0);
            gl.glTranslated(-80, 70, 0);
            renderer.begin3DRendering();
            renderer.setColor(.7f, .5f, .5f, 1);
            renderer.draw3D("Raging Bull", 0f, 0f,0, .25f*1f/7);
            renderer.end3DRendering();
   gl.glPopMatrix();

	}


	@Override
	public void draw(GL2 gl, GLU glu) {

		
		gl.glPushMatrix();
		gl.glTranslated(25, 1, -5);
		cacti.draw(gl, glu);
		gl.glPopMatrix();
		// glu.gluSphere(quadric,  radius, slices, stacks)
		// glu.gluCylinder quadric, base, top, height, slices, stacks)
		// glu.gluD hayTexture.bind();
		gl.glPushMatrix();
		gl.glTranslated(50, 5, 50);
		gl.glRotatef(100, 0,1,0); 
		drawCow(gl,glu);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glTranslated(20, 5, 70);
		gl.glRotatef(90, 0,1,0); 
		drawCow(gl,glu);
		gl.glPopMatrix();

		gl.glEnable(GL2.GL_TEXTURE_2D);
		//wall with door
		redwoodTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,1f); gl.glVertex3f(50,  0, 80);
			gl.glTexCoord2f(3f,1f); gl.glVertex3f( 50,  30, 80);
			gl.glTexCoord2f(3f,1f); gl.glVertex3f( 62,  30, 68);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(62, 0, 68);
	
			gl.glTexCoord2f(0f,1f); gl.glVertex3f( 62,  30, 68);
			gl.glTexCoord2f(2f,1f); gl.glVertex3f(62, 10, 68);
			gl.glTexCoord2f(2f,0f); gl.glVertex3f(68,  10, 62);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f( 68,  30, 62);
	
			gl.glTexCoord2f(0f,1f); gl.glVertex3f(68,  0, 62);
			gl.glTexCoord2f(3f,1f); gl.glVertex3f( 68,  30, 62);
			gl.glTexCoord2f(3f,0f); gl.glVertex3f( 80, 30, 50);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(80, 0, 50);
		gl.glEnd();


		//Left Wall
		//inner texture
		gl.glEnable(GL2.GL_CULL_FACE);
		autowoodTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  0, 50);
			gl.glTexCoord2f(0f,1f); gl.glVertex3f( 20,  30, 50);
			gl.glTexCoord2f(1f,1f); gl.glVertex3f( 50, 30, 80);
			gl.glTexCoord2f(1f,0f); gl.glVertex3f(50, 0, 80);
		gl.glEnd();

		//outer texturer
		redwoodTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  0, 50);
			gl.glTexCoord2f(1f,0f); gl.glVertex3f(50, 0, 80);
			gl.glTexCoord2f(1f,3f); gl.glVertex3f( 50, 30, 80);
			gl.glTexCoord2f(0f,3f); gl.glVertex3f( 20,  30, 50);
		gl.glEnd();
		gl.glDisable(GL2.GL_CULL_FACE);


		//right wall
		redwoodTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,1f); gl.glVertex3f(50,  0, 20);
			gl.glTexCoord2f(3f,1f); gl.glVertex3f( 50,  30, 20);
			gl.glTexCoord2f(3f,0f); gl.glVertex3f( 80, 30, 50);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(80, 0, 50);
		gl.glEnd();


		//Roof
		shingleTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(1f,0f); gl.glVertex3f(10,  22, 60);
			gl.glTexCoord2f(1f,1f); gl.glVertex3f( 35,  44, 35);
			gl.glTexCoord2f(0f,1f); gl.glVertex3f( 65, 44, 65);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(40, 22, 90);
		gl.glEnd();

		shingleTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(1f,0f); gl.glVertex3f( 65, 44, 65);
			gl.glTexCoord2f(1f,1f); gl.glVertex3f(90,  22, 40);
			gl.glTexCoord2f(0f,1f); gl.glVertex3f(60,  22, 10);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(35, 44, 35);
		gl.glEnd();


		//ground
		grassTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,2f); gl.glVertex3f(0,  0, 0);
			gl.glTexCoord2f(3f,2f); gl.glVertex3f(100,  0, 0);
			gl.glTexCoord2f(3f,0f); gl.glVertex3f(100, 0, 100);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 100);
		gl.glEnd();

		//carpet
		hayTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,2f); gl.glVertex3f(20,  1, 50);
			gl.glTexCoord2f(3f,2f); gl.glVertex3f(50,  1, 80);
			gl.glTexCoord2f(3f,0f); gl.glVertex3f( 80, 1, 50);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(50, 1, 20);
		gl.glEnd();


		//silo
		yellowwoodTexture.bind();
		glu.gluQuadricTexture  (quadric, true);        // use true to generate texture coordinates
		gl.glPushMatrix();
			gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
			gl.glTranslated(50,-80,0);
			glu.gluCylinder(quadric, 6,6, 30, 10, 1);
			//TODO how can i make solid black
			grassTexture.bind();
			gl.glTranslated(0,0,30);
			glu.gluSphere(quadric, 6, 10, 10);
		gl.glPopMatrix();
		glu.gluQuadricTexture  (quadric, false);        // use true to generate texture coordinates


		//piture
		farmerTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,1f); gl.glVertex3f(28.5f, 29, 42.5f);
			gl.glTexCoord2f(1f,1f); gl.glVertex3f(42.5f, 29, 28.5f);
			gl.glTexCoord2f(1f,0f); gl.glVertex3f(42.5f, 15, 28.5f);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f( 28.5f,15, 42.5f);
		gl.glEnd();




		//back wal automatic texturing
		autowoodTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = {1.0f/42.42f,0,0,20};
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = {0,1f/30f,0,0};
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex3f(20, 30, 50);
		gl.glVertex3f( 20,  0, 50);
		gl.glVertex3f(50, 0, 20);
		gl.glVertex3f(50, 30, 20);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}

	private void drawCow(GL2 gl, GLU glu){


		gl.glEnable(GL2.GL_TEXTURE_2D);
		cowTexture.bind();
	
			
		//body
		gl.glPushMatrix();   
			gl.glScaled(3, 1, 1);
			glu.gluSphere(sphereQuadric, 3, 10, 1);
		gl.glPopMatrix();
		
			//legs 
			gl.glPushMatrix();
				gl.glTranslated(2, -5, 2);
				gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
				glu.gluCylinder(sphereQuadric, 1., .5, 5., 10, 1);
			gl.glPopMatrix();
	
			gl.glPushMatrix();
				gl.glTranslated(-2, -5, -2);
				gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
				glu.gluCylinder(sphereQuadric, 1., .5, 5., 10, 1);
			gl.glPopMatrix();
	
			gl.glPushMatrix();
				gl.glTranslated(2, -5, -2);
				gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
				glu.gluCylinder(sphereQuadric, 1., .5, 5., 10, 1);
			gl.glPopMatrix();
	
			gl.glPushMatrix();
				gl.glTranslated(-2, -5, 2);
				gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
				glu.gluCylinder(sphereQuadric, 1., .5, 5., 10, 1);
			gl.glPopMatrix();
	
			
	
			//head
			cowheadTexture.bind();
			gl.glPushMatrix();
				gl.glTranslated(-8, 2, 0);
				gl.glRotated(50,0,1,0);
				gl.glRotated(-30,0,0,1);
				glu.gluSphere(sphereQuadric, 2, 10, 10);
			gl.glPopMatrix();
	
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
}
