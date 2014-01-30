package Buildings;
import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.TardisChair;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.TextureIO;


public class StephanBuilding extends Building
{
	
	private static GLUquadric quadric; // to control properties of quadric-based objects here
	private static Texture grassTexture;
	private static Texture panelTexture;
	private static Texture tardisInteriorTexture;
	private static Texture floorTexture;
	private static TardisChair chair;
	private TextRenderer renderer;

	
	public StephanBuilding(GL2 gl,GLU glu)
	{
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		if(quadric==null){
		 quadric = glu.gluNewQuadric();
	     glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
	     glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
	     glu.gluQuadricTexture  (quadric, false);        // false, or true to generate texture coordinates
	     grassTexture = setupTexture(gl, "stephanGrass.png");
	     panelTexture = setupTexture(gl, "stephanPanel.png");
	     tardisInteriorTexture = setupTexture(gl, "stephanTardisInterior.png");
	     floorTexture = setupTexture(gl, "stephanFloor.png");
	     chair = new TardisChair(gl,glu);
		}
	}
	
	   public void drawMoving(GL2 gl, GLU glu) {
	            	// Stephane Building Text
              gl.glPushMatrix();
                  gl.glRotated(180, 0, 1, 0);
                  gl.glTranslated(-70, 5, -24.5);
                  renderer.begin3DRendering();
                  renderer.setColor(.6f, .1f, 1, 1);
                  renderer.draw3D("A Night At The Roxbury", 0f, 0f,0, .25f*1f/9);
                  renderer.end3DRendering();
          gl.glPopMatrix();
  
	    }


	@Override
	public void draw(GL2 gl, GLU glu) {
        
        
        
		
	  gl.glPushMatrix(); // Ames change
	  gl.glTranslatef(0,0,100); // move to x&y in 0..100 range
		
		//automatic texture arrays
    	float[] coef_sTardisInteriorSide = {0,0,.4f,0};
    	float[] coef_tTardisInteriorSide = {0,.4f,0,0};
    	float[] coef_sTardisInteriorFrontBack = {.4f,0,0,0};
    	float[] coef_tTardisInteriorFrontBack = {0,.4f,0,0};
    	float[] coef_sPanelSide = {0,0,.25f,0};
    	float[] coef_tPanelSide = {0,.2f,0,0};
    	float[] coef_sPanelFrontBack = {.25f,0,0,0};
    	float[] coef_tPanelFrontBack = {0,.2f,0,0};
    	float[] coef_sGrass = {.5f,0,0,0};
    	float[] coef_tGrass = {0,0,.5f,0};
		
		
		
    	//grass on left side
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    grassTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sGrass, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tGrass, 0);      
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(0.0, 0.0, 0.0);
	    		gl.glVertex3d(25.0, 0.0, 0.0);
	    		gl.glVertex3d(25.0, 0.0, -100.0);
	    		gl.glVertex3d(0.0, 0.0, -100.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	//grass on right side
    	gl.glEnable(GL2.GL_TEXTURE_2D);
	    grassTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sGrass, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tGrass, 0);      
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(75.0, 0.0, 0.0);
	    		gl.glVertex3d(100.0, 0.0, 0.0);
	    		gl.glVertex3d(100.0, 0.0, -100.0);
	    		gl.glVertex3d(75.0, 0.0, -100.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	//grass in front
    	gl.glEnable(GL2.GL_TEXTURE_2D);
	    grassTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sGrass, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tGrass, 0);      
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(25.0, 0.0, 0.0);
	    		gl.glVertex3d(75.0, 0.0, 0.0);
	    		gl.glVertex3d(75.0, 0.0, -25.0);
	    		gl.glVertex3d(25.0, 0.0, -25.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	//grass in back
    	gl.glEnable(GL2.GL_TEXTURE_2D);
	    grassTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sGrass, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tGrass, 0);      
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(25.0, 0.0, -75.0);
	    		gl.glVertex3d(75.0, 0.0, -75.0);
	    		gl.glVertex3d(75.0, 0.0, -100.0);
	    		gl.glVertex3d(25.0, 0.0, -100.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	//floor
    	gl.glEnable(GL2.GL_TEXTURE_2D);
	    floorTexture.bind();     
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3d(25.0, 0.0, -25.0);
	    		gl.glTexCoord2f(10f,0f); gl.glVertex3d(75.0, 0.0, -25.0);
	    		gl.glTexCoord2f(10f,12f); gl.glVertex3d(75.0, 0.0, -75.0);
	    		gl.glTexCoord2f(0f,12f); gl.glVertex3d(25.0, 0.0, -75.0);
	    	gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	//left wall
		gl.glEnable(GL2.GL_CULL_FACE);
		gl.glEnable(GL2.GL_TEXTURE_2D);
		tardisInteriorTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sTardisInteriorSide, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tTardisInteriorSide, 0);            
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(25.0, 20.0, -75.0);
	    		gl.glVertex3d(25.0, 20.0, -25.0);
	    		gl.glVertex3d(25.0, 0.0, -25.0);
	    		gl.glVertex3d(25.0, 0.0, -75.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    gl.glEnable(GL2.GL_TEXTURE_2D);
		panelTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sPanelSide, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tPanelSide, 0);
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(25.0, 0.0, -75.0);
		    	gl.glVertex3d(25.0, 0.0, -25.0);
		    	gl.glVertex3d(25.0, 20.0, -25.0);
	    		gl.glVertex3d(25.0, 20.0, -75.0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glDisable(GL2.GL_CULL_FACE);
    	
    	//right wall
		gl.glEnable(GL2.GL_CULL_FACE);
		gl.glEnable(GL2.GL_TEXTURE_2D);
		panelTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sPanelSide, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tPanelSide, 0);
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(75.0, 20.0, -75.0);
	    		gl.glVertex3d(75.0, 20.0, -25.0);
	    		gl.glVertex3d(75.0, 0.0, -25.0);
	    		gl.glVertex3d(75.0, 0.0, -75.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    gl.glEnable(GL2.GL_TEXTURE_2D);
		tardisInteriorTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sTardisInteriorSide, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tTardisInteriorSide, 0);         
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(75.0, 0.0, -75.0);
		    	gl.glVertex3d(75.0, 0.0, -25.0);
		    	gl.glVertex3d(75.0, 20.0, -25.0);
	    		gl.glVertex3d(75.0, 20.0, -75.0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glDisable(GL2.GL_CULL_FACE);
    	
    	//back wall
    	//right side
    	gl.glEnable(GL2.GL_CULL_FACE);
		gl.glEnable(GL2.GL_TEXTURE_2D);
		panelTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sPanelFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tPanelFrontBack, 0);
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(35.0, 20.0, -75.0);
	    		gl.glVertex3d(75.0, 20.0, -75.0);
	    		gl.glVertex3d(75.0, 0.0, -75.0);
	    		gl.glVertex3d(35.0, 0.0, -75.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    tardisInteriorTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sTardisInteriorFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tTardisInteriorFrontBack, 0);         
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(35.0, 0.0, -75.0);
		    	gl.glVertex3d(75.0, 0.0, -75.0);
		    	gl.glVertex3d(75.0, 20.0, -75.0);
			    gl.glVertex3d(35.0, 20.0, -75.0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glDisable(GL2.GL_CULL_FACE);
    	
    	//above door side
    	gl.glEnable(GL2.GL_CULL_FACE);
		gl.glEnable(GL2.GL_TEXTURE_2D);
		panelTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sPanelFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tPanelFrontBack, 0);
	    	gl.glBegin(GL2.GL_QUADS);
	    		gl.glVertex3d(25.0, 20.0, -75.0);
	    		gl.glVertex3d(35.0, 20.0, -75.0);
	    		gl.glVertex3d(35.0, 15.0, -75.0);
	    		gl.glVertex3d(25.0, 15.0, -75.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    tardisInteriorTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sTardisInteriorFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tTardisInteriorFrontBack, 0);         
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(25.0, 15.0, -75.0);
		    	gl.glVertex3d(35.0, 15.0, -75.0);
		    	gl.glVertex3d(35.0, 20.0, -75.0);
			    gl.glVertex3d(25.0, 20.0, -75.0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glDisable(GL2.GL_CULL_FACE);
    	
    	
    	//front wall
    	//left side
    	gl.glEnable(GL2.GL_CULL_FACE);
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    tardisInteriorTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sTardisInteriorFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tTardisInteriorFrontBack, 0);         
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(25.0, 20.0, -25.0);
		    	gl.glVertex3d(45.0, 20.0, -25.0);
		    	gl.glVertex3d(45.0, 0.0, -25.0);
		    	gl.glVertex3d(25.0, 0.0, -25.0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glEnable(GL2.GL_TEXTURE_2D);
		panelTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sPanelFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tPanelFrontBack, 0);
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(25.0, 0.0, -25.0);
		    	gl.glVertex3d(45.0, 0.0, -25.0);
	    		gl.glVertex3d(45.0, 20.0, -25.0);
	    		gl.glVertex3d(25.0, 20.0, -25.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glDisable(GL2.GL_CULL_FACE);
    	
    	
    	//right side
    	gl.glEnable(GL2.GL_CULL_FACE);
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    tardisInteriorTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sTardisInteriorFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tTardisInteriorFrontBack, 0);         
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(55.0, 20.0, -25.0);
		    	gl.glVertex3d(75.0, 20.0, -25.0);
		    	gl.glVertex3d(75.0, 0.0, -25.0);
		    	gl.glVertex3d(55.0, 0.0, -25.0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glEnable(GL2.GL_TEXTURE_2D);
		panelTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sPanelFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tPanelFrontBack, 0);
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(55.0, 0.0, -25.0);
		    	gl.glVertex3d(75.0, 0.0, -25.0);
	    		gl.glVertex3d(75.0, 20.0, -25.0);
	    		gl.glVertex3d(55.0, 20.0, -25.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glDisable(GL2.GL_CULL_FACE);
    	
    	//above door
    	gl.glEnable(GL2.GL_CULL_FACE);
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    tardisInteriorTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sTardisInteriorFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tTardisInteriorFrontBack, 0);         
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(45.0, 20.0, -25.0);
		    	gl.glVertex3d(55.0, 20.0, -25.0);
		    	gl.glVertex3d(55.0, 15.0, -25.0);
		    	gl.glVertex3d(45.0, 15.0, -25.0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glEnable(GL2.GL_TEXTURE_2D);
		panelTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sPanelFrontBack, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tPanelFrontBack, 0);
	    	gl.glBegin(GL2.GL_QUADS);
		    	gl.glVertex3d(45.0, 15.0, -25.0);
		    	gl.glVertex3d(55.0, 15.0, -25.0);
	    		gl.glVertex3d(55.0, 20.0, -25.0);
	    		gl.glVertex3d(45.0, 20.0, -25.0);
	    	gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glDisable(GL2.GL_CULL_FACE);
    	
    	
    	//Roof
    	gl.glColor3f(.215f, .224f, .282f);
    	gl.glBegin(GL2.GL_TRIANGLE_FAN);
	    	gl.glVertex3d(50.0, 27.0, -50.0);
	    	gl.glVertex3d(25.0, 20.0, -75.0);
	    	gl.glVertex3d(75.0, 20.0, -75.0);
	    	gl.glVertex3d(75.0, 20.0, -25.0);
	    	gl.glVertex3d(25.0, 20.0, -25.0);
	    	gl.glVertex3d(25.0, 20.0, -75.0);
    	gl.glEnd();
    	
    	
    	// Prototypes:
        //glu.gluSphere(quadric,  radius, slices, stacks), center at origin
        //glu.gluCylinder quadric, base, top, height, slices, stacks), down +Z axis
        //glu.gluDisk(quadric, inner radius, outer radius, slices, stacks), in XY plane
        //glu.gluPartialDisk(quadric, inner radius, outer radius, slices, stacks, start angle, end angle)
    	
    	//light on roof
    	gl.glColor3f(.7f, .7f, .7f);
    	gl.glPushMatrix();
    		gl.glTranslatef(50f, 27f, -50f);
    		gl.glRotatef(-90,1, 0, 0);
    		glu.gluCylinder(quadric,1, 1, 3, 10, 1);
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    		gl.glTranslatef(50f, 29f, -50f);
    		glu.gluSphere(quadric,  1, 10, 10);
    	gl.glPopMatrix();
    	
    	//center console
    	gl.glColor3f(.85f, .85f, .44f);
    	gl.glPushMatrix();
			gl.glTranslatef(50f, 5f, -50f);
			gl.glRotatef(-90,1, 0, 0);
			glu.gluCylinder(quadric,2.5, 2.5, 20, 10, 1);
			glu.gluDisk(quadric, 0, 2.5, 10, 10);
		gl.glPopMatrix();
		
		gl.glColor3f(1f, 0f, 0f);
		gl.glPushMatrix();
			gl.glTranslatef(50f, 3f, -50f);
			gl.glRotatef(-90,1, 0, 0);
			glu.gluDisk(quadric, 0, 4, 10, 10);
		gl.glPopMatrix();
			
		gl.glPushMatrix();
			gl.glTranslatef(50f, 3f, -50f);
			gl.glRotatef(-90,1, 0, 0);
			glu.gluDisk(quadric, 0, 5, 10, 10);
			glu.gluCylinder(quadric,5, 2.5, 2, 10, 1);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslatef(50f, 0f, -50f);
			gl.glRotatef(-90,1, 0, 0);
			glu.gluCylinder(quadric,4, 4, 3, 10, 1);
		gl.glPopMatrix();
		
		//coat rack
		gl.glColor3f(0f, 0f, 0f);
		gl.glPushMatrix();
			gl.glTranslatef(60f, .1f, -30f);
			gl.glRotatef(-90,1, 0, 0);
			glu.gluDisk(quadric, .1, 1, 10, 10);
			glu.gluCylinder(quadric,.1,.1, 7, 10, 1);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glTranslatef(60f, 7.0f, -30f);
			gl.glRotatef(90, 0, 1, 0);
			gl.glRotatef(-25,1, 0, 0);
			glu.gluCylinder(quadric,.1,.1, 1.25, 5, 1);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glTranslatef(60f, 7.0f, -30f);
			gl.glRotatef(270, 0, 1, 0);
			gl.glRotatef(-25,1, 0, 0);
			glu.gluCylinder(quadric,.1,.1, 1.25, 5, 1);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glTranslatef(60f, 7.0f, -30f);
			gl.glRotatef(180, 0, 1, 0);
			gl.glRotatef(-25,1, 0, 0);
			glu.gluCylinder(quadric,.1,.1, 1.25, 5, 1);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glTranslatef(60f, 7.0f, -30f);
			gl.glRotatef(-25,1, 0, 0);
			glu.gluCylinder(quadric,.1,.1, 1.25, 5, 1);
		gl.glPopMatrix();
      gl.glPopMatrix();
      
      //chair
      gl.glPushMatrix();
      	gl.glTranslatef(35f, 0f, 50f);
      	gl.glRotatef(90f, 0f, 1f, 0f);
      	gl.glScalef(2f, 2f, 2f);
      	chair.draw(gl, glu);
      gl.glPopMatrix();
	}

}
