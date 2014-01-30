package Buildings;
//Dario Baldoni
//

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


public class BaldoniBuilding extends Building{
	
	private static GLUquadric quadric, treeQuad;
	private static Texture grass, floor, exWalls, inWalls, ceiling, roof, tv, door, window;
	private TextRenderer renderer;

	
	public BaldoniBuilding(GL2 gl, GLU glu){
		 renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
			
		//Edit by Melvin Ross
		if(quadric==null){
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // false, or true to generate texture coordinates
        
        treeQuad = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, true);        // false, or true to generate texture coordinates
        
        grass= setupTexture(gl, "grass.png");
        floor= setupTexture(gl, "floor.png");
        exWalls= setupTexture(gl, "bricktexture.png");
        inWalls= setupTexture(gl, "inWalls.png");
        ceiling= setupTexture(gl, "ceiling.png");
        roof= setupTexture(gl, "roof.png");
        tv= setupTexture(gl, "tv.png");
        door= setupTexture(gl, "door.png");
        window= setupTexture(gl, "window.png");
       }
	}
	public void drawMoving(GL2 gl, GLU glu) {
	    // Baldoni Building Text
        gl.glPushMatrix();
            gl.glRotated(180, 0, 1, 0);
            gl.glTranslated(-58, 12, -14.5);
            renderer.begin3DRendering();
            renderer.setColor(0, 1, 0, 1);
            renderer.draw3D("The Big Green", 0f, 0f,0, .25f*1f/8);
            renderer.end3DRendering();
         gl.glPopMatrix();

	}
	public void draw(GL2 gl, GLU glu) {

		
		//grass texture on ground
		gl.glEnable(GL2.GL_TEXTURE_2D);
        	grass.bind();
        		gl.glBegin(GL2.GL_QUADS);
        		gl.glTexCoord2f(0f,0f); gl.glVertex3f(0,  0, 0);
        		gl.glTexCoord2f(10f,0f); gl.glVertex3f(100,  0, 0);
        		gl.glTexCoord2f(10f,10f); gl.glVertex3f( 100, 0, 100);
        		gl.glTexCoord2f(0f,10f); gl.glVertex3f(0, 0, 100);
        	gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //floor inside building
        gl.glEnable(GL2.GL_TEXTURE_2D);
        	floor.bind();
        		gl.glBegin(GL2.GL_QUADS);
        		gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  .01f, 20);
        		gl.glTexCoord2f(10f,0f); gl.glVertex3f(80,  .01f, 20);
        		gl.glTexCoord2f(10f,10f); gl.glVertex3f(80, .01f, 80);
        		gl.glTexCoord2f(0f,10f); gl.glVertex3f(20, .01f, 80);
        	gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //left wall
        gl.glEnable(GL2.GL_TEXTURE_2D);
    		exWalls.bind();
    		gl.glEnable(GL2.GL_CULL_FACE);
    		gl.glBegin(GL2.GL_QUADS);
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  .01f, 20);
    			gl.glTexCoord2f(30f,0f); gl.glVertex3f(20,  .01f, 80);
    			gl.glTexCoord2f(30f,7f); gl.glVertex3f(20, 12, 80);
    			gl.glTexCoord2f(0f,7f); gl.glVertex3f(20, 12, 20);
    		gl.glEnd();
    		inWalls.bind();
    		gl.glBegin(GL2.GL_QUADS);
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  .01f, 20);
    			gl.glTexCoord2f(30f,0f); gl.glVertex3f(20,  12, 20);
    			gl.glTexCoord2f(30f,10f); gl.glVertex3f(20, 12, 80);
    			gl.glTexCoord2f(0f,10f); gl.glVertex3f(20, .01f, 80);
    		gl.glEnd();
    		gl.glDisable(GL2.GL_CULL_FACE);
    	gl.glDisable(GL2.GL_TEXTURE_2D);	
    	
        //right wall
    	gl.glEnable(GL2.GL_TEXTURE_2D);
		exWalls.bind();
		gl.glEnable(GL2.GL_CULL_FACE);
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(80,  .01f, 20);
			gl.glTexCoord2f(0f,7f); gl.glVertex3f(80,  12, 20);
			gl.glTexCoord2f(30f,7f); gl.glVertex3f(80, 12, 80);
			gl.glTexCoord2f(30f,0f); gl.glVertex3f(80, .01f, 80);
		gl.glEnd();
		inWalls.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(80,  .01f, 20);
			gl.glTexCoord2f(30f,0f); gl.glVertex3f(80,  .01f, 80);
			gl.glTexCoord2f(30f,10f); gl.glVertex3f(80, 12, 80);
			gl.glTexCoord2f(0f,10f); gl.glVertex3f(80, 12, 20);
		gl.glEnd();
		gl.glDisable(GL2.GL_CULL_FACE);
		gl.glDisable(GL2.GL_TEXTURE_2D);

		//ceiling
		gl.glEnable(GL2.GL_TEXTURE_2D);
    	ceiling.bind();
    	gl.glBegin(GL2.GL_QUADS);
    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  12, 20);
    		gl.glTexCoord2f(10f,0f); gl.glVertex3f(80,  12, 20);
    		gl.glTexCoord2f(10f,10f); gl.glVertex3f(80, 12, 80);
    		gl.glTexCoord2f(0f,10f); gl.glVertex3f(20, 12, 80);
    	gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    
    	//second floor walls
    	//left
    	gl.glEnable(GL2.GL_TEXTURE_2D);
		exWalls.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(30,  12, 30);
			gl.glTexCoord2f(30f,0f); gl.glVertex3f(30,  12, 70);
			gl.glTexCoord2f(30f,7f); gl.glVertex3f(30, 24, 70);
			gl.glTexCoord2f(0f,7f); gl.glVertex3f(30, 24, 30);
		gl.glEnd();
		//right
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(70,  12, 30);
			gl.glTexCoord2f(30f,0f); gl.glVertex3f(70,  12, 70);
			gl.glTexCoord2f(30f,7f); gl.glVertex3f(70, 24, 70);
			gl.glTexCoord2f(0f,7f); gl.glVertex3f(70, 24, 30);
		gl.glEnd();
		//front
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(30,  12, 30);
			gl.glTexCoord2f(30f,0f); gl.glVertex3f(70,  12, 30);
			gl.glTexCoord2f(30f,7f); gl.glVertex3f(70, 24, 30);
			gl.glTexCoord2f(0f,7f); gl.glVertex3f(30, 24, 30);
		gl.glEnd();
		//back
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(30,  12, 70);
			gl.glTexCoord2f(30f,0f); gl.glVertex3f(70,  12, 70);
			gl.glTexCoord2f(30f,7f); gl.glVertex3f(70, 24, 70);
			gl.glTexCoord2f(0f,7f); gl.glVertex3f(30, 24, 70);
		gl.glEnd();
		
		//bumpout in front
		//left
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(40,  12, 40);
			gl.glTexCoord2f(12f,0f); gl.glVertex3f(40,  12, 15);
			gl.glTexCoord2f(12f,5f); gl.glVertex3f(40, 24, 15);
			gl.glTexCoord2f(0f,5f); gl.glVertex3f(40, 24, 40);
		gl.glEnd();
		//right
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(60,  12, 15);
			gl.glTexCoord2f(12f,0f); gl.glVertex3f(60,  12, 60);
			gl.glTexCoord2f(12f,5f); gl.glVertex3f(60, 24, 60);
			gl.glTexCoord2f(0f,5f); gl.glVertex3f(60, 24, 15);
		gl.glEnd();
		//front
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(60,  12, 15);
			gl.glTexCoord2f(12f,0f); gl.glVertex3f(40,  12, 15);
			gl.glTexCoord2f(12f,5f); gl.glVertex3f(40, 24, 15);
			gl.glTexCoord2f(0f,5f); gl.glVertex3f(60, 24, 15);
		gl.glEnd();
		//triangle in front
		gl.glBegin(GL2.GL_TRIANGLES);
			gl.glTexCoord2f(0f,0f);  gl.glVertex3f(60,  24, 15);
			gl.glTexCoord2f(12f,0f); gl.glVertex3f(40, 24, 15);
			gl.glTexCoord2f(12f,2f);gl.glVertex3f(50,30, 15);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		//under bump out
		gl.glColor3f(.7f,.7f, .7f);
		gl.glBegin(GL2.GL_QUADS);
			gl.glVertex3f(60,  12, 15);
			gl.glVertex3f(40,  12, 15);
			gl.glVertex3f(40, 12, 20);
			gl.glVertex3f(60, 12, 20);
		gl.glEnd();
		
		//roof
		gl.glEnable(GL2.GL_TEXTURE_2D);
		roof.bind();
    	
		gl.glPushMatrix();
			gl.glTranslatef(50, 45, 50);
			gl.glBegin(GL2.GL_TRIANGLES);
				gl.glVertex3f(0, 0, 0);
				gl.glVertex3f(-21, -21, -21);
				gl.glVertex3f(21, -21, -21);
				
				gl.glVertex3f(0, 0, 0);
				gl.glVertex3f(21, -21, -21);
				gl.glVertex3f(21, -21, 21);
				
				gl.glVertex3f(0, 0, 0);
				gl.glVertex3f(21, -21, 21);
				gl.glVertex3f(-21, -21, 21);
				
				gl.glVertex3f(0, 0, 0);
				gl.glVertex3f(-21, -21, 21);
				gl.glVertex3f(-21, -21, -21);
			gl.glEnd();
		gl.glPopMatrix();
		
		//roof over bump out right
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(50,  30, 14);
			gl.glTexCoord2f(20f,0f); gl.glVertex3f(39,  23.8f, 14);
			gl.glTexCoord2f(20f,10f); gl.glVertex3f(39, 23.8f, 40);
			gl.glTexCoord2f(0f,10f); gl.glVertex3f(50, 30, 40);
		gl.glEnd();
		//roof over bump out left
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(50,  30, 14);
			gl.glTexCoord2f(20f,0f); gl.glVertex3f(61,  23.8f, 14);
			gl.glTexCoord2f(20f,10f); gl.glVertex3f(31, 23.8f, 40);
			gl.glTexCoord2f(0f,10f); gl.glVertex3f(50, 30, 40);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		
		//pillars right
		gl.glPushMatrix();
    		gl.glColor3f(.8f, .8f, .8f);
    		gl.glTranslated(42, 0, 16.5f);
    		gl.glRotatef(-90, 1,0, 0);
    		glu.gluCylinder(quadric, 1, 1, 12, 15, 1);
    	gl.glPopMatrix();
		//left
    	gl.glPushMatrix();
			gl.glColor3f(.8f, .8f, .8f);
			gl.glTranslated(58, 0, 16.5f);
			gl.glRotatef(-90, 1,0, 0);
			glu.gluCylinder(quadric, 1, 1, 12, 15, 1);
		gl.glPopMatrix();
		
		//front wall and back wall with automatic texturing
		 gl.glEnable(GL2.GL_TEXTURE_2D);
	        exWalls.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            float[] coef_s = {.5f,0,0,0};
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	            float[] coef_t = {0,.4f,0,0};
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	            gl.glBegin(GL2.GL_QUADS);
	            //front exterior
	                gl.glVertex3f(20,  0, 20);
	                gl.glVertex3f(48,  0, 20);
	                gl.glVertex3f(48, 12, 20);
	                gl.glVertex3f(20, 12, 20);
	                
	                gl.glVertex3f(48,  7, 20);
	                gl.glVertex3f(52,  7, 20);
	                gl.glVertex3f(52, 12, 20);
	                gl.glVertex3f(48, 12, 20);
	                
	                gl.glVertex3f(52,  0, 20);
	                gl.glVertex3f(80,  0, 20);
	                gl.glVertex3f(80, 12, 20);
	                gl.glVertex3f(52, 12, 20);
	                
	            //back exterior
	                gl.glVertex3f(20,  0, 80);
	                gl.glVertex3f(48,  0, 80);
	                gl.glVertex3f(48, 12, 80);
	                gl.glVertex3f(20, 12, 80);
	                
	                gl.glVertex3f(48,  7, 80);
	                gl.glVertex3f(52,  7, 80);
	                gl.glVertex3f(52, 12, 80);
	                gl.glVertex3f(48, 12, 80);
	                
	                gl.glVertex3f(52,  0, 80);
	                gl.glVertex3f(80,  0, 80);
	                gl.glVertex3f(80, 12, 80);
	                gl.glVertex3f(52, 12, 80);

	                
	            gl.glEnd();  
	        gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	        
	        gl.glEnable(GL2.GL_TEXTURE_2D);
			inWalls.bind();
			gl.glBegin(GL2.GL_QUADS);
				//interior front wall
				gl.glVertex3f(20,  0, 20.01f);
				gl.glVertex3f(48,  0, 20.01f);
				gl.glVertex3f(48, 12, 20.01f);
				gl.glVertex3f(20, 12, 20.01f);
            
				gl.glVertex3f(48,  7, 20.01f);
				gl.glVertex3f(52,  7, 20.01f);
				gl.glVertex3f(52, 12, 20.01f);
				gl.glVertex3f(48, 12, 20.01f);
            
				gl.glVertex3f(52,  0, 20.01f);
				gl.glVertex3f(80,  0, 20.01f);
				gl.glVertex3f(80, 12, 20.01f);
				gl.glVertex3f(52, 12, 20.01f);
		
				//interior back wall
				gl.glVertex3f(20,  0, 79.99f);
                gl.glVertex3f(48,  0, 79.99f);
                gl.glVertex3f(48, 12, 79.99f);
                gl.glVertex3f(20, 12, 79.99f);
                
                gl.glVertex3f(48,  7, 79.99f);
                gl.glVertex3f(52,  7, 79.99f);
                gl.glVertex3f(52, 12, 79.99f);
                gl.glVertex3f(48, 12, 79.99f);
                
                gl.glVertex3f(52,  0, 79.99f);
                gl.glVertex3f(80,  0, 79.99f);
                gl.glVertex3f(80, 12, 79.99f);
                gl.glVertex3f(52, 12, 79.99f);
				
			gl.glEnd();  
		    gl.glDisable(GL2.GL_TEXTURE_2D);
		    
		    //draw two couches
			gl.glPushMatrix();
				gl.glTranslatef(60, 0, 55);
				gl.glRotatef(-80,0,1,0);
				drawCouch(gl, glu);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				gl.glTranslatef(60, 0, 40);
				gl.glRotatef(-100,0,1,0);
				drawCouch(gl, glu);
			gl.glPopMatrix();
			
		    //draw some trees	
			gl.glPushMatrix();
				gl.glTranslatef(14, 0, 10);
				drawTree(gl, glu);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				gl.glTranslatef(72, 0, 8);
				drawTree(gl, glu);
			gl.glPopMatrix();
		
			gl.glPushMatrix();
				gl.glTranslatef(81, 0, 12);
				drawTree(gl, glu);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				gl.glTranslatef(12, 0, 87);
				drawTree(gl, glu);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				gl.glTranslatef(87, 0, 72);
				drawTree(gl, glu);
			gl.glPopMatrix();
			
			//tv on the wall;
			gl.glEnable(GL2.GL_TEXTURE_2D);
	    	tv.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(1f,1f);gl.glVertex3f(79.9f, 3.5f, 47);
				gl.glTexCoord2f(0f,1f);gl.glVertex3f(79.9f, 3.5f, 53);
				gl.glTexCoord2f(0f,0f);gl.glVertex3f(79.9f, 6.7f, 53);
				gl.glTexCoord2f(1f,0f);gl.glVertex3f(79.9f, 6.7f, 47);
			gl.glEnd();	
			gl.glDisable(GL2.GL_TEXTURE_2D);
			
			//bar
			gl.glBegin(GL2.GL_QUADS);
			gl.glColor3f(.6f, .3f, .2f);
			//bottom
	 			gl.glVertex3f(28, 0, 20);
	 			gl.glVertex3f(28, 0, 38);
	 			gl.glVertex3f(28, 4, 38);
	 			gl.glVertex3f(28, 4, 20);			
	 		//top
	 		gl.glColor3f(.8f, .4f, .2f);	
	 			gl.glVertex3f(30.5f, 4, 20);
	 			gl.glVertex3f(26, 4, 20);
	 			gl.glVertex3f(26, 4, 38);
	 			gl.glVertex3f(30.5f, 4, 38);
		    gl.glEnd();
		    
		    //draw bar stools
		    gl.glPushMatrix();
				gl.glTranslatef(30.5f, 0, 23);
				drawStool(gl, glu);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				gl.glTranslatef(30.5f, 0, 27);
				drawStool(gl, glu);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				gl.glTranslatef(30.5f, 0, 31);
				drawStool(gl, glu);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				gl.glTranslatef(30.5f, 0, 35);
				drawStool(gl, glu);
			gl.glPopMatrix();
			
			//add doors
			gl.glEnable(GL2.GL_TEXTURE_2D);
	    	door.bind();
	    	gl.glBegin(GL2.GL_QUADS);
	    	//front door
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(52,  0, 20);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(54,  0, 22);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(54, 7, 22);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(52, 7, 20);
	    	//back door
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(48,  0, 80);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(46,  0, 78);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(46, 7, 78);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(48, 7, 80);		
	    	gl.glEnd();
	    	gl.glDisable(GL2.GL_TEXTURE_2D);
	    	
	    	//add some windows
	    	gl.glEnable(GL2.GL_TEXTURE_2D);
	    	window.bind();
	    	gl.glBegin(GL2.GL_QUADS);
	    	//front top right
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(50, 16, 14.99f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(47, 16, 14.99f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(47, 22, 14.99f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(50, 22, 14.99f);	
	    	//front top left
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(53, 16, 14.99f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(50, 16, 14.99f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(50, 22, 14.99f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(53, 22, 14.99f);	
	    	//left of front door
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(65, 4, 19.99f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(62, 4, 19.99f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(62, 9, 19.99f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(65, 9, 19.99f);
	    	//right of front door
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(38, 4, 19.99f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(35, 4, 19.99f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(35, 9, 19.99f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(38, 9, 19.99f);
	    	//right side of house
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(19.99f, 4, 40);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(19.99f, 4, 43);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(19.99f, 9, 43);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(19.99f, 9, 40);
	    		
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(19.99f, 4, 60);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(19.99f, 4, 63);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(19.99f, 9, 63);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(19.99f, 9, 60);
	    	//left side of house
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(80.01f, 4, 40);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(80.01f, 4, 43);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(80.01f, 9, 43);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(80.01f, 9, 40);
	    		
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(80.01f, 4, 60);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(80.01f, 4, 63);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(80.01f, 9, 63);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(80.01f, 9, 60);
	    	
	    	//right of back door
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(65, 4, 80.01f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(62, 4, 80.01f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(62, 9, 80.01f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(65, 9, 80.01f);
	    	//left of back door
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(38, 4, 80.01f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(35, 4, 80.01f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(35, 9, 80.01f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(38, 9, 80.01f);
	    	//top back right
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(60, 15.5f, 70.01f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(56, 15.5f, 70.01f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(56, 23, 70.01f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(60, 23, 70.01f);
	    	//top back left
	    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(44, 15.5f, 70.01f);
	    		gl.glTexCoord2f(1f,0f); gl.glVertex3f(40, 15.5f, 70.01f);
	    		gl.glTexCoord2f(1f,1f); gl.glVertex3f(40, 23, 70.01f);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(44, 23, 70.01f);	
	    		
	    	gl.glEnd();
	    	gl.glDisable(GL2.GL_TEXTURE_2D);
	    	
	}
	
	public void drawCouch(GL2 gl, GLU glu){
		
			gl.glBegin(GL2.GL_QUADS);
				//front
				gl.glColor3f(.1f, .3f, .8f);//dark
		 		gl.glVertex3f(0, 0, 0);
		 		gl.glVertex3f(7, 0, 0);
		 		gl.glVertex3f(7, 2, 0);
		 		gl.glVertex3f(0, 2, 0);
		 		//back front
		 		gl.glColor3f(.1f, .3f, .8f);//dark
		 		gl.glVertex3f(-.5f, 0, 2.5f);
		 		gl.glVertex3f(7.5f, 0, 2.5f);
		 		gl.glVertex3f(7.5f, 3.5f, 2.5f);
		 		gl.glVertex3f(-.5f, 3.5f, 2.5f);
		 		//back back
		 		gl.glVertex3f(-.5f, 0, 3f);
		 		gl.glVertex3f(7.5f, 0, 3f);
		 		gl.glVertex3f(7.5f, 3.5f, 3f);
		 		gl.glVertex3f(-.5f, 3.5f, 3f);
		 		//left closest
		 		gl.glColor3f(.1f, .3f, .8f);//dark
		 		gl.glVertex3f(7, 0, 0);
		 		gl.glVertex3f(7, 0, 2.5f);
		 		gl.glVertex3f(7, 3, 2.5f);
		 		gl.glVertex3f(7, 3, 0);
		 		//right closest
		 		gl.glVertex3f(0, 0, 0);
		 		gl.glVertex3f(0, 0, 2.5f);
		 		gl.glVertex3f(0, 3, 2.5f);
		 		gl.glVertex3f(0, 3, 0);
		 		//right farthest
		 		gl.glVertex3f(-.5f, 0, 0);
		 		gl.glVertex3f(-.5f, 0, 3);
		 		gl.glVertex3f(-.5f, 3, 3);
		 		gl.glVertex3f(-.5f, 3, 0);
		 		//left farthest
		 		gl.glVertex3f(7.5f, 0, 0);
		 		gl.glVertex3f(7.5f, 0, 3f);
		 		gl.glVertex3f(7.5f, 3, 3f);
		 		gl.glVertex3f(7.5f, 3, 0);
		 		//front right on arm
		 		gl.glVertex3f(-.5f,0, 0);
		 		gl.glVertex3f(0, 0, 0);
		 		gl.glVertex3f(0, 3, 0);
		 		gl.glVertex3f(-.5f,3, 0);
		 		//front left on arm
		 		gl.glVertex3f(7,0, 0);
		 		gl.glVertex3f(7.5f, 0, 0);
		 		gl.glVertex3f(7.5f, 3, 0);
		 		gl.glVertex3f(7,3, 0);
		 		//right top on arm
		 		gl.glColor3f(.15f, .3f, .9f);//light
		 		gl.glVertex3f(-.5f,3, 0);
		 		gl.glVertex3f(0, 3, 0);
		 		gl.glVertex3f(0, 3, 2.5f);
		 		gl.glVertex3f(-.5f,3,2.5f);
		 		//left top on arm
		 		gl.glVertex3f(7.5f,3, 0);
		 		gl.glVertex3f(7, 3, 0);
		 		gl.glVertex3f(7, 3, 2.5f);
		 		gl.glVertex3f(7.5f,3, 2.5f);
		 		//back top
		 		gl.glVertex3f(-.5f, 3.5f, 2.5f);
		 		gl.glVertex3f(7.5f, 3.5f, 2.5f);
		 		gl.glVertex3f(7.5f, 3.5f, 3f);
		 		gl.glVertex3f(-.5f, 3.5f, 3f);
		 		//top
		 		gl.glVertex3f(0, 2, 0);
		 		gl.glVertex3f(7, 2, 0);
		 		gl.glVertex3f(7, 2, 2.5f);
		 		gl.glVertex3f(0, 2, 2.5f);

		 		
		 	gl.glEnd();
		
	}
	
	public void drawTree(GL2 gl, GLU glu){
        gl.glPushMatrix();
			gl.glColor3f(.55f, .46f, .39f);
        	gl.glRotatef(-90, 1,0, 0);
        	glu.gluCylinder(quadric, 1.2, 1.2, 2.5, 15, 1);
        gl.glPopMatrix();
        
        gl.glEnable(GL2.GL_TEXTURE_2D);
        grass.bind();
        gl.glPushMatrix();
        	gl.glTranslatef(0,2,0);
        	gl.glRotatef(-90, 1,0, 0);
            glu.gluCylinder(treeQuad, 3.5, .1, 14, 15, 1);  
        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D); 
    
	}
	
	public void drawStool(GL2 gl, GLU glu){
		//stand
		gl.glPushMatrix();
			gl.glColor3f(.7f, .2f, .7f);
			gl.glRotatef(-90, 1,0, 0);
			glu.gluCylinder(quadric, .3, .5, 2.5, 15, 1);
		gl.glPopMatrix();
		//chair
		gl.glPushMatrix();
			gl.glColor3f(.7f, .8f, .7f);
			gl.glTranslatef(0,2.5f,0);
			gl.glRotatef(-90, 1,0, 0);
			glu.gluCylinder(quadric, 1, 1, .2, 15, 1);  
		gl.glPopMatrix();
		//seat on top
		gl.glPushMatrix();
			gl.glColor3f(.7f, .8f, .7f);
			gl.glTranslatef(0,2.5f,0);
			gl.glRotatef(-90, 1,0, 0);
			glu.gluDisk(quadric, 1, 0, 15, 1);  
		gl.glPopMatrix();
		
	}
	
}
