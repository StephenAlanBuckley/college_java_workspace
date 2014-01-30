package Buildings;
// William Ames Fall 2010  Texture Demo

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.Hot_tub;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class KeemonBuilding extends Building
	{
	    private static GLUquadric quadric; // to control properties of quadric-based objects
	    private static Texture cementTexture;     // bricks
	    private static Texture wallPaper; // for inside of building
	    private static Texture tv;
	    private static Texture floor;
	    private static Texture ceiling;
	    private static Hot_tub hotTub;
	    private int x0=-20,x1=30,y0=0,y1=30,z0=-30,z1=40; 
	    //private int doorh = 7; Moved it out to get rid of the warning, but kept in case planned on using
	    private TextRenderer renderer;

	    
	public KeemonBuilding(GL2 gl, GLU glu){
		 setupBuilding(gl, glu);
	}
	
    public void setupBuilding(GL2 gl, GLU glu) 
    {
    	  renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
          
    	//Edit by Melvin Ross
    	if(quadric==null){
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // use true to generate texture coordinate

        cementTexture     = setupTexture(gl, "keemon_cement.png");
        wallPaper = setupTexture(gl, "keemon_wallpaper.png");
        tv = setupTexture(gl, "keemon_tv.png");
        floor = setupTexture(gl, "keemon_tile.png");
        ceiling = setupTexture(gl, "keemon_ceiling.png");
        
        hotTub = new Hot_tub(gl, glu);
    	}
    }
    public void drawMoving(GL2 gl, GLU glu) {
        // Keemon Building Text
                gl.glPushMatrix();
                    gl.glRotated(1, 0, 0, 0);
                    gl.glTranslated(40, 10, 90.5);
                    renderer.begin3DRendering();
                    renderer.setColor(1, 0, 0, 1);
                    renderer.draw3D("Hot Tub Time Machine", 0f, 0f,0, .25f*1f/9);
                    renderer.end3DRendering();
             gl.glPopMatrix();

    }


    public void draw(GL2 gl, GLU glu) 
    {
        
       
    	
      gl.glPushMatrix();
      	gl.glPushMatrix();
      		gl.glTranslatef(79,0,75);
      		gl.glRotatef(180,0,1,0);
  			hotTub.draw(gl, glu);
  		gl.glPopMatrix();
        gl.glTranslatef(50, 0, 50); // Ames change, need x,z 0 to 100 each
    	//Outside Ground
        gl.glColor3f(0f, 1f, 0f);
        	gl.glPushMatrix();
            gl.glRotatef(-90f, 1f, 0f, 0f); 
            gl.glRectf(-50,-50, 50, 50);
        gl.glPopMatrix();
      
        //ladder
        gl.glColor3f(1f, 0f, 0f);

        float posX = x1-2, posY = 15;
    	int j = (int) posX;

        for(int i=(int)posY ;i>0;i= i-2){
        	gl.glPushMatrix();
    		gl.glRotatef(-90f, 1f, -90f, 0f); 
    		gl.glTranslatef(j, i, 4);
    		glu.gluCylinder(quadric, .25,.25, 5, 10, 1);
    		j -= 2;

    		gl.glPopMatrix();
    		
        }    		

    		
    		gl.glPushMatrix();
    		gl.glRotatef(45f, 32f, 0f, 0f); 
    		gl.glTranslatef(x1-26, -9.5f, z0);
    		glu.gluCylinder(quadric, .25,.25, 22, 10, 1);
    		gl.glPopMatrix();
    		
    		gl.glPushMatrix();
    		gl.glRotatef(45f, 32f, 0f, 0f); 
    		gl.glTranslatef(x1-21, -9.5f, z0);
    		glu.gluCylinder(quadric, .25,.25, 22, 10, 1);
    		gl.glPopMatrix();
    		
    		
    		
    		//fire pole
    		gl.glColor3f(1,0,1);
    		gl.glPushMatrix();
    			gl.glTranslatef(0f,30,1.5f);
    			gl.glRotatef(90,1,0,0);
    			glu.gluCylinder(quadric,.25,.25,30,10,1);
    		gl.glPopMatrix();
    		
    		
    		
    		
    		
    		//tv
    		gl.glEnable(GL2.GL_TEXTURE_2D);
    		tv.bind();
    		gl.glBegin(GL2.GL_QUADS);
	    		gl.glTexCoord2f(0f,1f); gl.glVertex3f(x0+.01f, y0+4, z1/2+10);
		        gl.glTexCoord2f(1f,1f); gl.glVertex3f(x0+.01f, y0+4, z1/2-10);
		        gl.glTexCoord2f(1f,0f); gl.glVertex3f(x0+.01f, y0+13, z1/2-10);
		        gl.glTexCoord2f(0f,0f); gl.glVertex3f(x0+.01f, y0+13, z1/2+10);
    		gl.glEnd();
    		gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //floor
        gl.glEnable(GL2.GL_TEXTURE_2D);
        	floor.bind();
        	gl.glBegin(GL2.GL_QUADS);
    			gl.glTexCoord2f(0f,10f); gl.glVertex3f(x0, 0.1f, z1);
    			gl.glTexCoord2f(15f,10f); gl.glVertex3f(x1, 0.1f, z1);
    			gl.glTexCoord2f(15f,0f); gl.glVertex3f( x1, 0.1f, z0);
    			gl.glTexCoord2f(0f,0f); gl.glVertex3f(x0, 0.1f, z0);
    		gl.glEnd();
    	gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	
    	//ceiling
    	gl.glEnable(GL2.GL_TEXTURE_2D);
    		ceiling.bind();
    		gl.glBegin(GL2.GL_QUADS);
	    		gl.glTexCoord2f(0f,10f); gl.glVertex3f(x0, y1, z1);
				gl.glTexCoord2f(20f,10f); gl.glVertex3f(x1, y1, z1);
				gl.glTexCoord2f(20f,0f); gl.glVertex3f( x1, y1, z0);
				gl.glTexCoord2f(0f,0f); gl.glVertex3f(x0, y1, z0);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
    	
    	//Left wall inside
        gl.glEnable(GL2.GL_CULL_FACE);

    	gl.glEnable(GL2.GL_TEXTURE_2D);
        wallPaper.bind();
            gl.glBegin(GL2.GL_QUADS);
	            gl.glTexCoord2f(0f,1f); gl.glVertex3f(x0, y0, z1);
		        gl.glTexCoord2f(1f,1f); gl.glVertex3f(x0, y0, z0);
		        gl.glTexCoord2f(1f,0f); gl.glVertex3f(x0, y1, z0);
		        gl.glTexCoord2f(0f,0f); gl.glVertex3f(x0, y1, z1);
	            
            gl.glEnd();
            gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);

    	
        //Left wall outside
    	gl.glEnable(GL2.GL_TEXTURE_2D);
        cementTexture.bind();
            gl.glBegin(GL2.GL_QUADS);
	            gl.glTexCoord2f(0f,10f); gl.glVertex3f(x0, y0, z1);
		        gl.glTexCoord2f(10f,10f); gl.glVertex3f(x0, y0, z0);
		        gl.glTexCoord2f(10f,0f); gl.glVertex3f(x0, y1, z0);
		        gl.glTexCoord2f(0f,0f); gl.glVertex3f(x0, y1, z1);
            
            gl.glEnd();
            gl.glDisable(GL2.GL_TEXTURE_2D);

        
        
        
    	//Front wall outside and door
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_TEXTURE_2D);
    	cementTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s = {.5f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            float[] coef_t = {0,.25f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
    		
    		gl.glBegin(GL2.GL_QUADS);
	
	            gl.glVertex3f(x0,  y0, z1);
				gl.glVertex3f(-2,  y0, z1);
				gl.glVertex3f(-2,  y1, z1);
				gl.glVertex3f(x0, y1, z1);
				
	            gl.glVertex3f(-2,7, z1);
				gl.glVertex3f(2, 7, z1);
				gl.glVertex3f(2,y1, z1);
				gl.glVertex3f(-2,y1, z1);
	           
	            gl.glVertex3f(2,  y0, z1);
				gl.glVertex3f(x1,  y0, z1);
				gl.glVertex3f(x1, y1, z1);
				gl.glVertex3f(2, y1, z1);
	      gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
        gl.glDisable(GL2.GL_TEXTURE_2D);

        gl.glDisable(GL2.GL_CULL_FACE);

    	
        //Front wall inside and door
        gl.glEnable(GL2.GL_TEXTURE_2D);
        wallPaper.bind();
            gl.glBegin(GL2.GL_QUADS);
	            gl.glTexCoord2f(0f,.4f); gl.glVertex3f(x0,  y0, z1);
	            gl.glTexCoord2f(.4f,.4f);gl.glVertex3f(-2,  y0, z1);
	            gl.glTexCoord2f(.4f,0f);gl.glVertex3f(-2,  y1, z1);
	            gl.glTexCoord2f(0f,1f);gl.glVertex3f(x0, y1, z1);
					
	            gl.glTexCoord2f(0f,.2f); gl.glVertex3f(-2,7, z1);
	            gl.glTexCoord2f(.2f,.2f);gl.glVertex3f(2, 7, z1);
	            gl.glTexCoord2f(.2f,0f);gl.glVertex3f(2,y1, z1);
	            gl.glTexCoord2f(0f,0f);gl.glVertex3f(-2,y1, z1);
		           
	            gl.glTexCoord2f(0f,.2f);gl.glVertex3f(2,  y0, z1);
	            gl.glTexCoord2f(.2f,.2f);gl.glVertex3f(x1,  y0, z1);
	            gl.glTexCoord2f(.2f,0f);gl.glVertex3f(x1, y1, z1);
	            gl.glTexCoord2f(0f,0f);gl.glVertex3f(2, y1, z1);
            gl.glEnd();
        
        gl.glDisable(GL2.GL_TEXTURE_2D);


        //Right wall outside
        gl.glEnable(GL2.GL_CULL_FACE);
        	gl.glEnable(GL2.GL_TEXTURE_2D);
        	cementTexture.bind();
	            gl.glBegin(GL2.GL_QUADS);
		            gl.glTexCoord2f(0f,10f);gl.glVertex3f(x1,  y0, z1);
		            gl.glTexCoord2f(5f,10f);gl.glVertex3f(x1,  y0, -18);
		            gl.glTexCoord2f(5f,0f);gl.glVertex3f(x1, y1, -18);
		            gl.glTexCoord2f(0f,0f);gl.glVertex3f(x1, y1, z1);
		            
		            gl.glTexCoord2f(0f,8f);gl.glVertex3f(x1,  7, -18);
		            gl.glTexCoord2f(2f,8f);gl.glVertex3f(x1,  7, -22);
		            gl.glTexCoord2f(2f,0f);gl.glVertex3f(x1, y1, -22);
		            gl.glTexCoord2f(0f,0f);gl.glVertex3f(x1, y1, -18);
		            
		            gl.glTexCoord2f(0f,10f);gl.glVertex3f(x1,  y0, -22);
		            gl.glTexCoord2f(5f,10f);gl.glVertex3f(x1,  y0, z0);
		            gl.glTexCoord2f(5f,0f);gl.glVertex3f(x1, y1, z0);
		            gl.glTexCoord2f(0f,0f);gl.glVertex3f(x1, y1, -22);
	            gl.glEnd();
            gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_CULL_FACE);

		//Right wall inside
            gl.glEnable(GL2.GL_TEXTURE_2D);
            wallPaper.bind();
	            gl.glBegin(GL2.GL_QUADS);
		            gl.glTexCoord2f(0f,.4f);gl.glVertex3f(x1,  y0, z1);
		            gl.glTexCoord2f(.4f,.4f);gl.glVertex3f(x1,  y0, -18);
		            gl.glTexCoord2f(.4f,0f);gl.glVertex3f(x1, y1, -18);
		            gl.glTexCoord2f(0f,0f);gl.glVertex3f(x1, y1, z1);
		            
		            gl.glTexCoord2f(0f,.2f);gl.glVertex3f(x1,  7, -18);
		            gl.glTexCoord2f(.2f,.2f);gl.glVertex3f(x1,  7, -22);
		            gl.glTexCoord2f(.2f,0f);gl.glVertex3f(x1, y1, -22);
		            gl.glTexCoord2f(0f,0f);gl.glVertex3f(x1, y1, -18);
		            
		            gl.glTexCoord2f(0f,.4f);gl.glVertex3f(x1,  y0, -22);
		            gl.glTexCoord2f(.4f,.4f);gl.glVertex3f(x1,  y0, z0);
		            gl.glTexCoord2f(.4f,0f);gl.glVertex3f(x1, y1, z0);
		            gl.glTexCoord2f(0f,0f);gl.glVertex3f(x1, y1, -22);
	            gl.glEnd();
	            
            gl.glDisable(GL2.GL_TEXTURE_2D);
        
		//Back wall inside
    	gl.glEnable(GL2.GL_CULL_FACE);
		gl.glEnable(GL2.GL_TEXTURE_2D);
			wallPaper.bind();
			gl.glBegin(GL2.GL_QUADS);
				gl.glTexCoord2f(0f,1f); gl.glVertex3f(x0,  y0, z0);
				gl.glTexCoord2f(1f,1f); gl.glVertex3f(x1,  y0, z0);
				gl.glTexCoord2f(1f,0f); gl.glVertex3f(x1,  y1, z0);
				gl.glTexCoord2f(0f,0f); gl.glVertex3f(x0,  y1, z0);
			gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_CULL_FACE);

		//Back wall outside 
		cementTexture.bind();
		gl.glEnable(GL2.GL_TEXTURE_2D);
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,10f); gl.glVertex3f(x0,  y0, z0);
			gl.glTexCoord2f(20f,10f); gl.glVertex3f(x1,  y0, z0);
			gl.glTexCoord2f(20f,0f); gl.glVertex3f(x1,  y1, z0);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(x0,  y1, z0);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
      gl.glPopMatrix();
    }
}
