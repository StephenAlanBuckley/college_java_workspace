package Buildings;
// William Ames Fall 2010  Texture Demo

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.Archway;

import com.jogamp.opengl.util.texture.Texture;

public class KayeBuilding extends Building
{
    private static GLUquadric manualQuadric; // to control properties of quadric-based objects
    private static GLUquadric autoQuadric; // for Signorile's head
    private static Archway arch;
    private static Texture brickTexture;     // bricks
    private static Texture grassTexture;
    private static Texture stoneTexture;
    private static Texture woodTexture;
    private static Texture roofTexture;
    private static Texture fireTexture;
    private static Texture tableTexture;

    public KayeBuilding(GL2 gl, GLU glu) {
    	//Edit done by Melvin Ross
    	if(manualQuadric==null){
        manualQuadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(manualQuadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (manualQuadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (manualQuadric, false);        // use true to generate texture coordinates

        autoQuadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(autoQuadric, GLU.GLU_FILL);
        glu.gluQuadricNormals  (autoQuadric, GLU.GLU_NONE);
        glu.gluQuadricTexture  (autoQuadric, true); // for Signorile's head
        
        arch = new Archway( gl, glu);

        brickTexture     = setupTexture(gl, "bricks.png");
        grassTexture	 = setupTexture(gl, "jkGrass.png");
        stoneTexture	 = setupTexture(gl, "jkStone.png");
        woodTexture 	 = setupTexture(gl, "jkWood.png");
        roofTexture 	 = setupTexture(gl, "jkRoof.png");
        fireTexture 	 = setupTexture(gl, "jkFire.png");
        tableTexture	 = setupTexture(gl, "jkTable.png");
    	}
    }

    public void draw(GL2 gl, GLU glu) {
      gl.glPushMatrix();
        gl.glTranslatef(50,0,100); // Ames change, original was x=-50 to 50, z=0 to -100.  Both should be 0..100
        // glu.gluSphere(quadric,  radius, slices, stacks)
        // glu.gluCylinder quadric, base, top, height, slices, stacks)
        // glu.gluDisk(quadric, inner radius, outer radius, slices, stacks)
        gl.glPushMatrix();
        	gl.glTranslatef(-8, 0, 0);
        	gl.glTranslatef(0, 0, -10);
        	arch.draw(gl, glu);
        	for(int i = 0; i < 3; i++)
        	{
        		gl.glTranslatef(0, 0, -15);
        		arch.draw(gl, glu);
        	}
        gl.glPopMatrix();
    	// Grass ground (manually textured)
    	gl.glEnable(GL2.GL_TEXTURE_2D);
    		grassTexture.bind();
    		gl.glBegin(GL2.GL_QUADS);
    			// Front rectangle
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(-50, 0, 0);
    			gl.glTexCoord2f(0f,10f); gl.glVertex3f(-50,  0, -10);
    			gl.glTexCoord2f(50f,10f); gl.glVertex3f(50, 0, -10);
    			gl.glTexCoord2f(50f,0f); gl.glVertex3f(50, 0, 0);
    			// Left rectangle
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(-50, 0, -10);
    			gl.glTexCoord2f(0f,90f); gl.glVertex3f(-50,  0, -100);
    			gl.glTexCoord2f(5f,90f); gl.glVertex3f(-40, 0, -100);
    			gl.glTexCoord2f(5f,0f); gl.glVertex3f(-40, 0, -10);
    			// Right rectangle
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(40, 0, -10);
    			gl.glTexCoord2f(0f,90f); gl.glVertex3f(40,  0, -100);
    			gl.glTexCoord2f(5f,90f); gl.glVertex3f(50, 0, -100);
    			gl.glTexCoord2f(5f,0f); gl.glVertex3f(50, 0, -10);
    			// Back rectangle
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(-40, 0, -90);
    			gl.glTexCoord2f(0f,10f); gl.glVertex3f(-40,  0, -100);
    			gl.glTexCoord2f(40f,10f); gl.glVertex3f(40, 0, -100);
    			gl.glTexCoord2f(40f,0f); gl.glVertex3f(40, 0, -90);
    			// Central rectangle
    			gl.glTexCoord2f(.5f,0f); gl.glVertex3f(-15, 0, -10);
    			gl.glTexCoord2f(.5f,55f); gl.glVertex3f(-15,  0, -65);
    			gl.glTexCoord2f(15.5f,55f); gl.glVertex3f(15, 0, -65);
    			gl.glTexCoord2f(15.5f,0f); gl.glVertex3f(15, 0, -10);
    		gl.glEnd();
    		// Manually textured fireplace in the right hall
    		brickTexture.bind();
    		gl.glBegin(GL2.GL_QUADS);
    			// Left pillar
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(22, 0, -11);
    			gl.glTexCoord2f(2f,0f); gl.glVertex3f(25,  0, -11);
    			gl.glTexCoord2f(2f,2f); gl.glVertex3f(25, 6, -11);
    			gl.glTexCoord2f(0f,2f); gl.glVertex3f(22, 6, -11);
    			// Right pillar
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(29, 0, -11);
    			gl.glTexCoord2f(2f,0f); gl.glVertex3f(32,  0, -11);
    			gl.glTexCoord2f(2f,2f); gl.glVertex3f(32, 6, -11);
    			gl.glTexCoord2f(0f,2f); gl.glVertex3f(29, 6, -11);
    			// Mantle
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(33, 6, -11);
    			gl.glTexCoord2f(3f,0f); gl.glVertex3f(21,  6, -11);
    			gl.glTexCoord2f(3f,1.5f); gl.glVertex3f(21, 8, -11);
    			gl.glTexCoord2f(0f,1.5f); gl.glVertex3f(33, 8, -11);
    		gl.glEnd();
    		fireTexture.bind();
    		gl.glBegin(GL2.GL_QUADS);
    			// The actual fire
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(25, 0, -11);
    			gl.glTexCoord2f(1f,0f); gl.glVertex3f(25,  6, -11);
    			gl.glTexCoord2f(1f,1f); gl.glVertex3f(29, 6, -11);
    			gl.glTexCoord2f(0f,1f); gl.glVertex3f(29, 0, -11);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	// Autotextured walls of the house
    	gl.glEnable(GL2.GL_TEXTURE_2D);
        stoneTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            // Walls in the xy plane
            float[] coef_s = {.5f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            float[] coef_t = {0,.25f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glBegin(GL2.GL_QUADS);
            	// Back wall (needs space for a door)
            	// Top part of wall
            	gl.glVertex3f(-40, 7, -90);
            	gl.glVertex3f(40, 7, -90);
            	gl.glVertex3f(40, 21, -90);
            	gl.glVertex3f(-40, 21, -90);
        		// Left part of wall
        		gl.glVertex3f(-40, 0, -90);
        		gl.glVertex3f(-2, 0, -90);
        		gl.glVertex3f(-2, 7, -90);
        		gl.glVertex3f(-40, 7, -90);
        		// Right part of wall
        		gl.glVertex3f(2, 0, -90);
        		gl.glVertex3f(40, 0, -90);
        		gl.glVertex3f(40, 7, -90);
        		gl.glVertex3f(2, 7, -90);
                // Front left wall (small)
                gl.glVertex3f(-40, 0, -10);
                gl.glVertex3f(-15, 0, -10);
                gl.glVertex3f(-15, 21, -10);
                gl.glVertex3f(-40, 21, -10);
                // Front right wall (small)
                gl.glVertex3f(40, 0, -10);
            	gl.glVertex3f(15, 0, -10);
            	gl.glVertex3f(15, 21, -10);
            	gl.glVertex3f(40, 21, -10);
            	// Front middle wall (needs space for a door)
            	// Top part of wall
            	gl.glVertex3f(-15, 7, -65);
            	gl.glVertex3f(15, 7, -65);
            	gl.glVertex3f(15, 21, -65);
            	gl.glVertex3f(-15, 21, -65);
            	// Left part of wall
            	gl.glVertex3f(-15, 0, -65);
            	gl.glVertex3f(-2, 0, -65);
            	gl.glVertex3f(-2, 7, -65);
            	gl.glVertex3f(-15, 7, -65);
            	// Right part of wall
            	gl.glVertex3f(2, 0, -65);
            	gl.glVertex3f(15, 0, -65);
            	gl.glVertex3f(15, 7, -65);
            	gl.glVertex3f(2, 7, -65);
            gl.glEnd();
            // Walls in the yz plane
            coef_s[0] = 0; coef_s[2] = .5f;
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glBegin(GL2.GL_QUADS);
            	// Left wall
            	gl.glVertex3f(-40, 0, -90);
            	gl.glVertex3f(-40, 0, -10);
            	gl.glVertex3f(-40, 21, -10);
            	gl.glVertex3f(-40, 21, -90);
            	// Left inner wall
            	gl.glVertex3f(-15, 0, -10);
            	gl.glVertex3f(-15, 0, -65);
            	gl.glVertex3f(-15, 21, -65);
            	gl.glVertex3f(-15, 21, -10);
            	// Right inner wall
            	gl.glVertex3f(15, 0, -10);
            	gl.glVertex3f(15, 0, -65);
            	gl.glVertex3f(15, 21, -65);
            	gl.glVertex3f(15, 21, -10);
            	// Right wall
            	gl.glVertex3f(40, 0, -90);
            	gl.glVertex3f(40, 0, -10);
            	gl.glVertex3f(40, 21, -10);
            	gl.glVertex3f(40, 21, -90);
            gl.glEnd();
         // Floors in the xz plane
            woodTexture.bind();
            coef_s[2] = 0; coef_s[0] = .5f;
            coef_t[1] = 0; coef_t[2] = .25f;
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glBegin(GL2.GL_QUADS);
            	// Main hall floor
            	gl.glVertex3f(-40, 0, -90);
            	gl.glVertex3f(-40, 0, -65);
            	gl.glVertex3f(40, 0, -65);
            	gl.glVertex3f(40, 0, -90);
            	// Left hall floor
            	gl.glVertex3f(-40, 0, -65);
            	gl.glVertex3f(-40, 0, -10);
            	gl.glVertex3f(-15, 0, -10);
            	gl.glVertex3f(-15, 0, -65);
            	// Right hall floor
            	gl.glVertex3f(15, 0, -65);
            	gl.glVertex3f(15, 0, -10);
            	gl.glVertex3f(40, 0, -10);
            	gl.glVertex3f(40, 0, -65);
            gl.glEnd();
            // Ceilings in a unique plane
            roofTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
            	// Front middle ceiling
            	gl.glVertex3f(-15, 21, -65);
            	gl.glVertex3f(-15, 32, -77.5f);
            	gl.glVertex3f(15, 32, -77.5f);
            	gl.glVertex3f(15, 21, -65);
            	// Back middle ceiling
            	gl.glVertex3f(-15, 21, -90);
            	gl.glVertex3f(-15, 32, -77.5f);
            	gl.glVertex3f(15, 32, -77.5f);
            	gl.glVertex3f(15, 21, -90);
            	// Far left ceiling
            	gl.glVertex3f(-40, 21, -10);
            	gl.glVertex3f(-27.5f, 32, -10);
            	gl.glVertex3f(-27.5f, 32, -90);
            	gl.glVertex3f(-40, 21, -90);
            	// Inner left ceiling
            	gl.glVertex3f(-15, 21, -10);
            	gl.glVertex3f(-27.5f, 32, -10);
            	gl.glVertex3f(-27.5f, 32, -90);
            	gl.glVertex3f(-15, 21, -90);
            	// Inner right ceiling
            	gl.glVertex3f(15, 21, -10);
            	gl.glVertex3f(27.5f, 32, -10);
            	gl.glVertex3f(27.5f, 32, -90);
            	gl.glVertex3f(15, 21, -90);
            	// Far right ceiling
            	gl.glVertex3f(40, 21, -10);
            	gl.glVertex3f(27.5f, 32, -10);
            	gl.glVertex3f(27.5f, 32, -90);
            	gl.glVertex3f(40, 21, -90);
            gl.glEnd();
            // Ceilings in the xy plane
            coef_t[1] = .25f; coef_t[0] = 0;
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glBegin(GL2.GL_TRIANGLES);
            	// Front left triangle
            	gl.glVertex3f(-40, 21, -10);
            	gl.glVertex3f(-27.5f, 32, -10);
            	gl.glVertex3f(-15, 21, -10);
            	// Front right triangle
            	gl.glVertex3f(15, 21, -10);
            	gl.glVertex3f(27.5f, 32, -10);
            	gl.glVertex3f(40, 21, -10);
            	// Back left triangle
            	gl.glVertex3f(-40, 21, -90);
            	gl.glVertex3f(-27.5f, 32, -90);
            	gl.glVertex3f(-15, 21, -90);
            	// Back right triangle
            	gl.glVertex3f(15, 21, -90);
            	gl.glVertex3f(27.5f, 32, -90);
            	gl.glVertex3f(40, 21, -90);
            gl.glEnd();
            // Ceilings in the yz plane
            coef_s[0] = 0; coef_s[2] = .5f;
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glBegin(GL2.GL_TRIANGLES);
            // Left interior ceiling
            gl.glVertex3f(-15, 21, -65);
        	gl.glVertex3f(-15, 32, -77.5f);
        	gl.glVertex3f(-15, 21, -90);
        	// Right interior ceiling
            gl.glVertex3f(15, 21, -65);
        	gl.glVertex3f(15, 32, -77.5f);
        	gl.glVertex3f(15, 21, -90);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        
        gl.glEnable(GL2.GL_TEXTURE_2D);
        tableTexture.bind();
        // Tabletop
        gl.glPushMatrix();
            gl.glTranslatef(-35, 3, -85); // 5 feet off of ground, in the left hallway corner
            gl.glRotatef(90, 1, 0, 0);
            //glu.gluCylinder(autoQuadric, 0, 4, 10, 1);
            glu.gluCylinder(autoQuadric, 4, 4, .75f, 10, 1);
            glu.gluDisk(autoQuadric, 0, 4, 10, 10);
        gl.glPopMatrix();
        // Legs
        gl.glPushMatrix();
        	gl.glTranslatef(-37.5f, 3f, -83);
        	gl.glRotatef(90, 1, 0, 0);
        	glu.gluCylinder(autoQuadric, .5, .5, 3, 10, 1);
        gl.glPopMatrix();
        gl.glPushMatrix();
    		gl.glTranslatef(-37.5f, 3f, -87);
    		gl.glRotatef(90, 1, 0, 0);
    		glu.gluCylinder(autoQuadric, .5, .5, 3, 10, 1);
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    		gl.glTranslatef(-32.5f, 3f, -87);
    		gl.glRotatef(90, 1, 0, 0);
    		glu.gluCylinder(autoQuadric, .5, .5, 3, 10, 1);
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    		gl.glTranslatef(-32.5f, 3f, -83);
    		gl.glRotatef(90, 1, 0, 0);
    		glu.gluCylinder(autoQuadric, .5, .5, 3, 10, 1);
    	gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);
      gl.glPopMatrix();
   }
}