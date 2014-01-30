package Buildings;
// William Ames Fall 2010  Texture Demo

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.PerryDresser;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class PerryBuilding extends Building
{
    private static GLUquadric quadric; // to control properties of quadric-based objects
    private static Texture brickTexture;     // bricks
    private static Texture wallPaper; // for inside of building
    private static Texture picture;
    private static Texture floor;
    private static Texture ceiling;
    private static PerryDresser myDresser;
    private TextRenderer renderer;

    
    public PerryBuilding(GL2 gl, GLU glu) 
    {
        renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
    	//Edit by Melvin Ross
    	if(quadric==null){
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // use true to generate texture coordinates

        myDresser = new PerryDresser(gl, glu);
        brickTexture     = setupTexture(gl, "perryBrick.png");
        wallPaper = setupTexture(gl, "perryWallpaper.png");
        picture = setupTexture(gl, "perryPicture.png");
        floor = setupTexture(gl, "perryFloor.png");
        ceiling = setupTexture(gl, "perryCeiling.png");
    	}
    }
    
    public void drawMoving(GL2 gl, GLU glu) {
                // Perry Building Text
        gl.glPushMatrix();
            gl.glRotated(0, 0, 1, 0);
            gl.glTranslated(42, 10, 40.5);
            renderer.begin3DRendering();
            renderer.setColor(0, 0, 1, 1);
            renderer.draw3D("The da Vinci Code", 0f, 0f,0, .25f*1f/9);
            renderer.end3DRendering();
     gl.glPopMatrix();

    }

    public void draw(GL2 gl, GLU glu) 
    {       

    	
    	gl.glPushMatrix();
    	gl.glRotatef(-90, 0, 1, 0);
    	gl.glTranslatef(22f,1f,-19f);
    	myDresser.draw(gl, glu);
    	gl.glPopMatrix();
    	
      gl.glPushMatrix();
       gl.glTranslatef(50, 0, 50); // Ames change, shift range to x&z in 0..100
        //Grass
        gl.glColor3f(0f, 1f, 0f);
            gl.glPushMatrix();
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            gl.glRectf(-50,-50, 50, 50);
        gl.glPopMatrix();
      
        //table
        gl.glColor3f(.66f, .168f, .168f);
            gl.glPushMatrix();
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            gl.glTranslatef(0, 20, 4);
            glu.gluDisk(quadric, 0, 5, 10, 10);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            gl.glTranslatef(3, 16, 0);
            glu.gluCylinder(quadric,.25,.25, 4,10,1);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            gl.glTranslatef(3, 24, 0);
            glu.gluCylinder(quadric,.25,.25, 4,10,1);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            gl.glTranslatef(-3, 16, 0);
            glu.gluCylinder(quadric,.25,.25, 4,10,1);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
            gl.glTranslatef(-3, 24, 0);
            glu.gluCylinder(quadric,.25,.25, 4,10,1);
            gl.glPopMatrix();
        
        //floor
        gl.glEnable(GL2.GL_TEXTURE_2D);
            floor.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(0f,1f); gl.glVertex3f(-20, 0.01f, -10);
                gl.glTexCoord2f(1f,1f); gl.glVertex3f( 20, 0.01f, -10);
                gl.glTexCoord2f(1f,0f); gl.glVertex3f( 20, 0.01f, -30);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f(-20, 0.01f, -30);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //ceiling outside
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gl.glEnable(GL2.GL_CULL_FACE);
            brickTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(5f,0f); gl.glVertex3f(-20, 30, -10);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f( 20, 30, -10);
                gl.glTexCoord2f(0f,5f); gl.glVertex3f( 20, 30, -30);
                gl.glTexCoord2f(5f,5f); gl.glVertex3f(-20, 30, -30);
            gl.glEnd();
            gl.glDisable(GL2.GL_CULL_FACE);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //ceiling inside
        gl.glEnable(GL2.GL_TEXTURE_2D);
            ceiling.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(0f,1f); gl.glVertex3f(-20, 30, -10);
                gl.glTexCoord2f(1f,1f); gl.glVertex3f( 20, 30, -10);
                gl.glTexCoord2f(1f,0f); gl.glVertex3f( 20, 30, -30);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f(-20, 30, -30);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //Left wall inside
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gl.glEnable(GL2.GL_CULL_FACE);
        wallPaper.bind();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,.4f); gl.glVertex3f(-20,  0, -10);
            gl.glTexCoord2f(.4f,.4f); gl.glVertex3f(-20,  0, -30);
            gl.glTexCoord2f(.4f,0f); gl.glVertex3f(-20, 30, -30);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(-20, 30, -10);
            gl.glEnd();
         gl.glDisable(GL2.GL_CULL_FACE);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //Left wall outside
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,5.5f); gl.glVertex3f(-20,  0, -10);
            gl.glTexCoord2f(5.5f,5.5f); gl.glVertex3f(-20,  0, -30);
            gl.glTexCoord2f(5.5f,0f); gl.glVertex3f(-20, 30, -30);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(-20, 30, -10);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);

        //picture
        gl.glEnable(GL2.GL_TEXTURE_2D);
            picture.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(0f,1f); gl.glVertex3f(-19.9f,  12, -18);
                gl.glTexCoord2f(1f,1f); gl.glVertex3f(-19.9f,  12, -22);
                gl.glTexCoord2f(1f,0f); gl.glVertex3f(-19.9f, 18, -22);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f(-19.9f, 18, -18);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //Front wall outside and door
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gl.glEnable(GL2.GL_CULL_FACE);
        brickTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s = {.5f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            float[] coef_t = {0,.25f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glBegin(GL2.GL_QUADS);
            gl.glVertex3f(-20,  0, -10);
            gl.glVertex3f(-2,  0, -10);
            gl.glVertex3f(-2, 30, -10);
            gl.glVertex3f(-20, 30, -10);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glVertex3f(-2,  7, -10);
            gl.glVertex3f(2,  7, -10);
            gl.glVertex3f(2, 30, -10);
            gl.glVertex3f(-2, 30, -10);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glVertex3f(2,  0, -10);
            gl.glVertex3f(20,  0, -10);
            gl.glVertex3f(20, 30, -10);
            gl.glVertex3f(2, 30, -10);
            gl.glEnd();
        gl.glDisable(GL2.GL_CULL_FACE);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        
        //Front wall inside and door
        wallPaper.bind();
        gl.glEnable(GL2.GL_TEXTURE_2D);
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,.45f);gl.glVertex3f(-20,  0, -10);
            gl.glTexCoord2f(.45f,.45f);gl.glVertex3f(-2,  0, -10);
            gl.glTexCoord2f(.45f,0f);gl.glVertex3f(-2, 30, -10);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(-20, 30, -10);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,.1f);gl.glVertex3f(-2,  7, -10);
            gl.glTexCoord2f(.1f,.1f);gl.glVertex3f(2,  7, -10);
            gl.glTexCoord2f(.1f,0f);gl.glVertex3f(2, 30, -10);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(-2, 30, -10);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,.45f);gl.glVertex3f(2,  0, -10);
            gl.glTexCoord2f(.45f,.45f);gl.glVertex3f(20,  0, -10);
            gl.glTexCoord2f(.45f,0f);gl.glVertex3f(20, 30, -10);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(2, 30, -10);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        
        //Right wall outside 
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gl.glEnable(GL2.GL_CULL_FACE);
        brickTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,3f);gl.glVertex3f(20,  0, -10);
            gl.glTexCoord2f(3f,3f);gl.glVertex3f(20,  0, -18);
            gl.glTexCoord2f(3f,0f);gl.glVertex3f(20, 30, -18);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(20, 30, -10);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,2f);gl.glVertex3f(20,  10, -18);
            gl.glTexCoord2f(2f,2f);gl.glVertex3f(20,  10, -22);
            gl.glTexCoord2f(2f,0f);gl.glVertex3f(20, 30, -22);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(20, 30, -18);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,3f);gl.glVertex3f(20,  0, -22);
            gl.glTexCoord2f(3f,3f);gl.glVertex3f(20,  0, -30);
            gl.glTexCoord2f(3f,0f);gl.glVertex3f(20, 30, -30);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(20, 30, -22);
            gl.glEnd();
        gl.glDisable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        
        //Right wall inside
        gl.glEnable(GL2.GL_TEXTURE_2D);
        wallPaper.bind();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,.4f);gl.glVertex3f(20,  0, -10);
            gl.glTexCoord2f(.4f,.4f);gl.glVertex3f(20,  0, -18);
            gl.glTexCoord2f(.4f,0f);gl.glVertex3f(20, 30, -18);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(20, 30, -10);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,.2f);gl.glVertex3f(20,  10, -18);
            gl.glTexCoord2f(.2f,.2f);gl.glVertex3f(20,  10, -22);
            gl.glTexCoord2f(.2f,0f);gl.glVertex3f(20, 30, -22);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(20, 30, -18);
            gl.glEnd();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,.4f);gl.glVertex3f(20,  0, -22);
            gl.glTexCoord2f(.4f,.4f);gl.glVertex3f(20,  0, -30);
            gl.glTexCoord2f(.4f,0f);gl.glVertex3f(20, 30, -30);
            gl.glTexCoord2f(0f,0f);gl.glVertex3f(20, 30, -22);
            gl.glEnd();
       gl.glEnable(GL2.GL_TEXTURE_2D);
        
        //Back wall inside
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gl.glEnable(GL2.GL_CULL_FACE);
            wallPaper.bind();
            gl.glBegin(GL2.GL_QUADS);
                gl.glTexCoord2f(0f,1f); gl.glVertex3f(-20,  0, -30);
                gl.glTexCoord2f(1f,1f); gl.glVertex3f(20,  0, -30);
                gl.glTexCoord2f(1f,0f); gl.glVertex3f(20 , 30, -30);
                gl.glTexCoord2f(0f,0f); gl.glVertex3f(-20, 30, -30);
            gl.glEnd();
        gl.glDisable(GL2.GL_CULL_FACE);
        gl.glDisable(GL2.GL_TEXTURE_2D);
    
        //Back wall outside 
        gl.glEnable(GL2.GL_TEXTURE_2D);
            brickTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
            gl.glTexCoord2f(0f,5f); gl.glVertex3f(-20,  0, -30);
            gl.glTexCoord2f(5f,5f); gl.glVertex3f(20,  0, -30);
            gl.glTexCoord2f(5f,0f); gl.glVertex3f(20 , 30, -30);
            gl.glTexCoord2f(0f,0f); gl.glVertex3f(-20, 30, -30);
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
      gl.glPopMatrix();
    }
}