package main;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

public class CrossHair {
	
	public CrossHair(){
	}
	public void draw(GL2 gl, GLU glu, float x, float y, float z, float direction, float tilt) {
	
		gl.glColor3d(1,0,0);
		gl.glPushMatrix();
			 gl.glTranslated(x, y, z);
			 gl.glRotatef(direction-90, 0f, 1f, 0f);
			 gl.glRotatef(tilt, 1f, 0f, 0f);
			 //gl.glTranslatef(-x, -y, -z);	
			 gl.glBegin(GL.GL_LINES);
			 gl.glVertex3f((float) (-0.1), 0, 0);
				gl.glVertex3f((float) (0.1), 0, 0);
				gl.glVertex3f(0, (float) (+0.1), 0);
				gl.glVertex3f(0, (float) (-0.1), 0);
			 gl.glEnd();
		gl.glPopMatrix();
	}
}
