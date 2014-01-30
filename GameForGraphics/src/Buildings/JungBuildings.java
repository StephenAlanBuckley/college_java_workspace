package Buildings;
import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.JungOpenCar;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


//it looked cool on paper... but it was too ambitious and the result looks really not cool....
//i made building first then decided to do something cool but... didn't turn out as cool as I would liked it to be...
//So I am also zipping the Building that I made... instead of this weird one... which was first thing i created so...
public class JungBuildings extends Building{
	private static JungOpenCar myWidget;
	static Texture windowTexture; // wall texture
	static Texture floorTexture; //floor texture
//	private Texture skyTexture; //for antenna
	static Texture eleTexture; //for elevator
	private static Texture grassTexture;
//	private Texture fishTexture;
	private static GLUquadric quadric;
	private static GLUquadric spherequadric;
	private float oneCount = 0, oneX = 45, oneSpace = 0, oneGo = 0, oneTop = 0;
	private float twoCount = 76, twoX = 10, twoSpace = 0, twoGo = 2, twoTop = 0;
	private float threeCount = 76, threeX = 80, threeSpace = 0, threeGo = 2, threeTop = 0;
	private float fourCount = 76, fourX = 45, fourSpace = 0, fourGo = 2, fourTop = 0;
	private float ele1Height = 0.5f, ele1StartX = 47.5f, ele1StartY = 0, ele1StartZ = 82;
	private float ele2Height = 0.5f, ele2StartX = 12.5f, ele2StartY = 20, ele2StartZ = 47;
	private float ele3Height = 0.5f, ele3StartX = 82.5f, ele3StartY = 40, ele3StartZ = 47;
	private float ele4Height = 0.5f, ele4StartX = 47.5f, ele4StartY = 50, ele4StartZ = 12;
	private float platX = 30, platZ = 30;
	private float fishX = 25, fishY = 68;
	private float speed = 0.15f, angle = 0;
	private float propAngle = 0;
	private TextRenderer renderer;

	
	public JungBuildings(GL2 gl, GLU glu){
		if(windowTexture==null){
		windowTexture = setupTexture(gl, "jungWindow.png");
		floorTexture = setupTexture(gl, "jungInside.png");
	//	skyTexture = setupTexture(gl, "jungsky.png");
		eleTexture = setupTexture(gl, "jungelevator.png");
		grassTexture = setupTexture(gl, "junggrass.png");
	//	fishTexture = setupTexture(gl, "jungFish.png");
		quadric = glu.gluNewQuadric();
		spherequadric = glu.gluNewQuadric();
		myWidget = new JungOpenCar(gl, glu);
		}
	    renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
	}
	
	@Override
	public void draw(GL2 gl, GLU glu) {
	      
	}
	
	@Override
	public void drawMoving(GL2 gl, GLU glu, double eyex, double eyey, double eyez) {
	     // Jung Building Text
	              gl.glPushMatrix();
	                  gl.glRotated(180, 0, 1, 1);
	                  gl.glTranslated(-60, 30, 0);
	                  renderer.begin3DRendering();
	                  renderer.setColor(0, 0, 0, 1);
	                  renderer.draw3D("Back To The Future", 0f, 0f,0, .25f*1f/5);
	                  renderer.end3DRendering();
	                gl.glPopMatrix();
		
		//my Open Car
		gl.glPushMatrix();
		    gl.glTranslatef(50f, 1, 50f);
		    myWidget.draw(gl, glu);
		    gl.glPopMatrix();
		    
		    
		grassPlane(gl, glu);
		elevator(gl, glu);
		firstWalls(gl, glu);
		secondWalls(gl, glu);
		thirdWalls(gl, glu);
		fourthWalls(gl, glu);
		platform(gl, glu);
		fish(gl, glu);
		aquaSphere(gl, glu);
		propeller(gl, glu);
	}
	
	private void floorPlane(GL2 gl, GLU glu, float startX, float startZ){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		floorTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,0,0.5f,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
        	gl.glVertex3f(startX, 55, startZ);
        	gl.glVertex3f(startX+5, 55, startZ);
        	gl.glVertex3f(startX+5, 55, startZ+5);
        	gl.glVertex3f(startX, 55, startZ+5);
        	gl.glEnd();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
            gl.glDisable(GL2.GL_TEXTURE_GEN_S);
            gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	
	
	private void grassPlane(GL2 gl, GLU glu){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		grassTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {1f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,0,1f,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
        gl.glBegin(GL2.GL_QUADS);
    	gl.glVertex3f(0, 0, 100);
    	gl.glVertex3f(100, 0, 100);
    	gl.glVertex3f(100, 0, 0);
    	gl.glVertex3f(0, 0, 0);
    	gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	
	private void sideTrap (GL2 gl, GLU glu, float startX, float startY, float startZ, float upX, float upY, float upZ, float upL, float downL){
		//for making trapazoid like shape for the side walls
		gl.glEnable(GL2.GL_TEXTURE_2D);
		windowTexture.bind();
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
	
	private void eleCable(GL2 gl, GLU glu, float startX, float startY, float startZ){
		gl.glPushMatrix();
		gl.glEnable(GL2.GL_BLEND);
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glColor4d(0, 0.749, 1, 0.2);
		gl.glTranslatef(startX, startY, startZ);
		gl.glRotatef(-90,1,0,0);
		glu.gluCylinder(quadric, 5, 5, 40, 20, 1);
		gl.glDisable(GL2.GL_BLEND);
		gl.glPopMatrix();
	}
	private void elefloor(GL2 gl, GLU glu, float startX, float startY, float startZ){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		floorTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {0,0,0.5f,0};
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
		eleTexture.bind();
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
		eleTexture.bind();
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
		windowTexture.bind();
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
	private void eleDoor(GL2 gl, GLU glu, float startX, float startY, float startZ, float tilt){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		windowTexture.bind();
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
        	gl.glVertex3f(startX+5f, startY, startZ);
        	gl.glVertex3f(startX+5f, startY+10f, startZ+tilt);
        	gl.glVertex3f(startX, startY+10, startZ+tilt);
        	gl.glEnd();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
            gl.glDisable(GL2.GL_TEXTURE_GEN_S);
            gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	
	private void oneEleDoor(GL2 gl, GLU glu){
		if(oneCount >= 0 && oneCount <= 20){
			eleDoor(gl, glu, oneX-oneSpace, 0, 92, -2f);
			eleDoor(gl, glu, oneX+5+oneSpace, 0, 92, -2f);
			oneCount++;
			oneSpace += 0.2;
		}
		if(oneCount >= 21 && oneCount <= 54){
			eleDoor(gl, glu, oneX-oneSpace, 0, 92, -2f);
			eleDoor(gl, glu, oneX+5+oneSpace, 0, 92, -2f);
			oneCount++;
		}
		if(oneCount > 54 && oneCount<= 75){
			eleDoor(gl, glu, oneX-oneSpace, 0, 92, -2f);
			eleDoor(gl, glu, oneX+5+oneSpace, 0, 92, -2f);
			oneCount++;
			oneSpace -= 0.2;
		}
		if(oneCount == 75){
			oneGo = 1;
		}
		if(oneCount > 75){
			eleDoor(gl, glu, oneX, 0, 92, -2f);
			eleDoor(gl, glu, oneX+5, 0, 92, -2f);
		}		
		
	}
	
	private void twoEleDoor(GL2 gl, GLU glu){
		if(twoCount >= 0 && twoCount <= 20){
			eleDoor(gl, glu, twoX-twoSpace, 0, 57, -2f);
			eleDoor(gl, glu, twoX+5+twoSpace, 0, 57, -2f);
			twoCount++;
			twoSpace += 0.2;
		}
		if(twoCount >= 21 && twoCount <= 54){
			eleDoor(gl, glu, twoX-twoSpace, 0, 57, -2f);
			eleDoor(gl, glu, twoX+5+twoSpace, 0, 57, -2f);
			twoCount++;
		}
		if(twoCount > 54 && twoCount<= 75){
			eleDoor(gl, glu, twoX-twoSpace, 0, 57, -2f);
			eleDoor(gl, glu, twoX+5+twoSpace, 0, 57, -2f);
			twoCount++;
			twoSpace -= 0.2;
		}
		if(twoCount == 75){
			twoGo = 1;
		}
		if(twoCount > 75){
			eleDoor(gl, glu, twoX, 0, 57, -2f);
			eleDoor(gl, glu, twoX+5, 0, 57, -2f);
		}		
		
	}
	private void threeEleDoor(GL2 gl, GLU glu){
		if(threeCount >= 0 && threeCount <= 20){
			eleDoor(gl, glu, threeX-threeSpace, 0, 57, -2f);
			eleDoor(gl, glu, threeX+5+threeSpace, 0, 57, -2f);
			threeCount++;
			threeSpace += 0.2;
		}
		if(threeCount >= 21 && threeCount <= 54){
			eleDoor(gl, glu, threeX-threeSpace, 0, 57, -2f);
			eleDoor(gl, glu, threeX+5+threeSpace, 0, 57, -2f);
			threeCount++;
		}
		if(threeCount > 54 && threeCount<= 75){
			eleDoor(gl, glu, threeX-threeSpace, 0, 57, -2f);
			eleDoor(gl, glu, threeX+5+threeSpace, 0, 57, -2f);
			threeCount++;
			threeSpace -= 0.2;
		}
		if(threeCount == 75){
			threeGo = 1;
		}
		if(threeCount > 75){
			eleDoor(gl, glu, threeX, 0, 57, -2f);
			eleDoor(gl, glu, threeX+5, 0, 57, -2f);
		}		
		
	}
	private void fourEleDoor(GL2 gl, GLU glu){
		if(fourCount >= 0 && fourCount <= 20){
			eleDoor(gl, glu, fourX-fourSpace, 0, 22, -2f);
			eleDoor(gl, glu, fourX+5+fourSpace, 0, 22, -2f);
			fourCount++;
			fourSpace += 0.2;
		}
		if(fourCount >= 21 && fourCount <= 54){
			eleDoor(gl, glu, fourX-fourSpace, 0, 22, -2f);
			eleDoor(gl, glu, fourX+5+fourSpace, 0, 22, -2f);
			fourCount++;
		}
		if(fourCount > 54 && fourCount<= 75){
			eleDoor(gl, glu, fourX-fourSpace, 0, 22, -2f);
			eleDoor(gl, glu, fourX+5+fourSpace, 0, 22, -2f);
			fourCount++;
			fourSpace -= 0.2;
		}
		if(fourCount == 75){
			fourGo = 1;
		}
		if(fourCount > 75){
			eleDoor(gl, glu, fourX, 0, 22, -2f);
			eleDoor(gl, glu, fourX+5, 0, 22, -2f);
		}		
		
	}
	
	private void elevator(GL2 gl, GLU glu){
		elefloor(gl, glu, ele1StartX, ele1StartY, ele1StartZ);
		eleSide(gl, glu, ele1StartX, ele1StartY, ele1StartZ);
		eleSide(gl, glu, ele1StartX+5, ele1StartY, ele1StartZ);
		eleBack(gl, glu, ele1StartX, ele1StartY, ele1StartZ);
		elefloor(gl, glu, ele2StartX, ele2StartY, ele2StartZ);
		eleSide(gl, glu, ele2StartX, ele2StartY, ele2StartZ);
		eleSide(gl, glu, ele2StartX+5, ele2StartY, ele2StartZ);
		eleBack(gl, glu, ele2StartX, ele2StartY, ele2StartZ);
		elefloor(gl, glu, ele3StartX, ele3StartY, ele3StartZ);
		eleSide(gl, glu, ele3StartX, ele3StartY, ele3StartZ);
		eleSide(gl, glu, ele3StartX+5, ele3StartY, ele3StartZ);
		eleBack(gl, glu, ele3StartX, ele3StartY, ele3StartZ);
		elefloor(gl, glu, ele4StartX, ele4StartY, ele4StartZ);
		eleSide(gl, glu, ele4StartX, ele4StartY, ele4StartZ);
		eleSide(gl, glu, ele4StartX+5, ele4StartY, ele4StartZ);
		eleBack(gl, glu, ele4StartX, ele4StartY, ele4StartZ);
		
		if(ele1StartY == 55 && oneTop == 0){ //first elevator control
			    ele1Height = ele1Height*-1;
			    oneGo = 3;
			    oneTop++;
		}
		if(oneGo == 3 && oneTop < 50){
			oneTop++;
		}
		if(oneTop == 50){
			oneGo = 2;
		}
		
		if(ele1StartY == 0 && oneGo == 2){
			oneCount = 0;
			ele1Height = Math.abs(ele1Height);
			oneGo = 0;
			oneTop = 0;
		}
		if(oneGo == 1){
			ele1StartY += ele1Height;
			oneGo = 2;
		}				
		if(oneGo == 2){
			ele1StartY += ele1Height;
		}
		
		
		if(ele2StartY == 55 && twoTop == 0){ //second elevator control
		    ele2Height = ele2Height*-1;
		    twoGo = 3;
		    twoTop++;
		}
		if(twoGo == 3 && twoTop < 50){
			twoTop++;
		}
		if(twoTop == 50){
			twoGo = 2;
		}
    	if(ele2StartY == 0 && twoGo == 2){
		twoCount = 0;
		ele2Height = Math.abs(ele2Height);
		twoGo = 0;
		twoTop = 0;
	    }
    	if(twoGo == 1){
		ele2StartY += ele2Height;
		twoGo = 2;
    	}				
    	if(twoGo == 2){
		ele2StartY += ele2Height;
    	}
    	
    	if(ele3StartY == 55 && threeTop == 0){ //third elevator control
		    ele3Height = ele3Height*-1;
		    threeGo = 3;
		    threeTop++;
		}
		if(threeGo == 3 && threeTop < 50){
			threeTop++;
		}
		if(threeTop == 50){
			threeGo = 2;
		}
    	if(ele3StartY == 0 && threeGo == 2){
		threeCount = 0;
		ele3Height = Math.abs(ele3Height);
		threeGo = 0;
		threeTop = 0;
	    }
    	if(threeGo == 1){
		ele3StartY += ele3Height;
		threeGo = 2;
    	}				
    	if(threeGo == 2){
		ele3StartY += ele3Height;
    	}
    	
    	if(ele4StartY == 55 && fourTop == 0){ //fourth elevator control
		    ele4Height = ele4Height*-1;
		    fourGo = 3;
		    fourTop++;
		}
		if(fourGo == 3 && fourTop < 50){
			fourTop++;
		}
		if(fourTop == 50){
			fourGo = 2;
		}
    	if(ele4StartY == 0 && fourGo == 2){
		fourCount = 0;
		ele4Height = Math.abs(ele4Height);
		fourGo = 0;
		fourTop = 0;
	    }
    	if(fourGo == 1){
		ele4StartY += ele4Height;
		fourGo = 2;
    	}				
    	if(fourGo == 2){
		ele4StartY += ele4Height;
    	}
		
	}
	
	private void fish(GL2 gl, GLU glu){
		moveFish();
		gl.glPushMatrix();
		gl.glScalef(2, 1, 1);
		gl.glTranslatef(fishX, fishY, 50);
		gl.glRotatef(angle, 0, 1, 0);
		gl.glColor3f(0.9f, 0.9f, 0.4f);
		glu.gluSphere(spherequadric, 1, 10, 10);
		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glColor3f(0.9f, 0.9f, 0.4f);
		gl.glVertex3f(1, 0, 0);
		gl.glVertex3f(2, 1.5f, 0);
		gl.glVertex3f(2, -1.5f, 0);
		gl.glEnd();
		gl.glPushMatrix();
		gl.glColor3f(0, 0, 0);
		gl.glTranslatef(-1f, 0.3f, 1);		
		glu.gluSphere(spherequadric, 0.2, 10, 10);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glColor3f(0, 0, 0);
		gl.glTranslatef(-1f, 0.3f, -1);		
		glu.gluSphere(spherequadric, 0.2, 10, 10);
		gl.glPopMatrix();
		gl.glPopMatrix();
	}
	
	
	
	private void moveFish(){
	
		if(fishX > 27){
			speed = speed*-1;
			angle = 0;
		}
		if(fishX< 22){
			speed = Math.abs(speed);
			angle = -180;
		}
		fishX = fishX+speed;
	
	}
	
	
	
	private void firstWalls(GL2 gl, GLU glu){
		oneEleDoor(gl, glu);
		eleCable(gl, glu, 50, 15, 85);
		wallPlane(gl, glu, 45, 10, 90, 0);
		wallPlane(gl, glu, 45, 0, 78, 2f);
		wallPlane(gl, glu, 45, 10, 80, 0);
		sideTrap(gl, glu, 45, 0, 78, 45, 10, 80, 10, 14);
		sideTrap(gl, glu, 55, 0, 78, 55, 10, 80, 10, 14);
		sideTrap(gl, glu, 45, 10, 80, 45, 20, 80, 10, 10);
		sideTrap(gl, glu, 55, 10, 80, 55, 20, 80, 10, 10);		
	}
	
	private void secondWalls(GL2 gl, GLU glu){
		twoEleDoor(gl, glu);
		eleCable(gl, glu, 15, 15, 50);
		wallPlane(gl, glu, 10, 10, 55, 0);
		wallPlane(gl, glu, 10, 0, 43, 2f);
		wallPlane(gl, glu, 10, 10, 45, 0);
		sideTrap(gl, glu, 10, 0, 43, 10, 10, 45, 10, 14);
		sideTrap(gl, glu, 20, 0, 43, 20, 10, 45, 10, 14);
		sideTrap(gl, glu, 10, 10, 45, 10, 20, 45, 10, 10);
		sideTrap(gl, glu, 20, 10, 45, 20, 20, 45, 10, 10);		
	}
	
	private void thirdWalls(GL2 gl, GLU glu){
		threeEleDoor(gl, glu);
		eleCable(gl, glu, 85, 15, 50);
		wallPlane(gl, glu, 80, 10, 55, 0);
		wallPlane(gl, glu, 80, 0, 43, 2f);
		wallPlane(gl, glu, 80, 10, 45, 0);
		sideTrap(gl, glu, 80, 0, 43, 80, 10, 45, 10, 14);
		sideTrap(gl, glu, 90, 0, 43, 90, 10, 45, 10, 14);
		sideTrap(gl, glu, 80, 10, 45, 80, 20, 45, 10, 10);
		sideTrap(gl, glu, 90, 10, 45, 90, 20, 45, 10, 10);		
	}
	
	private void fourthWalls(GL2 gl, GLU glu){
		fourEleDoor(gl, glu);
		eleCable(gl, glu, 50, 15, 15);
		wallPlane(gl, glu, 45, 10, 20, 0);
		wallPlane(gl, glu, 45, 0, 8, 2f);
		wallPlane(gl, glu, 45, 10, 10, 0);
		sideTrap(gl, glu, 45, 0, 8, 45, 10, 10, 10, 14);
		sideTrap(gl, glu, 55, 0, 8, 55, 10, 10, 10, 14);
		sideTrap(gl, glu, 45, 10, 10, 45, 20, 10, 10, 10);
		sideTrap(gl, glu, 55, 10, 10, 55, 20, 10, 10, 10);		
	}
	
	private void platform(GL2 gl, GLU glu){
		floorPlane(gl, glu, ele4StartX-5, ele4StartZ+5);
		floorPlane(gl, glu, ele4StartX, ele4StartZ+5);
		floorPlane(gl, glu, ele4StartX+5, ele4StartZ+5);
		floorPlane(gl, glu, ele4StartX-5, ele4StartZ);
		floorPlane(gl, glu, ele4StartX+5, ele4StartZ);
		floorPlane(gl, glu, ele4StartX-5, ele4StartZ-5);
		floorPlane(gl, glu, ele4StartX, ele4StartZ-5);		
		floorPlane(gl, glu, ele4StartX+5, ele4StartZ-5);
		floorPlane(gl, glu, ele4StartX, ele4StartZ+10);
		floorPlane(gl, glu, ele4StartX, ele4StartZ+15);
		
		floorPlane(gl, glu, ele3StartX-5, ele3StartZ+5);
		floorPlane(gl, glu, ele3StartX, ele3StartZ+5);
		floorPlane(gl, glu, ele3StartX+5, ele3StartZ+5);
		floorPlane(gl, glu, ele3StartX-5, ele3StartZ);
		floorPlane(gl, glu, ele3StartX+5, ele3StartZ);
		floorPlane(gl, glu, ele3StartX-5, ele3StartZ-5);
		floorPlane(gl, glu, ele3StartX, ele3StartZ-5);
		floorPlane(gl, glu, ele3StartX+5, ele3StartZ-5);
		floorPlane(gl, glu, ele3StartX-10, ele3StartZ);
		floorPlane(gl, glu, ele3StartX-15, ele3StartZ);
		
		floorPlane(gl, glu, ele2StartX-5, ele2StartZ+5);
		floorPlane(gl, glu, ele2StartX, ele2StartZ+5);
		floorPlane(gl, glu, ele2StartX+5, ele2StartZ+5);
		floorPlane(gl, glu, ele2StartX-5, ele2StartZ);
		floorPlane(gl, glu, ele2StartX+5, ele2StartZ);
		floorPlane(gl, glu, ele2StartX-5, ele2StartZ-5);
		floorPlane(gl, glu, ele2StartX, ele2StartZ-5);		
		floorPlane(gl, glu, ele2StartX+5, ele2StartZ-5);
		floorPlane(gl, glu, ele2StartX+10, ele2StartZ);
		floorPlane(gl, glu, ele2StartX+15, ele2StartZ);
		
		floorPlane(gl, glu, ele1StartX-5, ele1StartZ+5);
		floorPlane(gl, glu, ele1StartX, ele1StartZ+5);
		floorPlane(gl, glu, ele1StartX+5, ele1StartZ+5);
		floorPlane(gl, glu, ele1StartX-5, ele1StartZ);
		floorPlane(gl, glu, ele1StartX+5, ele1StartZ);
		floorPlane(gl, glu, ele1StartX-5, ele1StartZ-5);
		floorPlane(gl, glu, ele1StartX, ele1StartZ-5);
		floorPlane(gl, glu, ele1StartX+5, ele1StartZ-5);
		floorPlane(gl, glu, ele1StartX, ele1StartZ-10);
		floorPlane(gl, glu, ele1StartX, ele1StartZ-15);
		
		for(float i = 0; i<8; i++){
			for(float j = 0; j<8; j++){
				floorPlane(gl, glu, platX+(5*i), platZ+(5*j));
			}			
		}
		
	}
	
	private void aquaSphere(GL2 gl, GLU glu){
		gl.glPushMatrix();
		gl.glEnable(GL2.GL_BLEND);
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glColor4d(0.254, 0.411, 1, 0.2);
		gl.glTranslatef(50, 68, 50);
		glu.gluSphere(spherequadric, 10, 10, 10);
		gl.glDisable(GL2.GL_BLEND);
		gl.glPopMatrix();
		
		
		gl.glPushMatrix();
		gl.glTranslatef(50, 55, 50);
		gl.glRotatef(-90, 1, 0, 0);
		gl.glColor3f(0, 0, 0);
		glu.gluCylinder(spherequadric, 6, 2, 3, 10, 1);
		gl.glPopMatrix();
	
	}
	
	private void propeller(GL2 gl, GLU glu){
		gl.glEnable(GL2.GL_TEXTURE_2D);
		floorTexture.bind();
		gl.glPushMatrix();
		gl.glTranslatef(50, 50, 50);
		propAngle += 60;
		gl.glRotatef(propAngle, 0, 1, 0);
		glu.gluSphere(spherequadric, 5, 10, 10);
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0, 0); gl.glVertex3f(0, -1.5f, 2f);
		gl.glTexCoord2f(0, 1); gl.glVertex3f(0, -1.5f, -2f);
		gl.glTexCoord2f(1, 1); gl.glVertex3f(-20, -1.5f, -2f);
		gl.glTexCoord2f(1, 0); gl.glVertex3f(-20, -1.5f, 2f);
		gl.glEnd();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0, 0); gl.glVertex3f(0, -1.5f, 2f);
		gl.glTexCoord2f(0, 1); gl.glVertex3f(0, -1.5f, -2f);
		gl.glTexCoord2f(1, 1); gl.glVertex3f(20, -1.5f, -2f);
		gl.glTexCoord2f(1, 0); gl.glVertex3f(20, -1.5f, 2f);
		gl.glEnd();
		gl.glPopMatrix();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	
	
	
}