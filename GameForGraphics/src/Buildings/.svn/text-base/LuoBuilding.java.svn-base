package Buildings;
import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.LuoTank;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


public class LuoBuilding extends Building {

	private static GLUquadric quadric;
	private static GLUquadric autoQuadric; // for Signorile's head
	private static Texture lavaTexture;
	private static Texture brickTexture2;
	private static Texture brickTexture;
	private static Texture rockTexture;
	private static Texture rockTexture2;
	private static Texture rockTexture3;
	private static Texture eyeTexture1;
	private static Texture eyeTexture2;
	private static Texture eyeTexture3;
	private static Texture eyeTexture4;
	private static Texture eyeTexture5;
	private static Texture eyeTexture6;
	private static Texture eyeTexture7;
	private static Texture eyeTexture8;
	private static Texture eyeTexture9;
	private static Texture eyeTexture10;
	private static Texture eyeTexture11;
	private static Texture eyeTexture12;
	private static Texture eyeTexture13;
	private int timeStep;
	private int stepGap;
	private static LuoTank myTank;
	private TextRenderer renderer;

	
	public LuoBuilding(GL2 gl, GLU glu)
	{   
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		if(quadric==null){
			quadric = glu.gluNewQuadric();
			glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
			glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
			glu.gluQuadricTexture  (quadric, false);        // use true to generate texture coordinates
	
			autoQuadric = glu.gluNewQuadric();
			glu.gluQuadricDrawStyle(autoQuadric, GLU.GLU_FILL);
			glu.gluQuadricNormals  (autoQuadric, GLU.GLU_NONE);
			glu.gluQuadricTexture  (autoQuadric, true); // for Signorile's head
	
			lavaTexture = setupTexture(gl, "luoLava.png");
			brickTexture = setupTexture(gl, "luoBrick1.png");
			brickTexture2 = setupTexture(gl, "luoBrick2.png");
			rockTexture = setupTexture(gl, "luoRock.png");
			rockTexture2 = setupTexture(gl, "luoRock2.png");
			rockTexture3 = setupTexture(gl, "luoRock3.png");
			eyeTexture1 = setupTexture(gl,"luoEye1.png");
			eyeTexture2 = setupTexture(gl,"luoEye2.png");
			eyeTexture3 = setupTexture(gl,"luoEye3.png");
			eyeTexture4 = setupTexture(gl,"luoEye4.png");
			eyeTexture5 = setupTexture(gl,"luoEye5.png");
			eyeTexture6 = setupTexture(gl,"luoEye6.png");
			eyeTexture7 = setupTexture(gl,"luoEye7.png");
			eyeTexture8 = setupTexture(gl,"luoEye8.png");
			eyeTexture9 = setupTexture(gl,"luoEye9.png");
			eyeTexture10 = setupTexture(gl,"luoEye10.png");
			eyeTexture11 = setupTexture(gl,"luoEye11.png");
			eyeTexture12 = setupTexture(gl,"luoEye12.png");
			eyeTexture13 = setupTexture(gl,"luoEye13.png");
			timeStep = 0;
			stepGap = 0;
			//Tank at front door
			myTank = new LuoTank(gl, glu);
		}
		
	}
	
	public void drawMoving(GL2 gl, GLU glu, double eyeX, double eyeY, double eyeZ) {
		
	    gl.glEnable(GL2.GL_TEXTURE_2D);
		    
		    gl.glPushMatrix(); //Drawing eye on top of tower	
		    this.bindEyeTexture();
		        gl.glColor3f(1,1,0);
		        gl.glTranslatef(50f, 200f, 50f);
		        gl.glRotated(90, 1, 0, 0);
		        glu.gluSphere(autoQuadric, 16, 10, 10);
		    gl.glPopMatrix();
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    
	    
	}
    
    
	private void bindEyeTexture() {
		switch(timeStep){
			case 0: eyeTexture1.bind();break;
			case 1: eyeTexture2.bind();break;
			case 2: eyeTexture3.bind();break;
			case 3: eyeTexture4.bind();break;
			case 4: eyeTexture5.bind();break;
			case 5: eyeTexture6.bind();break;
			case 6: eyeTexture7.bind();break;
			case 7: eyeTexture8.bind();break;
			case 8: eyeTexture9.bind();break;
			case 9: eyeTexture10.bind();break;
			case 10: eyeTexture11.bind();break;
			case 11: eyeTexture12.bind();break;
			case 12: eyeTexture13.bind();break;
			default: eyeTexture1.bind();
		}
		if(stepGap>10){
			timeStep++;
			stepGap=0;
		}
		stepGap++;
		timeStep = timeStep % 13;
	}

	   public void drawMoving(GL2 gl, GLU glu) {
	      // Luo Building Text
        gl.glPushMatrix();
            gl.glRotated(180, 0, 1, 0);
            gl.glTranslated(-60, 10, -19.5);
            renderer.begin3DRendering();
            renderer.setColor(1, 0, 0, 1);
            renderer.draw3D("Reign of Fire", 0f, 0f,0, .25f*1f/7);
            renderer.end3DRendering();
   gl.glPopMatrix();

	    }

	public void draw(GL2 gl, GLU glu) {


		
			gl.glEnable(GL2.GL_TEXTURE_2D);
				lavaTexture.bind();
				gl.glColor3f(1f,0f,0f); //Ground
				gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f,0f); gl.glVertex3f(0,0,0);
				gl.glTexCoord2f(4f,0f); gl.glVertex3f(100,0,0);
				gl.glTexCoord2f(4f,4f); gl.glVertex3f(100,0,100);
				gl.glTexCoord2f(0f,4f); gl.glVertex3f(0,0,100);
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			
			//tank in front door
			gl.glPushMatrix(); 
			gl.glTranslatef(50f, 1f, 20f);
			myTank.draw(gl, glu);
			gl.glPopMatrix(); 
			
			gl.glPushMatrix(); 
			gl.glColor3f(0f,1f,0f); 
			gl.glTranslatef(50f, 0f, 50f);
			
			gl.glEnable(GL2.GL_TEXTURE_2D);
	        brickTexture.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            float[] coef_s = {.1f,0f,.1f,0};
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	            float[] coef_t = {0f,.1f,0f,0};
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	            
				gl.glPushMatrix(); //Ground level walls
					gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(-30,0,-30);
					gl.glVertex3f(-30,0,30);
					gl.glVertex3f(-30,20,30);
					gl.glVertex3f(-30,20,-30);
					
					gl.glVertex3f(30,0,-30);
					gl.glVertex3f(30,0,30);
					gl.glVertex3f(30,20,30);
					gl.glVertex3f(30,20,-30);
					gl.glEnd();
				gl.glPopMatrix(); 
				
				gl.glPushMatrix(); //Front door wall
					gl.glTranslatef(0f, 0, 30f);
					gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(-30,0,0);
					gl.glVertex3f(-4,0,0);
					gl.glVertex3f(-4,20,0);
					gl.glVertex3f(-30,20,0);
					
					gl.glVertex3f(4,0,0);
					gl.glVertex3f(30,0,0);
					gl.glVertex3f(30,20,0);
					gl.glVertex3f(4,20,0);
					
					gl.glVertex3f(-4,8,0);
					gl.glVertex3f(-4,20,0);
					gl.glVertex3f(4,20,0);
					gl.glVertex3f(4,8,0);
					gl.glEnd();
				gl.glPopMatrix(); 
				
				gl.glPushMatrix(); //Back door wall
					gl.glTranslatef(0f, 0, -30f);
					gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(-30,0,0);
					gl.glVertex3f(-4,0,0);
					gl.glVertex3f(-4,20,0);
					gl.glVertex3f(-30,20,0);
					
					gl.glVertex3f(4,0,0);
					gl.glVertex3f(30,0,0);
					gl.glVertex3f(30,20,0);
					gl.glVertex3f(4,20,0);
					
					gl.glVertex3f(-4,8,0);
					gl.glVertex3f(-4,20,0);
					gl.glVertex3f(4,20,0);
					gl.glVertex3f(4,8,0);
					gl.glEnd();
				gl.glPopMatrix(); 
				
				float[] coef_s2 = {.1f,0f,0f,0};
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s2, 0);
	            float[] coef_t2 = {0f,0f,.1f,0};
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t2, 0);
	            
				gl.glPushMatrix(); //Ground floor ceiling
					gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(-30,20,-30);
					gl.glVertex3f(-30,20,30);
					gl.glVertex3f(-16,20,30);
					gl.glVertex3f(-16,20,-30);
					
					gl.glVertex3f(30,20,-30);
					gl.glVertex3f(30,20,30);
					gl.glVertex3f(16,20,30);
					gl.glVertex3f(16,20,-30);
					
					gl.glVertex3f(-30,20,-30);
					gl.glVertex3f(30,20,-30);
					gl.glVertex3f(30,20,-16);
					gl.glVertex3f(-30,20,-16);
					
					gl.glVertex3f(-30,20,30);
					gl.glVertex3f(30,20,30);
					gl.glVertex3f(30,20,16);
					gl.glVertex3f(-30,20,16);
					gl.glEnd();
				gl.glPopMatrix(); 

			gl.glPushMatrix();  // Cylinder wall
				gl.glColor3f(0f,1f,0f);
				gl.glTranslatef(0f, 20f, 0f);
				gl.glRotatef(-90, 1, 0, 0);
		        glu.gluCylinder(autoQuadric, 30, 28, 20, 10, 1);
	        gl.glPopMatrix();
	        
	        gl.glPushMatrix();  // Cylinder wall
				gl.glColor3f(0f,1f,0f);
				gl.glTranslatef(0f, 40f, 0f);
		        gl.glRotatef(-90, 1, 0, 0);
		        glu.gluCylinder(autoQuadric, 26, 24, 20, 10, 1);
	        gl.glPopMatrix();
	        
	        gl.glPushMatrix();  // Cylinder wall
				gl.glColor3f(0f,1f,0f);
				gl.glTranslatef(0f, 60f, 0f);
		        gl.glRotatef(-90, 1, 0, 0);
		        glu.gluCylinder(autoQuadric, 22, 20, 20, 10, 1);
	        gl.glPopMatrix();
	           
	        gl.glPushMatrix();  // Cylinder wall
				gl.glColor3f(0f,1f,0f);
				gl.glTranslatef(0f, 80f, 0f);
		        gl.glRotatef(-90, 1, 0, 0);
		        glu.gluCylinder(autoQuadric, 20, 20, 80, 10, 1);
	        gl.glPopMatrix();
	        
	        float[] coef_s3 = {.1f,0f,0f,0};
            float[] coef_t3 = {0f,.1f,0f,0};
	        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s3, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t3, 0);
            
	        gl.glPushMatrix();  // Disk to cover up gap in wall
	            gl.glTranslatef(0f, 40f, 0f);
	            gl.glRotatef(-90, 1, 0, 0);
	            glu.gluDisk(autoQuadric, 28, 26, 10, 2); 
            gl.glPopMatrix();
            
            gl.glPushMatrix();  // Disk to cover up gap in wall
	            gl.glTranslatef(0f, 60f, 0f);
	            gl.glRotatef(-90, 1, 0, 0);
	            glu.gluDisk(autoQuadric, 24, 22, 10, 2); 
            gl.glPopMatrix();

            gl.glPushMatrix();  // Disk to cover up gap in wall
	            gl.glTranslatef(0f, 160f, 0f);
	            gl.glRotatef(-90, 1, 0, 0);
	            glu.gluDisk(autoQuadric, 20,0, 10, 2); 
            gl.glPopMatrix();
            
            brickTexture2.bind();
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s3, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t3, 0);
            
            gl.glPushMatrix(); 
	            gl.glTranslatef(0f, 162.5f, 0f);
	            for(int angle = 0; angle<360; angle = angle + 30) //Drawing blocks on top of tower
	            {
	            	gl.glPushMatrix();
			            gl.glRotatef(angle, 0, 1, 0);
			            gl.glTranslatef(0f, 0f, 20f);
			            drawPrism(gl, glu, 3f, 2f, 3f);
		            gl.glPopMatrix();
	            }
	
	            for(int angle = 15; angle<360; angle = angle + 30)//Drawing blocks on top of tower
	            {
	            	gl.glPushMatrix();
			            gl.glRotatef(angle, 0, 1, 0);
			            gl.glTranslatef(0f, 0f, 20f);
			            this.drawPrism(gl, glu, 3f, 2f, 1.5f);
		            gl.glPopMatrix();
	            }
            gl.glPopMatrix();
            
            rockTexture.bind();
            
            gl.glPushMatrix(); //Drawing horns next to eye
            	gl.glColor3f(1f,.70f,0f);
	            gl.glTranslatef(0f, 162.5f, 0f);
	            gl.glTranslatef(-20f, 0f, 0f);
	            this.drawTetrahedron(gl, glu, 20f,5f,70f);
	            this.drawTetrahedron(gl, glu, 20f,10f,40f);
	            this.drawTetrahedron(gl, glu, 20f,15f,30f);
	            this.drawTetrahedron(gl, glu, 20f,20f,20f);
            gl.glPopMatrix();
            
            gl.glPushMatrix(); //Drawing horns next to eye
            	gl.glColor3f(1f,.70f,0f);
	            gl.glTranslatef(0f, 162.5f, 0f);
	            gl.glTranslatef(20f, 0f, 0f);
	            gl.glScalef(-1f, 1f, 1f);
	            this.drawTetrahedron(gl, glu, 20f,5f,70f);
	            this.drawTetrahedron(gl, glu, 20f,10f,40f);
	            this.drawTetrahedron(gl, glu, 20f,15f,30f);
	            this.drawTetrahedron(gl, glu, 20f,20f,20f);
            gl.glPopMatrix();
            gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);

            
            gl.glEnable(GL2.GL_TEXTURE_2D);
            gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            rockTexture3.bind();
	        //Drawing stairs
            for(int step = 0; step<144; step++)
            {
            	gl.glPushMatrix();
	            	gl.glTranslatef(0f, step, 0f);
		            gl.glRotatef(step*5, 0, 1, 0);
		            gl.glTranslatef(8f,0,0);
		            this.drawPrism(gl, glu, 3f, 1f, 1f);
	            gl.glPopMatrix();
            }
            
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s2, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t2, 0);
            
            rockTexture2.bind();
            gl.glPushMatrix();  // Middle pillar surrounded by stairs
	            glu.gluQuadricDrawStyle(autoQuadric, GLU.GLU_FILL);
				gl.glColor3f(0f,1f,0f);
				gl.glTranslatef(0f, 0f, 0f);
		        gl.glRotatef(-90, 1, 0, 0);
		        glu.gluCylinder(autoQuadric, 6, 6, 144, 10, 1);
	        gl.glPopMatrix();

	        gl.glPushMatrix();
	        	glu.gluQuadricDrawStyle(autoQuadric, GLU.GLU_FILL);
		        gl.glColor3f(1f,0f,0f); 
		        gl.glTranslatef(0f, 144f, 0f);
		    	
				gl.glBegin(GL2.GL_QUADS); //Upper floor Ground
					gl.glVertex3f(-13,0,0);
					gl.glVertex3f(-13,0,-13);
					gl.glVertex3f(13,0,-13);
					gl.glVertex3f(13,0,0);
	
					gl.glVertex3f(-13,0,0);
					gl.glVertex3f(-13,0,13);
					gl.glVertex3f(0,0,13);
					gl.glVertex3f(0,0,0);
	
					gl.glVertex3f(0,0,6);
					gl.glVertex3f(0,0,13);
					gl.glVertex3f(13,0,13);
					gl.glVertex3f(13,0,6);
	
					gl.glVertex3f(11,0,0);
					gl.glVertex3f(13,0,0);
					gl.glVertex3f(13,0,6);
					gl.glVertex3f(11,0,6);
				gl.glEnd();
				
				lavaTexture.bind();
				gl.glPushMatrix();//Drawing well
				glu.gluQuadricDrawStyle(autoQuadric, GLU.GLU_FILL);
				gl.glColor3f(.7f,.6f,.2f);
					gl.glRotatef(-90, 1, 0, 0);
				    glu.gluCylinder(autoQuadric, 4, 3, 3, 10, 1);
			    gl.glPopMatrix();

			    gl.glPushMatrix();
			        gl.glTranslatef(0f, 3.1f, 0f);
				    gl.glRotatef(-90, 1, 0, 0);
		            gl.glRotatef(18, 0, 0, 1);
		            glu.gluDisk(autoQuadric, 3,0, 10, 2); 
	            gl.glPopMatrix();
	            
	            brickTexture.bind();
	            
	            gl.glPushMatrix();//Drawing chair
	            gl.glTranslatef(0f, 0f, -9f);
		            gl.glPushMatrix();
			        gl.glTranslatef(0f, 1.5f, 0f);
				    this.drawPrism(gl, glu, 2.5f, 1.5f, 1f);
				    gl.glPopMatrix();
				    
		            gl.glPushMatrix();
		            gl.glTranslatef(2.5f, 1.5f, 0f);
				    this.drawPrism(gl, glu, 0.5f, 1.5f, 1.5f);
				    gl.glPopMatrix();
				    
				    gl.glPushMatrix();
		            gl.glTranslatef(-2.5f, 1.5f, 0f);
				    this.drawPrism(gl, glu, 0.5f, 1.5f, 1.5f);
				    gl.glPopMatrix();
				    
				    gl.glPushMatrix();
		            gl.glTranslatef(0f, 2f, -2f);
				    this.drawPrism(gl, glu, 2.5f, 0.7f, 7f);
				    gl.glPopMatrix();
			    gl.glPopMatrix();

			    gl.glPushMatrix();//Drawing balcony
			    	gl.glTranslatef(0f, 0f, 18f);
				    gl.glBegin(GL2.GL_QUADS); 
					gl.glVertex3f(-4,0,0);
					gl.glVertex3f(4,0,0);
					gl.glVertex3f(4,0,10);
					gl.glVertex3f(-4,0,10);
	
					gl.glVertex3f(-4,0,10);
					gl.glVertex3f(4,0,10);
					gl.glVertex3f(4,-3,0);
					gl.glVertex3f(-4,-3,0);
					gl.glEnd();
					
					gl.glBegin(GL2.GL_TRIANGLES);
			        gl.glVertex3f(4,0,10);
			        gl.glVertex3f(4,0,0);
			        gl.glVertex3f(4,-3,0); 
			        gl.glEnd();
			         
			        gl.glBegin(GL2.GL_TRIANGLES);
			        gl.glVertex3f(-4,0,10);
			        gl.glVertex3f(-4,0,0);
			        gl.glVertex3f(-4,-3,0); 
			        gl.glEnd();
			    gl.glPopMatrix();
			    
			gl.glPopMatrix();
			gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	        gl.glPopMatrix();	
           
	
	}
	
	public void drawPrism(GL2 gl, GLU glu, float width, float length, float height){
	
		gl.glColor3f(0.45f,0.22f,0f);
		
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex3f(-width,-height,length);
		gl.glVertex3f(-width,-height,-length);
		gl.glVertex3f(width, -height, -length);
		gl.glVertex3f(width, -height, length);
	
		gl.glVertex3f(-width,height,length);
		gl.glVertex3f(-width,height,-length);
		gl.glVertex3f(width, height, -length);
		gl.glVertex3f(width, height, length);

		gl.glVertex3f(-width,-height,length);
		gl.glVertex3f(-width,height,length);
		gl.glVertex3f(width,height,length);
		gl.glVertex3f(width,-height,length);
		
		gl.glVertex3f(-width,-height,-length);
		gl.glVertex3f(-width,height,-length);
		gl.glVertex3f(width,height,-length);
		gl.glVertex3f(width,-height,-length);

		gl.glVertex3f(width,height,length);
		gl.glVertex3f(width,height,-length);
		gl.glVertex3f(width,-height,-length);
		gl.glVertex3f(width,-height,length);
		
		gl.glVertex3f(-width,height,length);
		gl.glVertex3f(-width,height,-length);
		gl.glVertex3f(-width,-height,-length);
		gl.glVertex3f(-width,-height,length);
		gl.glEnd();
		
	}
	
	public void drawTetrahedron(GL2 gl, GLU glu, float width, float length, float height){
		
		  gl.glBegin(GL2.GL_TRIANGLES);
          gl.glVertex3f(0f,0f,width/2);
          gl.glVertex3f( 0f,0f,-width/2);
          gl.glVertex3f(length,0,0); // bottom

          gl.glVertex3f(0,height,0);
          gl.glVertex3f(0f,0f,width/2);
          gl.glVertex3f(length,0,0); // front
          
          gl.glVertex3f(0,height,0);
          gl.glVertex3f(0f,0f,-width/2);
          gl.glVertex3f(length,0,0); // back

          gl.glVertex3f(0,height,0);
          gl.glVertex3f(0f,0f,width/2);
          gl.glVertex3f(0f,0f,-width/2); // side
          gl.glEnd();
		
	}
}
