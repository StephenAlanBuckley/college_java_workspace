package Buildings;
// William Ames Fall 2010  Texture Demo

import java.awt.Font;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.Warehouse;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class EndresBuilding extends Building {
	private static GLUquadric quadric; // to control properties of quadric-based
								// objects
	private static GLUquadric sphereQuadric; // for Signorile's head
	private static Texture brickTexture; // bricks
	private static Texture grassTexture; // wooden planks
	private static Texture windowTexture; // for the sphere
	private static Texture concreteTexture; // for the sphere
	private static Texture garageTexture; // for the sphere
	private static Texture garageCoverTexture; // for the sphere
	private static Texture metalPaneTexture; // for the sphere
	private static Texture roofTexture; // for the sphere
	private static Texture crateTexture; // for the sphere
	private Warehouse model;
	private TextRenderer renderer;

	public EndresBuilding(GL2 gl, GLU glu) {
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
		model = new Warehouse(gl, glu);
		//Edited by Melvin Ross
		if(quadric==null){
		quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // false, or true to generate texture coordinates

		sphereQuadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(sphereQuadric, GLU.GLU_FILL);
		glu.gluQuadricNormals(sphereQuadric, GLU.GLU_NONE);
		glu.gluQuadricTexture(sphereQuadric, true); // for Signorile's head

		brickTexture = setupTexture(gl, "Ebricks.png");
		grassTexture = setupTexture(gl, "Egrass.png");
		garageTexture = setupTexture(gl, "Egarage.png");
		garageCoverTexture = setupTexture(gl, "EgarageCover.png");
		windowTexture = setupTexture(gl, "Ewindow.png");
		metalPaneTexture = setupTexture(gl, "EmetalPane.png");
		concreteTexture = setupTexture(gl, "Econcrete.png");
		roofTexture = setupTexture(gl, "Eroof.png");
		crateTexture = setupTexture(gl, "Ecrate.png");
		}
	}
	
	   public void drawMoving(GL2 gl, GLU glu) {
	     // Endres Building Text
        gl.glPushMatrix();
            gl.glRotated(0, 0, 1, 0);
            gl.glTranslated(35, 12, 80.5);
            renderer.begin3DRendering();
            renderer.setColor(0, 0, 0, 1);
            renderer.draw3D("2 Fast 2 Furious", 0f, 0f,0, .25f*1f/9);
            renderer.end3DRendering();
     gl.glPopMatrix();

	    }

	

	public void draw(GL2 gl, GLU glu) {
     

		
		gl.glPushMatrix();
	    gl.glTranslatef(0,0,100); // Ames change, move to range x&z = 0..100
		floor(gl);
	  gl.glPopMatrix();
	  gl.glPushMatrix();
	  gl.glTranslatef(75,0,66); // Ames change, move to range x&z = 0..100
	  gl.glRotatef(90, 0, 1, 0);
	  	model.draw(gl, glu);
	  gl.glPopMatrix();
	  
	}
	public void leftWall(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 0, -20);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(20, 0, -50);
			gl.glTexCoord2f(20f,1f);	gl.glVertex3f(20, 3, -50);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(20, 3, -20);

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 8, -20);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(20, 8, -50);
			gl.glTexCoord2f(20,.5f);		gl.glVertex3f(20, 10, -50);
			gl.glTexCoord2f(0f, .5f);	gl.glVertex3f(20, 10, -20);

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 3, -20);
			gl.glTexCoord2f(3f, 0f);	gl.glVertex3f(20, 3, -24);
			gl.glTexCoord2f(3f, 1.5f);	gl.glVertex3f(20, 8, -24);
			gl.glTexCoord2f(0f, 1.5f);	gl.glVertex3f(20, 8, -20);

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 3, -27);
			gl.glTexCoord2f(15f,0f);	gl.glVertex3f(20, 3, -50);
			gl.glTexCoord2f(15f,1.5f);	gl.glVertex3f(20, 8, -50);
			gl.glTexCoord2f(0f, 1.5f);	gl.glVertex3f(20, 8, -27);
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	//second half
	
	// left wall window
	gl.glEnable(GL2.GL_TEXTURE_2D);
	gl.glEnable(GL.GL_BLEND);
	gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		windowTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 3, -24);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(20, 3, -27);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(20, 8, -27);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(20, 8, -24);
		gl.glEnd();
		gl.glFlush();
	gl.glDisable(GL2.GL_BLEND);
	}
	public void leftWallUpper(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		metalPaneTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 10, -20);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(20, 10, -50);
			gl.glTexCoord2f(20f,1f);	gl.glVertex3f(20, 20, -50);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(20, 20, -20);
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);

	}

	public void outsideDecor(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
		//left
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(19.75f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(19.75f, 10.5f, -50.25f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(19.75f, 10.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(19.75f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(20f, 9.5f, -50.35f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(20f, 9.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 10.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(19.75f, 10.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(20, 10.5f, -50.25f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(20, 10.5f, -19.75f);
		//right
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54.5f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(54.5f, 10.5f, -50.25f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(54.5f, 10.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54.5f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54f, 9.5f, -50.35f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(54f, 9.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54.5f, 10.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 10.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54, 10.5f, -50.25f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(54, 10.5f, -19.75f);

			
		//front
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(54.5f, 10.5f, -19.75f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(19.74f, 10.5f, -19.75f);

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 9.5f, -19.75f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 9.5f, -20f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 9.5f, -20f);

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 10.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 10.5f, -19.75f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 10.5f, -20f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 10.5f, -20f);
		//back
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(54.5f, 10.5f, -50.25f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(19.74f, 10.5f, -50.25f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 9.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 9.5f, -50f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 9.5f, -50f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 10.5f, -50.25f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 10.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 10.5f, -50f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 10.5f, -50f);
			
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glEnable(GL2.GL_TEXTURE_2D);
			concreteTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
			
			//left
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(19.75f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(19.75f, 20.5f, -50.25f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(19.75f, 20.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(19.75f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(20f, 19.5f, -50.35f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(20f, 19.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 20.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(19.75f, 20.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(20, 20.5f, -50.25f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(20, 20.5f, -19.75f);
			//right
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54.5f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(54.5f, 20.5f, -50.25f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(54.5f, 20.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54.5f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54f, 19.5f, -50.35f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(54f, 19.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54.5f, 20.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 20.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54, 20.5f, -50.25f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(54, 20.5f, -19.75f);
			
			
			//front
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(54.5f, 20.5f, -19.75f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(19.74f, 20.5f, -19.75f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 19.5f, -19.75f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 19.5f, -20f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 19.5f, -20f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 20.5f, -19.75f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 20.5f, -19.75f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 20.5f, -20f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 20.5f, -20f);
			//back
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,.3f);	gl.glVertex3f(54.5f, 20.5f, -50.25f);
			gl.glTexCoord2f(0f, .3f);	gl.glVertex3f(19.74f, 20.5f, -50.25f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 19.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 19.5f, -50f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 19.5f, -50f);
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(19.75f, 20.5f, -50.25f);
			gl.glTexCoord2f(20f,0f);	gl.glVertex3f(54.5f, 20.5f, -50.25f);
			gl.glTexCoord2f(20f,.1f);	gl.glVertex3f(54.5f, 20.5f, -50f);
			gl.glTexCoord2f(0f, .1f);	gl.glVertex3f(19.74f, 20.5f, -50f);
			
		//the garage floor	
			//front
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(18, -1, -18);
			gl.glTexCoord2f(1f,0f);	gl.glVertex3f(18, 0, -18);
			gl.glTexCoord2f(1f,19f);	gl.glVertex3f(56, 0, -18);
			gl.glTexCoord2f(0f, 19f);	gl.glVertex3f(56, -1, -18);
			//left
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(18, -1, -18f);
			gl.glTexCoord2f(19f,0f);	gl.glVertex3f(18, -1, -52f);
			gl.glTexCoord2f(19f,1f);	gl.glVertex3f(18, 0, -52f);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(18, 0, -18f);
			//back
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(18, -1, -52);
			gl.glTexCoord2f(1f,0f);	gl.glVertex3f(18, 0, -52);
			gl.glTexCoord2f(1f,19f);	gl.glVertex3f(56, 0, -52);
			gl.glTexCoord2f(0f, 19f);	gl.glVertex3f(56, -1, -52);
			//rght
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(56, -1, -18f);
			gl.glTexCoord2f(19f,0f);	gl.glVertex3f(56, -1, -52f);
			gl.glTexCoord2f(19f,17f);	gl.glVertex3f(56, 0, -52f);
			gl.glTexCoord2f(0f, 17f);	gl.glVertex3f(56, 0, -18f);
			//garage ramp
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(42, -1, -15f);
			gl.glTexCoord2f(5f,0f);	gl.glVertex3f(52, -1, -15f);
			gl.glTexCoord2f(5f,2f);	gl.glVertex3f(52, 0, -18f);
			gl.glTexCoord2f(0f, 2f);	gl.glVertex3f(42, 0, -18f);
			
			//floor
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(18, 0f, -18);
			gl.glTexCoord2f(19f,0f);	gl.glVertex3f(18, 0f, -52);
			gl.glTexCoord2f(19f,17f);	gl.glVertex3f(56, 0f, -52f);
			gl.glTexCoord2f(0f, 17f);	gl.glVertex3f(56, 0f, -18f);
			
			
			
	
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	//garage ramp sides
	gl.glEnable(GL2.GL_TEXTURE_2D);
	concreteTexture.bind();
		gl.glBegin(GL2.GL_TRIANGLES);
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(42, -1, -15);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(42, -1, -18);
			gl.glTexCoord2f(0f,1f);		gl.glVertex3f(42, 0, -18);

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(52, -1, -15);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(52, -1, -18);
			gl.glTexCoord2f(0f,1f);		gl.glVertex3f(52, 0, -18);
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	gl.glEnable(GL2.GL_TEXTURE_2D);
	roofTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 20f, -20);
		gl.glTexCoord2f(19f,0f);	gl.glVertex3f(20, 20f, -50);
		gl.glTexCoord2f(19f,17f);	gl.glVertex3f(54, 20f, -50f);
		gl.glTexCoord2f(0f, 17f);	gl.glVertex3f(54, 20f, -20f);
		
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);

	}
	public void rightWall(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54, 0, -20);
				gl.glTexCoord2f(7f,0f);		gl.glVertex3f(54, 0, -50);
				gl.glTexCoord2f(7f,3f);		gl.glVertex3f(54, 10, -50);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(54, 10, -20);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	public void rightWallUpper(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		metalPaneTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54, 10, -20);
				gl.glTexCoord2f(7f,0f);		gl.glVertex3f(54, 10, -50);
				gl.glTexCoord2f(7f,3f);		gl.glVertex3f(54, 20, -50);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(54, 20, -20);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	
	public void rightWallDecor(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		metalPaneTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(54.25f, 9.5f, -20);
				gl.glTexCoord2f(7f,0f);		gl.glVertex3f(54.25f, 9.5f, -50);
				gl.glTexCoord2f(7f,3f);		gl.glVertex3f(54.25f, 10.5f, -50);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(54.25f, 10.5f, -20);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	public void backWall(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 0, -50);
				gl.glTexCoord2f(7f,0f);		gl.glVertex3f(54, 0, -50);
				gl.glTexCoord2f(7f,3f);		gl.glVertex3f(54, 10, -50);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(20, 10, -50);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	public void backWallUpper(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		metalPaneTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 10, -50);
				gl.glTexCoord2f(7f,0f);		gl.glVertex3f(54, 10, -50);
				gl.glTexCoord2f(7f,3f);		gl.glVertex3f(54, 20, -50);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(20, 20, -50);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	public void frontWallUpper(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		metalPaneTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 10, -20);
		gl.glTexCoord2f(7f,0f);		gl.glVertex3f(54, 10, -20);
		gl.glTexCoord2f(7f,3f);		gl.glVertex3f(54, 20, -20);
		gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(20, 20, -20);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	public void frontWall(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(20, 0, -20);
				gl.glTexCoord2f(6f,0f);		gl.glVertex3f(34, 0, -20);
				gl.glTexCoord2f(6f,3f);		gl.glVertex3f(34, 10, -20);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(20, 10, -20);

				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(34, 7, -20);
				gl.glTexCoord2f(2f,0f);		gl.glVertex3f(38, 7, -20);
				gl.glTexCoord2f(2f,1f);		gl.glVertex3f(38, 10, -20);
				gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(34, 10, -20);

				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(38, 0, -20);
				gl.glTexCoord2f(2f,0f);		gl.glVertex3f(42, 0, -20);
				gl.glTexCoord2f(2f,3f);		gl.glVertex3f(42, 10, -20);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(38, 10, -20);

				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(52, 0, -20);
				gl.glTexCoord2f(1f,0f);		gl.glVertex3f(54, 0, -20);
				gl.glTexCoord2f(1f,3f);		gl.glVertex3f(54, 10, -20);
				gl.glTexCoord2f(0f, 3f);	gl.glVertex3f(52, 10, -20);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		//above garage
		gl.glEnable(GL2.GL_TEXTURE_2D);
		garageCoverTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(42, 9, -20);
				gl.glTexCoord2f(1f,0f);		gl.glVertex3f(52, 9, -20);
				gl.glTexCoord2f(1f,1f);		gl.glVertex3f(52, 10, -20);
				gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(42, 10, -20);

				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(42, 10, -20);
				gl.glTexCoord2f(1f,0f);		gl.glVertex3f(52, 10, -20);
				gl.glTexCoord2f(1f,.5f);	gl.glVertex3f(52, 9.5f, -19);
				gl.glTexCoord2f(0f, .5f);	gl.glVertex3f(42, 9.5f, -19);

				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(42, 9.5f, -19);
				gl.glTexCoord2f(1f,0f);		gl.glVertex3f(52, 9.5f, -19);
				gl.glTexCoord2f(1f,.5f);	gl.glVertex3f(52, 8.5f, -18.75f);
				gl.glTexCoord2f(0f, .5f);	gl.glVertex3f(42, 8.5f, -18.75f);

				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(42, 10f, -20);
				gl.glTexCoord2f(1f,0f);		gl.glVertex3f(42, 9.5f, -19);
				gl.glTexCoord2f(1f,.5f);	gl.glVertex3f(42, 8.5f, -18.75f);
				gl.glTexCoord2f(0f, .5f);	gl.glVertex3f(42, 8.5f, -20);

				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(52, 10f, -20);
				gl.glTexCoord2f(1f,0f);		gl.glVertex3f(52, 9.5f, -19);
				gl.glTexCoord2f(1f,.5f);	gl.glVertex3f(52, 8.5f, -18.75f);
				gl.glTexCoord2f(0f, .5f);	gl.glVertex3f(52, 8.5f, -20);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		
		
		//garage door
		gl.glEnable(GL2.GL_TEXTURE_2D);
		garageTexture.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(42, 7, -20);
				gl.glTexCoord2f(1f,0f);		gl.glVertex3f(52, 7, -20);
				gl.glTexCoord2f(1f,.5f);	gl.glVertex3f(52, 9, -20);
				gl.glTexCoord2f(0f, .5f);	gl.glVertex3f(42, 9, -20);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	public void floor(GL2 gl){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		grassTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
		//the Y is -1 because I ran out of time and needed to give the building a different garage
			gl.glTexCoord2f(12f, 12f);	gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(24f, 12f);	gl.glVertex3f(0, 0, -100);
			gl.glTexCoord2f(24f, 24f);	gl.glVertex3f(100, 0, -100);
			gl.glTexCoord2f(12f, 24f);	gl.glVertex3f(100, 0, 0);
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	
	public void insideObjects(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		concreteTexture.bind();
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
				gl.glEnable(GL2.GL_TEXTURE_GEN_T);
					gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
					gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
					float[] coef_s = { .92f, 0, 0, 0 };
					gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
					float[] coef_t = { 0, 0f, 1, 0 };
					gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
					gl.glPushMatrix();
						gl.glTranslatef(42, 0, -40);
						gl.glRotatef(-90, 1, 0, 0);
						glu.gluCylinder(quadric, .5, .5, 4, 10, 1);
					gl.glPopMatrix();

					gl.glPushMatrix();
						gl.glTranslatef(42, 4, -40);
						glu.gluSphere(sphereQuadric, .5, 10, 10);
					gl.glPopMatrix();
					
				    gl.glPushMatrix();
				    	gl.glTranslatef(52, 0, -40);
				    	gl.glRotatef(-90, 1, 0, 0);
				    	glu.gluCylinder(quadric, .5, .5, 4, 10, 1);
				    gl.glPopMatrix();
				    
				    gl.glPushMatrix();
				    	gl.glTranslatef(52, 4, -40);
				    	glu.gluSphere(sphereQuadric, .5, 10, 1);
				    gl.glPopMatrix();
				gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		
		
//	gl.glEnable(GL2.GL_TEXTURE_2D);
//		concreteTexture.bind();
//		gl.glPushMatrix();
//			gl.glTranslatef(42, 0, -40);
//			gl.glRotatef(-90, 1, 0, 0);
//			glu.gluCylinder(quadric, .5, .5, 4, 10, 10);
//		gl.glPopMatrix();
//		
//		gl.glPushMatrix();
//			gl.glTranslatef(42, 4, -40);
//			glu.gluSphere(sphereQuadric, .5, 10, 10);
//	gl.glPopMatrix();
//    gl.glDisable(GL2.GL_TEXTURE_2D);
//
//    gl.glEnable(GL2.GL_TEXTURE_2D);
//    concreteTexture.bind();
//    gl.glPushMatrix();
//    gl.glTranslatef(52, 0, -40);
//    gl.glRotatef(-90, 1, 0, 0);
//    glu.gluCylinder(quadric, .5, .5, 4, 10, 10);
//    gl.glPopMatrix();
//    
//    gl.glPushMatrix();
//    gl.glTranslatef(52, 4, -40);
//    glu.gluSphere(sphereQuadric, .5, 10, 10);
//    gl.glPopMatrix();
//    gl.glDisable(GL2.GL_TEXTURE_2D);

    gl.glEnable(GL2.GL_TEXTURE_2D);
		crateTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(21, 4, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(21, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 0, -48);//l
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(25, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 4, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(25, 0, -48);//r
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 0, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 4, -44);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 4, -44);//f
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 0, -48);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 0, -48);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 4, -48);//b
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 4, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 4, -48);//t ****

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(21, 8, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(21, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 4, -48);//l
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(25, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 8, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(25, 4, -48);//r
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 4, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 8, -44);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 8, -44);//f
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 4, -48);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 4, -48);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 8, -48);//b
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(21, 8, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(25, 8, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(25, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(21, 8, -48);//t ****

			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(26, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(26, 4, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(26, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(26, 0, -48);//l
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(30, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(30, 4, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(30, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(30, 0, -48);//r
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(26, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(30, 0, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(30, 4, -44);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(26, 4, -44);//f
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(26, 0, -48);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(30, 0, -48);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(30, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(26, 4, -48);//b
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(26, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(30, 4, -44);
			gl.glTexCoord2f(1f,1f);	gl.glVertex3f(30, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(26, 4, -48);//t ****
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(31, 4, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(31, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 0, -48);//l
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(35, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 4, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(35, 0, -48);//r
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 0, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 0, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 4, -44);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 4, -44);//f
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 0, -48);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 0, -48);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 4, -48);//b
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 4, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 4, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 4, -48);//t ****
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(31, 8, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(31, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 4, -48);//l
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(35, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 8, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(35, 4, -48);//r
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 4, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 4, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 8, -44);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 8, -44);//f
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 4, -48);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 4, -48);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 8, -48);//b
			
			gl.glTexCoord2f(0f, 0f);	gl.glVertex3f(31, 8, -44);
			gl.glTexCoord2f(1f,0f);		gl.glVertex3f(35, 8, -44);
			gl.glTexCoord2f(1f,1f);		gl.glVertex3f(35, 8, -48);
			gl.glTexCoord2f(0f, 1f);	gl.glVertex3f(31, 8, -48);//t ****
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
//    
	}
}