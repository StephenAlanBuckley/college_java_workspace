package Buildings;
/**
 * This class makes my amazing building
 * 
 * @author - Michael Cerbone
 */

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.CerbonePoolTable;
import SketchupModels.Firetruck;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class CerboneBuilding extends Building {

	private static GLUquadric quadric; // to control properties of quadric-based
								// objects
	private static GLUquadric sphereQuadric; // for Signorile's head

	private static Texture siren; // for the sphere
	private static Texture brick;
	private static Texture hardwood;
	private static Texture sign;
	private static Texture ceiling;
	private static Texture grass;
	
	//private static SketchupModelJAXB firetruck;
	private Firetruck firetruck;
	private static CerbonePoolTable pooltable;

	private float windowTrim = .25f;
	private float windowDepth = .5f;
	private float windowSeperator = .1f;
	private TextRenderer renderer;

	
	public CerboneBuilding(GL2 gl, GLU glu) {
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		if(quadric==null){
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE,
														// GLU_FILL,
														// GLU_SILHOUETTE
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or
														// GLU_SMOOTH
		glu.gluQuadricTexture(quadric, false); // use true to generate texture
												// coordinatesd

		sphereQuadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(sphereQuadric, GLU.GLU_FILL);
		glu.gluQuadricNormals(sphereQuadric, GLU.GLU_NONE);
		glu.gluQuadricTexture(sphereQuadric, true); 
		
		//firetruck = new SketchupModelJAXB("Firetruck.dae",gl,glu);
		firetruck = new Firetruck(gl,glu);
        //pooltable = new SketchupModelJAXB("CerbonePoolTable.dae",gl,glu);
        pooltable = new CerbonePoolTable(gl,glu);
		
		siren = setupTexture(gl, "CerboneSiren.png");
		brick = setupTexture(gl, "CerboneBrick.png");
		hardwood = setupTexture(gl, "CerboneHardwood.png");
		sign = setupTexture(gl, "CerboneSign.png");
		ceiling = setupTexture(gl, "CerboneCieling.png");
		grass = setupTexture(gl, "CerboneGrass.png");
		}
	}
	
	
	
    public void drawMoving(GL2 gl, GLU glu, double eyeX, double eyeY, double eyeZ) {
        // Cerbone Building Text
        gl.glPushMatrix();
            gl.glRotated(0, 0, 1, 0);
            gl.glTranslated(15, 10, 72.1);
            renderer.begin3DRendering();
            renderer.setColor(1, 0, 0, 1);
            renderer.draw3D("Ladder 49", 0f, 0f,0, .25f*1f/7);
            renderer.end3DRendering();
      gl.glPopMatrix();

      gl.glPushMatrix();
        gl.glTranslatef(0,0,100);
        gl.glTranslatef(10, 0, -30);
        // sirens
        gl.glEnable(GL2.GL_TEXTURE_2D);
        siren.bind();
        gl.glPushMatrix();
        gl.glTranslatef(70, 13.3f, -12);
        angle += 8;
        gl.glRotatef(angle, 0, 1, 0);
        glu.gluSphere(sphereQuadric, 1., 10, 10);
        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);

        gl.glEnable(GL2.GL_TEXTURE_2D);
        siren.bind();
        gl.glPushMatrix();
        gl.glTranslatef(61, 13.3f, -12);
        gl.glRotatef(angle, 0, 1, 0);
        glu.gluSphere(sphereQuadric, 1., 10, 10);
        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);
      gl.glPopMatrix();
    }

	private float angle = 0;
	


	public void draw(GL2 gl, GLU glu) {
		
          
		gl.glPushMatrix(); // Ames change
	   gl.glTranslatef(0,0,100); // move to x&y in 0..100 range
		//translate everything
		gl.glPushMatrix();
		gl.glTranslatef(10, 0, -30);
		
		drawBuilding(gl, glu);
		drawLandscape(gl);
		
		/*
		gl.glPushMatrix();
		gl.glTranslatef(20, 0, -10);
		firetruck.draw(gl,glu);
		gl.glPopMatrix();
		*/

		gl.glPushMatrix();
		gl.glTranslatef(5, 0, -10);
		drawDesk(gl);
		gl.glPopMatrix();

		gl.glPushMatrix();
		gl.glTranslatef(6, 0, -50);
		drawBunkBed(gl);
		gl.glPopMatrix();
		
		gl.glPopMatrix();
	  gl.glPopMatrix();
	}

	private void drawBuilding(GL2 gl, GLU glu) {
		gl.glColor3f(1, 0, 0);
		drawFront(gl, glu);

		gl.glColor3f(1, 0, 1);
		gl.glPushMatrix();
		gl.glTranslatef(80, 0, 0);
		gl.glRotatef(90, 0, 1, 0);
		drawRight(gl, glu);
		gl.glPopMatrix();

		gl.glColor3f(0, 1, 1);
		gl.glPushMatrix();
		gl.glTranslatef(80, 0, -60);
		gl.glRotatef(180, 0, 1, 0);
		drawBack(gl, glu);
		gl.glPopMatrix();

		gl.glColor3f(0, 1, 0);
		gl.glPushMatrix();
		gl.glTranslatef(2, 0, -58);
		gl.glRotatef(-90, 0, 1, 0);
		drawLeft(gl, glu);
		gl.glPopMatrix();

		drawTower(gl, glu);
		
		gl.glPushMatrix();
		gl.glTranslatef(30, 0, -40);
		pooltable.draw(gl,glu);
		gl.glPopMatrix();
		
		gl.glColor3f(1, 1, 0);
		gl.glPushMatrix();
		gl.glTranslatef(57, 0, -50);
		//drawFireTruck(gl);
		firetruck.draw(gl,glu);
		gl.glPopMatrix();

		// fire pole
		gl.glColor3f(.5f, 0, .5f);
		gl.glPushMatrix();
		gl.glTranslatef(8, 0, -55);
		gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
		glu.gluCylinder(quadric, .3, .3, 60, 10, 1);
		gl.glPopMatrix();

		// fire hole bottom
		gl.glColor3f(0, 0, 0);
		gl.glPushMatrix();
		gl.glTranslatef(8, 41.9f, -55);
		gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
		glu.gluDisk(quadric, .3, 2.5, 10, 1);
		gl.glPopMatrix();

		// fire hole top
		gl.glColor3f(0, 0, 0);
		gl.glPushMatrix();
		gl.glTranslatef(8, 42.1f, -55);
		gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
		glu.gluDisk(quadric, .3, 2.5, 10, 1);
		gl.glPopMatrix();
		
		// sirens used to be drawn here, moved to "drawMoving"

		drawFloors(gl);
		drawRoof(gl);
	}

	private void drawFront(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brick.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .5f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, 1f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		// left wall
		gl.glVertex3f(20, 0, 0);
		gl.glVertex3f(25, 0, 0);
		gl.glVertex3f(25, 60, 0);
		gl.glVertex3f(20, 60, 0);

		gl.glVertex3f(20, 0, -.5f);
		gl.glVertex3f(25, 0, -.5f);
		gl.glVertex3f(25, 60, -.5f);
		gl.glVertex3f(20, 60, -.5f);

		// right wall
		gl.glVertex3f(75, 0, 0);
		gl.glVertex3f(80, 0, 0);
		gl.glVertex3f(80, 60, 0);
		gl.glVertex3f(75, 60, 0);

		gl.glVertex3f(75, 0, -.5f);
		gl.glVertex3f(80, 0, -.5f);
		gl.glVertex3f(80, 60, -.5f);
		gl.glVertex3f(75, 60, -.5f);
		// middle wall between garage doors
		gl.glVertex3f(45, 0, 0);
		gl.glVertex3f(55, 0, 0);
		gl.glVertex3f(55, 60, 0);
		gl.glVertex3f(45, 60, 0);

		gl.glVertex3f(45, 0, -.5f);
		gl.glVertex3f(55, 0, -.5f);
		gl.glVertex3f(55, 60, -.5f);
		gl.glVertex3f(45, 60, -.5f);
		// above 1st garage door
		gl.glVertex3f(25, 30, 0);
		gl.glVertex3f(45, 30, 0);
		gl.glVertex3f(45, 45, 0);
		gl.glVertex3f(25, 45, 0);

		gl.glVertex3f(25, 30, -.5f);
		gl.glVertex3f(45, 30, -.5f);
		gl.glVertex3f(45, 45, -.5f);
		gl.glVertex3f(25, 45, -.5f);
		// above 2nd garage door
		gl.glVertex3f(55, 30, 0);
		gl.glVertex3f(75, 30, 0);
		gl.glVertex3f(75, 45, 0);
		gl.glVertex3f(55, 45, 0);

		gl.glVertex3f(55, 30, -.5f);
		gl.glVertex3f(75, 30, -.5f);
		gl.glVertex3f(75, 45, -.5f);
		gl.glVertex3f(55, 45, -.5f);
		// above 1st window
		gl.glVertex3f(25, 55, 0);
		gl.glVertex3f(45, 55, 0);
		gl.glVertex3f(45, 60, 0);
		gl.glVertex3f(25, 60, 0);

		gl.glVertex3f(25, 55, -.5f);
		gl.glVertex3f(45, 55, -.5f);
		gl.glVertex3f(45, 60, -.5f);
		gl.glVertex3f(25, 60, -.5f);
		// above 2nd window
		gl.glVertex3f(55, 55, 0);
		gl.glVertex3f(75, 55, 0);
		gl.glVertex3f(75, 60, 0);
		gl.glVertex3f(55, 60, 0);

		gl.glVertex3f(55, 55, -.5f);
		gl.glVertex3f(75, 55, -.5f);
		gl.glVertex3f(75, 60, -.5f);
		gl.glVertex3f(55, 60, -.5f);
		/*
		 * // inside of garage hole // left gl.glVertex3f(25, 0, 0);
		 * gl.glVertex3f(25, 30, 0); gl.glVertex3f(25, 30, -.5f);
		 * gl.glVertex3f(25, 0, -.5f); // top gl.glVertex3f(25, 30, 0);
		 * gl.glVertex3f(25, 30, -.5f); gl.glVertex3f(45, 30, -.5f);
		 * gl.glVertex3f(45, 30, 0); // right gl.glVertex3f(45, 0, 0);
		 * gl.glVertex3f(45, 30, 0); gl.glVertex3f(45, 30, -.5f);
		 * gl.glVertex3f(45, 0, -.5f);
		 */

		// section from tower to main building
		gl.glVertex3f(20, 0, 2);
		gl.glVertex3f(20, 0, -.5f);
		gl.glVertex3f(20, 60, -.5f);
		gl.glVertex3f(20, 60, 2);

		gl.glEnd();

		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex3f(42, 65, 0);
		gl.glVertex3f(50, 70, 0);
		gl.glVertex3f(58, 65, 0);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		gl.glEnable(GL2.GL_TEXTURE_2D);
		sign.bind();
		gl.glBegin(GL2.GL_QUADS);
		// Firehouse sign
		gl.glTexCoord2f(0f, 1f);
		gl.glVertex3f(40, 60, 0);
		gl.glTexCoord2f(1f, 1f);
		gl.glVertex3f(60, 60, 0);
		gl.glTexCoord2f(1f, 0f);
		gl.glVertex3f(60, 65, 0);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(40, 65, 0);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);

		// leftWindow
		drawWindow(gl, glu, 25, 45, 0, 20, 10, 2, 3);
		// rightWindow
		drawWindow(gl, glu, 55, 45, 0, 20, 10, 2, 3);
		// left garage door
		drawWindow(gl, glu, 25, 0, 0, 20, 30, 5, 1);
		// right garage door
		drawWindow(gl, glu, 55, 0, 0, 20, 30, 1, 1);
	}

	private void drawRight(GL2 gl, GLU glu) {
		gl.glColor3f(1, 0, 0);
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brick.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .5f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, 1f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		// draw Bottom wall
		gl.glVertex3f(0, 0, 0);
		gl.glVertex3f(60, 0, 0);
		gl.glVertex3f(60, 25, 0);
		gl.glVertex3f(0, 25, 0);

		gl.glVertex3f(0, 0, -.5f);
		gl.glVertex3f(60, 0, -.5f);
		gl.glVertex3f(60, 25, -.5f);
		gl.glVertex3f(0, 25, -.5f);
		/*
		 * gl.glVertex3f(5,0,2); gl.glVertex3f(5,0,1.5f);
		 * gl.glVertex3f(5,80,1.5f); gl.glVertex3f(5,80,2);
		 */
		// Top wall
		gl.glVertex3f(0, 55, 0);
		gl.glVertex3f(60, 55, 0);
		gl.glVertex3f(60, 60, 0);
		gl.glVertex3f(0, 60, 0);

		gl.glVertex3f(0, 55, -.5f);
		gl.glVertex3f(60, 55, -.5f);
		gl.glVertex3f(60, 60, -.5f);
		gl.glVertex3f(0, 60, -.5f);
		// left wall
		gl.glVertex3f(0, 25, 0);
		gl.glVertex3f(5, 25, 0);
		gl.glVertex3f(5, 55, 0);
		gl.glVertex3f(0, 55, 0);

		gl.glVertex3f(0, 25, -.5f);
		gl.glVertex3f(5, 25, -.5f);
		gl.glVertex3f(5, 55, -.5f);
		gl.glVertex3f(0, 55, -.5f);
		// right wall
		gl.glVertex3f(55, 25, 0);
		gl.glVertex3f(60, 25, 0);
		gl.glVertex3f(60, 55, 0);
		gl.glVertex3f(55, 55, 0);

		gl.glVertex3f(55, 25, -.5f);
		gl.glVertex3f(60, 25, -.5f);
		gl.glVertex3f(60, 55, -.5f);
		gl.glVertex3f(55, 55, -.5f);
		// horizontal wall
		gl.glVertex3f(5, 35, 0);
		gl.glVertex3f(55, 35, 0);
		gl.glVertex3f(55, 45, 0);
		gl.glVertex3f(5, 45, 0);

		gl.glVertex3f(5, 35, -.5f);
		gl.glVertex3f(55, 35, -.5f);
		gl.glVertex3f(55, 45, -.5f);
		gl.glVertex3f(5, 45, -.5f);
		// middle walls
		// top
		gl.glVertex3f(25, 45, 0);
		gl.glVertex3f(35, 45, 0);
		gl.glVertex3f(35, 55, 0);
		gl.glVertex3f(25, 55, 0);

		gl.glVertex3f(25, 45, -.5f);
		gl.glVertex3f(35, 45, -.5f);
		gl.glVertex3f(35, 55, -.5f);
		gl.glVertex3f(25, 55, -.5f);
		// bottom
		gl.glVertex3f(25, 25, 0);
		gl.glVertex3f(35, 25, 0);
		gl.glVertex3f(35, 35, 0);
		gl.glVertex3f(25, 35, 0);

		gl.glVertex3f(25, 25, -.5f);
		gl.glVertex3f(35, 25, -.5f);
		gl.glVertex3f(35, 35, -.5f);
		gl.glVertex3f(25, 35, -.5f);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// top left window
		drawWindow(gl, glu, 5, 45, 0, 20, 10, 2, 4);
		// top right window
		drawWindow(gl, glu, 35, 45, 0, 20, 10, 2, 4);
		// bottom left window
		drawWindow(gl, glu, 5, 25, 0, 20, 10, 2, 4);
		// bottom right window
		drawWindow(gl, glu, 35, 25, 0, 20, 10, 2, 4);
	}

	private void drawBack(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brick.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .5f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, 1f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		// Top wall
		gl.glVertex3f(0, 55, 0);
		gl.glVertex3f(78, 55, 0);
		gl.glVertex3f(78, 60, 0);
		gl.glVertex3f(0, 60, 0);

		gl.glVertex3f(0, 55, -.5f);
		gl.glVertex3f(78, 55, -.5f);
		gl.glVertex3f(78, 60, -.5f);
		gl.glVertex3f(0, 60, -.5f);
		// left wall
		gl.glVertex3f(0, 0, 0);
		gl.glVertex3f(5, 0, 0);
		gl.glVertex3f(5, 55, 0);
		gl.glVertex3f(0, 55, 0);

		gl.glVertex3f(0, 0, -.5f);
		gl.glVertex3f(5, 0, -.5f);
		gl.glVertex3f(5, 55, -.5f);
		gl.glVertex3f(0, 55, -.5f);
		// right wall
		gl.glVertex3f(55, 0, 0);
		gl.glVertex3f(78, 0, 0);
		gl.glVertex3f(78, 55, 0);
		gl.glVertex3f(55, 55, 0);

		gl.glVertex3f(55, 0, -.5f);
		gl.glVertex3f(78, 0, -.5f);
		gl.glVertex3f(78, 55, -.5f);
		gl.glVertex3f(55, 55, -.5f);
		// top horizontal wall
		gl.glVertex3f(5, 35, 0);
		gl.glVertex3f(55, 35, 0);
		gl.glVertex3f(55, 45, 0);
		gl.glVertex3f(5, 45, 0);

		gl.glVertex3f(5, 35, -.5f);
		gl.glVertex3f(55, 35, -.5f);
		gl.glVertex3f(55, 45, -.5f);
		gl.glVertex3f(5, 45, -.5f);
		// bottom horizontal wall
		gl.glVertex3f(5, 15, 0);
		gl.glVertex3f(55, 15, 0);
		gl.glVertex3f(55, 25, 0);
		gl.glVertex3f(5, 25, 0);

		gl.glVertex3f(5, 15, -.5f);
		gl.glVertex3f(55, 15, -.5f);
		gl.glVertex3f(55, 25, -.5f);
		gl.glVertex3f(5, 25, -.5f);
		// middle walls
		// top
		gl.glVertex3f(25, 45, 0);
		gl.glVertex3f(35, 45, 0);
		gl.glVertex3f(35, 55, 0);
		gl.glVertex3f(25, 55, 0);

		gl.glVertex3f(25, 45, -.5f);
		gl.glVertex3f(35, 45, -.5f);
		gl.glVertex3f(35, 55, -.5f);
		gl.glVertex3f(25, 55, -.5f);
		// bottom
		gl.glVertex3f(25, 25, 0);
		gl.glVertex3f(35, 25, 0);
		gl.glVertex3f(35, 35, 0);
		gl.glVertex3f(25, 35, 0);

		gl.glVertex3f(25, 25, -.5f);
		gl.glVertex3f(35, 25, -.5f);
		gl.glVertex3f(35, 35, -.5f);
		gl.glVertex3f(25, 35, -.5f);
		// bottom horizontal walls
		// left
		gl.glVertex3f(5, 0, 0);
		gl.glVertex3f(27.5f, 0, 0);
		gl.glVertex3f(27.5f, 5, 0);
		gl.glVertex3f(5, 5, 0);

		gl.glVertex3f(5, 0, -.5f);
		gl.glVertex3f(27.5f, 0, -.5f);
		gl.glVertex3f(27.5f, 5, -.5f);
		gl.glVertex3f(5, 5, -.5f);
		// right
		gl.glVertex3f(32.5f, 0, 0);
		gl.glVertex3f(55, 0, 0);
		gl.glVertex3f(55, 5, 0);
		gl.glVertex3f(32.5f, 5, 0);

		gl.glVertex3f(32.5f, 0, -.5f);
		gl.glVertex3f(55, 0, -.5f);
		gl.glVertex3f(55, 5, -.5f);
		gl.glVertex3f(32.5f, 5, -.5f);

		// left of door
		gl.glVertex3f(20, 5, 0);
		gl.glVertex3f(27.5f, 5, 0);
		gl.glVertex3f(27.5f, 15, 0);
		gl.glVertex3f(20, 15, 0);

		gl.glVertex3f(20, 5, -.5f);
		gl.glVertex3f(27.5f, 5, -.5f);
		gl.glVertex3f(27.5f, 15, -.5f);
		gl.glVertex3f(20, 15, -.5f);
		// right of door
		gl.glVertex3f(32.5f, 5, 0);
		gl.glVertex3f(40, 5, 0);
		gl.glVertex3f(40, 10, 0);
		gl.glVertex3f(32.5f, 10, 0);

		gl.glVertex3f(32.5f, 5, -.5f);
		gl.glVertex3f(40, 5, -.5f);
		gl.glVertex3f(40, 15, -.5f);
		gl.glVertex3f(32.5f, 15, -.5f);
		// above door
		gl.glVertex3f(27.5f, 10, 0);
		gl.glVertex3f(32.5f, 10, 0);
		gl.glVertex3f(32.5f, 15, 0);
		gl.glVertex3f(27.5f, 15, 0);

		gl.glVertex3f(27.5f, 10, -.5f);
		gl.glVertex3f(32.5f, 10, -.5f);
		gl.glVertex3f(32.5f, 15, -.5f);
		gl.glVertex3f(27.5f, 15, -.5f);
		// inside door
		// left
		gl.glVertex3f(27.5f, 0, 0);
		gl.glVertex3f(27.5f, 0, -.5f);
		gl.glVertex3f(27.5f, 10, -.5f);
		gl.glVertex3f(27.5f, 10, 0);
		// right
		gl.glVertex3f(32.5f, 0, 0);
		gl.glVertex3f(32.5f, 0, -.5f);
		gl.glVertex3f(32.5f, 10, -.5f);
		gl.glVertex3f(32.5f, 10, 0);
		// top
		gl.glVertex3f(27.5f, 10, 0);
		gl.glVertex3f(32.5f, 10, 0);
		gl.glVertex3f(32.5f, 10, -.5f);
		gl.glVertex3f(27.5f, 10, -.5f);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// top left window
		drawWindow(gl, glu, 5, 45, 0, 20, 10, 2, 4);
		// top right window
		drawWindow(gl, glu, 35, 45, 0, 20, 10, 2, 4);
		// mid left window
		drawWindow(gl, glu, 5, 25, 0, 20, 10, 2, 4);
		// mid right window
		drawWindow(gl, glu, 35, 25, 0, 20, 10, 2, 4);
		// bottom left window
		drawWindow(gl, glu, 5, 5, 0, 15, 10, 2, 3);
		// bttom right window
		drawWindow(gl, glu, 40, 5, 0, 15, 10, 2, 3);
	}

	private void drawLeft(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brick.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .5f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, 1f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glColor3f(1, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		// Top wall
		gl.glVertex3f(-2, 55, 0);
		gl.glVertex3f(40, 55, 0);
		gl.glVertex3f(40, 60, 0);
		gl.glVertex3f(-2, 60, 0);

		gl.glVertex3f(-2, 55, -.5f);
		gl.glVertex3f(40, 55, -.5f);
		gl.glVertex3f(40, 60, -.5f);
		gl.glVertex3f(-2, 60, -.5f);
		// left wall
		gl.glVertex3f(-2, 0, 0);
		gl.glVertex3f(5, 0, 0);
		gl.glVertex3f(5, 55, 0);
		gl.glVertex3f(-2, 55, 0);

		gl.glVertex3f(-2, 0, -.5f);
		gl.glVertex3f(5, 0, -.5f);
		gl.glVertex3f(5, 55, -.5f);
		gl.glVertex3f(-2, 55, -.5f);
		// right wall
		gl.glVertex3f(35, 0, 0);
		gl.glVertex3f(40, 0, 0);
		gl.glVertex3f(40, 55, 0);
		gl.glVertex3f(35, 55, 0);

		gl.glVertex3f(35, 0, -.5f);
		gl.glVertex3f(40, 0, -.5f);
		gl.glVertex3f(40, 55, -.5f);
		gl.glVertex3f(35, 55, -.5f);
		// top horizontal wall
		gl.glVertex3f(5, 35, 0);
		gl.glVertex3f(35, 35, 0);
		gl.glVertex3f(35, 45, 0);
		gl.glVertex3f(5, 45, 0);

		gl.glVertex3f(5, 35, -.5f);
		gl.glVertex3f(35, 35, -.5f);
		gl.glVertex3f(35, 45, -.5f);
		gl.glVertex3f(5, 45, -.5f);
		// bottom horizontal wall
		gl.glVertex3f(5, 15, 0);
		gl.glVertex3f(35, 15, 0);
		gl.glVertex3f(35, 25, 0);
		gl.glVertex3f(5, 25, 0);

		gl.glVertex3f(5, 15, -.5f);
		gl.glVertex3f(35, 15, -.5f);
		gl.glVertex3f(35, 25, -.5f);
		gl.glVertex3f(5, 25, -.5f);
		// footer horizontal wall
		gl.glVertex3f(5, 0, 0);
		gl.glVertex3f(35, 0, 0);
		gl.glVertex3f(35, 5, 0);
		gl.glVertex3f(5, 5, 0);

		gl.glVertex3f(5, 0, -.5f);
		gl.glVertex3f(35, 0, -.5f);
		gl.glVertex3f(35, 5, -.5f);
		gl.glVertex3f(5, 5, -.5f);
		// mid walls
		// top
		gl.glVertex3f(20, 45, 0);
		gl.glVertex3f(25, 45, 0);
		gl.glVertex3f(25, 55, 0);
		gl.glVertex3f(20, 55, 0);

		gl.glVertex3f(20, 45, -.5f);
		gl.glVertex3f(25, 45, -.5f);
		gl.glVertex3f(25, 55, -.5f);
		gl.glVertex3f(20, 55, -.5f);
		// mid
		gl.glVertex3f(20, 25, 0);
		gl.glVertex3f(25, 25, 0);
		gl.glVertex3f(25, 35, 0);
		gl.glVertex3f(20, 35, 0);

		gl.glVertex3f(20, 25, -.5f);
		gl.glVertex3f(25, 25, -.5f);
		gl.glVertex3f(25, 35, -.5f);
		gl.glVertex3f(20, 35, -.5f);
		// bottom
		gl.glVertex3f(20, 5, 0);
		gl.glVertex3f(25, 5, 0);
		gl.glVertex3f(25, 15, 0);
		gl.glVertex3f(20, 15, 0);

		gl.glVertex3f(20, 5, -.5f);
		gl.glVertex3f(25, 5, -.5f);
		gl.glVertex3f(25, 15, -.5f);
		gl.glVertex3f(20, 15, -.5f);

		// section from tower to main building
		gl.glVertex3f(40, 0, 2);
		gl.glVertex3f(40, 0, -.5f);
		gl.glVertex3f(40, 60, -.5f);
		gl.glVertex3f(40, 60, 2);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// top left window
		drawWindow(gl, glu, 5, 45, 0, 15, 10, 2, 3);
		// top right window
		drawWindow(gl, glu, 25, 45, 0, 10, 10, 2, 2);
		// mid left window
		drawWindow(gl, glu, 5, 25, 0, 15, 10, 2, 3);
		// mid right window
		drawWindow(gl, glu, 25, 25, 0, 10, 10, 2, 2);
		// bottom left window
		drawWindow(gl, glu, 5, 5, 0, 15, 10, 2, 3);
		// bottom right window
		drawWindow(gl, glu, 25, 5, 0, 10, 10, 2, 2);
	}

	private void drawTower(GL2 gl, GLU glu) {
		gl.glColor3f(1, 0, 0);

		drawTowerFace(gl, glu);

		gl.glColor3f(1, 1, 0);
		gl.glPushMatrix();
		gl.glTranslatef(18, 0, 2);
		gl.glRotatef(90, 0, 1, 0);
		drawTowerRight(gl, glu);
		gl.glPopMatrix();

		gl.glColor3f(1, 0, 1);
		gl.glPushMatrix();
		gl.glTranslatef(20, 0, -16f);
		gl.glRotatef(180, 0, 1, 0);
		// draw back-looks just like right just rotated differently
		drawTowerRight(gl, glu);
		gl.glPopMatrix();

		gl.glColor3f(0, 1, 0);
		gl.glPushMatrix();
		gl.glTranslatef(2, 0, -18);
		gl.glRotatef(-90, 0, 1, 0);
		drawTowerLeft(gl, glu);
		gl.glPopMatrix();
	}

	private void drawTowerFace(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brick.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .5f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, 1f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		// left side wall
		gl.glVertex3f(0, 0, 2);
		gl.glVertex3f(5, 0, 2);
		gl.glVertex3f(5, 80, 2);
		gl.glVertex3f(0, 80, 2);

		gl.glVertex3f(0, 0, 1.5f);
		gl.glVertex3f(5, 0, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		gl.glVertex3f(0, 80, 1.5f);

		gl.glVertex3f(5, 0, 2);
		gl.glVertex3f(5, 0, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		gl.glVertex3f(5, 80, 2);
		// right side wall
		gl.glVertex3f(15, 0, 2);
		gl.glVertex3f(20, 0, 2);
		gl.glVertex3f(20, 80, 2);
		gl.glVertex3f(15, 80, 2);

		gl.glVertex3f(15, 0, 1.5f);
		gl.glVertex3f(20, 0, 1.5f);
		gl.glVertex3f(20, 80, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);

		gl.glVertex3f(15, 0, 2);
		gl.glVertex3f(15, 0, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);
		gl.glVertex3f(15, 80, 2);
		// above door
		gl.glVertex3f(5, 10, 2);
		gl.glVertex3f(15, 10, 2);
		gl.glVertex3f(15, 25, 2);
		gl.glVertex3f(5, 25, 2);

		gl.glVertex3f(5, 10, 1.5f);
		gl.glVertex3f(15, 10, 1.5f);
		gl.glVertex3f(15, 25, 1.5f);
		gl.glVertex3f(5, 25, 1.5f);

		// above 1st window
		gl.glVertex3f(5, 35, 2);
		gl.glVertex3f(15, 35, 2);
		gl.glVertex3f(15, 45, 2);
		gl.glVertex3f(5, 45, 2);

		gl.glVertex3f(5, 35, 1.5f);
		gl.glVertex3f(15, 35, 1.5f);
		gl.glVertex3f(15, 45, 1.5f);
		gl.glVertex3f(5, 45, 1.5f);
		// above 2nd window
		gl.glVertex3f(5, 55, 2);
		gl.glVertex3f(15, 55, 2);
		gl.glVertex3f(15, 70, 2);
		gl.glVertex3f(5, 70, 2);

		gl.glVertex3f(5, 55, 1.5f);
		gl.glVertex3f(15, 55, 1.5f);
		gl.glVertex3f(15, 70, 1.5f);
		gl.glVertex3f(5, 70, 1.5f);
		// above tower inlet
		gl.glVertex3f(5, 75, 2);
		gl.glVertex3f(15, 75, 2);
		gl.glVertex3f(15, 80, 2);
		gl.glVertex3f(5, 80, 2);

		gl.glVertex3f(5, 75, 1.5f);
		gl.glVertex3f(15, 75, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		// inside of inlet
		// top
		gl.glVertex3f(5, 75, 2);
		gl.glVertex3f(5, 75, 1.5f);
		gl.glVertex3f(15, 75, 1.5f);
		gl.glVertex3f(15, 75, 2);
		// bottom
		gl.glVertex3f(5, 65, 2);
		gl.glVertex3f(5, 65, 1.5f);
		gl.glVertex3f(15, 65, 1.5f);
		gl.glVertex3f(15, 65, 2);

		// left door trim
		gl.glVertex3f(5, 0, 2);
		gl.glVertex3f(7.5f, 0, 2);
		gl.glVertex3f(7.5f, 10, 2);
		gl.glVertex3f(5, 10, 2);

		gl.glVertex3f(5, 0, 1.5f);
		gl.glVertex3f(7.5f, 0, 1.5f);
		gl.glVertex3f(7.5f, 10, 1.5f);
		gl.glVertex3f(5, 10, 1.5f);

		gl.glVertex3f(7.5f, 0, 2);
		gl.glVertex3f(7.5f, 0, 1.5f);
		gl.glVertex3f(7.5f, 10, 1.5f);
		gl.glVertex3f(7.5f, 10, 2);
		// right door trim
		gl.glVertex3f(12.5f, 0, 2);
		gl.glVertex3f(15, 0, 2);
		gl.glVertex3f(15, 10, 2);
		gl.glVertex3f(12.5f, 10, 2);

		gl.glVertex3f(12.5f, 0, 1.5f);
		gl.glVertex3f(15, 0, 1.5f);
		gl.glVertex3f(15, 10, 1.5f);
		gl.glVertex3f(12.5f, 10, 1.5f);

		gl.glVertex3f(12.5f, 0, 2);
		gl.glVertex3f(12.5f, 0, 1.5f);
		gl.glVertex3f(12.5f, 10, 1.5f);
		gl.glVertex3f(12.5f, 10, 2);

		// top of door
		gl.glVertex3f(7.5f, 10, 2);
		gl.glVertex3f(7.5f, 10, 1.5f);
		gl.glVertex3f(12.5f, 10, 1.5f);
		gl.glVertex3f(12.5f, 10, 2);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// 1st window
		drawWindow(gl, glu, 5, 25, 2, 10, 10, 2, 2);
		// 2md window
		drawWindow(gl, glu, 5, 45, 2, 10, 10, 2, 2);
		drawRoofSegment(gl, glu);
	}

	private void drawTowerRight(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brick.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .5f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, 1f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		// left wall
		gl.glVertex3f(0, 60, 2);
		gl.glVertex3f(5, 60, 2);
		gl.glVertex3f(5, 80, 2);
		gl.glVertex3f(0, 80, 2);

		gl.glVertex3f(0, 60, 1.5f);
		gl.glVertex3f(5, 60, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		gl.glVertex3f(0, 80, 1.5f);

		gl.glVertex3f(5, 60, 2);
		gl.glVertex3f(5, 60, 2);
		gl.glVertex3f(5, 80, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);

		// right wall
		gl.glVertex3f(15, 60, 2);
		gl.glVertex3f(20, 60, 2);
		gl.glVertex3f(20, 80, 2);
		gl.glVertex3f(15, 80, 2);

		gl.glVertex3f(15, 60, 1.5f);
		gl.glVertex3f(20, 60, 1.5f);
		gl.glVertex3f(20, 80, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);

		gl.glVertex3f(15, 60, 2);
		gl.glVertex3f(15, 60, 2);
		gl.glVertex3f(15, 80, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);
		// above building
		gl.glVertex3f(5, 60, 2);
		gl.glVertex3f(15, 60, 2);
		gl.glVertex3f(15, 70, 2);
		gl.glVertex3f(5, 70, 2);

		gl.glVertex3f(5, 60, 1.5f);
		gl.glVertex3f(15, 60, 1.5f);
		gl.glVertex3f(15, 70, 1.5f);
		gl.glVertex3f(5, 70, 1.5f);

		// above tower inlet
		gl.glVertex3f(5, 75, 2);
		gl.glVertex3f(15, 75, 2);
		gl.glVertex3f(15, 80, 2);
		gl.glVertex3f(5, 80, 2);

		gl.glVertex3f(5, 75, 1.5f);
		gl.glVertex3f(15, 75, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		// inside of inlet
		// top
		gl.glVertex3f(5, 75, 2);
		gl.glVertex3f(5, 75, 1.5f);
		gl.glVertex3f(15, 75, 1.5f);
		gl.glVertex3f(15, 75, 2);
		// bottom
		gl.glVertex3f(5, 65, 2);
		gl.glVertex3f(5, 65, 1.5f);
		gl.glVertex3f(15, 65, 1.5f);
		gl.glVertex3f(15, 65, 2);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		drawRoofSegment(gl, glu);
	}

	private void drawTowerLeft(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brick.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .5f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, 1f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		// left side wall
		gl.glVertex3f(0, 0, 2);
		gl.glVertex3f(5, 0, 2);
		gl.glVertex3f(5, 80, 2);
		gl.glVertex3f(0, 80, 2);

		gl.glVertex3f(0, 0, 1.5f);
		gl.glVertex3f(5, 0, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		gl.glVertex3f(0, 80, 1.5f);

		gl.glVertex3f(5, 0, 2);
		gl.glVertex3f(5, 0, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		gl.glVertex3f(5, 80, 2);
		// right side wall
		gl.glVertex3f(15, 0, 2);
		gl.glVertex3f(20, 0, 2);
		gl.glVertex3f(20, 80, 2);
		gl.glVertex3f(15, 80, 2);

		gl.glVertex3f(15, 0, 1.5f);
		gl.glVertex3f(20, 0, 1.5f);
		gl.glVertex3f(20, 80, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);

		gl.glVertex3f(15, 0, 2);
		gl.glVertex3f(15, 0, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);
		gl.glVertex3f(15, 80, 2);
		// below 1st window
		gl.glVertex3f(5, 0, 2);
		gl.glVertex3f(15, 0, 2);
		gl.glVertex3f(15, 5, 2);
		gl.glVertex3f(5, 5, 2);

		gl.glVertex3f(5, 0, 1.5f);
		gl.glVertex3f(15, 0, 1.5f);
		gl.glVertex3f(15, 5, 1.5f);
		gl.glVertex3f(5, 5, 1.5f);
		// above 1st window
		gl.glVertex3f(5, 15, 2);
		gl.glVertex3f(15, 15, 2);
		gl.glVertex3f(15, 25, 2);
		gl.glVertex3f(5, 25, 2);

		gl.glVertex3f(5, 15, 1.5f);
		gl.glVertex3f(15, 15, 1.5f);
		gl.glVertex3f(15, 25, 1.5f);
		gl.glVertex3f(5, 25, 1.5f);
		// above 2nd window
		gl.glVertex3f(5, 35, 2);
		gl.glVertex3f(15, 35, 2);
		gl.glVertex3f(15, 45, 2);
		gl.glVertex3f(5, 45, 2);

		gl.glVertex3f(5, 35, 1.5f);
		gl.glVertex3f(15, 35, 1.5f);
		gl.glVertex3f(15, 45, 1.5f);
		gl.glVertex3f(5, 45, 1.5f);
		// above 3rd window
		gl.glVertex3f(5, 55, 2);
		gl.glVertex3f(15, 55, 2);
		gl.glVertex3f(15, 70, 2);
		gl.glVertex3f(5, 70, 2);

		gl.glVertex3f(5, 55, 1.5f);
		gl.glVertex3f(15, 55, 1.5f);
		gl.glVertex3f(15, 70, 1.5f);
		gl.glVertex3f(5, 70, 1.5f);
		// above tower inlet
		gl.glVertex3f(5, 75, 2);
		gl.glVertex3f(15, 75, 2);
		gl.glVertex3f(15, 80, 2);
		gl.glVertex3f(5, 80, 2);

		gl.glVertex3f(5, 75, 1.5f);
		gl.glVertex3f(15, 75, 1.5f);
		gl.glVertex3f(15, 80, 1.5f);
		gl.glVertex3f(5, 80, 1.5f);
		// inside of inlet
		// top
		gl.glVertex3f(5, 75, 2);
		gl.glVertex3f(5, 75, 1.5f);
		gl.glVertex3f(15, 75, 1.5f);
		gl.glVertex3f(15, 75, 2);
		// bottom
		gl.glVertex3f(5, 65, 2);
		gl.glVertex3f(5, 65, 1.5f);
		gl.glVertex3f(15, 65, 1.5f);
		gl.glVertex3f(15, 65, 2);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// 1st window
		drawWindow(gl, glu, 5, 5, 2, 10, 10, 2, 2);
		// 2nd window
		drawWindow(gl, glu, 5, 25, 2, 10, 10, 2, 2);
		// 3rd window
		drawWindow(gl, glu, 5, 45, 2, 10, 10, 2, 2);
		drawRoofSegment(gl, glu);
	}

	private void drawRoofSegment(GL2 gl, GLU glu) {
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex3f(-1, 79.5f, 3);
		gl.glVertex3f(21, 79.5f, 3);
		gl.glVertex3f(10, 86.25f, -8);
		gl.glEnd();
	}

	private void drawWindow(GL2 gl, GLU glu, float bottomLx, float bottomLy,
			float bottomLz, float width, float height, int rows, int columns) {
		float availableHeight = height - 2 * windowTrim - (rows - 1)
				* windowSeperator;
		float availableWidth = width - 2 * windowTrim - (columns - 1)
				* windowSeperator;
		float windowHeight = availableHeight / rows;
		float windowWidth = availableWidth / columns;
		float glassDepth = bottomLz - windowDepth / 2;
		float backZCoor = bottomLz - windowDepth;

		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		// left trim
		gl.glVertex3f(bottomLx, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height, bottomLz);
		gl.glVertex3f(bottomLx, bottomLy + height, bottomLz);

		gl.glVertex3f(bottomLx, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height, backZCoor);
		gl.glVertex3f(bottomLx, bottomLy + height, backZCoor);

		gl.glVertex3f(bottomLx + windowTrim, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height, backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height, bottomLz);
		// right trim
		gl.glVertex3f(bottomLx + width, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height,
				bottomLz);
		gl.glVertex3f(bottomLx + width, bottomLy + height, bottomLz);

		gl.glVertex3f(bottomLx + width, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height,
				backZCoor);
		gl.glVertex3f(bottomLx + width, bottomLy + height, backZCoor);

		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height,
				backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height,
				bottomLz);
		// bottom trim
		gl.glVertex3f(bottomLx + windowTrim, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + windowTrim,
				bottomLz);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + windowTrim, bottomLz);

		gl.glVertex3f(bottomLx + windowTrim, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy, backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + windowTrim,
				backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + windowTrim, backZCoor);

		gl.glVertex3f(bottomLx + windowTrim, bottomLy + windowTrim, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + windowTrim,
				bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + windowTrim,
				backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + windowTrim, backZCoor);
		// top trim
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height, bottomLz);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height - windowTrim,
				bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height
				- windowTrim, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height,
				bottomLz);

		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height, backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height - windowTrim,
				backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height
				- windowTrim, backZCoor);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height,
				backZCoor);

		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height - windowTrim,
				bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height
				- windowTrim, bottomLz);
		gl.glVertex3f(bottomLx + width - windowTrim, bottomLy + height
				- windowTrim, backZCoor);
		gl.glVertex3f(bottomLx + windowTrim, bottomLy + height - windowTrim,
				backZCoor);

		// window seperators
		for (int i = 1; i < rows; i++) {
			gl.glVertex3f(bottomLx + windowTrim, bottomLy + windowHeight * i,
					glassDepth);
			gl.glVertex3f(bottomLx + width - windowTrim, bottomLy
					+ windowHeight * i, glassDepth);
			gl.glVertex3f(bottomLx + width - windowTrim, bottomLy
					+ windowHeight * i + windowSeperator, glassDepth);
			gl.glVertex3f(bottomLx + windowTrim, bottomLy + windowHeight * i
					+ windowSeperator, glassDepth);
		}

		for (int j = 1; j < columns; j++) {
			gl.glVertex3f(bottomLx + windowTrim + windowWidth * j, bottomLy
					+ windowTrim, glassDepth);
			gl.glVertex3f(bottomLx + windowTrim + windowWidth * j, bottomLy
					+ height - windowTrim, glassDepth);
			gl.glVertex3f(bottomLx + windowTrim + windowWidth * j
					+ windowSeperator, bottomLy + height - windowTrim,
					glassDepth);
			gl.glVertex3f(bottomLx + windowTrim + windowWidth * j
					+ windowSeperator, bottomLy + windowTrim, glassDepth);
		}
		gl.glEnd();
	}

	/*
	private void drawFireTruck(GL2 gl) {
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		// top
		gl.glVertex3f(0, 16, 0);
		gl.glVertex3f(0, 16, -40);
		gl.glVertex3f(16, 16, -40);
		gl.glVertex3f(16, 16, 0);
		gl.glEnd();

		gl.glEnable(GL2.GL_TEXTURE_2D);
		frontTruck.bind();
		gl.glBegin(GL2.GL_QUADS);
		// front
		gl.glTexCoord2f(0f, 1f);
		gl.glVertex3f(0, 0, 0);
		gl.glTexCoord2f(1f, 1f);
		gl.glVertex3f(16, 0, 0);
		gl.glTexCoord2f(1f, 0f);
		gl.glVertex3f(16, 16, 0);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(0, 16, 0);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);

		gl.glEnable(GL2.GL_TEXTURE_2D);
		backTruck.bind();
		gl.glBegin(GL2.GL_QUADS);
		// back
		gl.glTexCoord2f(0f, 1f);
		gl.glVertex3f(0, 0, -40);
		gl.glTexCoord2f(1f, 1f);
		gl.glVertex3f(16, 0, -40);
		gl.glTexCoord2f(1f, 0f);
		gl.glVertex3f(16, 16, -40);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(0, 16, -40);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);

		gl.glEnable(GL2.GL_TEXTURE_2D);
		leftTruck.bind();
		gl.glBegin(GL2.GL_QUADS);
		// left
		gl.glTexCoord2f(1f, 0f);
		gl.glVertex3f(0, 0, 0);
		gl.glTexCoord2f(1f, 1f);
		gl.glVertex3f(0, 16, 0);
		gl.glTexCoord2f(0f, 1f);
		gl.glVertex3f(0, 16, -40);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(0, 0, -40);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);

		gl.glEnable(GL2.GL_TEXTURE_2D);
		rightTruck.bind();
		gl.glBegin(GL2.GL_QUADS);
		// right
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(16, 0, 0);
		gl.glTexCoord2f(0f, 1f);
		gl.glVertex3f(16, 16, 0);
		gl.glTexCoord2f(1f, 1f);
		gl.glVertex3f(16, 16, -40);
		gl.glTexCoord2f(1f, 0f);
		gl.glVertex3f(16, 0, -40);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	*/

	private void drawFloors(GL2 gl) {
		// top
		gl.glEnable(GL2.GL_TEXTURE_2D);
		gl.glEnable(GL2.GL_CULL_FACE);
		hardwood.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .25f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, .25f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		// 2nd floor
		// main floor
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(1, 0, 1);
		gl.glVertex3f(2, 42, 0);
		gl.glVertex3f(80, 42, 0);
		gl.glVertex3f(80, 42, -60);
		gl.glVertex3f(2, 42, -60);
		// left tower
		gl.glVertex3f(0, 42, 1);
		gl.glVertex3f(2, 42, 1);
		gl.glVertex3f(2, 42, -18);
		gl.glVertex3f(0, 42, -18);
		// front tower
		gl.glVertex3f(0, 42, 2);
		gl.glVertex3f(20, 42, 2);
		gl.glVertex3f(20, 42, -1);
		gl.glVertex3f(0, 42, -1);
		gl.glEnd();

		gl.glDisable(GL2.GL_CULL_FACE);
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// bottom
		gl.glEnable(GL2.GL_TEXTURE_2D);
		gl.glEnable(GL2.GL_CULL_FACE);
		ceiling.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		// coef_s = { .25f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		// coef_t = { 0, .25f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		// 2nd floor
		// main floor
		gl.glBegin(GL2.GL_QUADS);
		// gl.glColor3f(1, 0, 1);
		gl.glVertex3f(2, 42, -60);
		gl.glVertex3f(80, 42, -60);
		gl.glVertex3f(80, 42, 0);
		gl.glVertex3f(2, 42, 0);
		// left tower
		gl.glVertex3f(0, 42, -18);
		gl.glVertex3f(2, 42, -18);
		gl.glVertex3f(2, 42, 1);
		gl.glVertex3f(0, 42, 1);
		// front tower
		gl.glVertex3f(0, 42, -1);
		gl.glVertex3f(20, 42, -1);
		gl.glVertex3f(20, 42, 2);
		gl.glVertex3f(0, 42, 2);
		gl.glEnd();

		gl.glDisable(GL2.GL_CULL_FACE);
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// 1st floor
		// main floor
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(.2f, .2f, .2f);
		gl.glVertex3f(2, 0, 0);
		gl.glVertex3f(80, 0, 0);
		gl.glVertex3f(80, 0, -60);
		gl.glVertex3f(2, 0, -60);
		// left tower
		gl.glVertex3f(0, 0, 1);
		gl.glVertex3f(2, 0, 1);
		gl.glVertex3f(2, 0, -18);
		gl.glVertex3f(0, 0, -18);
		// front tower
		gl.glVertex3f(0, 0, 2);
		gl.glVertex3f(20, 0, 2);
		gl.glVertex3f(20, 0, -1);
		gl.glVertex3f(0, 0, -1);
		gl.glEnd();
	}

	private void drawRoof(GL2 gl) {
		gl.glColor3f(0, 0, 0);
		// main roof
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex3f(2, 60, 0);
		gl.glVertex3f(80, 60, 0);
		gl.glVertex3f(80, 60, -60);
		gl.glVertex3f(2, 60, -60);
		// left tower
		gl.glVertex3f(0, 60, 1);
		gl.glVertex3f(2, 60, 1);
		gl.glVertex3f(2, 60, -18);
		gl.glVertex3f(0, 60, -18);
		// front tower
		gl.glVertex3f(0, 60, 2);
		gl.glVertex3f(20, 60, 2);
		gl.glVertex3f(20, 60, -1);
		gl.glVertex3f(0, 60, -1);
		gl.glEnd();
	}

	private void drawLandscape(GL2 gl) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		grass.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		float[] coef_s = { .75f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, .75f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex3f(0, 0, -70);
		gl.glVertex3f(-10, 0, -70);
		gl.glVertex3f(-10, 0, 30);
		gl.glVertex3f(0, 0, 30);

		gl.glVertex3f(80, 0, 30);
		gl.glVertex3f(90, 0, 30);
		gl.glVertex3f(90, 0, -70);
		gl.glVertex3f(80, 0, -70);

		gl.glVertex3f(80, 0, -60);
		gl.glVertex3f(0, 0, -60);
		gl.glVertex3f(0, 0, -70);
		gl.glVertex3f(80, 0, -70);

		gl.glVertex3f(2, 0, -18);
		gl.glVertex3f(2, 0, -60);
		gl.glVertex3f(0, 0, -60);
		gl.glVertex3f(0, 0, -18);

		gl.glVertex3f(0, 0, 2);
		gl.glVertex3f(0, 0, 30);
		gl.glVertex3f(5, 0, 30);
		gl.glVertex3f(5, 0, 2);

		gl.glVertex3f(75, 0, 0);
		gl.glVertex3f(75, 0, 30);
		gl.glVertex3f(80, 0, 30);
		gl.glVertex3f(80, 0, 0);
		gl.glEnd();

		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		// driveway
		gl.glColor3f(.2f, .2f, .2f);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex3f(5, 0, 2);
		gl.glVertex3f(75, 0, 2);
		gl.glVertex3f(75, 0, 30);
		gl.glVertex3f(5, 0, 30);

		gl.glVertex3f(20, 0, 0);
		gl.glVertex3f(75, 0, 0);
		gl.glVertex3f(75, 0, 2);
		gl.glVertex3f(20, 0, 2);
		gl.glEnd();
	}

	private void drawDesk(GL2 gl) {
		gl.glColor3f(.5f, .2f, .2f);
		gl.glBegin(GL2.GL_QUADS);
		// top
		gl.glVertex3f(0, 3, 0);
		gl.glVertex3f(0, 3, 8);
		gl.glVertex3f(2, 3, 8);
		gl.glVertex3f(2, 3, 0);
		gl.glEnd();

		// front right leg
		drawLeg(gl, 1.7f, 7.7f, 3, .2f);
		// back right leg
		drawLeg(gl, .1f, 7.7f, 3, .2f);
		// front left leg
		drawLeg(gl, 1.7f, .3f, 3, .2f);
		// back left leg
		drawLeg(gl, .1f, .3f, 3, .2f);
	}

	private void drawLeg(GL2 gl, float leftx, float leftz, float height,
			float thickness) {
		gl.glBegin(GL2.GL_QUADS);
		// front
		gl.glVertex3f(leftx, 0, leftz);
		gl.glVertex3f(leftx + thickness, 0, leftz);
		gl.glVertex3f(leftx + thickness, height, leftz);
		gl.glVertex3f(leftx, height, leftz);
		// back
		gl.glVertex3f(leftx, 0, leftz + thickness);
		gl.glVertex3f(leftx + thickness, 0, leftz + thickness);
		gl.glVertex3f(leftx + thickness, height, leftz + thickness);
		gl.glVertex3f(leftx, height, leftz + thickness);
		// left
		gl.glVertex3f(leftx, 0, leftz);
		gl.glVertex3f(leftx, 0, leftz + thickness);
		gl.glVertex3f(leftx, height, leftz + thickness);
		gl.glVertex3f(leftx, height, leftz);
		// right
		gl.glVertex3f(leftx + thickness, 0, leftz);
		gl.glVertex3f(leftx + thickness, 0, leftz + thickness);
		gl.glVertex3f(leftx + thickness, height, leftz + thickness);
		gl.glVertex3f(leftx + thickness, height, leftz);
		gl.glEnd();
	}

	private void drawBunkBed(GL2 gl) {
		gl.glColor3f(.5f, .2f, .2f);
		// frontleft leg
		drawLeg(gl, 0, 5.8f, 6, .2f);
		// front right leg
		drawLeg(gl, 2.8f, 5.8f, 6, .2f);
		// back left leg
		drawLeg(gl, 0, 0, 6, .2f);
		// back right leg
		drawLeg(gl, 2.8f, 0, 6, .2f);

		gl.glColor3f(.2f, .2f, .5f);
		drawMattress(gl, 0, 1, 0, 3, 6, .8f);
		drawMattress(gl, 0, 5, 0, 3, 6, .8f);
		
		gl.glColor3f(.9f, .9f, .9f);
		drawPillow(gl, .5f, 1.8f, .2f);
		drawPillow(gl, .5f, 5.8f, .2f);

	}

	private void drawMattress(GL2 gl, float leftx, float lefty, float leftz,
			float width, float length, float thickness) {
		gl.glBegin(GL2.GL_QUADS);
		// top
		gl.glVertex3f(leftx, lefty, leftz);
		gl.glVertex3f(leftx, lefty, leftz+length);
		gl.glVertex3f(leftx+width, lefty, leftz+length);
		gl.glVertex3f(leftx+width, lefty, leftz);
		// bottom
		gl.glVertex3f(leftx, lefty+thickness, leftz);
		gl.glVertex3f(leftx, lefty+thickness, leftz+length);
		gl.glVertex3f(leftx+width, lefty+thickness, leftz+length);
		gl.glVertex3f(leftx+width, lefty+thickness, leftz);
		// front
		gl.glVertex3f(leftx, lefty, leftz);
		gl.glVertex3f(leftx, lefty+thickness, leftz);
		gl.glVertex3f(leftx+width, lefty+thickness, leftz);
		gl.glVertex3f(leftx+width, lefty, leftz);
		// back
		gl.glVertex3f(leftx, lefty, leftz+length);
		gl.glVertex3f(leftx, lefty+thickness, leftz+length);
		gl.glVertex3f(leftx+width, lefty+thickness, leftz+length);
		gl.glVertex3f(leftx+width, lefty, leftz+length);
		// left
		gl.glVertex3f(leftx, lefty, leftz);
		gl.glVertex3f(leftx, lefty+thickness, leftz);
		gl.glVertex3f(leftx, lefty+thickness, leftz+length);
		gl.glVertex3f(leftx, lefty, leftz+length);
		// right
		gl.glVertex3f(leftx+width, lefty, leftz);
		gl.glVertex3f(leftx+width, lefty+thickness, leftz);
		gl.glVertex3f(leftx+width, lefty+thickness, leftz+length);
		gl.glVertex3f(leftx+width, lefty, leftz+length);
		gl.glEnd();
	}

	private void drawPillow(GL2 gl, float leftx, float lefty, float leftz) {
		float thickness = .2f;
		float length = 1;
		float width = 2;

		drawMattress(gl, leftx, lefty, leftz, width, length, thickness);
		drawMattress(gl, leftx, lefty, leftz, width, length, thickness);

	}

	@SuppressWarnings("unused")
	private void drawDog(GL2 gl, GLU glu) {
		gl.glColor3f(1f, .2f, .2f);

		// body
		gl.glPushMatrix();
		// gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
		glu.gluCylinder(quadric, .4, .4, 2.5, 10, 1);
		gl.glColor3f(0, 1, 1);
		gl.glPopMatrix();

		// neck
		gl.glPushMatrix();
		gl.glTranslatef(0, 0, .5f);
		gl.glRotatef(-135f, 1f, 0f, 0f); // stand upright (Y)
		glu.gluCylinder(quadric, .3, .3, .8, 10, 1);
		gl.glColor3f(0, 1, 1);
		gl.glPopMatrix();

		// head
		gl.glPushMatrix();
		// gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
		// glu.gluCylinder(quadric, .4, .5, 3, 10, 1);
		gl.glColor3f(0, 1, 1);
		gl.glPopMatrix();

		/*
		 * gl.glBegin(GL2.GL_QUADS); gl.glVertex3f(20, 0, 0); gl.glVertex3f(75,
		 * 0, 0); gl.glVertex3f(75, 0, 2); gl.glVertex3f(20, 0, 2); gl.glEnd();
		 */
	}
}