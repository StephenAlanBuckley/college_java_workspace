package Buildings;
// William Ames Fall 2010  Texture Demo

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import Weapons.Turret;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class GolderBuilding extends Building{
    private static GLUquadric quadric; // to control properties of quadric-based objects
    private static GLUquadric sphereQuadric; // for Signorile's head
    private static Texture brickTexture;     // bricks
    private static Texture cobbleTexture;     // cobblestone
 //   private Texture woodTexture;     // wood
    private static Texture wood2Texture;     // wood
    private static Texture carpTexture;     // carpet
    private static Texture grassTexture;     // grass
    private static Texture chromeTexture;     // grass
    private static Texture fabTexture;     // grass
  //  private Texture marbleTexture; // marble
    private static Texture stained1; // stained glass
    private static Texture stained2; // stained glass
    private TextRenderer renderer;

    
    public GolderBuilding(GL2 gl, GLU glu) {
    	renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
    	
    	if(quadric==null){
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, true);        // use true to generate texture coordinates

        sphereQuadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(sphereQuadric, GLU.GLU_FILL);
        glu.gluQuadricNormals  (sphereQuadric, GLU.GLU_NONE);
        glu.gluQuadricTexture  (sphereQuadric, true); // for Signorile's head

        brickTexture     = setupTexture(gl, "Golderbricks.png");
        cobbleTexture = setupTexture(gl, "Goldercobble.png");
       // woodTexture = setupTexture(gl, "Golderwood.png");
        wood2Texture = setupTexture(gl, "Golderwood2.png");
        grassTexture = setupTexture(gl, "Goldergrass.png");
        carpTexture = setupTexture(gl, "Goldercarpet.png");
        stained1 = setupTexture(gl, "Golderstained1.png");
        stained2 = setupTexture(gl, "Golderstained2.png");
        chromeTexture = setupTexture(gl, "Golderchrome.png");
        fabTexture = setupTexture(gl, "Golderfab.png");
    	}

    }
    public void drawMoving(GL2 gl, GLU glu) {
        // Golder Building Text
                gl.glPushMatrix();
                    gl.glRotated(0, 0, 1, 0);
                    gl.glTranslated(40, 20, 80.5);
                    renderer.begin3DRendering();
                    renderer.setColor(1, 1, 1, 1);
                    renderer.draw3D("Kingdom of Heaven", 0f, 0f,0, .25f*1f/7);
                    renderer.end3DRendering();
            gl.glPopMatrix();

    }


    public void draw(GL2 gl, GLU glu) {
        
    	 ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
    	// GRASS AND FLOORS
    	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
        

    	
    	
        
      
    	
    	
    	
    	
// grass
        
        gl.glEnable(GL2.GL_TEXTURE_2D);
        grassTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,20f); gl.glVertex3f(0,  -.1f, 0);
            gl.glTexCoord2f(80f,20f); gl.glVertex3f( 100,  -.1f, 0);
            gl.glTexCoord2f(80f,0f); gl.glVertex3f( 100, -0.1f, 100);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, -0.1f, 100);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
    //floor
        gl.glEnable(GL2.GL_TEXTURE_2D);
            cobbleTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(0f,20f); gl.glVertex3f(20,  0, 20);
                gl.glTexCoord2f(40f,20f); gl.glVertex3f( 80,  0, 20);
                gl.glTexCoord2f(40f,0f); gl.glVertex3f( 80, 0, 90);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f(20, 0, 90);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        gl.glEnable(GL2.GL_TEXTURE_2D);
        carpTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,20f); gl.glVertex3f(25,  .1f, 25);
            gl.glTexCoord2f(8f,20f); gl.glVertex3f( 75,  .1f, 25);
            gl.glTexCoord2f(8f,0f); gl.glVertex3f( 75, .1f, 75);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(25, .1f, 75);
        gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
    
    
    ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
	// FRONT WALL
	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
    
    
    
    //Front
  
    
    gl.glEnable(GL2.GL_TEXTURE_2D);
    brickTexture.bind();
    gl.glBegin(GL2.GL_QUADS);
        gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  15, 80);
        gl.glTexCoord2f(0f,20f); gl.glVertex3f( 20,  40, 80);
        gl.glTexCoord2f(15f,20f); gl.glVertex3f( 80, 40,80);
        gl.glTexCoord2f(15f,0f); gl.glVertex3f(80, 15, 80);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
    
	
	
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    brickTexture.bind();
	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        float[] coef_s = {.5f,0,0,0};
	        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	        float[] coef_t = {0,1f,0,0};
	        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	        gl.glBegin(GL2.GL_QUADS);
	            gl.glVertex3f( 20,  0, 80);
	            gl.glVertex3f(20,  20, 80);
	            gl.glVertex3f( 35, 20,80);
	            gl.glVertex3f( 35, 0, 80);
	        gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	  brickTexture.bind();
	  gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	  gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	      gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	      gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	      coef_s = new float[] {.5f,0,0,0};
	      gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	      coef_t = new float[] {0,1f,0,0};
	      gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	      gl.glBegin(GL2.GL_QUADS);
	          gl.glVertex3f( 65,  0, 80);
	          gl.glVertex3f(65,  20, 80);
	          gl.glVertex3f( 80, 20,80);
	          gl.glVertex3f( 80, 0, 80);
	      gl.glEnd();
	  gl.glDisable(GL2.GL_TEXTURE_2D);
	  gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	  gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	  
	  gl.glEnable(GL2.GL_TEXTURE_2D);
	brickTexture.bind();
	gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	    gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	    gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	    coef_s = new float[] {.5f,0,0,0};
	    gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	    coef_t = new float[] {0,1f,0,0};
	    gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	    gl.glBegin(GL2.GL_QUADS);
	        gl.glVertex3f( 55,  0, 80);
	        gl.glVertex3f(55,  20, 80);
	        gl.glVertex3f( 45, 20,80);
	        gl.glVertex3f( 45, 0, 80);
	    gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	

	//WINDOWS
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	stained1.bind();
	gl.glPushMatrix();
		gl.glTranslated(50,40,80.1);
		glu.gluDisk(quadric, 0, 7,10, 10);
	gl.glPopMatrix();
	gl.glPushMatrix();
		gl.glTranslated(50,40,79.9);
		glu.gluDisk(quadric, 0, 7,10, 10);
	gl.glPopMatrix();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	stained2.bind();
	gl.glPushMatrix();
		gl.glTranslated(40,15,80.1);
		glu.gluPartialDisk(quadric, 0,5, 10, 10, 270,180);
	gl.glPopMatrix();
	gl.glPushMatrix();
		gl.glTranslated(40,15,79.9);
		glu.gluPartialDisk(quadric, 0,5, 10, 10, 270,180);
	gl.glPopMatrix();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	stained2.bind();
	gl.glPushMatrix();
		gl.glTranslated(60,15,80.1);
		glu.gluPartialDisk(quadric, 0,5, 10, 10, 270,180);
	gl.glPopMatrix();
	gl.glPushMatrix();
		gl.glTranslated(60,15,79.9);
		glu.gluPartialDisk(quadric, 0,5, 10, 10, 270,180);
	gl.glPopMatrix();
	gl.glDisable(GL2.GL_TEXTURE_2D);
    
	
	//front triangle thing
	gl.glEnable(GL2.GL_TEXTURE_2D);
	brickTexture.bind();
		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(20f, 40f, 80f);    // lower left vertex
		gl.glTexCoord2f(24f,0f); gl.glVertex3f(80f, 40f, 80f);    // lower right vertex
		gl.glTexCoord2f(12f,12); gl.glVertex3f( 50f, 60f, 80f);    // upper vertex
    gl.glEnd();  
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	
    ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
	// LEFT WALL
	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
    
    
    
        //left wall
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  0, 80);
            gl.glTexCoord2f(0f,20f); gl.glVertex3f( 20,  40, 80);
            gl.glTexCoord2f(15f,20f); gl.glVertex3f( 20, 40, 20);
            gl.glTexCoord2f(15f,0f); gl.glVertex3f(20, 0, 20);
        gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
 
    
    gl.glEnable(GL2.GL_TEXTURE_2D);
	stained1.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(20.1f,  10, 30);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 20.1f,  35, 30);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 20.1f, 35, 40);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(20.1f, 10, 40);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(19.9f,  10, 30);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 19.9f,  35, 30);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 19.9f, 35, 40);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(19.9f, 10, 40);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	stained2.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(20.1f,  10, 55);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 20.1f,  35, 55);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 20.1f, 35, 65);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(20.1f, 10, 65);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(19.9f,  10, 55);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 19.9f,  35, 55);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 19.9f, 35, 65);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(19.9f, 10, 65);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
    
    
    
    
	 ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
	// BACK WALL
	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
    
    
    
    
    
    
  //back wall
	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    brickTexture.bind();
	    gl.glBegin(GL2.GL_QUADS);
	        gl.glTexCoord2f(0f,0f); gl.glVertex3f(20,  0, 20);
	        gl.glTexCoord2f(0f,20f); gl.glVertex3f( 20,  40, 20);
	        gl.glTexCoord2f(15f,20f); gl.glVertex3f( 80, 40, 20);
	        gl.glTexCoord2f(15f,0f); gl.glVertex3f(80, 0, 20);
	    gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
    chromeTexture.bind();
    gl.glBegin(GL2.GL_QUADS);
        gl.glTexCoord2f(0f,0f); gl.glVertex3f(49,  5, 20.1f);
        gl.glTexCoord2f(0f,20f); gl.glVertex3f( 49,  35, 20.1f);
        gl.glTexCoord2f(1f,20f); gl.glVertex3f( 51, 35, 20.1f);
        gl.glTexCoord2f(1f,0f); gl.glVertex3f(51, 5, 20.1f);
    gl.glEnd();
    gl.glBegin(GL2.GL_QUADS);
    	gl.glTexCoord2f(0f,0f); gl.glVertex3f(43,  28, 20.1f);
    	gl.glTexCoord2f(0f,1f); gl.glVertex3f( 43,  26, 20.1f);
    	gl.glTexCoord2f(10f,1f); gl.glVertex3f( 57, 26, 20.1f);
    	gl.glTexCoord2f(10f,0f); gl.glVertex3f(57, 28, 20.1f);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
    
	
	
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	stained2.bind();
	gl.glPushMatrix();
		gl.glTranslated(50,45,20.1);
		glu.gluDisk(quadric, 0, 7,10, 10);
	gl.glPopMatrix();
	gl.glPushMatrix();
		gl.glTranslated(50,45,19.9);
		glu.gluDisk(quadric, 0, 7,10, 10);
	gl.glPopMatrix();
	gl.glDisable(GL2.GL_TEXTURE_2D);
		
    
    ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
	// RIGHT WALL
	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
    

//right wall
	gl.glEnable(GL2.GL_TEXTURE_2D);
	brickTexture.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(80,  0, 20);
	    gl.glTexCoord2f(0f,20f); gl.glVertex3f( 80,  40, 20);
	    gl.glTexCoord2f(15f,20f); gl.glVertex3f( 80, 40, 80);
	    gl.glTexCoord2f(15f,0f); gl.glVertex3f(80, 0, 80);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	stained1.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(79.9f,  10, 30);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 79.9f,  35, 30);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 79.9f, 35, 40);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(79.9f, 10, 40);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(80.1f,  10, 30);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 80.1f,  35, 30);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 80.1f, 35, 40);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(80.1f, 10, 40);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	stained2.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(79.9f,  10, 55);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 79.9f,  35, 55);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 79.9f, 35, 65);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(79.9f, 10, 65);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(80.1f,  10, 55);
	    gl.glTexCoord2f(0f,3f); gl.glVertex3f( 80.1f,  35, 55);
	    gl.glTexCoord2f(1f,3f); gl.glVertex3f( 80.1f, 35, 65);
	    gl.glTexCoord2f(1f,0f); gl.glVertex3f(80.1f, 10, 65);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	 ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
	// Ceiling
	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
    
	
	//right ceiling
	gl.glEnable(GL2.GL_TEXTURE_2D);
	brickTexture.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,10f); gl.glVertex3f(50,  60, 20);
	    gl.glTexCoord2f(15f,10f); gl.glVertex3f( 80,  40, 20);
	    gl.glTexCoord2f(15f,0f); gl.glVertex3f( 80, 40, 80);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(50, 60, 80);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	//left ceiling
	gl.glEnable(GL2.GL_TEXTURE_2D);
	brickTexture.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,10f); gl.glVertex3f(50,  60, 20);
	    gl.glTexCoord2f(15f,10f); gl.glVertex3f( 20,  40, 20);
	    gl.glTexCoord2f(15f,0f); gl.glVertex3f( 20, 40, 80);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(50, 60, 80);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
    
	//back triangle thing
	gl.glEnable(GL2.GL_TEXTURE_2D);
	brickTexture.bind();
		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(20f, 40f, 20f);    // lower left vertex
		gl.glTexCoord2f(24f,0f); gl.glVertex3f(80f, 40f, 20f);    // lower right vertex
		gl.glTexCoord2f(12f,12); gl.glVertex3f( 50f, 60f, 20f);    // upper vertex
    gl.glEnd();  
	gl.glDisable(GL2.GL_TEXTURE_2D);	

	
	 ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
	//Cross on Roof
	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
    
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
    chromeTexture.bind();
    gl.glBegin(GL2.GL_QUADS);
        gl.glTexCoord2f(0f,0f); gl.glVertex3f(49,  59, 80.1f);
        gl.glTexCoord2f(0f,20f); gl.glVertex3f( 49,  75, 80.1f);
        gl.glTexCoord2f(1f,20f); gl.glVertex3f( 51, 75, 80.1f);
        gl.glTexCoord2f(1f,0f); gl.glVertex3f(51, 59, 80.1f);
    gl.glEnd();
    gl.glBegin(GL2.GL_QUADS);
    	gl.glTexCoord2f(0f,0f); gl.glVertex3f(46,  69, 80.1f);
    	gl.glTexCoord2f(0f,1f); gl.glVertex3f( 46,  71, 80.1f);
    	gl.glTexCoord2f(10f,1f); gl.glVertex3f( 54, 71, 80.1f);
    	gl.glTexCoord2f(10f,0f); gl.glVertex3f(54, 69, 80.1f);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
	
    
    ////////////////////////// ////////////////////////// ////////////////////////// //////////////////////////   	
	// PEWS AND ALTAR
	 ////////////////////////// ////////////////////////// ////////////////////////// ////////////////////////// 	
    
    
	float x = 50;
	float length= 15;
	float z= 50;
	
	for(x=30; x<=55; x=x+25){
		for(z=50; z<=70; z=z+4){
	gl.glEnable(GL2.GL_TEXTURE_2D);
	wood2Texture.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 2f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 2f, z+2);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 2f, z+2);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 2f, z);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 0f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 2f, z);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 2f, z);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 0f, z);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 0f, z+2);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 4f, z+2);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 4f, z+2);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 0f, z+2);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x, 0f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x, 2f, z);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 2f, z+2);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 0f, z+2);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 0f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 2f, z);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x+length, 2f, z+2);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x+length, 0f, z+2);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
    }
	}
    
	x= 37.5f;
	length= 25;
	z= 30;
	
	
	
	
	gl.glEnable(GL2.GL_TEXTURE_2D);
	fabTexture.bind();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 5f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 5f, z+5);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 5f, z+5);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 5f, z);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 0f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 5f, z);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 5f, z);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 0f, z);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 0f, z+5);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 5f, z+5);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 5f, z+5);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 0f, z+5);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x, 0f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x, 5f, z);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x, 5f, z+5);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x, 0f, z+5);
	gl.glEnd();
	gl.glBegin(GL2.GL_QUADS);
	    gl.glTexCoord2f(0f,1f); gl.glVertex3f(x+length, 0f, z);
	    gl.glTexCoord2f(2f,1f); gl.glVertex3f(x+length, 5f, z);
	    gl.glTexCoord2f(2f,0f); gl.glVertex3f(x+length, 5f, z+5);
	    gl.glTexCoord2f(0f,0f); gl.glVertex3f(x+length, 0f, z+5);
	gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
	
	
	
	
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}