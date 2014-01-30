package Buildings;
// William Ames Fall 2010

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class MccannBuilding extends Building
{
    private GLUquadric quadric; // to control properties of quadric-based objects here
    private SketchupModelJAXB destroyer;
    private Texture texture1, texture2;
    private TextRenderer renderer;


    public MccannBuilding(GL2 gl, GLU glu) {
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, true);        // false, or true to generate texture coordinates

		destroyer = new SketchupModelJAXB("Dallas_Class_Destroyer.dae",gl, glu);
        
        texture1 = setupTexture(gl, "base_road1.png");
        texture2 = setupTexture(gl, "metaltiles.png");
        renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
    }    
    
    public void drawMoving(GL2 gl, GLU glu) {
    	// McCann Building Text
        gl.glPushMatrix();
            gl.glRotated(180, 0, 1, 0);
            gl.glTranslated(-60, 10, -4.5);
            renderer.begin3DRendering();
            renderer.setColor(.5f, 0, 0, 1);
            renderer.draw3D("The Last Castle", 0f, 0f,0, .25f*1f/6);
            renderer.end3DRendering();
          gl.glPopMatrix();

    }

    
    public void draw(GL2 gl, GLU glu) {
    	
              	
    	gl.glPushMatrix();
    		gl.glRotated(-90, 0, 1, 0);
    		gl.glTranslated(200, 300, 400);
    		gl.glScaled(8, 8, 8);
    		destroyer.draw(gl, glu);
    	gl.glPopMatrix();
    
    	
      gl.glPushMatrix();
        gl.glTranslatef(0,0,100); // ames change, move to z=0..100 range
        gl.glEnable(GL2.GL_TEXTURE_2D);
    	texture1.bind();

    	gl.glPushMatrix();
    		gl.glTranslatef(50f, 11f, -50f);
    		gl.glRotatef(90f, 1.0f, 0.0f, 0.0f);
        	glu.gluCylinder(quadric, 10, 10, 11, 10, 1);
        	glu.gluCylinder(quadric, 2, 2, -200, 10, 1);
        	texture2.bind();
        	glu.gluDisk(quadric, 0, 10, 10, 10);
        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);

    	
        gl.glEnable(GL2.GL_TEXTURE_2D);
    	texture2.bind();
        gl.glBegin(GL2.GL_QUADS);
        	// Draw the ground
        	gl.glColor3d(0, 1, 0);
        	gl.glTexCoord2d(0,0);	gl.glVertex3d(0, 0, 0);
        	gl.glTexCoord2d(0,10);	gl.glVertex3d(0, 0, -100);
        	gl.glTexCoord2d(10,10);	gl.glVertex3d(100, 0, -100);
        	gl.glTexCoord2d(10,0);	gl.glVertex3d(100, 0, 0);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        // all outer walls, octagon with straight sides length = 38 
        gl.glBegin(GL2.GL_QUAD_STRIP);
            gl.glColor3d(.3,.3,.3);
            
            gl.glTexCoord2d(0,0);gl.glVertex3d(29, 7, -5);
            gl.glTexCoord2d(0,20);gl.glVertex3d(29, 50, -5);
            gl.glTexCoord2d(4,0);gl.glVertex3d(71, 7, -5);
            gl.glTexCoord2d(4,20);gl.glVertex3d(71, 50, -5);
            
            gl.glTexCoord2d(4,0);gl.glVertex3d(95, 7, -29);
            gl.glTexCoord2d(4,20);gl.glVertex3d(95, 50, -29);
            
            gl.glTexCoord2d(4,0);gl.glVertex3d(95, 7, -71);
            gl.glTexCoord2d(4,20);gl.glVertex3d(95, 50, -71);
            
            gl.glTexCoord2d(4,0);gl.glVertex3d(71, 7, -95);
            gl.glTexCoord2d(4,20);gl.glVertex3d(71, 50, -95);
            
            gl.glTexCoord2d(4,0);gl.glVertex3d(29, 7, -95);
            gl.glTexCoord2d(4,20);gl.glVertex3d(29, 50, -95);
            
            gl.glTexCoord2d(4,0);gl.glVertex3d(5, 7, -71);
            gl.glTexCoord2d(4,20);gl.glVertex3d(5, 50, -71);
            
            gl.glTexCoord2d(4,0);gl.glVertex3d(5, 7, -29);
            gl.glTexCoord2d(4,20);gl.glVertex3d(5, 50, -29);
            
            gl.glTexCoord2d(4,0);gl.glVertex3d(29, 7, -5);
            gl.glTexCoord2d(4,20);gl.glVertex3d(29, 50, -5);
            
            gl.glEnd();

            gl.glEnable(GL2.GL_TEXTURE_2D);
        	texture1.bind();
            gl.glPushMatrix();
            	drawQuadrant(gl);
            gl.glPopMatrix();
            gl.glPushMatrix();
            	gl.glTranslatef(100f,0.0f,0.0f);
            	gl.glRotatef(90,0.0f,1.0f,0.0f);
            	drawQuadrant(gl);
            gl.glPopMatrix();
            gl.glPushMatrix();
            	gl.glTranslatef(100.0f,0.0f,-100.0f);
            	gl.glRotatef(180,0.0f,1.0f,0.0f);
            	drawQuadrant(gl);
        	gl.glPopMatrix();
        	gl.glPushMatrix();
            	gl.glTranslatef(0.0f,0.0f,-100.0f);
            	gl.glRotatef(270,0.0f,1.0f,0.0f);
            	drawQuadrant(gl);
    		gl.glPopMatrix();
    		gl.glDisable(GL2.GL_TEXTURE_2D);
    	gl.glPopMatrix();
    }
    public void drawQuadrant(GL2 gl) {

      	gl.glEnable(GL2.GL_TEXTURE_2D);
    	gl.glBegin(GL2.GL_QUAD_STRIP);
      	
    	gl.glColor3d(0, 0, 1);
      	// outer walls
      	gl.glTexCoord2d(0,0);	gl.glVertex3d(52, 10, -5);
      	gl.glTexCoord2d(0,1);	gl.glVertex3d(52, 0, -5);
      	gl.glTexCoord2d(1,0);	 gl.glVertex3d(71, 10, -5);
      	gl.glTexCoord2d(1,1);	 gl.glVertex3d(71, 0, -5);

      	gl.glTexCoord2d(1,0);	gl.glVertex3d(95, 10, -29);
      	gl.glTexCoord2d(1,1);	gl.glVertex3d(95, 0, -29);
      
      	gl.glTexCoord2d(1,0);	gl.glVertex3d(95, 10, -48);
      	gl.glTexCoord2d(1,1);	gl.glVertex3d(95, 0, -48);
    
      	gl.glEnd();
      	gl.glDisable(GL2.GL_TEXTURE_2D);

      	gl.glEnable(GL2.GL_TEXTURE_2D);
      	texture2.bind();
      	gl.glBegin(GL2.GL_QUADS);
      
      	gl.glTexCoord2d(0,0);	gl.glVertex3d(85.76, 10, -46);	//elbow segment 1
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(95, 10, -46);
	      gl.glTexCoord2d(2,1);	gl.glVertex3d(95, 10, -29);
	      gl.glTexCoord2d(2,0);	gl.glVertex3d(85.76, 10, -29);
	
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(95, 10, -29);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(85.76, 10, -34);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(66.76, 10, -14.24);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(71, 10, -5);			//elbow segment 2
	      
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(62, 9, -25);	//tile at top of ramp
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(68, 9, -25);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(68, 9, -35);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(62, 9, -35);
	      	
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(68, 9, -35);	//tile at far end of platform
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(78, 9, -35);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(78, 9, -41);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(68, 9, -41);
	      	
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(68, 9, -41);	//triangles filling in the platform
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(62, 9, -35);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(68, 9, -25);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(78, 9, -35);
	      
	      gl.glEnd();
	      gl.glDisable(GL2.GL_TEXTURE_2D);
	      
	      gl.glEnable(GL2.GL_TEXTURE_2D);
	      texture1.bind();
	      gl.glBegin(GL2.GL_QUADS);
	      
	      gl.glTexCoord2d(0,19);	gl.glVertex3d(71, 10, -5);
	      gl.glTexCoord2d(1,19);	gl.glVertex3d(66.76, 10, -14.24);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(66.76, 50, -14.24); 	//wall segment
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(71, 50, -5);

	      gl.glTexCoord2d(0,0);	gl.glVertex3d(80.76, 10, -29);	//elbow barrier
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(80.76, 15, -29);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(71.76, 15, -19.24);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(71.76, 10, -19.24);
	      
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(15, 50, -5);	//ceiling
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(85, 50, -5);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(85, 50, -95);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(15, 50, -95);
	
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(71, 10, -5);	//wall behind elbow
	      gl.glTexCoord2d(0,20);	gl.glVertex3d(71, 50, -5);
	      gl.glTexCoord2d(1,20);	gl.glVertex3d(95, 50, -29);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(95, 10, -29);
	  		
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(66.76, 0, -14.24);	//wall between exit and elbow
	      gl.glTexCoord2d(0,20);	gl.glVertex3d(66.76, 50, -14.24);
	      gl.glTexCoord2d(1,20);	gl.glVertex3d(54, 50, -14.24);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(54, 0, -14.24);
	      
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(47.5, 11, -41);	//center barrier
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(47.5, 19, -41);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(52.5, 19, -41);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(52.5, 11, -41);
	      
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(50, 11, -50);	//center ledge
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(50, 12, -50);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(50, 12, -41);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(50, 11, -41);
	  		
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(54, 10, -14.24);	//wall above exit
	      gl.glTexCoord2d(0,19);	gl.glVertex3d(54, 50, -14.24);
	      gl.glTexCoord2d(1,19);	gl.glVertex3d(46, 50, -14.24);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(46, 10, -14.24);
	      
	      gl.glTexCoord2d(0,0);   gl.glVertex3d(85.76, 10, -46);	//wall below elbow segment 1
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(85.76, 0, -46);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(85.76, 0, -34);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(85.76, 10, -34);
			
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(85.76, 10, -34);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(85.76, 0, -34);
	      gl.glTexCoord2d(2,1);	gl.glVertex3d(66.76, 0, -14.24);
	      gl.glTexCoord2d(2,0);	gl.glVertex3d(66.76, 10, -14.24);	//wall below elbow segment 2
	      
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(54, 0, -14.24);	//right wall of exit alcove (facing inward)
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(54, 0, -5);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(54, 10, -5);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(54, 10, -14.24);
	  		
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(85.76, 0, -46);	//left wall of exit alcove (facing inward)
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(95, 0, -46);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(95, 10, -46);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(85.76, 10, -46);
	  		
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(46, 10, -5);	//ceiling of exit alcove
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(46, 10, -14.24);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(54, 10, -14.24);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(54, 10, -5);
	      
	      gl.glTexCoord2d(1,18);	gl.glVertex3d(85.76, 50, -46);	//arch1
	      gl.glTexCoord2d(0,18);	gl.glVertex3d(85.76, 50, -40);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(85.76, 20, -40);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(85.76, 20, -46);
	      
	      gl.glTexCoord2d(1,19);	gl.glVertex3d(95, 50, -34);	//arch2
	      gl.glTexCoord2d(0,19);	gl.glVertex3d(85.76, 50, -34);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(85.76, 20, -34);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(95, 20, -34);
	      
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(95, 20, -46);	//arch3
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(85.76, 20, -46);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(85.76, 20, -34);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(95, 20, -34);
	      
	      gl.glTexCoord2d(1,19);	gl.glVertex3d(85.76, 50, -40);	//arch4
	      gl.glTexCoord2d(0,19);	gl.glVertex3d(85.76, 50, -34);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(85.76, 10, -34);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(85.76, 10, -40);

	      gl.glTexCoord2d(1,19);	gl.glVertex3d(46, 50, -5);	//another wall
	      gl.glTexCoord2d(0,19);	gl.glVertex3d(46, 50, -14.24);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(46, 10, -14.24);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(46, 10, -5);
	      
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(57, 0, -25.5);	//back wall of ramp chock
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(57, 0, -29.5);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(57, 4.8, -29.5);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(57, 4.8, -25.5);
	
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(51, 0, -25);	//ramp
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(51, 0, -30);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(62, 9, -30);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(62, 9, -25);
	      
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(68, 9, -41);	//rectangular prism supporting inner corner of platform
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(62, 9, -35);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(62, 0, -35);	
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(68, 0, -41);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(62, 9, -35);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(62, 0, -35);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(67, 0, -35);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(67, 9, -35);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(67, 9, -35);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(67, 0, -35);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(67, 0, -40);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(67, 9, -40);
	      	
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(68, 9, -25);	//wall supporting outer edge of platform
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(78, 9, -35);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(78, 0, -35);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(68, 0, -25);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(78, 9, -41);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(78, 9, -35);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(78, 0, -35);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(78, 0, -41);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(67.5, 9, -25.5);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(77.5, 9, -35.5);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(77.5, 0, -35.5);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(67.5, 0, -25.5);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(77.5, 9, -41);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(77.5, 9, -35.5);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(77.5, 0, -35.5);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(77.5, 0, -41);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(77.5, 9, -41);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(77.5, 0, -41);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(78, 0, -41);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(78, 9, -41);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(68, 9, -25);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(68, 0, -25);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(67.5, 0, -25.5);
	      gl.glTexCoord2d(1,0);	gl.glVertex3d(67.5, 9, -25.5);
	
	      gl.glEnd();
	      gl.glBegin(GL2.GL_TRIANGLES);
	      	
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(57, 4.8, -25.5);	//side walls of ramp chock
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(57, 0, -25.5);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(51, 0, -25.5);
	      gl.glTexCoord2d(0,0);	gl.glVertex3d(57, 4.8, -29.5);
	      gl.glTexCoord2d(0,1);	gl.glVertex3d(57, 0, -29.5);
	      gl.glTexCoord2d(1,1);	gl.glVertex3d(51, 0, -29.5);
	      
	      gl.glEnd();
	      gl.glDisable(GL2.GL_TEXTURE_2D);
    }
          
}
