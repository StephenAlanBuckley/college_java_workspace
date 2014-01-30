// William Ames Fall 2010

import javax.media.opengl.GL2;
import javax.media.opengl.glu.*;

public class Lamp
{
    private GLUquadric quadric; // to control properties of quadric-based objects here

    public Lamp(GLU glu) {
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // false, or true to generate texture coordinates
    }
    
    public void draw(GL2 gl, GLU glu) {
        gl.glColor3f(1f,0f,.25f);

        // Prototypes:
        //glu.gluSphere(quadric,  radius, slices, stacks), center at origin
        //glu.gluCylinder quadric, base radius, top radius, height, slices, stacks), down +Z axis
        //glu.gluDisk(quadric, inner radius, outer radius, slices, stacks), in XY plane
        //glu.gluPartialDisk(quadric, inner radius, outer radius, slices, stacks, start angle, end angle)

        // Lamp Stem, cylindrical, a little smaller at the top.
        gl.glPushMatrix();
        	gl.glColor3f(1,0,0);
        	gl.glRotatef(-90  , 1, 0, 0);
        	glu.gluCylinder(quadric, 1, 0.5, 5, 10, 10);
        	// Base
        	gl.glColor3f(1,0,1);
        	glu.gluDisk(quadric, 1.2, 1.8, 10, 10);
        gl.glPopMatrix();

        // the Bulb
        gl.glPushMatrix();
            gl.glColor3f(1,1,0);
            gl.glTranslatef(0,5,0);
            glu.gluSphere(quadric, 1.5, 10, 10);
        gl.glPopMatrix();
        
        
        // the Shade
        gl.glPushMatrix();
            gl.glEnable(GL2.GL_BLEND);
                gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
	            gl.glColor4d(0,1,0, .2);
	            gl.glTranslatef(0,5,0);
	            gl.glRotatef(-90,1,0,0);
	            glu.gluCylinder(quadric, 3, 2, 1.5, 10, 10);
            gl.glDisable(GL2.GL_BLEND);
        gl.glPopMatrix();
    }
}