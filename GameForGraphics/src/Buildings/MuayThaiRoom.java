package Buildings;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import Movement.Eye;


public class MuayThaiRoom extends BuildingSection {
   private BoxingRing a;
   private BoxingRing b;
   private Heavybag c;
   private Heavybag d;

	public MuayThaiRoom(GL2 gl, GLU glu, float x, float y, float z, Eye eye) {
		super(gl, glu, x, y, z, eye);
        a = new BoxingRing(gl, glu, x + 5, y + 0, z + -18);
        b = new BoxingRing(gl, glu, x + 30, y + 0, z + -18);
        c = new Heavybag(gl, glu, x + 5, y + 0, z + -6);
        d = new Heavybag(gl, glu, x + 25, y + 0, z + -6);
	}

	public void drawThis(GL2 gl, GLU glu) {
		gl.glPushMatrix();
		draw(gl, glu);
        a.draw(gl, glu);
        b.draw(gl, glu);
        c.draw(gl, glu);
        d.draw(gl, glu);
		gl.glPopMatrix();
	}

}
