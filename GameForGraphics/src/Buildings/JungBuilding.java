package Buildings;
import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import com.jogamp.opengl.util.texture.Texture;

//Youngmoon Jung
//my building
public class JungBuilding extends Building{
	
	private Texture skyTexture; //for antenna
	private GLUquadric sphereQuadric; //for sphere antenna
	private float ele1Height = 2;
	private float ele2Height = 1f;
	private float ele1StartX = 55, ele1StartY = 0, ele1StartZ = 50;
	private float ele2StartX = 25, ele2StartY = 0, ele2StartZ = 50;
	
	public JungBuilding(GL2 gl, GLU glu){
		if(sphereQuadric==null){
		sphereQuadric = glu.gluNewQuadric();
		skyTexture = setupTexture(gl, "jungsky.png");
		}
	}
	private void floorPlane(GL2 gl, GLU glu){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		JungBuildings.floorTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {1f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,0,1f,0}; // Ames change, was dependent on y instead of z
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
    	gl.glVertex3f(15, 0, 85);
    	gl.glVertex3f(65, 0, 85);
    	gl.glVertex3f(65, 0, 25);
    	gl.glVertex3f(15, 0, 25);
    	gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	private void roofPlane(GL2 gl, GLU glu){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		JungBuildings.windowTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,0,.5f,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
    	gl.glVertex3f(15, 160, 41);
    	gl.glVertex3f(15, 160, 69);
    	gl.glVertex3f(65, 160, 69);
    	gl.glVertex3f(65, 160, 41);
    	gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	private void elefloor(GL2 gl, GLU glu, float startX, float startY, float startZ){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		JungBuildings.floorTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,.5f,0,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
        	gl.glVertex3f(startX, startY, startZ);
        	gl.glVertex3f(startX+5, startY, startZ);
        	gl.glVertex3f(startX+5, startY, startZ+5);
        	gl.glVertex3f(startX, startY, startZ+5);
        	gl.glEnd();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
            gl.glDisable(GL2.GL_TEXTURE_GEN_S);
            gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	private void eleSide(GL2 gl, GLU glu, float startX, float startY, float startZ){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		JungBuildings.eleTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,.5f,0,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
        	gl.glVertex3f(startX, startY, startZ);
        	gl.glVertex3f(startX, startY, startZ+5);
        	gl.glVertex3f(startX, startY+10, startZ+5);
        	gl.glVertex3f(startX, startY+10, startZ);
        	gl.glEnd();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
            gl.glDisable(GL2.GL_TEXTURE_GEN_S);
            gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	private void eleBack(GL2 gl, GLU glu, float startX, float startY, float startZ){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		JungBuildings.eleTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,.5f,0,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
        	gl.glVertex3f(startX, startY, startZ);
        	gl.glVertex3f(startX+5, startY, startZ);
        	gl.glVertex3f(startX+5, startY+10, startZ);
        	gl.glVertex3f(startX, startY+10, startZ);
        	gl.glEnd();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
            gl.glDisable(GL2.GL_TEXTURE_GEN_S);
            gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	
	
	private void wallPlane(GL2 gl, GLU glu, float startX, float startY, float startZ, float tilt){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		JungBuildings.windowTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,.5f,0,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
        	gl.glVertex3f(startX, startY, startZ);
        	gl.glVertex3f(startX+10f, startY, startZ);
        	gl.glVertex3f(startX+10f, startY+10f, startZ+tilt);
        	gl.glVertex3f(startX, startY+10, startZ+tilt);
        	gl.glEnd();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
            gl.glDisable(GL2.GL_TEXTURE_GEN_S);
            gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	
	private void frontWall(GL2 gl, GLU glu){
		float startX = 15;
		float startY = 0;
		float startZ = 85;
		float wHeight = 10;
		float wWidth = 10;
		float tiltZ1 = 2; //first 5 floors
		float tiltZ2 = 1; //second 5 floors
		
		//bottom of the building where door is
		wallPlane(gl, glu, startX, startY, startZ, -2f);
		wallPlane(gl, glu, startX+wWidth, startY, startZ, -2f);
		wallPlane(gl, glu, startX+wWidth*3, startY, startZ, -2f);
		wallPlane(gl, glu, startX+wWidth*4, startY, startZ, -2f);
		//2nd floor of the building to bottom-ish floors of the building
		for(int i = 1; i<=4; i++){
			for(int j = 0; j<5; j++){
				wallPlane(gl, glu, startX+(wWidth*j), startY+(wHeight*i), startZ-(tiltZ1*i), -2f);
			}			
		}
		
		//the 2nd tilts of the front wall
		for(int i = 5; i<= 10; i++){
			for(int j = 0; j<5; j++){
				wallPlane(gl, glu, startX+(wWidth*j), startY+(wHeight*i), startZ-10-(tiltZ2*(i-5)), -1f);
			}
		}
		
		//the rest of the front wall
		for(int i = 11; i<= 15; i++){
			for(int j = 0; j<5; j++){
				wallPlane(gl, glu, startX+(wWidth*j), startY+(wHeight*i), startZ-16, 0f);
			}
		}
	}
	
	private void backWall(GL2 gl, GLU glu){
		float startX = 15;
		float startY = 0;
		float startZ = 25;
		float wHeight = 10;
		float wWidth = 10;
		float tiltZ1 = 2; //first 5 floors
		float tiltZ2 = 1; //second 5 floors
		
		//bottom of the building where door is
		wallPlane(gl, glu, startX, startY, startZ, 2f);
		wallPlane(gl, glu, startX+wWidth, startY, startZ, 2f);
		wallPlane(gl, glu, startX+wWidth*3, startY, startZ, 2f);
		wallPlane(gl, glu, startX+wWidth*4, startY, startZ, 2f);
		//2nd floor of the building to bottom-ish floors of the building
		for(int i = 1; i<=4; i++){
			for(int j = 0; j<5; j++){
				wallPlane(gl, glu, startX+(wWidth*j), startY+(wHeight*i), startZ+(tiltZ1*i), 2f);
			}			
		}
		
		//the 2nd tilts of the front wall
		for(int i = 5; i<= 10; i++){
			for(int j = 0; j<5; j++){
				wallPlane(gl, glu, startX+(wWidth*j), startY+(wHeight*i), startZ+10+(tiltZ2*(i-5)), 1f);
			}
		}
		
		//the rest of the front wall
		for(int i = 11; i<= 15; i++){
			for(int j = 0; j<5; j++){
				wallPlane(gl, glu, startX+(wWidth*j), startY+(wHeight*i), startZ+16, 0f);
			}
		}
	}
	private void sideTrap (GL2 gl, GLU glu, float startX, float startY, float startZ, float upX, float upY, float upZ, float upL, float downL){
		//for making trapazoid like shape for the side walls
		gl.glEnable(GL2.GL_TEXTURE_2D);
		JungBuildings.windowTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {0,0,0.5f,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,.5f,0,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
        	gl.glVertex3f(startX, startY, startZ);
        	gl.glVertex3f(startX, startY, startZ+downL);
        	gl.glVertex3f(upX, upY, upZ+upL);
        	gl.glVertex3f(upX, upY, upZ);
        	gl.glEnd();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
            gl.glDisable(GL2.GL_TEXTURE_GEN_S);
            gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		
	}
	
	private void rightSideWall(GL2 gl, GLU glu){
		sideTrap(gl, glu, 15, 0, 25, 15, 50, 35, 40, 60);
		sideTrap(gl, glu, 15, 50, 35, 15, 110, 41, 28,40);
		sideTrap(gl, glu, 15, 110, 41, 15, 160, 41, 28, 28);
	}
	
	private void leftSideWall(GL2 gl, GLU glu){
		sideTrap(gl, glu, 65, 0, 25, 65, 50, 35, 40, 60);
		sideTrap(gl, glu, 65, 50, 35, 65, 110, 41, 28,40);
		sideTrap(gl, glu, 65, 110, 41, 65, 160, 41, 28, 28);
	}
	
	//moving elevator put together
	private void elevator(GL2 gl, GLU glu){
		elefloor(gl, glu, ele1StartX, ele1StartY, ele1StartZ);
		eleSide(gl, glu, ele1StartX, ele1StartY, ele1StartZ);
		eleSide(gl, glu, ele1StartX+5, ele1StartY, ele1StartZ);
		eleBack(gl, glu, ele1StartX, ele1StartY, ele1StartZ);
		elefloor(gl, glu, ele2StartX, ele2StartY, ele2StartZ);
		eleSide(gl, glu, ele2StartX, ele2StartY, ele2StartZ);
		eleSide(gl, glu, ele2StartX+5, ele2StartY, ele2StartZ);
		eleBack(gl, glu, ele2StartX, ele2StartY, ele2StartZ);
		if(ele1StartY >= 150){
		    ele1Height = ele1Height*-1;
		}
		if(ele1StartY <= 0 ){
			ele1Height = Math.abs(ele1Height);
		}
		ele1StartY += ele1Height;
		if(ele2StartY >= 150){
		    ele2Height = ele2Height*-1;
		}
		if(ele2StartY <= 0 ){
			ele2Height = Math.abs(ele2Height);
		}
		ele2StartY += ele2Height;
	}
	
	
	
	
	@Override
	public void draw(GL2 gl, GLU glu) {
		// TODO Auto-generated method stub
		frontWall(gl, glu);
		backWall(gl, glu);
		floorPlane(gl, glu);
		rightSideWall(gl, glu);
		leftSideWall(gl, glu);
		roofPlane(gl, glu);
		elevator(gl, glu);
		//antenna
		gl.glEnable(GL2.GL_TEXTURE_2D);
		skyTexture.bind();
		gl.glPushMatrix();
		gl.glTranslatef(45, 165, 52);
		glu.gluSphere(sphereQuadric, 7, 10, 10);
		gl.glPopMatrix();
		gl.glDisable(GL.GL_TEXTURE_2D);
		

		gl.glPushMatrix();
		gl.glColor3f(1, 0, 0);
		gl.glTranslatef(45, 170, 52);
		gl.glRotatef(-90f, 1f, 0f, 0f);
		glu.gluCylinder(sphereQuadric, 1, .5, 25, 10, 1);
		gl.glPopMatrix();
		
		gl.glEnable(GL2.GL_TEXTURE_2D); //entrance decoration
		skyTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f, 1f); gl.glVertex3f(34, 0, 86);
		gl.glTexCoord2f(2f, 1f); gl.glVertex3f(34, 0, 86);
		gl.glTexCoord2f(2f, 0f); gl.glVertex3f(36, 10, 84);
		gl.glTexCoord2f(0f, 0f); gl.glVertex3f(36, 10, 84);
		gl.glEnd();
		gl.glDisable(GL.GL_TEXTURE_2D);
		
		gl.glEnable(GL2.GL_TEXTURE_2D); //entrance decoration
		skyTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f, 1f); gl.glVertex3f(44, 0, 86);
		gl.glTexCoord2f(2f, 1f); gl.glVertex3f(44, 0, 86);
		gl.glTexCoord2f(2f, 0f); gl.glVertex3f(46, 10, 84);
		gl.glTexCoord2f(0f, 0f); gl.glVertex3f(46, 10, 84);
		gl.glEnd();
		gl.glDisable(GL.GL_TEXTURE_2D);

		
	}
	
}