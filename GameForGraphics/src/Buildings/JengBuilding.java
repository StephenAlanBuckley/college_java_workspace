package Buildings;
/*
   Warren's building
   Warren Jeng, Fall 2010
   CS333 Homework #5
*/

import java.awt.Font;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.JengRobot;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class JengBuilding extends Building{
    private static GLUquadric woodQuadric; // to control properties of quadric-based objects here
    private static GLUquadric ballQuadric; //
    private static Texture wallTexture;
    private static Texture floorTexture;
    private static Texture grassTexture;
    private static Texture basketballTexture;
    private static Texture woodTexture;
    private static JengRobot robot;
    private TextRenderer renderer;
    
    public JengBuilding(GL2 gl, GLU glu) {
        renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
    	if(woodQuadric==null){
    	woodQuadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(woodQuadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (woodQuadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (woodQuadric, true);        // wooden chair
        
        ballQuadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(ballQuadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (ballQuadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (ballQuadric, true);        // true for basketball texture
        
        grassTexture = setupTexture(gl, "jengGrass.png");
        wallTexture = setupTexture(gl, "jengWall.png");
        floorTexture = setupTexture(gl, "jengFloor.png");
        basketballTexture = setupTexture(gl, "jengBasketball.png");
        woodTexture = setupTexture(gl, "jengWood.png");
        
        robot = new JengRobot(gl, glu);
    	}
    }
    
    public void drawMoving(GL2 gl, GLU glu) {
        // Jeng Building Text
                gl.glPushMatrix();
                    gl.glRotated(0, 0, 1, 0);
                    gl.glTranslated(45, 10, 80.5);
                    renderer.begin3DRendering();
                    renderer.setColor(.2f, .2f, .2f, 1);
                    renderer.draw3D("The Chair", 0f, 0f,0, .25f*1f/9);
                    renderer.end3DRendering();
            gl.glPopMatrix();

    }


    public void draw(GL2 gl, GLU glu) {
        
      
    	
    	gl.glPushMatrix(); // Ames change
      gl.glTranslatef(0,0,100); // move to x&y in 0..100 range
        gl.glColor3f(139f/255,69f/255,19f/255);
        
        //google sketchup robot statue
        gl.glPushMatrix();
        	gl.glTranslatef(45,0,-60);
        	gl.glRotatef(-90,0,1,0);
        	robot.draw(gl, glu);
        gl.glPopMatrix();
        
        // basketball in room
        gl.glEnable(GL2.GL_TEXTURE_2D);
        	basketballTexture.bind();
	        gl.glPushMatrix();
	        	gl.glTranslatef(35,1,-70);
	        	glu.gluSphere(ballQuadric, 1, 10, 10);
	        gl.glPopMatrix();
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    
	    //chair
        gl.glEnable(GL2.GL_TEXTURE_2D);
	    	woodTexture.bind();
	    	//leg 1
	        gl.glPushMatrix();
	            gl.glTranslatef(65f,1.5f,-60f);
	            gl.glRotatef(-90,1,0,0);
	            glu.gluCylinder(woodQuadric, .2, .2, 1.5, 5, 1);
	        gl.glPopMatrix();
	        //leg 2
	        gl.glPushMatrix();
		        gl.glTranslatef(66.5f,1.5f,-60f);
		        gl.glRotatef(-90,1,0,0);
		        glu.gluCylinder(woodQuadric, .2, .2, 1.5, 5, 1);
		    gl.glPopMatrix();
		    //leg 3
		    gl.glPushMatrix();
			    gl.glTranslatef(65f,1.5f,-61.5f);
			    gl.glRotatef(-90,1,0,0);
			    glu.gluCylinder(woodQuadric, .2, .2, 1.5, 5, 1);
			gl.glPopMatrix();
			//leg 4
			gl.glPushMatrix();
				gl.glTranslatef(66.5f,1.5f,-61.5f);
				gl.glRotatef(-90,1,0,0);
				glu.gluCylinder(woodQuadric, .2, .2, 1.5, 5, 1);
			gl.glPopMatrix();
			//seat
			gl.glPushMatrix();
				gl.glTranslatef(65.75f,2.9f,-60.75f);
				gl.glRotatef(-90,1,0,0);
				glu.gluCylinder(woodQuadric, 0, 1.3, .1, 10, 1);
			gl.glPopMatrix();
			//back piece
			gl.glPushMatrix();
				gl.glTranslatef(65.75f,4.05f,-62f);
				glu.gluCylinder(woodQuadric, 0, 1.3, .1, 10, 1);
			gl.glPopMatrix();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	    
        // building floor, manual texture generation
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gl.glEnable(GL.GL_CULL_FACE);
            floorTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f(20, 0, -20);
                gl.glTexCoord2f(5f,0f); gl.glVertex3f(80, 0, -20);
                gl.glTexCoord2f(5f,5f); gl.glVertex3f(80, 0, -80);
                gl.glTexCoord2f(0f,5f); gl.glVertex3f(20, 0, -80);
            gl.glEnd();
        gl.glDisable(GL.GL_CULL_FACE);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
	    // grass floor around building using automatic texture generation
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    gl.glEnable(GL.GL_CULL_FACE);
	    grassTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        
	        float[] coef_s = {.1f,0,0,0};
	        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	        float[] coef_t = {0,0,-.1f,0};
	        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	        gl.glBegin(GL2.GL_QUADS);
	        	//lower rectangle
	            gl.glVertex3f(  0, 0, 0);
	            gl.glVertex3f(100, 0, 0);
	            gl.glVertex3f(100, 0, -20);
	            gl.glVertex3f(  0, 0, -20);
	            //upper rectangle
	            gl.glVertex3f(  0, 0, -80);
	            gl.glVertex3f(100, 0, -80);
	            gl.glVertex3f(100, 0, -100);
	            gl.glVertex3f(  0, 0, -100);
	            //left rectangle
	            gl.glVertex3f( 0, 0, -20);
	            gl.glVertex3f(20, 0, -20);
	            gl.glVertex3f(20, 0, -80);
	            gl.glVertex3f( 0, 0, -80);
	            //right rectangle
	            gl.glVertex3f( 80, 0, -20);
	            gl.glVertex3f(100, 0, -20);
	            gl.glVertex3f(100, 0, -80);
	            gl.glVertex3f( 80, 0, -80);
	        gl.glEnd();
	    gl.glDisable(GL.GL_CULL_FACE);
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	    
	    
	    // create 4 walls using automatic texture
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    wallTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	        
	        gl.glBegin(GL2.GL_QUADS);
        		//ceiling
		        gl.glVertex3f(20, 25, -20);
	            gl.glVertex3f(80, 25, -20);
	            gl.glVertex3f(80, 25, -80);
	            gl.glVertex3f(20, 25, -80);
            gl.glEnd();
        
	        coef_t[2] = 0;
	        coef_t[1] = .2f;
	        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

	        gl.glBegin(GL2.GL_QUADS);
	        	//front wall with door
	            gl.glVertex3f(20, 0, -20);
	            gl.glVertex3f(48, 0, -20);
	            gl.glVertex3f(48, 7, -20);
	            gl.glVertex3f(20, 7, -20);
	            
	            gl.glVertex3f(52, 0, -20);
	            gl.glVertex3f(80, 0, -20);
	            gl.glVertex3f(80, 7, -20);
	            gl.glVertex3f(52, 7, -20);
	            
	            gl.glVertex3f(20, 7, -20);
	            gl.glVertex3f(80, 7, -20);
	            gl.glVertex3f(80, 25, -20);
	            gl.glVertex3f(20, 25, -20);
	            
	            //back wall
	            gl.glVertex3f(20,  0, -80);
	            gl.glVertex3f(80,  0, -80);
	            gl.glVertex3f(80, 25, -80);
	            gl.glVertex3f(20, 25, -80);
	        gl.glEnd();
	        
	        coef_s[0] = 0f;
	        coef_s[2] = -0.1f;
	        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	        gl.glBegin(GL2.GL_QUADS);
	        	//left side wall
	            gl.glVertex3f(20, 0, -20);
	            gl.glVertex3f(20, 0, -80);
	            gl.glVertex3f(20, 25, -80);
	            gl.glVertex3f(20, 25, -20);

		        //right side wall with door
	            gl.glVertex3f(80, 0, -20);
	            gl.glVertex3f(80, 0, -52);
	            gl.glVertex3f(80, 7, -52);
	            gl.glVertex3f(80, 7, -20);
	            
	            gl.glVertex3f(80,  7, -20);
	            gl.glVertex3f(80,  7, -80);
	            gl.glVertex3f(80, 25, -80);
	            gl.glVertex3f(80, 25, -20);
	            
	            gl.glVertex3f(80, 0, -56);
	            gl.glVertex3f(80, 0, -80);
	            gl.glVertex3f(80, 7, -80);
	            gl.glVertex3f(80, 7, -56);
	        gl.glEnd();
	        
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	  gl.glPopMatrix();
    }
}
