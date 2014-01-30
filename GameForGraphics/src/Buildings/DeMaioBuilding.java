package Buildings;
// William Ames, Brian DeMaio Fall 2010  Pyramid Building

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.DemaioMummy;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class DeMaioBuilding extends Building{
    private static GLUquadric quadric; // to control properties of quadric-based objects
    private static GLUquadric sphereQuadric; // for urns
   // private static SketchupModelJAXB mummy;
    private DemaioMummy mummy;
    private static Texture pyramidTexture; // pyramid brick
    private static Texture sandTexture;     // sand
    private static Texture urnTexture;     // urn
    private static Texture coffinTexture;     // coffin
    private TextRenderer renderer;

    
    public DeMaioBuilding(GL2 gl, GLU glu) {
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

        pyramidTexture = setupTexture(gl, "demaioPyramidTexture.png");
        sandTexture = setupTexture(gl, "demaioSand.png");
        urnTexture = setupTexture(gl, "demaioUrnTexture.png");
        coffinTexture = setupTexture(gl, "demaioCoffinTexture.png");
        
        mummy = new DemaioMummy(gl, glu);
       // mummy = new SketchupModelJAXB("demaioMummy.dae",gl, glu);
    	}
    }
    public void drawMoving(GL2 gl, GLU glu) {
         // Demaio Building Text
                gl.glPushMatrix();
                    gl.glRotated(180, 0, 1, 0);
                    gl.glTranslated(-40, 0, -10);
                    renderer.begin3DRendering();
                    renderer.setColor(.6f, .1f, 1, 1);
                    renderer.draw3D("The Mummy Returns", 0f, 0f,0, .25f*1f/9);
                    renderer.end3DRendering();
           gl.glPopMatrix();
    }


    public void draw(GL2 gl, GLU glu) {

  	  
       

    	
        //sand
        gl.glEnable(GL2.GL_TEXTURE_2D);
        sandTexture.bind();
        gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,20f); gl.glVertex3f(0,  0f, 0);
            gl.glTexCoord2f(80f,20f); gl.glVertex3f( 100,  0f, 0);
            gl.glTexCoord2f(80f,0f); gl.glVertex3f( 100, 0f, 100);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0f, 100);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);

        
        //front wall, with doorway
    
        gl.glEnable(GL2.GL_TEXTURE_2D);
        pyramidTexture.bind();
        gl.glBegin(GL2.GL_TRIANGLES);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(14.667f,  7f, 85.333f);
            gl.glTexCoord2f(8f,0f); gl.glVertex3f(85.333f,  7f, 85.333f);
            gl.glTexCoord2f(4f,4f); gl.glVertex3f(50,  60f, 50);
        gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
    
    //front bottom left
    gl.glEnable(GL2.GL_TEXTURE_2D);
    pyramidTexture.bind();
    gl.glBegin(GL2.GL_QUADS);
        gl.glTexCoord2f(.333f,1f); gl.glVertex3f(14.667f,  7f, 85.333f);
        gl.glTexCoord2f(2.667f,1f); gl.glVertex3f(46f,  7f, 85.333f);
        gl.glTexCoord2f(2.667f,0.333f); gl.glVertex3f(46f,  0f, 90f);
        gl.glTexCoord2f(0f,0.333f); gl.glVertex3f(10f,  0f, 90f);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
    
    //front bottom right
    gl.glEnable(GL2.GL_TEXTURE_2D);
    pyramidTexture.bind();
    gl.glBegin(GL2.GL_QUADS);
        gl.glTexCoord2f(0f,0.333f); gl.glVertex3f(54f,  0f, 90f);
        gl.glTexCoord2f(0f,1f); gl.glVertex3f(54f,  7f, 85.333f);
        gl.glTexCoord2f(2.333f,1f); gl.glVertex3f(85.333f,  7f, 85.333f);
        gl.glTexCoord2f(2.667f,0.333f); gl.glVertex3f(90f,  0f, 90f);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
    
    
	//right wall
    gl.glEnable(GL2.GL_TEXTURE_2D);
    pyramidTexture.bind();
    gl.glBegin(GL2.GL_TRIANGLES);
        gl.glTexCoord2f(0f,0f); gl.glVertex3f(90,  0f, 10);
        gl.glTexCoord2f(8f,0f); gl.glVertex3f(90,  0f, 90);
        gl.glTexCoord2f(4f,4f); gl.glVertex3f(50,  60f, 50);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
    
  //left wall
    gl.glEnable(GL2.GL_TEXTURE_2D);
    pyramidTexture.bind();
    gl.glBegin(GL2.GL_TRIANGLES);
        gl.glTexCoord2f(0f,0f); gl.glVertex3f(10,  0f, 10);
        gl.glTexCoord2f(8f,0f); gl.glVertex3f(10,  0f, 90);
        gl.glTexCoord2f(4f,4f); gl.glVertex3f(50,  60f, 50);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);

    
    //back wall, with doorway

    gl.glEnable(GL2.GL_TEXTURE_2D);
    pyramidTexture.bind();
    gl.glBegin(GL2.GL_TRIANGLES);
        gl.glTexCoord2f(0f,0f); gl.glVertex3f(14.667f,  7f, 14.667f);
        gl.glTexCoord2f(8f,0f); gl.glVertex3f(85.333f,  7f, 14.667f);
        gl.glTexCoord2f(4f,4f); gl.glVertex3f(50,  60f, 50);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);

    //back right (as viewed from outside)
    gl.glEnable(GL2.GL_TEXTURE_2D);
    pyramidTexture.bind();
    gl.glBegin(GL2.GL_QUADS);
    	gl.glTexCoord2f(.333f,1f); gl.glVertex3f(14.667f,  7f, 14.667f);
    	gl.glTexCoord2f(2.667f,1f); gl.glVertex3f(46f,  7f, 14.667f);
    	gl.glTexCoord2f(2.667f,0.333f); gl.glVertex3f(46f,  0f, 10f);
    	gl.glTexCoord2f(0f,0.333f); gl.glVertex3f(10f,  0f, 10f);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);

  //back left (as viewed from outside)
    gl.glEnable(GL2.GL_TEXTURE_2D);
    pyramidTexture.bind();
    gl.glBegin(GL2.GL_QUADS);
    	gl.glTexCoord2f(0f,0.333f); gl.glVertex3f(54f,  0f, 10f);
    	gl.glTexCoord2f(0f,1f); gl.glVertex3f(54f,  7f, 14.667f);
    	gl.glTexCoord2f(2.333f,1f); gl.glVertex3f(85.333f,  7f, 14.667f);
    	gl.glTexCoord2f(2.667f,0.333f); gl.glVertex3f(90f,  0f, 10f);
    gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);

    
    //urns
    drawUrn(gl, glu, 30f, 40f);
    drawUrn(gl, glu, 30f, 30f);
    drawUrn(gl, glu, 25f, 40f);
    drawUrn(gl, glu, 70f, 60f);
    drawUrn(gl, glu, 70f, 50f);
    
    //coffin
    drawCoffin(gl, glu, 60f, 60f);
    gl.glPushMatrix();
    	gl.glScalef(.5f, .5f, .5f);
    	gl.glTranslatef(60f, 0, 50f);
    	gl.glRotatef(-90, 0, 1, 0);
    	mummy.draw(gl, glu);
    gl.glPopMatrix();
    }
    
    private void drawUrn(GL2 gl, GLU glu, float xCoord, float zCoord){
        //urn sphere
        gl.glEnable(GL2.GL_TEXTURE_2D);
        urnTexture.bind();
        gl.glPushMatrix();
            gl.glTranslatef(xCoord, 2, zCoord); // 2 feet off of ground
            glu.gluSphere(sphereQuadric, 2., 10, 10);
        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //urn top
        gl.glEnable(GL2.GL_TEXTURE_2D);
        urnTexture.bind();
        gl.glPushMatrix();
        	gl.glTranslatef(xCoord, 3.5f, zCoord);
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            glu.gluCylinder(quadric, .8f, 1f, 2., 10, 1);
        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);
    }
    
    private void drawCoffin(GL2 gl, GLU glu, float xCoord, float zCoord){
    	//draw the top of the coffin using traingle fan, and texture it
    	 gl.glEnable(GL2.GL_TEXTURE_2D);
    	    coffinTexture.bind();
    	    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
    	    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
    	        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
    	        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
    	        float[] coef_s = {.091f,0f,0f,0f};
    	        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
    	        float[] coef_t = {0f,0f,-.046f,0};
    	        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

    	    gl.glBegin(GL2.GL_TRIANGLE_FAN);
           		gl.glVertex3f(xCoord,  2f, zCoord);
           		gl.glVertex3f(xCoord-3f,  2f, zCoord+2f);
           		gl.glVertex3f(xCoord-2f,  2f, zCoord+5f);
            	gl.glVertex3f(xCoord+2f,  2f, zCoord+5f);
            	gl.glVertex3f(xCoord+3f,  2f, zCoord+2f);
            	gl.glVertex3f(xCoord+2f,  2f, zCoord-10f);
            	gl.glVertex3f(xCoord-2f,  2f, zCoord-10f);
            	gl.glVertex3f(xCoord-3f,  2f, zCoord+2f);
           gl.glEnd();
       gl.glDisable(GL2.GL_TEXTURE_2D);
       gl.glDisable(GL2.GL_TEXTURE_GEN_S);
       gl.glDisable(GL2.GL_TEXTURE_GEN_T);
       
       //draw the base of the coffin using a quad strip
       gl.glColor3f(.673f,.465f,.206f);
       gl.glBegin(GL2.GL_QUAD_STRIP);
  		gl.glVertex3f(xCoord-3f,  2f, zCoord+2f);
  		gl.glVertex3f(xCoord-3f,  0f, zCoord+2f);
  		gl.glVertex3f(xCoord-2f,  2f, zCoord+5f);
  		gl.glVertex3f(xCoord-2f,  0f, zCoord+5f);
  		gl.glVertex3f(xCoord+2f,  2f, zCoord+5f);
  		gl.glVertex3f(xCoord+2f,  0f, zCoord+5f);
  		gl.glVertex3f(xCoord+3f,  2f, zCoord+2f);
  		gl.glVertex3f(xCoord+3f,  0f, zCoord+2f);
  		gl.glVertex3f(xCoord+2f,  2f, zCoord-10f);
  		gl.glVertex3f(xCoord+2f,  0f, zCoord-10f);
  		gl.glVertex3f(xCoord-2f,  2f, zCoord-10f);
  		gl.glVertex3f(xCoord-2f,  0f, zCoord-10f);
  		gl.glVertex3f(xCoord-3f,  2f, zCoord+2f);
  		gl.glVertex3f(xCoord-3f,  0f, zCoord+2f);
   	gl.glEnd();
    }
}