package Buildings;
// Will Fothergill
// Homework #6

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.*;

import main.SketchupModelJAXB;


import SketchupModels.FothergillCouch;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class FothergillBuilding extends Building
{
    private static GLUquadric quadric; // to control properties of quadric-based objects here
    private static Texture stoneTexture;
    private static Texture floorTexture;
    private static Texture grassTexture;
    private static Texture indoorTexture;
    private static Texture indoorRotatedTexture;
    private static Texture indoorRoofTexture;
    private static Texture outdoorRoofTexture;
    private static FothergillCouch myCouch;
    private TextRenderer renderer;

    
    
    public FothergillBuilding(GL2 gl, GLU glu) {
    	renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
    	if(quadric==null){
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture (quadric, false); // false, or true to generate texture coordinates
        
        stoneTexture = Building.setupTexture(gl, "FothergillStones.png");
        floorTexture = Building.setupTexture(gl, "Fothergillwood.png");
        grassTexture = Building.setupTexture(gl, "FothergillGrass.png");
        indoorTexture = Building.setupTexture(gl, "FothergillIndoorWall.png");
        indoorRotatedTexture = Building.setupTexture(gl, "FothergillIndoorWallRotated.png");
        indoorRoofTexture = Building.setupTexture(gl, "FothergillInsideCeiling.png");
        outdoorRoofTexture = Building.setupTexture(gl, "FothergillOutdoorRoof.png");
        myCouch = new FothergillCouch(gl, glu);
    	}
    }
    
    public void drawMoving(GL2 gl, GLU glu) {
    	// Fothergill Building Text
    	 gl.glPushMatrix();
    	               gl.glRotated(180, 0, 1, 0);
    	               gl.glTranslated(-30, 10, -9.5);
    	               renderer.begin3DRendering();
    	               renderer.setColor(0.2f, 0.2f, 1f, 1);
    	               renderer.draw3D("Waiting...", 0f, 0f,0, .25f*1f/6);
    	               renderer.end3DRendering();
    	 gl.glPopMatrix();

    }

    
    public void draw(GL2 gl, GLU glu) {
                

    	
        //Outside Grass
        gl.glEnable(GL2.GL_TEXTURE_2D);
            grassTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(0f,2f); gl.glVertex3f(0,  0, 0);
                gl.glTexCoord2f(3f,2f); gl.glVertex3f( 0,  0, 100);
                gl.glTexCoord2f(3f,0f); gl.glVertex3f( 100, 0, 100);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f(100, 0, 0);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        // Indoor Wood Checked Floor
        gl.glEnable(GL2.GL_TEXTURE_2D);
        floorTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,20f); gl.glVertex3f(10,  0.1f, 10);
            gl.glTexCoord2f(20f,20f); gl.glVertex3f( 10,  0.1f, 90);
            gl.glTexCoord2f(20f,0f); gl.glVertex3f(90, 0.1f, 90);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(90, 0.1f, 10);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
    
        // Walkway 1 (in front)
        gl.glColor3f(.2f,.2f,.2f); 
        gl.glBegin(GL2.GL_QUADS);
    		gl.glVertex3f( 20, 0, 0);
    		gl.glVertex3f(20, 0, 10);
    		gl.glVertex3f(30, 0, 10);
    		gl.glVertex3f( 30, 0, 0);
    	gl.glEnd();
    	
    	//draw Sketchup Model
		gl.glPushMatrix(); 
			gl.glTranslatef(12f, 0, 20f);
			gl.glRotated(90, 0, 1, 0);
			myCouch.draw(gl, glu);
		gl.glPopMatrix(); 
    	
    	// Walkway 2 (in back)
        gl.glColor3f(.2f,.2f,.2f); 
        gl.glBegin(GL2.GL_QUADS);
    		gl.glVertex3f( 20, 0, 90);
    		gl.glVertex3f(20, 0, 100);
    		gl.glVertex3f(30, 0, 100);
    		gl.glVertex3f( 30, 0, 90);
    	gl.glEnd();
    	
    	// draw the front and back walls of the building on the insides only
        gl.glEnable(GL2.GL_CULL_FACE);
    	gl.glEnable(GL2.GL_TEXTURE_2D);
           indoorRotatedTexture.bind();
           gl.glEnable(GL2.GL_TEXTURE_GEN_S);
           gl.glEnable(GL2.GL_TEXTURE_GEN_T);
               gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               float[] coef_s = {.5f,0,0,0};
               gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
               float[] coef_t = {0,.25f,0,0};
               gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
               gl.glBegin(GL2.GL_QUADS);
               	// front wall to right of door
               	gl.glVertex3f( 10, 0, 10);
                   gl.glVertex3f(20, 0, 10);
                   gl.glVertex3f(20, 13, 10);
                   gl.glVertex3f( 10, 13, 10);
                   // front wall above door
                   gl.glVertex3f( 20, 7, 10);
                   gl.glVertex3f(30, 7, 10);
                   gl.glVertex3f(30, 13, 10);
                   gl.glVertex3f( 20, 13, 10);
                   // front wall to left of door
                   gl.glVertex3f( 30, 0, 10);
                   gl.glVertex3f(90, 0, 10);
                   gl.glVertex3f(90, 13, 10);
                   gl.glVertex3f( 30, 13, 10);
                   // back wall to right of door
               	gl.glVertex3f( 10, 13, 90);
                   gl.glVertex3f(20, 13, 90);
                   gl.glVertex3f(20, 0, 90);
                   gl.glVertex3f( 10, 0, 90);
                   // back wall above door
                   gl.glVertex3f( 20, 13, 90);
                   gl.glVertex3f(30, 13, 90);
                   gl.glVertex3f(30, 7, 90);
                   gl.glVertex3f( 20, 7, 90);
                   // back wall to left of door
                   gl.glVertex3f( 30, 0, 90);
                   gl.glVertex3f(30, 13, 90);
                   gl.glVertex3f(90, 13, 90);
                   gl.glVertex3f( 90, 0, 90);
               gl.glEnd();
           gl.glDisable(GL2.GL_TEXTURE_2D);
           gl.glDisable(GL2.GL_TEXTURE_GEN_S);
           gl.glDisable(GL2.GL_TEXTURE_GEN_T);
          gl.glDisable(GL2.GL_CULL_FACE);
          
          
           // Left Wall inside
           gl.glEnable(GL2.GL_CULL_FACE);
           gl.glEnable(GL2.GL_TEXTURE_2D);
           indoorTexture.bind();
           gl.glBegin(GL2.GL_QUADS);
               gl.glTexCoord2f(0f,30f); gl.glVertex3f(90,  0, 90);
               gl.glTexCoord2f(3f,30f); gl.glVertex3f(90,  13, 90);
               gl.glTexCoord2f(3f,0f); gl.glVertex3f(90, 13, 10);
               gl.glTexCoord2f(0f,0f); gl.glVertex3f(90, 0, 10);
           gl.glEnd();
           gl.glDisable(GL2.GL_TEXTURE_2D);
           gl.glDisable(GL2.GL_CULL_FACE);
           
        // Right Wall Inside
           gl.glEnable(GL2.GL_CULL_FACE);
           gl.glEnable(GL2.GL_TEXTURE_2D);
           indoorTexture.bind();
           gl.glBegin(GL2.GL_QUADS);
               gl.glTexCoord2f(0f,30f); gl.glVertex3f(10,  0, 10);
               gl.glTexCoord2f(3f,30f); gl.glVertex3f(10,  13, 10);
               gl.glTexCoord2f(3f,0f); gl.glVertex3f(10, 13, 90);
               gl.glTexCoord2f(0f,0f); gl.glVertex3f(10, 0, 90);
           gl.glEnd();
           gl.glDisable(GL2.GL_TEXTURE_2D);
           gl.glDisable(GL2.GL_CULL_FACE);
         
           
        /*// Inside Roof
           gl.glColor3d(1, .5, 0);
           gl.glBegin(GL2.GL_QUADS);
           		gl.glVertex3f(10,  13, 10);
           		gl.glVertex3f(10,  40, 50);
           		gl.glVertex3f(90,  40, 50);
           		gl.glVertex3f(90,  13, 10);
           
           		gl.glVertex3f(10,  13, 90);
           		gl.glVertex3f(10,  40, 50);
           		gl.glVertex3f(90,  40, 50);
           		gl.glVertex3f(90,  13, 90);
           gl.glEnd();
           
           gl.glColor3d(0, .5, .5);
           gl.glBegin(GL2.GL_TRIANGLES);
           		gl.glVertex3f(10,  13, 10);
           		gl.glVertex3f(10,  40, 50);
           		gl.glVertex3f(10,  13, 90);
           		
           		gl.glVertex3f(90,  13, 10);
           		gl.glVertex3f(90,  40, 50);
           		gl.glVertex3f(90,  13, 90);
           gl.glEnd();
    	*/
          // Used to draw the front and back inside ceilings 
           gl.glEnable(GL2.GL_CULL_FACE);
           gl.glEnable(GL2.GL_TEXTURE_2D);
           indoorRoofTexture.bind();
           gl.glEnable(GL2.GL_TEXTURE_GEN_S);
           gl.glEnable(GL2.GL_TEXTURE_GEN_T);
               gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               float[] coef_s1 = {.5f,0,0,0};
               gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
               float[] coef_t1 = {0,.25f,0,0};
               gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
               gl.glBegin(GL2.GL_QUADS);
               		
               // Inside Ceiling frontside
               		gl.glVertex3f(90,  13, 10);
               		gl.glVertex3f(90,  40, 50);
               		gl.glVertex3f(10,  40, 50);
               		gl.glVertex3f(10,  13, 10);
               	// Inside Ceiling backside
               		gl.glVertex3f(10,  13, 90);
               		gl.glVertex3f(10,  40, 50);
               		gl.glVertex3f(90,  40, 50);
               		gl.glVertex3f(90,  13, 90);
               
               gl.glEnd();
           gl.glDisable(GL2.GL_TEXTURE_2D);
           gl.glDisable(GL2.GL_TEXTURE_GEN_S);
           gl.glDisable(GL2.GL_TEXTURE_GEN_T);
           gl.glDisable(GL2.GL_CULL_FACE);
           
        // Used to draw the left and right side inside walls 
           gl.glEnable(GL2.GL_CULL_FACE);
           gl.glEnable(GL2.GL_TEXTURE_2D);
           outdoorRoofTexture.bind();
           gl.glEnable(GL2.GL_TEXTURE_GEN_S);
           gl.glEnable(GL2.GL_TEXTURE_GEN_T);
               gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               float[] coef_s11 = {0,0,.5f,0};
               gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s11, 0);
               float[] coef_t11 = {0,.25f,0,0};
               gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t11, 0);
               
               // Right Triangle part of wall.
               gl.glBegin(GL2.GL_TRIANGLES);
          		gl.glVertex3f(10,  13, 10);
          		gl.glVertex3f(10,  40, 50);
          		gl.glVertex3f(10,  13, 90);
          		
          		// Left Triangle Part of wall
          		gl.glVertex3f(90,  13, 90);
          		gl.glVertex3f(90,  40, 50);
          		gl.glVertex3f(90,  13, 10);
                              
               gl.glEnd();
           gl.glDisable(GL2.GL_TEXTURE_2D);
           gl.glDisable(GL2.GL_TEXTURE_GEN_S);
           gl.glDisable(GL2.GL_TEXTURE_GEN_T);
           gl.glDisable(GL2.GL_CULL_FACE);
    	
    	// Rug 1 (Large Rug)
    	gl.glPushMatrix();
    		gl.glTranslated(60, 0.2f, 65);
    		drawRug(gl, glu);
    	gl.glPopMatrix();
    	
    	// Rug 2 (Small Rug)
    	gl.glPushMatrix();
			gl.glScaled(.5, 1, .5);
			gl.glTranslated(110, 0.2f, 50);
			drawRug(gl, glu);
		gl.glPopMatrix();
        
		// Draws the six tables in the scene
        gl.glPushMatrix();
        	gl.glTranslated(45, 0, 30);
        	drawTable(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawTable(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawTable(gl, glu);
        	gl.glTranslated(20, 0, 0);
        	drawTable(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawTable(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawTable(gl, glu);
        gl.glPopMatrix();
		
        // Draw The stools around the tables
        gl.glPushMatrix();
        	gl.glTranslated(42, 0, 30);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(20, 0, 0);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        	gl.glTranslated(-13, 0, 0);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(20, 0, 0);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        	gl.glTranslated(-23, 0, -3);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(20, 0, 0);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        	gl.glTranslated(-20, 0, 6);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, 20);
        	drawStool(gl, glu);
        	gl.glTranslated(20, 0, 0);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        	gl.glTranslated(0, 0, -20);
        	drawStool(gl, glu);
        gl.glPopMatrix();
        
     // Left Wall, Outside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        stoneTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,30f); gl.glVertex3f(90,  0, 10);
            gl.glTexCoord2f(3f,30f); gl.glVertex3f(90,  13, 10);
            gl.glTexCoord2f(3f,0f); gl.glVertex3f(90, 13, 90);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(90, 0, 90);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);
        
      ///*//Right Wall, Outside Need To Fix
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        stoneTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,30f); gl.glVertex3f(10,  0, 90);
            gl.glTexCoord2f(3f,30f); gl.glVertex3f(10,  13, 90);
            gl.glTexCoord2f(3f,0f); gl.glVertex3f(10, 13, 10);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(10, 0, 10);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);
        //*/
        
        // Culling outside front and back walls
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        stoneTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s111 = {.1f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s111, 0);
            float[] coef_t111 = {0,.1f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t111, 0);
            gl.glBegin(GL2.GL_QUADS);
            	// front wall to right of door
            	gl.glVertex3f( 10, 13, 10);
                gl.glVertex3f(20, 13, 10);
                gl.glVertex3f(20, 0, 10);
                gl.glVertex3f( 10, 0, 10);
                // front wall above door
                gl.glVertex3f( 20, 13, 10);
                gl.glVertex3f(30, 13, 10);
                gl.glVertex3f(30, 7, 10);
                gl.glVertex3f( 20, 7, 10);
                // front wall to left of door
                gl.glVertex3f( 30, 0, 10);
                gl.glVertex3f(30, 13, 10);
                gl.glVertex3f(90, 13, 10);
                gl.glVertex3f( 90, 0, 10);
                // back wall to right of door
            	gl.glVertex3f( 10, 0, 90);
                gl.glVertex3f(20, 0, 90);
                gl.glVertex3f(20, 13, 90);
                gl.glVertex3f( 10, 13, 90);
                // back wall above door
                gl.glVertex3f( 20, 7, 90);
                gl.glVertex3f(30, 7, 90);
                gl.glVertex3f(30, 13, 90);
                gl.glVertex3f( 20, 13, 90);
                // back wall to left of door
                gl.glVertex3f( 90, 0, 90);
                gl.glVertex3f(90, 13, 90);
                gl.glVertex3f(30, 13, 90);
                gl.glVertex3f( 30, 0, 90);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);
     
     // Outside Roof
     // Used to draw the front and back outside ceilings 
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        outdoorRoofTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s122 = {.5f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s122, 0);
            float[] coef_t122 = {0,.25f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t122, 0);
            gl.glBegin(GL2.GL_QUADS);
            		
            // Outside Roof frontside
            gl.glVertex3f(10,  13, 10);
            gl.glVertex3f(10,  40, 50);
            		gl.glVertex3f(90,  40, 50);
            		
            		gl.glVertex3f(90,  13, 10);
            	// Outside Roof backside
            		gl.glVertex3f(90,  13, 90);
            		
            		gl.glVertex3f(90,  40, 50);
            		gl.glVertex3f(10,  40, 50);
            		gl.glVertex3f(10,  13, 90);
            gl.glEnd();
            
         // Right Triangle part of wall.
            gl.glBegin(GL2.GL_TRIANGLES);
       		
            gl.glVertex3f(10,  13, 90);
            
       		gl.glVertex3f(10,  40, 50);
       		gl.glVertex3f(10,  13, 10);
       		
       		// Left Triangle Part of wall
       		gl.glVertex3f(90,  13, 10);
       		gl.glVertex3f(90,  40, 50);
       		
       		gl.glVertex3f(90,  13, 90);               
            gl.glEnd();
            
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);
        
     // Outside Roof
        // Used to draw the outside triangles of the roof 
           gl.glEnable(GL2.GL_CULL_FACE);
           gl.glEnable(GL2.GL_TEXTURE_2D);
           outdoorRoofTexture.bind();
           gl.glEnable(GL2.GL_TEXTURE_GEN_S);
           gl.glEnable(GL2.GL_TEXTURE_GEN_T);
               gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
               float[] coef_s1223 = {0,0,.5f,0};
               gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1223, 0);
               float[] coef_t1223 = {0,.25f,0,0};
               gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1223, 0);
            
            // Right Triangle part of wall.
               gl.glBegin(GL2.GL_TRIANGLES);     		
               		gl.glVertex3f(10,  13, 90);
               		gl.glVertex3f(10,  40, 50);
               		gl.glVertex3f(10,  13, 10);
          		
          		// Left Triangle Part of wall
               		gl.glVertex3f(90,  13, 10);
               		gl.glVertex3f(90,  40, 50);
               		gl.glVertex3f(90,  13, 90);               
               gl.glEnd();
               
           gl.glDisable(GL2.GL_TEXTURE_2D);
           gl.glDisable(GL2.GL_TEXTURE_GEN_S);
           gl.glDisable(GL2.GL_TEXTURE_GEN_T);
           gl.glDisable(GL2.GL_CULL_FACE);
        
    }
  
    // Rug
    private void drawRug(GL2 gl, GLU glu){
        gl.glPushMatrix();
     		gl.glColor3f(1,0,0);
     		gl.glRotatef(-90 , 1, 0, 0);
     		glu.gluDisk(quadric, 16, 20, 10, 1);
     		gl.glColor3f(1,1,0);
     		glu.gluDisk(quadric, 12, 16, 10, 1);
     		gl.glColor3f(1,0,1);
     		glu.gluDisk(quadric, 8, 12, 10, 1);
     		gl.glColor3f(0,1,0);
     		glu.gluDisk(quadric, 4, 8, 10, 1);
     		gl.glColor3f(.5f,.5f,.5f);
     		glu.gluDisk(quadric, 0, 4, 10, 1);
     	gl.glPopMatrix();
    }
    
    // Bar Table
    private void drawTable(GL2 gl, GLU glu){
        gl.glPushMatrix();
        	gl.glColor3f(.8f,.8f,.8f);
        	gl.glRotatef(-90 , 1, 0, 0);
        	glu.gluCylinder(quadric, .2, 0.2, 3, 3, 1);
         	gl.glTranslatef(0, 0, 3);
         	gl.glColor3f(0,0,0);
         	glu.gluDisk(quadric, 0, 3, 10, 1);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        	gl.glColor3f(.8f,.8f,.8f);
        	gl.glRotatef(-90 , 1, 0, 0);
        	gl.glTranslatef(0, 0, 1);
        	glu.gluDisk(quadric, .8, 1, 10, 1);
        	gl.glRotatef(-90 , 1, 0, 0);
        	glu.gluCylinder(quadric, .05, .05, 1, 3, 1);
        	gl.glTranslatef(0, 0, -1);
        	glu.gluCylinder(quadric, .05, .05, 1, 3, 1);
        gl.glPopMatrix();
    }
    
    //Bar Stool
    private void drawStool(GL2 gl, GLU glu){	
           gl.glPushMatrix();
        		gl.glColor3f(0,.8f,.8f);
        		gl.glRotatef(-90 , 1, 0, 0);
        		glu.gluCylinder(quadric, .1, .1, 2, 3, 1);
        		gl.glTranslated(-.5, 0, 0);
        		glu.gluCylinder(quadric, .1, .1, 2, 3, 1);
        		gl.glTranslated(0, -.5, 0);
        		glu.gluCylinder(quadric, .1, .1, 2, 3, 1);
        		gl.glTranslated(.5, 0, 0);
        		glu.gluCylinder(quadric, .1, .1, 2, 3, 1);
        	gl.glPopMatrix();	
        
        	gl.glPushMatrix();
        		gl.glRotatef(-90 , 1, 0, 0);
        		gl.glColor3f(0,0,0);
        		gl.glTranslated(-.25, -.25, 2);
        		glu.gluDisk(quadric, 0, 1, 10, 1);
        	gl.glPopMatrix();
    }
}
