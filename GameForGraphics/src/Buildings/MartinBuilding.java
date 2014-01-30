package Buildings;
import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.CompanionCube;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


public class MartinBuilding extends Building {
private static GLUquadric wallquadric;
private static GLUquadric peakquadric;
private static GLUquadric ballquadric;
private static Texture grassTexture;
private static Texture woodenTexture;
private static Texture stoneTexture;
private static Texture stripeTexture;
private static Texture waveTexture;
//private static SketchupModelJAXB companionCube;
private static CompanionCube companionCube;
private TextRenderer renderer;


	public MartinBuilding(GL2 gl,GLU glu){
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
		//Edit by Melvin Ross
		if(wallquadric==null){
	    //companionCube = new SketchupModelJAXB("CompanionCube.dae",gl,glu);
	    companionCube = new CompanionCube(gl,glu);
		wallquadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(wallquadric, GLU.GLU_FILL); 
        glu.gluQuadricNormals  (wallquadric, GLU.GLU_NONE); 
        glu.gluQuadricTexture  (wallquadric, false);
        
        peakquadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(peakquadric, GLU.GLU_FILL); 
        glu.gluQuadricNormals  (peakquadric, GLU.GLU_NONE); 
        glu.gluQuadricTexture  (peakquadric, false);
        
        ballquadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(ballquadric, GLU.GLU_FILL); 
        glu.gluQuadricNormals  (ballquadric, GLU.GLU_NONE); 
        glu.gluQuadricTexture  (ballquadric, true);
        
        grassTexture = setupTexture(gl, "martingrass.png");
        woodenTexture = setupTexture(gl, "martinwooden.png");
        stoneTexture = setupTexture(gl, "martinstone.png");
        stripeTexture = setupTexture(gl, "martinstripes.png");
        waveTexture = setupTexture(gl, "martinwaves.png");
		}
        
	}
	   public void drawMoving(GL2 gl, GLU glu) {
		// Martin Building Text
        gl.glPushMatrix();
            gl.glRotated(-90, 0, 1, 0);
            gl.glTranslated(42, 10, -11.5);
            renderer.begin3DRendering();
            renderer.setColor(0, 0, 1, 1);
            renderer.draw3D("Point Break", 0f, 0f,0, .25f*1f/6);
            renderer.end3DRendering();
        gl.glPopMatrix();
 
	    }

	public void draw(GL2 gl, GLU glu) {

		
		gl.glPushMatrix();
			gl.glTranslatef(50, 0, 50);
			companionCube.draw(gl,glu);
		gl.glPopMatrix();
	gl.glEnable(GL2.GL_TEXTURE_2D);//walls of tower
		stoneTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	    	gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	    	gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	    	float[] coef_s = {.5f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            float[] coef_t = {0,0,.5f,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	    	gl.glPushMatrix();//Main room, walls of tower
				gl.glTranslatef(50, 0, 50);
				gl.glRotatef(-90f, 1, 0, 0);
				glu.gluCylinder(wallquadric,40,40,40,10,1);
			gl.glPopMatrix();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	
    gl.glEnable(GL2.GL_TEXTURE_2D);//roof of tower
	woodenTexture.bind();
	gl.glEnable(GL2.GL_TEXTURE_GEN_S);
    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
    	gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
    	gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
    	float[] coef_s2 = {.5f,0,0,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s2, 0);
        float[] coef_t2 = {0,0,.5f,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t2, 0);
		gl.glPushMatrix();
			gl.glTranslatef(50, 40, 50);
			gl.glRotatef(-90f,1,0,0);
			glu.gluCylinder(peakquadric,40,1,40,10,1);
		gl.glPopMatrix();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);	//ground
		grassTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 0);
			gl.glTexCoord2f(0f,4f); gl.glVertex3f(0, 0, 100);
			gl.glTexCoord2f(4f,4f); gl.glVertex3f(100, 0, 100);
			gl.glTexCoord2f(4f,0f); gl.glVertex3f(100, 0, 0);
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);//beach ball
		stripeTexture.bind();
		gl.glPushMatrix();
			gl.glTranslatef(40, 2, 50);
			glu.gluSphere(ballquadric, 2, 10, 10);
		gl.glPopMatrix();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);//picture on rear wall
		waveTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,1f); gl.glVertex3f(12, 10, 45);
			gl.glTexCoord2f(1f,1f); gl.glVertex3f(12, 10, 55);
			gl.glTexCoord2f(1f,0f); gl.glVertex3f(12, 20, 55);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(12, 20, 45);
		gl.glEnd();
	
	gl.glDisable(GL2.GL_TEXTURE_2D);
		
		gl.glBegin(GL2.GL_QUADS);//use white rectangles for openings
			//need one rectangle for each side of opening
			gl.glColor3f(1f, 1f, 1f);
			
			gl.glVertex3f(12, 0, 46);
			gl.glVertex3f(12, 0, 54);
			gl.glVertex3f(12, 7, 54);
			gl.glVertex3f(12, 7, 46);
			//these two are one "door"
			gl.glVertex3f(11.8f, 0, 46);
			gl.glVertex3f(11.8f, 0, 54);
			gl.glVertex3f(11.8f, 7, 54);
			gl.glVertex3f(11.8f, 7, 46);
			
			gl.glVertex3f(88f, 0, 46);
			gl.glVertex3f(88f, 0, 54);
			gl.glVertex3f(88f, 7, 54);
			gl.glVertex3f(88f, 7, 46);
			//these two are second "door"
			gl.glVertex3f(88.1f, 0, 46);
			gl.glVertex3f(88.1f, 0, 54);
			gl.glVertex3f(88.1f, 7, 54);
			gl.glVertex3f(88.1f, 7, 46);			
		gl.glEnd();

		
	}

}
