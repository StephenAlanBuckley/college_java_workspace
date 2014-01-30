package Buildings;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import Movement.Eye;

import com.jogamp.opengl.util.texture.Texture;

public class JiuJitsuRoom extends BuildingSection {

	private static Texture mat;
	private static Texture logo;

	public JiuJitsuRoom(GL2 gl, GLU glu, float x, float y, float z, Eye eye) {
		super(gl, glu, x, y, z, eye);
		if(mat==null){
		mat = Building.setupTexture(gl, "melvinjiujitsumatblue.png");
		logo = Building.setupTexture(gl, "melvinbjj.png");
		}
	}

	public void drawThis(GL2 gl, GLU glu) {
		gl.glPushMatrix();
		draw(gl, glu);
		gl.glBegin(GL2.GL_QUADS);
		// OUTTER RIM OF JIU JITSU MATS
		gl.glColor3f(1, 0, 0);
		gl.glVertex3f(x + 2, y + .01f, z - 2);
		gl.glVertex3f(x + 2, y + .01f, z - 38);
		gl.glVertex3f(x + 48, y + .01f, z - 38);
		gl.glVertex3f(x + 48, y + .01f, z - 2);
		gl.glEnd();

		// INNER TEXTURED JIU JITSU MATS
		gl.glEnable(GL2.GL_TEXTURE_2D);
		mat.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(x + 8, y + .011f, z - 8);
		gl.glTexCoord2f(0f, 5f);
		gl.glVertex3f(x + 8, y + .011f, z - 32);
		gl.glTexCoord2f(5f, 5f);
		gl.glVertex3f(x + 42, y + .011f, z - 32);
		gl.glTexCoord2f(5f, 0f);
		gl.glVertex3f(x + 42, y + .011f, z - 8);
		gl.glEnd();
		// Drawing Wall Logo
		logo.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f, 1f);
		gl.glVertex3f(x + .1f, y + 5, z - 10);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(x + .1f, y + 20, z - 10);
		gl.glTexCoord2f(1f, 0f);
		gl.glVertex3f(x + .1f, y + 20, z - 25);
		gl.glTexCoord2f(1f, 1f);
		gl.glVertex3f(x + .1f, y + 5, z - 25);

		gl.glTexCoord2f(1f, 1f);
		gl.glVertex3f(x + 50 - .1f, y + 5, z - 10);
		gl.glTexCoord2f(1f, 0f);
		gl.glVertex3f(x + 50 - .1f, y + 20, z - 10);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(x + 50 - .1f, y + 20, z - 25);
		gl.glTexCoord2f(0f, 1f);
		gl.glVertex3f(x + 50 - .1f, y + 5, z - 25);

		// DRAWING DONE
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glPopMatrix();
		// INSIDE MAT SPACE FOR DRILLS
	}

}
