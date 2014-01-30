package Buildings;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import com.jogamp.opengl.util.awt.TextRenderer;

import Movement.Eye;


public class MelvinTower extends Building {
	private float currY;
	private List<BuildingSection> sections;
	private TextRenderer renderer;


	public MelvinTower(GL2 gl, GLU glu, int num, Eye eye, float x, float y, float z) { //Number of stories can be set in constructor.
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
		currY = y+25f;
		Random rand = new Random();
		sections = new ArrayList<BuildingSection>(num + 2);
		BuildingSection b = new BuildingSection(gl, glu, x, y, z, eye);
		b.setTypeBottom();
		sections.add(b);
		for (int i = 0; i < num; i++) {
			if (rand.nextInt(2) == 0) {
				JiuJitsuRoom a = new JiuJitsuRoom(gl, glu, x, currY, z, eye);
				sections.add(a);
			} else {
				MuayThaiRoom a = new MuayThaiRoom(gl, glu, x, currY, z, eye);
				sections.add(a);
			}
			currY += 25;
		}
		BuildingSection c = new BuildingSection(gl, glu, x, currY, z, eye);
		c.setTypeTop();
		sections.add(c);
	}

	@Override
	public void draw(GL2 gl, GLU glu) {
		
		gl.glPushMatrix();
		for (BuildingSection i : sections) {
			i.drawThis(gl, glu);
		}
		gl.glPopMatrix();
	}
	public void drawMoving(GL2 gl,GLU glu, double a, double b, double c)
 {
	       // Melvin Tower Text
        gl.glPushMatrix();
                 gl.glTranslated(20, 13, 0);
                 renderer.begin3DRendering();
                 renderer.setColor(1, 0, 0, 1);
                 renderer.draw3D("Fight Club", 0f, 0f,0, .25f*1f/8);
                 renderer.end3DRendering();
               gl.glPopMatrix();


		gl.glPushMatrix();
		for (BuildingSection i : sections) {
			i.drawMoving(gl, glu);
		}
		gl.glPopMatrix();
	}

}
