package Buildings;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.MahonFountain;
import SketchupModels.MahonTower2;

import com.jogamp.opengl.util.texture.Texture;

public class MahonTower extends Building {
	private static Texture grassTexture;
	
	//private static SketchupModelJAXB tower;
	private MahonTower2 tower;
	
	public MahonTower(GL2 gl, GLU glu){
		grassTexture = setupTexture(gl, "mahonGrass.png");

		tower = new MahonTower2(gl, glu); //new SketchupModelJAXB("mahonTower2.dae", gl, glu);
	}
	
	
	//public void drawMoving(GL2 gl, GLU glu, float eyeX, float eyeY, float eyeZ) {
	//}
	
	@Override
	public void draw(GL2 gl, GLU glu) {

		gl.glPushMatrix();
			gl.glRotated(-90, 0, 1, 0);
			tower.draw(gl, glu); //draw tower, will need to be moved once it works
		gl.glPopMatrix();

		//sketching the ground******************************************
		gl.glEnable(GL2.GL_TEXTURE_2D);
			grassTexture.bind();

            gl.glBegin(GL2.GL_QUADS);
            	gl.glTexCoord2i(0, 0);gl.glVertex3d(0,0,0);
            	gl.glTexCoord2i(3, 0);gl.glVertex3d(100,0,0);
            	gl.glTexCoord2i(3, 3);gl.glVertex3d(100,0,100);
            	gl.glTexCoord2i(0, 3);gl.glVertex3d(0,0,100);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
	}
}
