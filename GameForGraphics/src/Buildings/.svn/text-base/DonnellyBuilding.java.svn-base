package Buildings;
// HW 5 - Donnelly Building
// Tim Donnelly
// 10/28/10


import Movement.Eye;
import Buildings.Step;

import java.awt.Font;
import java.util.ArrayList;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.DonnellyCar;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


public class DonnellyBuilding extends Building
{
	private static GLUquadric quadric ;
    private static Texture wallTexture;
    private static Texture ceilingTexture;
    private static Texture roofTexture;  
    private static Texture garageTexture;  
    private static Texture grassTexture;
    private static Texture kitchenTexture;
    private static Texture pavementTexture;
    private static Texture carpetTexture;
    private static Texture cushionTexture;
    private static Texture paintingTexture;
    private static Texture tvTexture;
    private static Texture curtainTexture;
    private static Texture woodTexture;
    private static DonnellyCar car;
    private TextRenderer renderer;

    
	public DonnellyBuilding(GL2 gl, GLU glu)
	{
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
		if(quadric==null){
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL);
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE);
		glu.gluQuadricTexture(quadric, true);
        wallTexture = setupTexture(gl, "donnellywall.png");
        ceilingTexture = setupTexture(gl,"donnellyceiling.png");	
        roofTexture = setupTexture(gl,"donnellyroof.png");	
        garageTexture = setupTexture(gl,"donnellygarage.png");	
        grassTexture = setupTexture(gl,"donnellygrass.png");
        kitchenTexture = setupTexture(gl,"donnellykitchen.png");
        pavementTexture = setupTexture(gl,"donnellypavement.png");
        carpetTexture = setupTexture(gl,"donnellycarpet.png");
        cushionTexture = setupTexture(gl,"donnellycushion.png");
        paintingTexture = setupTexture(gl,"donnellypainting.png");
        tvTexture = setupTexture(gl,"donnellytv.png");
        curtainTexture = setupTexture(gl,"donnellycurtains.png");
        woodTexture = setupTexture(gl,"donnellywood.png");
        car = new DonnellyCar(gl, glu);
		}
	}
	
	   public void drawMoving(GL2 gl, GLU glu) {
	        	     // Donnelly Building Text
	             gl.glPushMatrix();
	                 gl.glRotated(180, 0, 1, 0);
	                 gl.glTranslated(-60, 10, -39.5);
	                 renderer.begin3DRendering();
	                 renderer.setColor(0, 0, 0, 1);
	                 renderer.draw3D("The Simpsons Movie", 0f, 0f,0, .25f*1f/9);
	                 renderer.end3DRendering();
	          gl.glPopMatrix();

	    }

	
	public void draw(GL2 gl, GLU glu) 
	{
		
	    
		
		//Texture coordinates for walls
        //Walls facing screen
        float[] coef_s = {.25f,0,0,0};
        float[] coef_t = {0,.25f,0,0};
        //Walls facing up 
        float[] coef_sr = {.25f,0,0,0};
        float[] coef_tr = {0,0,.25f,0};
        //Walls facing left and right
        float[] coef_sl = {0,0,.25f,0};
        float[] coef_tl = {0,.25f,0,0};
        
        //Pink Car
        gl.glPushMatrix();
			gl.glTranslatef(70f, 0, 100f);        
			car.draw(gl, glu);
        gl.glPopMatrix();
        
        //Grass
		gl.glEnable(GL2.GL_TEXTURE_2D);
		grassTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sr, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tr, 0);	        
			gl.glColor3f(0f,1f,0f); //Green grass
			gl.glBegin(GL2.GL_QUADS);
				gl.glVertex3f(0,0,0);
				gl.glVertex3f(100,0,0);
				gl.glVertex3f(100,0,100);
				gl.glVertex3f(0,0,100);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);		
		
		//Ceiling
		gl.glEnable(GL2.GL_TEXTURE_2D);
		ceilingTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sr, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tr, 0);		
		
            gl.glColor3f(1f,0f,.5f); //Ceiling		
			gl.glBegin(GL2.GL_QUADS);
				gl.glVertex3f(20,10,45);
				gl.glVertex3f(65,10,45);
				gl.glVertex3f(65,10,75);
				gl.glVertex3f(20,10,75);
				
				gl.glVertex3f(35,10,45);
				gl.glVertex3f(65,10,45);
				gl.glVertex3f(65,10,40);
				gl.glVertex3f(35,10,40);		
				
				gl.glVertex3f(65,10,45);
				gl.glVertex3f(85,10,45);
				gl.glVertex3f(85,10,85);
				gl.glVertex3f(65,10,85);	
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);		
        
		//Roof
		gl.glEnable(GL2.GL_TEXTURE_2D);
		roofTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sr, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tr, 0);
            
            gl.glColor3f(1f,.5f,0f); //Brown Roof
            gl.glBegin(GL2.GL_QUADS);
			//Front
				gl.glVertex3f(18,20,80);
				gl.glVertex3f(87,20,80);
				gl.glVertex3f(87,30,60);
				gl.glVertex3f(18,30,60);
				
			//Garage
				gl.glVertex3f(63,9,87);
				gl.glVertex3f(87,9,87);
				gl.glVertex3f(87,15,75);
				gl.glVertex3f(63,15,75);	

			//Back
				//Middle
				gl.glVertex3f(30,20,35); 
				gl.glVertex3f(70,20,35);
				gl.glVertex3f(70,30,60);
				gl.glVertex3f(30,30,60);	
				//Left
				gl.glVertex3f(18,20,40); 
				gl.glVertex3f(35,20,40);
				gl.glVertex3f(35,30,60);
				gl.glVertex3f(18,30,60);			
				//Right
				gl.glVertex3f(65,20,40); 
				gl.glVertex3f(87,20,40);
				gl.glVertex3f(87,30,60);
				gl.glVertex3f(65,30,60);				
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        
        //Carpets
		gl.glEnable(GL2.GL_TEXTURE_2D);
		carpetTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sr, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tr, 0);	        
			gl.glColor3f(1f,1f,1f); //Blue Carpets
			gl.glBegin(GL2.GL_QUADS);
				gl.glVertex3f(20,.1f,45);
				gl.glVertex3f(35.1f,.1f,45);
				gl.glVertex3f(35.1f,.1f,75);
				gl.glVertex3f(20,.1f,75);
				
				gl.glVertex3f(35,.1f,55);
				gl.glVertex3f(65,.1f,55);
				gl.glVertex3f(65,.1f,75);
				gl.glVertex3f(35,.1f,75);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);	    
        
        //Kitchen 
		gl.glEnable(GL2.GL_TEXTURE_2D);
		kitchenTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sr, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tr, 0);	        
			gl.glColor3f(1f,1f,1f); //White Tile
			gl.glBegin(GL2.GL_QUADS);
				gl.glVertex3f(35.1f,.1f,40);
				gl.glVertex3f(65,.1f,40);
				gl.glVertex3f(65,.1f,55);
				gl.glVertex3f(35.1f,.1f,55);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);	        
        
        //Driveway
		gl.glEnable(GL2.GL_TEXTURE_2D);
		pavementTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sr, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tr, 0);	        
			gl.glColor3f(1f,1f,1f); //White Tile
			gl.glBegin(GL2.GL_QUADS);
				gl.glVertex3f(85,.1f,45);
				gl.glVertex3f(65,.1f,45);
				gl.glVertex3f(65,.1f,100);
				gl.glVertex3f(85,.1f,100);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);	              
        
        
        
        ////////////////
        //Front and Back
        ////////////////
        
        
        //TOP FLOOR
		gl.glEnable(GL2.GL_TEXTURE_2D);
		wallTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            
			gl.glBegin(GL2.GL_QUADS);
			gl.glColor3f(1f,1f,1f);
				//Front Wall 
				gl.glVertex3f(20,10,75);
				gl.glVertex3f(20,22,75);
				gl.glVertex3f(85,22,75);
				gl.glVertex3f(85,10,75);  	
				
				//Back Walls
				gl.glVertex3f(20,10,45);
				gl.glVertex3f(20,22,45);
				gl.glVertex3f(35,22,45);
				gl.glVertex3f(35,10,45); 			
				
				gl.glVertex3f(35,10,40);
				gl.glVertex3f(35,22,40);
				gl.glVertex3f(65,22,40);
				gl.glVertex3f(65,10,40); 	
				
				gl.glVertex3f(65,10,45);
				gl.glVertex3f(65,22,45);
				gl.glVertex3f(85,22,45);
				gl.glVertex3f(85,10,45); 	
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
				
        
        //OUTSIDE WALLS
		gl.glEnable(GL2.GL_TEXTURE_2D);
		gl.glEnable(GL.GL_CULL_FACE);
		gl.glCullFace(GL.GL_FRONT);
		wallTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);	
            
			gl.glBegin(GL2.GL_QUADS);
			gl.glColor3f(1f,1f,1f);            
			//Front Wall - Dining room w/ big window 
				//Bottom
				gl.glVertex3f(50,0,75); 
				gl.glVertex3f(50,3,75);
				gl.glVertex3f(65,3,75);
				gl.glVertex3f(65,0,75);	
				//Top
				gl.glVertex3f(50,7,75); 
				gl.glVertex3f(50,10,75);
				gl.glVertex3f(65,10,75);
				gl.glVertex3f(65,7,75);		
				//Left
				gl.glVertex3f(50,3,75); 
				gl.glVertex3f(50,7,75);
				gl.glVertex3f(54.5f,7,75);
				gl.glVertex3f(54.5f,3,75);		
				//Right
				gl.glVertex3f(60.5f,3,75); 
				gl.glVertex3f(60.5f,7,75);
				gl.glVertex3f(65,7,75);
				gl.glVertex3f(65,3,75);	
			
			//Front Wall - Foyer w/ door
				//Top
				gl.glVertex3f(35,8,75); 
				gl.glVertex3f(35,10,75);
				gl.glVertex3f(50,10,75);
				gl.glVertex3f(50,8,75);		
				//Left
				gl.glVertex3f(35,0,75); 
				gl.glVertex3f(35,8,75);
				gl.glVertex3f(40.5f,8,75);
				gl.glVertex3f(40.5f,0,75);		
				//Right
				gl.glVertex3f(44.5f,0,75); 
				gl.glVertex3f(44.5f,8,75);
				gl.glVertex3f(50,8,75);
				gl.glVertex3f(50,0,75);			
			
			//Front Wall - Living room w/ big window 
				//Bottom
				gl.glVertex3f(20,0,75); 
				gl.glVertex3f(20,3,75);
				gl.glVertex3f(35,3,75);
				gl.glVertex3f(35,0,75);	
				//Top
				gl.glVertex3f(20,7,75);
				gl.glVertex3f(20,10,75);
				gl.glVertex3f(35,10,75);
				gl.glVertex3f(35,7,75);		
				//Left
				gl.glVertex3f(20,3,75); 
				gl.glVertex3f(20,7,75);
				gl.glVertex3f(24.5f,7,75);
				gl.glVertex3f(24.5f,3,75);		
				//Right
				gl.glVertex3f(30.5f,3,75); 
				gl.glVertex3f(30.5f,7,75);
				gl.glVertex3f(35,7,75);
				gl.glVertex3f(35,3,75);	
			
			//Back Wall - Tv room w/ window and door
				//Bottom
				gl.glVertex3f(30,4.5f,45);
				gl.glVertex3f(20,4.5f,45);
				gl.glVertex3f(20,0,45);
				gl.glVertex3f(30,0,45);
				//Top
				gl.glVertex3f(30,10,45);
				gl.glVertex3f(20,10,45);
				gl.glVertex3f(20,7.5f,45);
				gl.glVertex3f(30,7.5f,45);	
				 //Left
				gl.glVertex3f(23,7.5f,45);
				gl.glVertex3f(20,7.5f,45);
				gl.glVertex3f(20,4.5f,45);
				gl.glVertex3f(23,4.5f,45);
				//Right
				gl.glVertex3f(30,7.5f,45);
				gl.glVertex3f(27,7.5f,45);
				gl.glVertex3f(27,4.5f,45);
				gl.glVertex3f(30,4.5f,45);
				//Above Door
				gl.glVertex3f(34,10,45);
				gl.glVertex3f(30,10,45);
				gl.glVertex3f(30,8.5f,45);
				gl.glVertex3f(34,8.5f,45);			
				//Right of Door
				gl.glVertex3f(35,10,45);
				gl.glVertex3f(34,10,45);
				gl.glVertex3f(34,0,45); 
				gl.glVertex3f(35,0,45);
				
			//Back Wall - Kitchen
				 //Bottom
				gl.glVertex3f(65,4.5f,40);
				gl.glVertex3f(35,4.5f,40);
				gl.glVertex3f(35,0,40);
				gl.glVertex3f(65,0,40);
				
				//Top
				gl.glVertex3f(65,10,40);
				gl.glVertex3f(35,10,40);
				gl.glVertex3f(35,7.5f,40); 
				gl.glVertex3f(65,7.5f,40);		
	
				//Left
				gl.glVertex3f(42,7.5f,40);
				gl.glVertex3f(35,7.5f,40);
				gl.glVertex3f(35,4.5f,40);
				gl.glVertex3f(42,4.5f,40);
				
				//Right
				gl.glVertex3f(65,7.5f,40);
				gl.glVertex3f(46,7.5f,40);
				gl.glVertex3f(46,4.5f,40);
				gl.glVertex3f(65,4.5f,40);		
				
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);		
	    	gl.glDisable(GL.GL_CULL_FACE);

	        //INSIDE WALLS
			gl.glEnable(GL2.GL_TEXTURE_2D);
			gl.glEnable(GL.GL_CULL_FACE);
			gl.glCullFace(GL.GL_BACK);
			wallTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);	
	            
				gl.glBegin(GL2.GL_QUADS);
				gl.glColor3f(1f,0f,.5f); //Pink - Inner Front-facing Walls            
				//Front Wall - Dining room w/ big window
					//Bottom
					gl.glVertex3f(50,0,75); 
					gl.glVertex3f(50,3,75);
					gl.glVertex3f(65,3,75);
					gl.glVertex3f(65,0,75);	
					//Top
					gl.glVertex3f(50,7,75);
					gl.glVertex3f(50,10,75);
					gl.glVertex3f(65,10,75);
					gl.glVertex3f(65,7,75);		
					//Left
					gl.glVertex3f(50,3,75); 
					gl.glVertex3f(50,7,75);
					gl.glVertex3f(54.5f,7,75);
					gl.glVertex3f(54.5f,3,75);		
					//Right
					gl.glVertex3f(60.5f,3,75); 
					gl.glVertex3f(60.5f,7,75);
					gl.glVertex3f(65,7,75);
					gl.glVertex3f(65,3,75);	
				
				//Front Wall - Foyer w/ door
					//Top
					gl.glVertex3f(35,8,75); 
					gl.glVertex3f(35,10,75);
					gl.glVertex3f(50,10,75);
					gl.glVertex3f(50,8,75);		
					//Left
					gl.glVertex3f(35,0,75); 
					gl.glVertex3f(35,8,75);
					gl.glVertex3f(40.5f,8,75);
					gl.glVertex3f(40.5f,0,75);		
					//Right
					gl.glVertex3f(44.5f,0,75); 
					gl.glVertex3f(44.5f,8,75);
					gl.glVertex3f(50,8,75);
					gl.glVertex3f(50,0,75);			
				
					//Front Wall - Living room w/ big window
					//Bottom
					gl.glVertex3f(20,0,75); 
					gl.glVertex3f(20,3,75);
					gl.glVertex3f(35,3,75);
					gl.glVertex3f(35,0,75);	
					//Top
					gl.glVertex3f(20,7,75); 
					gl.glVertex3f(20,10,75);
					gl.glVertex3f(35,10,75);
					gl.glVertex3f(35,7,75);		
					//Left
					gl.glVertex3f(20,3,75);
					gl.glVertex3f(20,7,75);
					gl.glVertex3f(24.5f,7,75);
					gl.glVertex3f(24.5f,3,75);		
					//Right
					gl.glVertex3f(30.5f,3,75); 
					gl.glVertex3f(30.5f,7,75);
					gl.glVertex3f(35,7,75);
					gl.glVertex3f(35,3,75);	
				
					//Back Wall - Tv room w/ window and door
					//Bottom
					gl.glVertex3f(30,4.5f,45);
					gl.glVertex3f(20,4.5f,45);
					gl.glVertex3f(20,0,45);
					gl.glVertex3f(30,0,45);
					//Top
					gl.glVertex3f(30,10,45);
					gl.glVertex3f(20,10,45);
					gl.glVertex3f(20,7.5f,45);
					gl.glVertex3f(30,7.5f,45);	
					 //Left
					gl.glVertex3f(23,7.5f,45);
					gl.glVertex3f(20,7.5f,45);
					gl.glVertex3f(20,4.5f,45);
					gl.glVertex3f(23,4.5f,45);
					//Right
					gl.glVertex3f(30,7.5f,45);
					gl.glVertex3f(27,7.5f,45);
					gl.glVertex3f(27,4.5f,45);
					gl.glVertex3f(30,4.5f,45);
					//Above Door
					gl.glVertex3f(34,10,45);
					gl.glVertex3f(30,10,45);
					gl.glVertex3f(30,8.5f,45);
					gl.glVertex3f(34,8.5f,45);			
					//Right of Door
					gl.glVertex3f(35,10,45);
					gl.glVertex3f(34,10,45);
					gl.glVertex3f(34,0,45); 
					gl.glVertex3f(35,0,45);
					
				//Back Wall - Kitchen
					//Bottom
					gl.glVertex3f(65,4.5f,40);
					gl.glVertex3f(35,4.5f,40);
					gl.glVertex3f(35,0,40);
					gl.glVertex3f(65,0,40);
					
					//Top
					gl.glVertex3f(65,10,40);
					gl.glVertex3f(35,10,40);
					gl.glVertex3f(35,7.5f,40); 
					gl.glVertex3f(65,7.5f,40);		
		
					//Left
					gl.glVertex3f(42,7.5f,40);
					gl.glVertex3f(35,7.5f,40);
					gl.glVertex3f(35,4.5f,40);
					gl.glVertex3f(42,4.5f,40);
					
					//Right
					gl.glVertex3f(65,7.5f,40);
					gl.glVertex3f(46,7.5f,40);
					gl.glVertex3f(46,4.5f,40);
					gl.glVertex3f(65,4.5f,40);	
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);		
	    	gl.glDisable(GL.GL_CULL_FACE);	    	
	    	
	    	

		//INNER WALLS
		gl.glEnable(GL2.GL_TEXTURE_2D);
		wallTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            
			gl.glBegin(GL2.GL_QUADS);
			gl.glColor3f(1f,0f,.5f); 
				//Living Room Top
				gl.glVertex3f(20,8.5f,64); 
				gl.glVertex3f(20,10,64);
				gl.glVertex3f(35,10,64);
				gl.glVertex3f(35,8.5f,64);		
				//Living Room Left
				gl.glVertex3f(20,0,64); 
				gl.glVertex3f(20,8.5f,64);
				gl.glVertex3f(23,8.5f,64);
				gl.glVertex3f(23,0,64);	
				//Living Room Right
				gl.glVertex3f(32,0,64); 
				gl.glVertex3f(32,8.5f,64);
				gl.glVertex3f(35,8.5f,64);
				gl.glVertex3f(35,0,64);	
				
				//Foyer
				gl.glVertex3f(35.1f,0,55); 
				gl.glVertex3f(35.1f,10,55);
				gl.glVertex3f(50,10,55);
				gl.glVertex3f(50,0,55);
				
				//Dining Room Left
				gl.glVertex3f(50,0,55); 
				gl.glVertex3f(50,8.5f,55);
				gl.glVertex3f(52,8.5f,55);
				gl.glVertex3f(52,0,55);		
				//Dining Room Right
				gl.glVertex3f(58,0,55); 
				gl.glVertex3f(58,8.5f,55);
				gl.glVertex3f(65,8.5f,55);
				gl.glVertex3f(65,0,55);			
				//Dining Room Top
				gl.glVertex3f(50,8.5f,55); 
				gl.glVertex3f(50,10,55);
				gl.glVertex3f(65,10,55);
				gl.glVertex3f(65,8.5f,55);	
			
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);

        
        
        
        
        /////////////
        //Side Walls
        /////////////
        
        //Top Floor and Attic
		gl.glEnable(GL2.GL_TEXTURE_2D);
		wallTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sl, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tl, 0);    
            
            gl.glColor3f(1f,1f,1f);
	        //Attic
	        gl.glBegin(GL2.GL_TRIANGLES);
	        	//Left
				gl.glVertex3f(20,22,45); 
				gl.glVertex3f(20,30,60);
				gl.glVertex3f(20,22,75);       
				//Right
				gl.glVertex3f(85,22,45); 
				gl.glVertex3f(85,30,60);
				gl.glVertex3f(85,22,75);
				//Left Garage
				gl.glVertex3f(65,10,85); 
				gl.glVertex3f(65,15,75);
				gl.glVertex3f(65,10,75);       
				//Right Garage
				gl.glVertex3f(85,10,85); 
				gl.glVertex3f(85,15,75);
				gl.glVertex3f(85,10,75);		
			gl.glEnd();
	    
			gl.glBegin(GL2.GL_QUADS);
			//Top Floor
				//Left
				gl.glVertex3f(20,10,45); 
				gl.glVertex3f(20,22,45);
				gl.glVertex3f(20,22,75);
				gl.glVertex3f(20,10,75);
				 //Right
				gl.glVertex3f(85,10,75);
				gl.glVertex3f(85,22,75);
				gl.glVertex3f(85,22,45);
				gl.glVertex3f(85,10,45);				
				//Left Middle
				gl.glVertex3f(35,10,40); 
				gl.glVertex3f(35,22,40);
				gl.glVertex3f(35,22,45);
				gl.glVertex3f(35,10,45);		
				//Right Middle
				gl.glVertex3f(65,10,40);
				gl.glVertex3f(65,22,40);
				gl.glVertex3f(65,22,45);
				gl.glVertex3f(65,10,45);		
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);			        
        gl.glDisable(GL.GL_CULL_FACE);        
        
        
        
        //OUTSIDE WALLS	
		gl.glEnable(GL2.GL_TEXTURE_2D);
		gl.glEnable(GL.GL_CULL_FACE);
		gl.glCullFace(GL.GL_FRONT);
		wallTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sl, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tl, 0);
            
            gl.glColor3f(1f,1f,1f);
            gl.glBegin(GL2.GL_QUADS);
				//Left Wall - Living room  
					gl.glVertex3f(20,0,60); //Bottom
					gl.glVertex3f(20,10,60);
					gl.glVertex3f(20,10,75);
					gl.glVertex3f(20,0,75);
				
				 //Left Wall - Tv room w/ window
					 //Bottom
					gl.glVertex3f(20,4.5f,45);
					gl.glVertex3f(20,4.5f,60);
					gl.glVertex3f(20,0,60);
					gl.glVertex3f(20,0,45);					
					//Top
					gl.glVertex3f(20,10,45);
					gl.glVertex3f(20,10,60);
					gl.glVertex3f(20,7.5f,60); 
					gl.glVertex3f(20,7.5f,45);						
					//Right
					gl.glVertex3f(20,7.5f,54.5f);
					gl.glVertex3f(20,7.5f,60);
					gl.glVertex3f(20,4.5f,60); 
					gl.glVertex3f(20,4.5f,54.5f);					
					//Left
					gl.glVertex3f(20,7.5f,45);
					gl.glVertex3f(20,7.5f,50.5f); 	
					gl.glVertex3f(20,4.5f,50.5f);
					gl.glVertex3f(20,4.5f,45);			
					
					//Kitchen Right
					gl.glVertex3f(65,10,45);
					gl.glVertex3f(65,10,40);
					gl.glVertex3f(65,0,40); 
					gl.glVertex3f(65,0,45);					

					//Kitchen Left
					gl.glVertex3f(35,10,40);					
					gl.glVertex3f(35,10,45);
					gl.glVertex3f(35,0,45);					
					gl.glVertex3f(35,0,40); 

				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);			        
	        gl.glDisable(GL.GL_CULL_FACE);
	        
	        
	        //INSIDE WALLS
			gl.glEnable(GL2.GL_TEXTURE_2D);
			gl.glEnable(GL.GL_CULL_FACE);
			gl.glCullFace(GL.GL_BACK);
			wallTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sl, 0);
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tl, 0); 
	            
	            gl.glBegin(GL2.GL_QUADS);
	            gl.glColor3f(.75f,0f,.75f); //Purple - Inner Side-facing Walls
	
				//Left Wall - Living room  
					gl.glVertex3f(20,0,60); 
					gl.glVertex3f(20,10,60);
					gl.glVertex3f(20,10,75);
					gl.glVertex3f(20,0,75);
				
				 //Left Wall - Tv room w/ window
					//Bottom
					gl.glVertex3f(20,4.5f,45);
					gl.glVertex3f(20,4.5f,60);
					gl.glVertex3f(20,0,60);
					gl.glVertex3f(20,0,45);					
					//Top
					gl.glVertex3f(20,10,45);
					gl.glVertex3f(20,10,60);
					gl.glVertex3f(20,7.5f,60); 
					gl.glVertex3f(20,7.5f,45);						
					//Right
					gl.glVertex3f(20,7.5f,54.5f);
					gl.glVertex3f(20,7.5f,60);
					gl.glVertex3f(20,4.5f,60); 
					gl.glVertex3f(20,4.5f,54.5f);					
					//Left
					gl.glVertex3f(20,7.5f,45);
					gl.glVertex3f(20,7.5f,50.5f); 	
					gl.glVertex3f(20,4.5f,50.5f);
					gl.glVertex3f(20,4.5f,45);	
					
					//Kitchen Right
					gl.glVertex3f(65,10,45);
					gl.glVertex3f(65,10,40);
					gl.glVertex3f(65,0,40); 
					gl.glVertex3f(65,0,45);					

					//Kitchen Left
					gl.glVertex3f(35,10,40);					
					gl.glVertex3f(35,10,45);
					gl.glVertex3f(35,0,45);					
					gl.glVertex3f(35,0,40);       
				
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);			        
	        gl.glDisable(GL.GL_CULL_FACE);		        
	        
	        
	        //INNER WALLS
			gl.glEnable(GL2.GL_TEXTURE_2D);
			wallTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sl, 0);
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tl, 0);   
	            
	            gl.glBegin(GL2.GL_QUADS);
			    //Inner Walls - Left
	            	//Kitchen TV - Top
					gl.glVertex3f(35.1f,8.5f,40); 
					gl.glVertex3f(35.1f,10,40);
					gl.glVertex3f(35.1f,10,75);
					gl.glVertex3f(35.1f,8.5f,75);	     
					 //Kitchen and TV - Right
					gl.glVertex3f(35.1f,0,40);
					gl.glVertex3f(35.1f,8.5f,40);
					gl.glVertex3f(35.1f,8.5f,48);
					gl.glVertex3f(35.1f,0,48);	  			
					//TV and Foyer
					gl.glVertex3f(35.1f,0,52); 
					gl.glVertex3f(35.1f,8.5f,52);
					gl.glVertex3f(35.1f,8.5f,65);
					gl.glVertex3f(35.1f,0,65);	  	
					//Living Room
					gl.glVertex3f(35.1f,0,73); 
					gl.glVertex3f(35.1f,8.5f,73);
					gl.glVertex3f(35.1f,8.5f,75);
					gl.glVertex3f(35.1f,0,75);	  	
					
				//Inner Walls - Right
					//Top
					gl.glVertex3f(50,8.5f,55); 
					gl.glVertex3f(50,10,55);
					gl.glVertex3f(50,10,75);
					gl.glVertex3f(50,8.5f,75);	
					//Dining Room
					gl.glVertex3f(50,0,55); 
					gl.glVertex3f(50,8.5f,55);
					gl.glVertex3f(50,8.5f,65);
					gl.glVertex3f(50,0,65);					
					//Dining Room
					gl.glVertex3f(50,0,73); 
					gl.glVertex3f(50,8.5f,73);
					gl.glVertex3f(50,8.5f,75);
					gl.glVertex3f(50,0,75);			
					//Dining Room
					gl.glVertex3f(64.9f,0,55); 
					gl.glVertex3f(64.9f,10,55);
					gl.glVertex3f(64.9f,10,75);
					gl.glVertex3f(64.9f,0,75);	  	
					//Kitchen
					gl.glVertex3f(64.9f,0,40); 
					gl.glVertex3f(64.9f,10,40);
					gl.glVertex3f(64.9f,10,45);
					gl.glVertex3f(64.9f,0,45);	  				
			
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);	
	        
	        ////////
	        //Garage
	        ////////
			gl.glEnable(GL2.GL_TEXTURE_2D);
			wallTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);//Front and Back
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	            
		        gl.glBegin(GL2.GL_QUADS);
				gl.glColor3f(1f,1f,1f);	  	
				
		        //Garage Door Wall
					//Top
					gl.glVertex3f(65,8,85); 
					gl.glVertex3f(65,10,85);
					gl.glVertex3f(85,10,85);
					gl.glVertex3f(85,8,85);		
					//Left
					gl.glVertex3f(65,0,85); 
					gl.glVertex3f(65,8,85);
					gl.glVertex3f(68,8,85);
					gl.glVertex3f(68,0,85);		
					//Right
					gl.glVertex3f(82,0,85); 
					gl.glVertex3f(82,8,85);
					gl.glVertex3f(85,8,85);
					gl.glVertex3f(85,0,85);
					
				//Back Wall
					gl.glVertex3f(65,0,45); 
					gl.glVertex3f(65,10,45);
					gl.glVertex3f(85,10,45);
					gl.glVertex3f(85,0,45);					
				
				//Inside Wall
					gl.glVertex3f(65,0,55); 
					gl.glVertex3f(65,10,55);
					gl.glVertex3f(85,10,55);
					gl.glVertex3f(85,0,55);	
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);					
					
					
	        //Sides
			gl.glEnable(GL2.GL_TEXTURE_2D);
			wallTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sl, 0);//Front and Back
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tl, 0);	    
	            
		        gl.glBegin(GL2.GL_QUADS);
				gl.glColor3f(1f,1f,1f);	
				
				//Right Wall
					gl.glVertex3f(85,0,85); 
					gl.glVertex3f(85,10,85);
					gl.glVertex3f(85,10,45);
					gl.glVertex3f(85,0,45);					
				
				//Left Wall
					gl.glVertex3f(65,0,85); 
					gl.glVertex3f(65,10,85);
					gl.glVertex3f(65,10,55);
					gl.glVertex3f(65,0,55);		
				gl.glEnd();	
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);	
			
			//Door
			gl.glEnable(GL2.GL_TEXTURE_2D);
			garageTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);  	
            gl.glBegin(GL2.GL_QUADS);
				gl.glVertex3f(68,6,85); 
				gl.glVertex3f(68,8,85);
				gl.glVertex3f(82,8,85);
				gl.glVertex3f(82,6,85);		
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);		
	        
	        /////////
	        //Objects
	        /////////
	        
	        //CURTAINS
	        gl.glColor3f(1f,1f,1f);	
	        gl.glEnable(GL2.GL_TEXTURE_2D);
	        curtainTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
	        	gl.glTexCoord2f(0f,0f);gl.glVertex3f(40,7.5f,40.1f); 
	        	gl.glTexCoord2f(1f,0f);gl.glVertex3f(42,7.5f,40.1f);
	        	gl.glTexCoord2f(1f,3f);gl.glVertex3f(42,3,40.1f);
	        	gl.glTexCoord2f(0f,3f);gl.glVertex3f(40,3,40.1f);	
	        	
	        	gl.glTexCoord2f(0f,0f);gl.glVertex3f(46,7.5f,40.1f); 
	        	gl.glTexCoord2f(1f,0f);gl.glVertex3f(48,7.5f,40.1f);
	        	gl.glTexCoord2f(1f,3f);gl.glVertex3f(48,3,40.1f);
	        	gl.glTexCoord2f(0f,3f);gl.glVertex3f(46,3,40.1f);	
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			
			//RODS
			gl.glColor3f(.75f,.5f,0f);	
	        gl.glPushMatrix();
	        	gl.glTranslatef(40, 7.6f, 40.1f); 
	        	gl.glRotatef(90, 0, 1, 0);
	        	glu.gluCylinder(quadric, .1, .1, 2, 10, 1);
        	gl.glPopMatrix();	
	        gl.glPushMatrix();
	        	gl.glTranslatef(46, 7.6f, 40.1f); 
	        	gl.glRotatef(90, 0, 1, 0);
	        	glu.gluCylinder(quadric, .1, .1, 2, 10, 1);
	    	gl.glPopMatrix();				
			
			
			
	        //KITCHEN TABLE
	        gl.glColor3f(1f,1f,1f);	
	        //Top
	        gl.glEnable(GL2.GL_TEXTURE_2D);
	        woodTexture.bind();
	        gl.glPushMatrix();
	        	gl.glTranslatef(45, 3, 45);
        		gl.glRotatef(-90, 1, 0, 0); //Right side up
        		glu.gluCylinder(quadric, 4, 4, 1, 10, 1);
        	gl.glPopMatrix();
        	gl.glDisable(GL2.GL_TEXTURE_2D);
        	
	        gl.glEnable(GL2.GL_TEXTURE_2D);
	        woodTexture.bind();
	        gl.glPushMatrix();
	        	gl.glTranslatef(45, 4, 45); 
	        	gl.glRotatef(-90, 1, 0, 0);
	        	glu.gluDisk(quadric, 0, 4, 10, 10);
        	gl.glPopMatrix();
        	gl.glDisable(GL2.GL_TEXTURE_2D);       	
	        
	        //Legs
        	gl.glColor3f(.5f,.5f,.5f);
	        gl.glPushMatrix();
        		gl.glTranslatef(47.5f, 0, 47.5f);
        		gl.glRotatef(-90, 1, 0, 0); //Right side up
        		glu.gluCylinder(quadric, 0.25, 0.25, 4, 10, 1);
    		gl.glPopMatrix();	        
	        gl.glPushMatrix();
    			gl.glTranslatef(47.5f, 0, 42.5f);
    			gl.glRotatef(-90, 1, 0, 0); //Right side up
    			glu.gluCylinder(quadric, 0.25, 0.25, 4, 10, 1);
    		gl.glPopMatrix();	      
    		gl.glPushMatrix();
    			gl.glTranslatef(42.5f, 0, 47.5f);
    			gl.glRotatef(-90, 1, 0, 0); //Right side up
    			glu.gluCylinder(quadric, 0.25, 0.25, 4, 10, 1);
    		gl.glPopMatrix();	      
		    gl.glPushMatrix();
	    		gl.glTranslatef(42.5f, 0, 42.5f);
	    		gl.glRotatef(-90, 1, 0, 0); //Right side up
	    		glu.gluCylinder(quadric, 0.25, 0.25, 4, 10, 1);
			gl.glPopMatrix();	      
    		
			//DINING ROOM TABLE
			//Top
			gl.glColor3f(.75f,.5f,0f);
			gl.glEnable(GL2.GL_TEXTURE_2D);
			woodTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_sr, 0);
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_tr, 0);	   
		        gl.glBegin(GL2.GL_QUADS);
		        	//Top
					gl.glVertex3f(55.5f,3.5f,61.5f); 
					gl.glVertex3f(60.5f,3.5f,61.5f);
					gl.glVertex3f(60.5f,3.5f,70.5f);
					gl.glVertex3f(55.5f,3.5f,70.5f);	
					
					//Sides
					gl.glVertex3f(55.5f,3,61.5f); 
					gl.glVertex3f(55.5f,3.5f,61.5f);
					gl.glVertex3f(55.5f,3.5f,70.5f);
					gl.glVertex3f(55.5f,3,70.5f);	
					
					gl.glVertex3f(60.5f,3,61.5f); 
					gl.glVertex3f(60.5f,3.5f,61.5f);
					gl.glVertex3f(60.5f,3.5f,70.5f);
					gl.glVertex3f(60.5f,3,70.5f);
					
					gl.glVertex3f(55.5f,3,61.5f); 
					gl.glVertex3f(55.5f,3.5f,61.5f);
					gl.glVertex3f(60.5f,3.5f,61.5f);
					gl.glVertex3f(60.5f,3,61.5f);
					
					gl.glVertex3f(55.5f,3,70.5f); 
					gl.glVertex3f(55.5f,3.5f,70.5f);
					gl.glVertex3f(60.5f,3.5f,70.5f);
					gl.glVertex3f(60.5f,3,70.5f);
	        	
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);	
			//Legs
			gl.glEnable(GL2.GL_TEXTURE_2D);
			woodTexture.bind();
	        gl.glPushMatrix();
        		gl.glTranslatef(56f, 0, 62f);
        		gl.glRotatef(-90, 1, 0, 0); //Right side up
        		glu.gluCylinder(quadric, 0.25, 0.25, 3, 10, 1);
    		gl.glPopMatrix();	        
	        gl.glPushMatrix();
    			gl.glTranslatef(60f, 0, 62f);
    			gl.glRotatef(-90, 1, 0, 0); //Right side up
    			glu.gluCylinder(quadric, 0.25, 0.25, 3, 10, 1);
    		gl.glPopMatrix();	      
    		gl.glPushMatrix();
    			gl.glTranslatef(60f, 0, 70f);
    			gl.glRotatef(-90, 1, 0, 0); //Right side up
    			glu.gluCylinder(quadric, 0.25, 0.25, 3, 10, 1);
    		gl.glPopMatrix();	      
		    gl.glPushMatrix();
	    		gl.glTranslatef(56f, 0, 70f);
	    		gl.glRotatef(-90, 1, 0, 0); //Right side up
	    		glu.gluCylinder(quadric, 0.25, 0.25, 3, 10, 1);
			gl.glPopMatrix();
			gl.glDisable(GL2.GL_TEXTURE_2D);	
			
			//COUCH
			gl.glEnable(GL2.GL_TEXTURE_2D);
			cushionTexture.bind();
			gl.glColor3f(1f,.25f,0f);	
            gl.glBegin(GL2.GL_QUADS);
            	//Back
            	gl.glTexCoord2f(0f,0f);gl.glVertex3f(34,2,55); 
            	gl.glTexCoord2f(3f,0f);gl.glVertex3f(34,2,63);
            	gl.glTexCoord2f(3f,1f);gl.glVertex3f(34,4,63);
            	gl.glTexCoord2f(0f,1f);gl.glVertex3f(34,4,55);	           
            	
            	//Seat
				gl.glTexCoord2f(0f,0f);gl.glVertex3f(31,2,55); 
				gl.glTexCoord2f(3f,0f);gl.glVertex3f(31,2,63);
				gl.glTexCoord2f(3f,1f);gl.glVertex3f(34,2,63);
				gl.glTexCoord2f(0f,1f);gl.glVertex3f(34,2,55);	
				
				//Left
				gl.glVertex3f(31,0,55); 
				gl.glVertex3f(31,2,55);
				gl.glVertex3f(34,2,55);
				gl.glVertex3f(34,0,55);	  	
				
				gl.glVertex3f(34,0,55); 
				gl.glVertex3f(34,4,55);
				gl.glVertex3f(35,4,55);
				gl.glVertex3f(35,0,55);	  					
				
				//Right
				gl.glVertex3f(31,0,63); 
				gl.glVertex3f(31,2,63);
				gl.glVertex3f(34,2,63);
				gl.glVertex3f(34,0,63);	  
				
				gl.glVertex3f(34,0,63); 
				gl.glVertex3f(34,4,63);
				gl.glVertex3f(35,4,63);
				gl.glVertex3f(35,0,63);	  
				
				//Front 
				gl.glVertex3f(31,0,55); 
				gl.glVertex3f(31,0,63);
				gl.glVertex3f(31,2,63);
				gl.glVertex3f(31,2,55);	  
				
				//Top
				gl.glVertex3f(34,4,55); 
				gl.glVertex3f(34,4,63);
				gl.glVertex3f(35,4,63);
				gl.glVertex3f(35,4,55);				
				
				
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);		
    		
			//PAINTING
			gl.glEnable(GL2.GL_TEXTURE_2D);
			paintingTexture.bind();
			gl.glColor3f(1f,1f,1f);	
            gl.glBegin(GL2.GL_QUADS);
            	gl.glTexCoord2f(0f,0f);gl.glVertex3f(35,6,57.5f); 
            	gl.glTexCoord2f(0f,1f);gl.glVertex3f(35,8.5f,57.5f);
            	gl.glTexCoord2f(1f,1f);gl.glVertex3f(35,8.5f,60.5f);
            	gl.glTexCoord2f(1f,0f);gl.glVertex3f(35,6,60.5f);	   			
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);    		
			
			//TV			
			gl.glEnable(GL2.GL_TEXTURE_2D);
			tvTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
            
            //Front
            	gl.glTexCoord2f(0f,0f);gl.glVertex3f(22,0,57); 
            	gl.glTexCoord2f(0f,1f);gl.glVertex3f(22,3,57);
            	gl.glTexCoord2f(1f,1f);gl.glVertex3f(22,3,61);
            	gl.glTexCoord2f(1f,0f);gl.glVertex3f(22,0,61);
				
			//Top
				gl.glVertex3f(22,3,57); 
				gl.glVertex3f(20,3,57);
				gl.glVertex3f(20,3,61);
				gl.glVertex3f(22,3,61);		
			//Right
				gl.glVertex3f(22,0,57); 
				gl.glVertex3f(20,0,57);
				gl.glVertex3f(20,3,57);
				gl.glVertex3f(22,3,57);	
			//Left
				gl.glVertex3f(22,0,61); 
				gl.glVertex3f(20,0,61);
				gl.glVertex3f(20,3,61);
				gl.glVertex3f(22,3,61);	
			gl.glEnd();
			
			
				
				
			/////////
			//Windows
			/////////
			gl.glEnable(GL2.GL_BLEND);
			gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
			gl.glBegin(GL2.GL_QUADS);
				gl.glColor4f(0f,.5f,1f, .25f);
				
				//Living Room
				gl.glVertex3f(24.5f,3,75); 
				gl.glVertex3f(24.5f,7,75);
				gl.glVertex3f(30.5f,7,75);
				gl.glVertex3f(30.5f,3,75);	

				//Dining Room
				gl.glVertex3f(54.5f,3,75); 
				gl.glVertex3f(54.5f,7,75);
				gl.glVertex3f(60.5f,7,75);
				gl.glVertex3f(60.5f,3,75);		
				
				//TV Room - Side
				gl.glVertex3f(20,4.5f,54.5f); 
				gl.glVertex3f(20,7.5f,54.5f);
				gl.glVertex3f(20,7.5f,50.5f);
				gl.glVertex3f(20,4.5f,50.5f);	
				
				//TV Room - Back
				gl.glVertex3f(23,4.5f,45); 
				gl.glVertex3f(23,7.5f,45);
				gl.glVertex3f(27,7.5f,45);
				gl.glVertex3f(27,4.5f,45);
				
				//Kitchen
				gl.glVertex3f(42,4.5f,40); 
				gl.glVertex3f(42,7.5f,40);
				gl.glVertex3f(46,7.5f,40);
				gl.glVertex3f(46,4.5f,40);	
				
			gl.glEnd();
			gl.glDisable(GL2.GL_BLEND);	   			
	}
	
	public void drawSteps(GL2 gl, GLU glu, Eye eye, ArrayList stepList, float xt, float yt, float zt)
	{
		float x = 0; float y; float z = 1;

		for (int i = 0; i < 25; i++)
		{
			gl.glBegin(GL2.GL_QUADS);
				gl.glColor3f(0f,1,1);
				gl.glVertex3f(0f,i,z*i); 
				gl.glVertex3f(0,i,z*(i+1));
				gl.glVertex3f(5,i,z*(i+1));
				gl.glVertex3f(5,i,z*i);	
			gl.glEnd();
			stepList.add(new Step(xt + x, x+xt+5, i, zt+z*i, zt+z*(i+1), eye));
		}
		for (int i = 25; i < 50; i++)
		{
			gl.glBegin(GL2.GL_QUADS);
				gl.glColor3f(0f,1,1);
				gl.glVertex3f(0f,50-i,z*i); 
				gl.glVertex3f(0,50-i,z*(i+1));
				gl.glVertex3f(5,50-i,z*(i+1));
				gl.glVertex3f(5,50-i,z*i);	
			gl.glEnd();
		stepList.add(new Step(xt + x, x+xt+5, 50-i, zt+z*i, zt+z*(i+1), eye));
		}
	}

}
