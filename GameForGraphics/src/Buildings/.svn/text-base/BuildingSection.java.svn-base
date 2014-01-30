package Buildings;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.SketchupModelJAXB;

import Movement.Eye;
import SketchupModels.Melvindesk;

import com.jogamp.opengl.util.texture.Texture;

public class BuildingSection {

	protected float x, y, z;
	private static Texture outside;
	private static Texture floor;
	private static Texture shaft;
	private int open = 0;
	protected Eye eye;
	private static Melvindesk myDesk;
	protected int type = 1; // 0=bottom //midsection=1 //top=2;

	public int getType() {
		return type;
	}

	public void setTypeBottom() {
		type = 0;
	}

	public void setTypeTop() {
		type = 2;
	}

	public BuildingSection(GL2 gl, GLU glu, float x, float y, float z, Eye eye) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.eye = eye;

		if(outside == null){
			outside = Building.setupTexture(gl, "melvinwindow-texture.png");
			floor = Building.setupTexture(gl, "melvinwood-32.png");
			shaft = Building.setupTexture(gl, "melvin-bare-metal.png");
			myDesk = new Melvindesk(gl, glu);
		}

	}

	public void drawThis(GL2 gl, GLU glu) {
		gl.glPushMatrix();
			this.draw(gl, glu);
		gl.glPopMatrix();

	}

	public void draw(GL2 gl, GLU glu) {
		 ///////////////////////////////////////////////
		 //FLOOR PLANE OF BUILDING WITH WOOD TEXTURING//
		 ///////////////////////////////////////////////
		
		if (type == 0) {
			//Draw Grass Plane
			gl.glColor3f(0,1,0);
			gl.glBegin(GL2.GL_QUADS);
			gl.glVertex3f(x-25, y-0.1f,z+25 );
			gl.glVertex3f(x-25, y-0.1f,z-75);
			gl.glVertex3f(x+75, y-0.1f,z-75);
			gl.glVertex3f(x+75, y-0.1f,z+25);
			gl.glEnd();
			gl.glPushMatrix();
			gl.glRotatef(-90, 0, 1, 0);
			gl.glTranslatef(-12, 0, -40);
			myDesk.draw(gl, glu);
			gl.glPopMatrix();
		}
		
		gl.glEnable(GL2.GL_TEXTURE_2D);
		floor.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f, 0f);
		gl.glVertex3f(x - (1f / 12f), y, z);
		gl.glTexCoord2f(0f, 5f);
		gl.glVertex3f(x - (1f / 12f), y, z - 50);
		gl.glTexCoord2f(5f, 5f);
		gl.glVertex3f(x + 50 + (1f / 12f), y, z - 50);
		gl.glTexCoord2f(5f, 0f);
		gl.glVertex3f(x + 50 + (1f / 12f), y, z);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);

		//
		if (type == 2) {
			//Draw Roof of skyscraper
			gl.glColor3f(1, 1, 0);
			gl.glBegin(GL2.GL_TRIANGLE_FAN);
			gl.glVertex3f(x + 25, y + 50, z - 25);
			gl.glVertex3f(x, y + 25, z);
			gl.glVertex3f(x, y + 25, z - 50);
			gl.glVertex3f(x + 50, y + 25, z - 50);
			gl.glVertex3f(x + 50, y + 25, z);
			gl.glVertex3f(x, y + 25, z);

			gl.glEnd();
		}

		/*
		 * ////////////////////////////////////////////////// BUILDING WALLS OF
		 * WITH WINDOW TEXTURING/////////
		 */// /////////////////////////////////////////////*/
		gl.glEnable(GL2.GL_TEXTURE_2D);
		outside.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		/*
		 * ////////////////////////////////////////////////// TEXTURING CONFIG
		 * LEFT AND RIGHT WALL OF BUILDING/
		 */// /////////////////////////////////////////////*/
		float[] coef_s1 = { 0, 0, .20f, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
		float[] coef_t1 = { 0, .08f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);

		/*
		 * //////////////////////////////////////////////////// DRAWING INSIDE
		 * LEFT AND RIGHT WALL OF BUILDING////
		 */// ///////////////////////////////////////////////*/
		gl.glBegin(GL2.GL_QUADS);
		// RIGHT WALL
		gl.glVertex3f(x + 50, y, z);
		gl.glVertex3f(x + 50, y + 25, z);
		gl.glVertex3f(x + 50, y + 25, z - 50);
		gl.glVertex3f(x + 50, y, z - 50);
		if (type == 2) {
			// LEFT WALL EXIT
			gl.glVertex3f(x, y, z);
			gl.glVertex3f(x, y + 25, z);
			gl.glVertex3f(x, y + 25, z - 15);
			gl.glVertex3f(x, y, z - 15);

			gl.glVertex3f(x, y, z - 22);
			gl.glVertex3f(x, y + 25, z - 22);
			gl.glVertex3f(x, y + 25, z - 50);
			gl.glVertex3f(x, y, z - 50);

			gl.glVertex3f(x, y + 12.5f, z - 15);
			gl.glVertex3f(x, y + 25, z - 15);
			gl.glVertex3f(x, y + 25, z - 22);
			gl.glVertex3f(x, y + 12.5f, z - 22);

		} else {
			// LEFT WALL FULL
			gl.glVertex3f(x, y, z);
			gl.glVertex3f(x, y + 25, z);
			gl.glVertex3f(x, y + 25, z - 50);
			gl.glVertex3f(x, y, z - 50);
		}
		// DRAWING DONE
		gl.glEnd();

		/*
		 * ///////////////////////////////////////////////// TEXTURING CONFIG
		 * BACK/FRONT WALL OF BUILDING////
		 */// ////////////////////////////////////////////*/
		float[] coef_s2 = { .20f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s2, 0);
		float[] coef_t2 = { 0, .08f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t2, 0);
		gl.glColor3f(.5f, .5f, 1);

			// BACK WALL [1,2,3,4]
		gl.glBegin(GL2.GL_QUADS);

			// FRONT WALL [1,2,3,4]
		if (type == 0) {
			
			// LEFT WALL
			gl.glVertex3f(x, y + 25, z);
			gl.glVertex3f(x + 20, y + 25, z);
			gl.glVertex3f(x + 20, y, z);
			gl.glVertex3f(x, y, z);
			// RIGHT WALL
			gl.glVertex3f(x + 32, y + 25, z);
			gl.glVertex3f(x + 50, y + 25, z);
			gl.glVertex3f(x + 50, y, z);
			gl.glVertex3f(x + 32, y, z);
			// UPPER MIDDLE SECTION
			gl.glVertex3f(x + 20, y + 25, z);
			gl.glVertex3f(x + 32, y + 25, z);
			gl.glVertex3f(x + 32, y + 12.5f, z);
			gl.glVertex3f(x + 20, y + 12.5f, z);
			// BACK WALL
			gl.glVertex3f(x, y + 25, z - 50);
			gl.glVertex3f(x + 50, y + 25, z - 50);
			gl.glVertex3f(x + 50, y, z - 50);
			gl.glVertex3f(x, y, z - 50);
		}
		// FRONT OPEN WALL
		else {
			gl.glVertex3f(x, y + 25, z);
			gl.glVertex3f(x + 50, y + 25, z);
			gl.glVertex3f(x + 50, y, z);
			gl.glVertex3f(x, y, z);
			// BACK WALL
			gl.glVertex3f(x, y + 25, z - 50);
			gl.glVertex3f(x + 50, y + 25, z - 50);
			gl.glVertex3f(x + 50, y, z - 50);
			gl.glVertex3f(x, y, z - 50);
		}

		// DRAWING DONE
		// TEXTURING DONE
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		
		/*
		 * ////////////////////////////////////////////////// BUILDING ELEVATOOR
		 * WITH METAL TEXTURING///////////
		 */// //////////////////////////////////////////////*/
		gl.glEnable(GL2.GL_TEXTURE_2D);
		shaft.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);

		/*
		 * ///////////////////////////////////////////////// TEXTURING CONFIG
		 * LEFT AND RIGHT WALL OF ELEVATOR/
		 */// /////////////////////////////////////////////*/
		float[] coef_s = { 0, 0, .20f, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
		float[] coef_t = { 0, .08f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

		/*
		 * //////////////////////////////////// DRAWING ELEVATOR LEFT/RIGHT
		 * WALL///
		 */// ///////////////////////////////*/
		gl.glBegin(GL2.GL_QUADS);
		// ELEVATOR SHAFT LEFT WALL
		gl.glVertex3f(x + 22, y, z - 40);
		gl.glVertex3f(x + 22, y + 25, z - 40);
		gl.glVertex3f(x + 22, y + 25, z - 47);
		gl.glVertex3f(x + 22, y, z - 47);
		// ELEVATOR RIGHT WALL
		gl.glVertex3f(x + 22 + 10, y, z - 40);
		gl.glVertex3f(x + 22 + 10, y + 25, z - 40);
		gl.glVertex3f(x + 22 + 10, y + 25, z - 47);
		gl.glVertex3f(x + 22 + 10, y, z - 47);
		// END OF DRAWING
		gl.glEnd();

		/*
		 * ////////////////////////////////////////// TEXTURING CONFIG
		 * BACK/FRONT OF ELEVATOR//
		 */// /////////////////////////////////////*/
		float[] coef_s3 = { .20f, 0, 0, 0 };
		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s3, 0);
		float[] coef_t3 = { 0, .08f, 0, 0 };
		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t3, 0);
		gl.glColor3f(.5f, .5f, 1);
		/*
		 * //////////////////////////////////// DRAWING ELEVATOR FRONT/BACK
		 * WALL///
		 */// ///////////////////////////////*/
		gl.glBegin(GL2.GL_QUADS);
		// ELEVATOR SHAFT FRONT
		gl.glColor3f(1, 1, .4f);
		gl.glVertex3f(x + 22, y + 10, z - 40);
		gl.glVertex3f(x + 22, y + 25, z - 40);
		gl.glVertex3f(x + 22 + 10, y + 25, z - 40);
		gl.glVertex3f(x + 22 + 10, y + 10, z - 40);
		gl.glColor3f(.8f, .5f, 1f);
		// ELEVATOR SHAFT BACK
		gl.glVertex3f(x + 22, y, z - 47);
		gl.glVertex3f(x + 22, y + 25, z - 47);
		gl.glVertex3f(x + 22 + 10, y + 25, z - 47);
		gl.glVertex3f(x + 22 + 10, y, z - 47);
		gl.glEnd();
		// END OF DRAWING
		// END OF TEXTURING
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}

	public void drawMoving(GL2 gl, GLU glu) {
		/*
		 * //////////////////////////// DRAWING ELEVATOR DOORS/////
		 */// ///////////////////////*/
		gl.glColor4f(.78f, .78f, .78f, .02f);

		gl.glBegin(GL2.GL_QUADS);
		// ELEVATOR DOOR LEFT
		gl.glVertex3f(x + 22 - open, y, z - 40);
		gl.glVertex3f(x + 22 - open, y + 10, z - 40);
		gl.glVertex3f(x + 22 + 5 - open, y + 10, z - 40);
		gl.glVertex3f(x + 22 + 5 - open, y, z - 40);
		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		// ELEVATOR DOOR RIGHT
		gl.glVertex3f(x + 22 + 5 + open, y, z - 40);
		gl.glVertex3f(x + 22 + 5 + open, y + 10, z - 40);
		gl.glVertex3f(x + 22 + 10 + open, y + 10, z - 40);
		gl.glVertex3f(x + 22 + 10 + open, y, z - 40);
		// ELEVATOR DOOR DIVIDER
		gl.glColor3f(0, 0, 0);
		if (open == 0) {
			gl.glVertex3f(x + 22 + 5, y, z - 39.999f);
			gl.glVertex3f(x + 22 + 5, y + 10, z - 39.999f);
			gl.glVertex3f(x + 22 + 5.5f, y + 10, z - 39.999f);
			gl.glVertex3f(x + 22 + 5.5f, y, z - 39.999f);
		}
		// END OF DRAWING
		// END OF TEXTURING
		gl.glEnd();
		// Open elevator door
		if (eye.getX() > (x + 22) && eye.getX() < (x + 32) && open <= 4
				&& (eye.getZ() < (z - 30) && eye.getZ() > (z - 40))) { 
			open++;
		}
		// Close elevator door
		else if (!(eye.getX() > (x + 22) && eye.getX() < (x + 32)) && open != 0
				|| eye.getZ() > (z - 30) && open != 0 || open != 0
				&& (eye.getX() > (x + 22) && eye.getX() < (x + 32)) && eye.getZ() < (z - 40))
			open--;
		// Transports eye up elevator
		if ((((eye.getX() > (x + 22) && eye.getX() < (x + 32)) && open == 0))
				&& (eye.getZ() < (z - 40) && eye.getZ() > (z - 47))) {
			eye.setY(eye.getY() + 25f);
			eye.setZ(eye.getZ() + 10);
		}

		if ((eye.getX() < x && eye.getY() > y + 25) && (eye.getZ() > -23 + z && eye.getZ() < -15 + z))
			eye.setY(4);
	}
}