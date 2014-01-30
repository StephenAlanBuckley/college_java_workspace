/*
 * HW 5
 * Jonathan Cole
 * Building
 */
package Buildings;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.Coletv;

import com.jogamp.opengl.util.texture.Texture;


public class ColeBuilding extends Building {
	
	private GLUquadric quadric; // to control properties of quadric-based objects
	
	private Texture grassTexture;    
	private Texture vinylTexture;
	private Texture carpetTexture;
	private Texture ceilingTexture;
	private Texture brickTexture;
	
	private static Coletv tv;

	
	public ColeBuilding(GL2 gl, GLU glu){
		quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // use true to generate texture coordinates

        tv = new Coletv(gl,glu);
        
        grassTexture     = setupTexture(gl, "colegrass.png");
        vinylTexture     = setupTexture(gl, "colevinylsmall.png");
        carpetTexture    = setupTexture(gl, "colecarpet.png");
        ceilingTexture    = setupTexture(gl, "coleceilingsmall.png");
        brickTexture    = setupTexture(gl, "colebrick.png");
	}
	public void draw(GL2 gl, GLU glu) {
	
		gl.glPushMatrix();
		gl.glTranslatef(50, 0, 70);
		tv.draw(gl,glu);
		gl.glPopMatrix();
		
		
		// roof outside
		gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        vinylTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
	        gl.glTexCoord2f(0f,0f); gl.glVertex3f(25,  30, 25);
	        gl.glTexCoord2f(0f,5f); gl.glVertex3f(25,  30, 75);
	        gl.glTexCoord2f(5f,5f); gl.glVertex3f(75,  30, 75);
	        gl.glTexCoord2f(5f,0f); gl.glVertex3f(75,  30, 25);
	        
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);
        
        //roof inside (ceiling upstairs)
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        ceilingTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
	        gl.glTexCoord2f(0f,0f); gl.glVertex3f(25,  30, 25);
	        gl.glTexCoord2f(5f,0f); gl.glVertex3f(75,  30, 25);
	        gl.glTexCoord2f(5f,5f); gl.glVertex3f(75,  30, 75);
	        gl.glTexCoord2f(0f,5f); gl.glVertex3f(25,  30, 75);
	        
	        
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);
  
		// left wall inside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
	        gl.glTexCoord2f(0f,0f); gl.glVertex3f(75,  0, 25);
	        gl.glTexCoord2f(12f,0f); gl.glVertex3f(75,  0, 75);
	        gl.glTexCoord2f(12f,12f); gl.glVertex3f(75,  30, 75);
	        gl.glTexCoord2f(0f,12f); gl.glVertex3f(75,  30, 25);
	        
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);
        
     // left wall outside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        vinylTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
	        gl.glTexCoord2f(0f,0f); gl.glVertex3f(75,  0, 25);
	        gl.glTexCoord2f(5f,0f); gl.glVertex3f(75,  30, 25);
	        gl.glTexCoord2f(5f,5f); gl.glVertex3f(75,  30, 75);
	        gl.glTexCoord2f(0f,5f); gl.glVertex3f(75,  0, 75); 
	        
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);
        
        // back wall outside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        vinylTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
	        gl.glTexCoord2f(0f,0f); gl.glVertex3f(25,  0, 75);
	        gl.glTexCoord2f(0f,5f); gl.glVertex3f(75,  0, 75);
	        gl.glTexCoord2f(5f,5f); gl.glVertex3f(75,  30, 75);
	        gl.glTexCoord2f(5f,0f); gl.glVertex3f(25,  30, 75);
	        
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);
        
     // back wall inside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
	        gl.glTexCoord2f(0f,0f); gl.glVertex3f(25,  0, 75);
	        gl.glTexCoord2f(0f,12f); gl.glVertex3f(25,  30, 75);
	        gl.glTexCoord2f(12f,12f); gl.glVertex3f(75,  30, 75);
	        gl.glTexCoord2f(12f,0f); gl.glVertex3f(75,  0, 75);
	        
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);

        // right wall outside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        vinylTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_t1 = {0,(15f/30f),0,0};
            float[] coef_s1 = {0,0,(20f/75f),0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f( 25,  0, 25);
                gl.glVertex3f(25,  0, 48);
                gl.glVertex3f(25, 7, 48);
                gl.glVertex3f( 25, 7, 25);
                
                gl.glVertex3f( 25,  0, 52);
                gl.glVertex3f(25,  0, 75);
                gl.glVertex3f(25, 7, 75);
                gl.glVertex3f( 25, 7, 52);
                
                gl.glVertex3f( 25,  7, 25);
                gl.glVertex3f(25,  7, 75);
                gl.glVertex3f(25, 30, 75);
                gl.glVertex3f( 25, 30, 25);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);
        
     // right wall inside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_t2 = {0,(12f/30f),0,0};
            float[] coef_s2 = {0,0,(12f/75f),0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s2, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t2, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f( 25,  0, 25);
                gl.glVertex3f( 25, 7, 25);
                gl.glVertex3f(25, 7, 48);
                gl.glVertex3f(25,  0, 48);
                
                gl.glVertex3f( 25,  0, 52);
                gl.glVertex3f( 25, 7, 52);
                gl.glVertex3f(25, 7, 75);
                gl.glVertex3f(25,  0, 75);
                
                gl.glVertex3f( 25,  7, 25);
                gl.glVertex3f( 25, 30, 25);
                gl.glVertex3f(25, 30, 75);
                gl.glVertex3f(25,  7, 75);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);

     // front wall inside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s3 = {(12f/50f),0,0,0};
            float[] coef_t3 = {0,(12f/30f),0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s3, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t3, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f( 25,  0, 25);
                gl.glVertex3f(48,  0, 25);
                gl.glVertex3f(48, 7, 25);
                gl.glVertex3f( 25, 7, 25);
                
                gl.glVertex3f( 52,  0, 25);
                gl.glVertex3f(75,  0, 25);
                gl.glVertex3f(75, 7, 25);
                gl.glVertex3f( 52, 7, 25);
                
                gl.glVertex3f( 25,  7, 25);
                gl.glVertex3f(75,  7, 25);
                gl.glVertex3f(75, 30, 25);
                gl.glVertex3f( 25, 30, 25);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);
        
     // front wall outside
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        vinylTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s5 = {0,0.16666f,0,0};
            float[] coef_t5 = {0.1f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s5, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t5, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f( 25,  0, 25);
                gl.glVertex3f( 25, 7, 25);
                gl.glVertex3f(48, 7, 25);
                gl.glVertex3f(48,  0, 25);
                
                gl.glVertex3f( 52,  0, 25);
                gl.glVertex3f( 52, 7, 25);
                gl.glVertex3f(75, 7, 25);
                gl.glVertex3f(75,  0, 25);
                
                gl.glVertex3f( 25,  7, 25);
                gl.glVertex3f( 25, 30, 25);
                gl.glVertex3f(75, 30, 25);
                gl.glVertex3f(75,  7, 25);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);
        
        
        // downstairs ceiling
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        ceilingTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s6 = {0,0,(10f/100f),0};
            float[] coef_t6 = {(10f/100f),0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s6, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t6, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f(70,  16, 75);
                gl.glVertex3f(25,  16, 75);
                gl.glVertex3f(25, 16, 25);
                gl.glVertex3f( 70, 16, 25);
                
                gl.glVertex3f(75,  16, 25);
                gl.glVertex3f(75,  16, 60);
                gl.glVertex3f(70, 16, 60);
                gl.glVertex3f( 70, 16, 25);
                
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);
        
     // upstairs floor
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        carpetTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s7 = {0,0,(10f/100f),0};
            float[] coef_t7 = {(10f/100f),0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s7, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t7, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f(70,  16, 75);
                gl.glVertex3f( 70, 16, 25);
                gl.glVertex3f(25, 16, 25);
                gl.glVertex3f(25,  16, 75);
                
                gl.glVertex3f(75,  16, 25);
                gl.glVertex3f( 70, 16, 25);
                gl.glVertex3f(70, 16, 60);
                gl.glVertex3f(75,  16, 60);
                
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_CULL_FACE);
        
        
        // carpet
        gl.glEnable(GL2.GL_TEXTURE_2D);
        carpetTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(25f,  0f, 25f);
            gl.glTexCoord2f(0f,10f); gl.glVertex3f(25f,  0f, 75f);
            gl.glTexCoord2f(10f,10f); gl.glVertex3f(75f,  0f, 75f);
            gl.glTexCoord2f(10f,0f); gl.glVertex3f(75f,  0f, 25f);
            

        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
     // grass
        gl.glEnable(GL2.GL_TEXTURE_2D);
        grassTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s4 = {0,0,(10f/100f),0};
            float[] coef_t4 = {(10f/100f),0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s4, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t4, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f(0,  0, 0);
                gl.glVertex3f(0,  0, 100);
                gl.glVertex3f(25, 0, 100);
                gl.glVertex3f( 25, 0, 0);
                
                gl.glVertex3f(75,  0, 0);
                gl.glVertex3f(75,  0, 100);
                gl.glVertex3f(100, 0, 100);
                gl.glVertex3f( 100, 0, 0);
                
                gl.glVertex3f(25,  0, 0);
                gl.glVertex3f(25,  0, 25);
                gl.glVertex3f(75, 0, 25);
                gl.glVertex3f( 75, 0, 0);
                
                gl.glVertex3f(25,  0, 75);
                gl.glVertex3f(25,  0, 100);
                gl.glVertex3f(75, 0, 100);
                gl.glVertex3f( 75, 0, 75);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        
        // stairs
        gl.glEnable(GL2.GL_TEXTURE_2D);
        carpetTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
        // horizontals
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  16f,75f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  16f, 75f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  16f, 73f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  16f, 73f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  14f,73f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  14f, 73f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  14f, 71f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  14f, 71f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  12f,71f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  12f, 71f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  12f, 69f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  12f, 69f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  10f,69f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  10f, 69f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  10f, 67f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  10f, 67f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  8f,67f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  8f, 67f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  8f, 65f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  8f, 65f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  6f,65f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  6f, 65f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  6f, 63f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  6f, 63f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  4f,63f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  4f, 63f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  4f, 61f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  4f, 61f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  2f,61f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  2f, 61f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  2f, 59f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  2f, 59f);
            
            // verticals
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  16f,73f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  16f, 73f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  14f, 73f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  14f, 73f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  14f,71f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  14f, 71f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  12f, 71f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  12f, 71f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  12f,69f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  12f, 69f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  10f, 69f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  10f, 69f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  10f,67f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  10f, 67f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  8f, 67f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  8f, 67f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  8f,65f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  8f, 65f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  6f, 65f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  6f, 65f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  6f,63f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  6f, 63f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  4f, 63f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  4f, 63f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  4f,61f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  4f, 61f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  2f, 61f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  2f, 61f);
            
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(75f,  2f,59f);
            gl.glTexCoord2f(0f,1f); gl.glVertex3f(70f,  2f, 59f);
            gl.glTexCoord2f(1f,1f); gl.glVertex3f(70f,  0f, 59f);
            gl.glTexCoord2f(1f,0f); gl.glVertex3f(75f,  0f, 59f);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
     // stair siding
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_t8 = {0,(12f/30f),0,0};
            float[] coef_s8 = {0,0,(12f/50f),0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s8, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t8, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f(70,  16, 75);
                gl.glVertex3f(70,  14, 75);
                gl.glVertex3f(70, 14, 73);
                gl.glVertex3f( 70, 16, 73);
                
                gl.glVertex3f(70,  14, 75);
                gl.glVertex3f(70,  12, 75);
                gl.glVertex3f(70, 12, 71);
                gl.glVertex3f( 70, 14, 71);
                
                gl.glVertex3f(70,  12, 75);
                gl.glVertex3f(70,  10, 75);
                gl.glVertex3f(70, 10, 69);
                gl.glVertex3f( 70, 12, 69);
                
                gl.glVertex3f(70,  10, 75);
                gl.glVertex3f(70,  8, 75);
                gl.glVertex3f(70, 8, 67);
                gl.glVertex3f( 70, 10, 67);
                
                gl.glVertex3f(70,  8, 75);
                gl.glVertex3f(70,  6, 75);
                gl.glVertex3f(70, 6, 65);
                gl.glVertex3f( 70, 8, 65);
                
                gl.glVertex3f(70,  6, 75);
                gl.glVertex3f(70,  4, 75);
                gl.glVertex3f(70, 4, 63);
                gl.glVertex3f( 70, 6, 63);
                
                gl.glVertex3f(70,  4, 75);
                gl.glVertex3f(70,  2, 75);
                gl.glVertex3f(70, 2, 61);
                gl.glVertex3f( 70, 4, 61);
                
                gl.glVertex3f(70,  2, 75);
                gl.glVertex3f(70,  0, 75);
                gl.glVertex3f(70, 0, 59);
                gl.glVertex3f( 70, 2, 59);
                
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        
     // table
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_t9 = {(12f/30f),(12f/30f),(12f/30f),0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_t9, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t9, 0);
            gl.glBegin(GL2.GL_QUADS);
	            gl.glVertex3f(45f,  3.2f, 45f);
	            gl.glVertex3f(45f,  3.2f, 55f);
	            gl.glVertex3f(55f,  3.2f, 55f);
	            gl.glVertex3f(55f,  3.2f, 45f);
                
	            gl.glVertex3f(45f,  3f, 45f);
	            gl.glVertex3f(45f,  3f, 55f);
	            gl.glVertex3f(55f,  3f, 55f);
	            gl.glVertex3f(55f,  3f, 45f);
	            
	            gl.glVertex3f(45f,  3f, 45f);
	            gl.glVertex3f(45f,  3.2f, 45f);
	            gl.glVertex3f(55f,  3.2f, 45f);
	            gl.glVertex3f(55f,  3f, 45f);
	            
	            gl.glVertex3f(45f,  3f, 55f);
	            gl.glVertex3f(45f,  3.2f, 55f);
	            gl.glVertex3f(55f,  3.2f, 55f);
	            gl.glVertex3f(55f,  3f, 55f);
	            
	            gl.glVertex3f(45f,  3f, 45f);
	            gl.glVertex3f(45f,  3.2f, 45f);
	            gl.glVertex3f(45f,  3.2f, 55f);
	            gl.glVertex3f(45f,  3f, 55f);
	            
	            gl.glVertex3f(55f,  3f, 45f);
	            gl.glVertex3f(55f,  3.2f, 45f);
	            gl.glVertex3f(55f,  3.2f, 55f);
	            gl.glVertex3f(55f,  3f, 55f);

            gl.glEnd();
            
            gl.glPushMatrix();
            gl.glTranslatef(46f,0f,46f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, .5, .5, 3, 10, 10);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glTranslatef(54f,0f,46f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, .5, .5, 3, 10, 10);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glTranslatef(46f,0f,54f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, .5, .5, 3, 10, 10);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glTranslatef(54f,0f,54f);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, .5, .5, 3, 10, 10);
            gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);

        

	}

}
