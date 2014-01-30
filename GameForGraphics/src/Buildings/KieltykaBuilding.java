package Buildings;
import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.KieltykaTable;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;
// Questions for Prof Ames:
// Texturing coeficients
// The cull on and off 
/*
 * initial location and eye view angle
 */
public class KieltykaBuilding extends Building {

	private static GLUquadric quadric; 
	private static Texture kieltykaGrass; 
	private static Texture kieltykaWhiteBrick;
	private static Texture kieltykaGreenRoof;
	private static Texture kieltykaBlackRoof;
	private static Texture kieltykaRedCarpet;
	private static Texture kieltykaClock2;
	private static Texture kieltykaTowerWindow;
	private static Texture kieltykaEagle;
	private static Texture kieltykaMainWindow;
	private static Texture kieltykaBookShelf;
	private static Texture kieltykaWoodCeiling;
	private KieltykaTable kieltykaTable;
	private TextRenderer renderer;

	
	 
	 public KieltykaBuilding(GL2 gl, GLU glu) {
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
		    
		 if(quadric==null){
		 quadric = glu.gluNewQuadric();
		 glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
		 glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
		 glu.gluQuadricTexture  (quadric, true);        // false, or true to generate texture coordinates
	       
		 kieltykaGrass = setupTexture(gl, "kieltykaGrass.png");
		 kieltykaWhiteBrick = setupTexture(gl,"kieltykaWhiteBrick.png");
		 kieltykaGreenRoof = setupTexture(gl,"kieltykaGreenRoof.png");
		 kieltykaBlackRoof = setupTexture(gl,"kieltykaBlackRoof.png");
		 kieltykaRedCarpet = setupTexture(gl,"kieltykaRedCarpet.png");
		 kieltykaClock2 = setupTexture(gl,"kieltykaClock2.png");
		 kieltykaTowerWindow = setupTexture(gl,"kieltykaTowerWindow.png");
		 kieltykaEagle = setupTexture(gl,"kieltykaEagle.png");
		 kieltykaMainWindow = setupTexture(gl,"kieltykaMainWindow.png");
		 kieltykaBookShelf = setupTexture(gl,"kieltykaBookShelf.png");
		 kieltykaWoodCeiling = setupTexture(gl,"kieltykaWoodCeiling.png");
		 kieltykaTable = new KieltykaTable(gl, glu);
		 }
		}
	  public void drawMoving(GL2 gl, GLU glu) {
         // Kieltya Building Text
	        gl.glPushMatrix();
	            gl.glRotated(180, 0, 1, 0);
	            gl.glTranslated(-57.5, 10, -14.5);
	            renderer.begin3DRendering();
	            renderer.setColor(1, 0, 0, 1);
	            renderer.draw3D("King Arthur", 0f, 0f,0, .25f*1f/7);
	            renderer.end3DRendering();
	          gl.glPopMatrix();


	    }

	
	 public void draw(GL2 gl, GLU glu) {


		 
		 //Draws Google Sketchup table
	        gl.glPushMatrix();
	        	gl.glTranslatef(18f, 4f, 87f); 
	        	gl.glScalef(1f,-1f,1f);
	        	gl.glScalef(1.5f,1.5f,1.5f);
				gl.glRotatef(90,0,1,0);
				kieltykaTable.draw(gl, glu);
	        gl.glPopMatrix();
	        
	        gl.glPushMatrix();
        		gl.glTranslatef(18f, 4f, 67f); 
        		gl.glScalef(1f,-1f,1f);
        		gl.glScalef(1.5f,1.5f,1.5f);
        		gl.glRotatef(90,0,1,0);
        		kieltykaTable.draw(gl, glu);
        		gl.glPopMatrix();
       
        	gl.glPushMatrix();
    			gl.glTranslatef(18f, 4f, 47f); 
    			gl.glScalef(1f,-1f,1f);
    			gl.glScalef(1.5f,1.5f,1.5f);
				gl.glRotatef(90,0,1,0);
				kieltykaTable.draw(gl, glu);
			gl.glPopMatrix();
   
    
			gl.glPushMatrix();
				gl.glTranslatef(18f, 4f, 27f); 
				gl.glScalef(1f,-1f,1f);
				gl.glScalef(1.5f,1.5f,1.5f);
				gl.glRotatef(90,0,1,0);
				kieltykaTable.draw(gl, glu);
			gl.glPopMatrix();
			
			// other side of tables
			 gl.glPushMatrix();
	        	gl.glTranslatef(78f, 4f, 87f); 
	        	gl.glScalef(1f,-1f,1f);
	        	gl.glScalef(1.5f,1.5f,1.5f);
				gl.glRotatef(90,0,1,0);
				kieltykaTable.draw(gl, glu);
	        gl.glPopMatrix();
	        
	        gl.glPushMatrix();
     		gl.glTranslatef(78f, 4f, 67f); 
     		gl.glScalef(1f,-1f,1f);
     		gl.glScalef(1.5f,1.5f,1.5f);
     		gl.glRotatef(90,0,1,0);
     		kieltykaTable.draw(gl, glu);
     		gl.glPopMatrix();
    
     	gl.glPushMatrix();
 			gl.glTranslatef(78f, 4f, 47f); 
 			gl.glScalef(1f,-1f,1f);
 			gl.glScalef(1.5f,1.5f,1.5f);
				gl.glRotatef(90,0,1,0);
				kieltykaTable.draw(gl, glu);
			gl.glPopMatrix();

 
			gl.glPushMatrix();
				gl.glTranslatef(78f, 4f, 27f); 
				gl.glScalef(1f,-1f,1f);
				gl.glScalef(1.5f,1.5f,1.5f);
				gl.glRotatef(90,0,1,0);
				kieltykaTable.draw(gl, glu);
			gl.glPopMatrix();

	       
	       
		 gl.glPushMatrix();
		 gl.glTranslatef(0,0,100);		// put everything in the pos z perspective 
		 
		 // Main windows 
		 gl.glEnable(GL2.GL_TEXTURE_2D); // turn on texture mapping
		 kieltykaMainWindow.bind();
         // front left exterior window
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(15, 15, -9.9f); // bottom left
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(25, 15, -9.9f); // bottom right
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(25, 35, -9.9f); // top right
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(15, 35, -9.9f); // top left
         gl.glEnd();
         // front left interior window
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(15, 15, -10.1f); // bottom left
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(25, 15, -10.1f); // bottom right
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(25, 35, -10.1f); // top right
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(15, 35, -10.1f); // top left
         gl.glEnd();
         // front right exterior window
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(75, 15, -9.9f); // bottom left
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(85, 15, -9.9f); // bottom right
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(85, 35, -9.9f); // top right
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(75, 35, -9.9f); // top left
      	gl.glEnd(); 
     // front right interior window
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(75, 15, -10.1f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(85, 15, -10.1f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(85, 35, -10.1f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(75, 35, -10.1f); // top left
     	gl.glEnd();
     // back left exterior window
     	gl.glBegin(GL2.GL_QUADS);
     		gl.glTexCoord2f(0f,1f); gl.glVertex3f(15, 15, -90.1f); // bottom left
     		gl.glTexCoord2f(1f,1f); gl.glVertex3f(25, 15, -90.1f); // bottom right
     		gl.glTexCoord2f(1f,0f); gl.glVertex3f(25, 35, -90.1f); // top right
     		gl.glTexCoord2f(0f,0f); gl.glVertex3f(15, 35, -90.1f); // top left
       	gl.glEnd();
       	// back left interior window
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(15, 15, -89.9f); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(25, 15, -89.9f); // bottom right
       		gl.glTexCoord2f(1f,0f); gl.glVertex3f(25, 35, -89.9f); // top right
       		gl.glTexCoord2f(0f,0f); gl.glVertex3f(15, 35, -89.9f); // top left
       	gl.glEnd();
       		// back right exterior window
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(75, 15, -90.1f); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(85, 15, -90.1f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(85, 35, -90.1f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(75, 35, -90.1f); // top left
       	gl.glEnd();
        	// back right interior window
   		gl.glBegin(GL2.GL_QUADS);
   			gl.glTexCoord2f(0f,1f); gl.glVertex3f(75, 15, -89.9f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(85, 15, -89.9f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(85, 35, -89.9f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(75, 35, -89.9f); // top left
        gl.glEnd();
        //clock
        gl.glEnable(GL2.GL_TEXTURE_2D); // turn on texture mapping
        kieltykaClock2.bind(); // bind - brick texture is going to be used for subsequent drawing when texture mapping is enabled
         // front clock
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 55, -39.9f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 55, -39.9f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 65, -39.9f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 65, -39.9f); // top left
        gl.glEnd();
        //back clock
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 55, -60.1f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 55, -60.1f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 65, -60.1f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 65, -60.1f); // top left
       	gl.glEnd();
       	gl.glDisable(GL2.GL_TEXTURE_2D); // turn it off
            
       	gl.glEnable(GL2.GL_TEXTURE_2D); // turn on texture mapping
       	kieltykaEagle.bind(); // bind - brick texture is going to be used for subsequent drawing when texture mapping is enabled
       	// front exterior eagle
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 15, -14.9f); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 15, -14.9f); // bottom right
       		gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 25, -14.9f); // top right
       		gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 25, -14.9f); // top left
       	gl.glEnd();
    	// front interior eagle
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 15, -15.1f); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 15, -15.1f); // bottom right
       		gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 25, -15.1f); // top right
       		gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 25, -15.1f); // top left
       	gl.glEnd();
       	//back exterior eagle
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 15, -85.1f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 15, -85.1f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 25, -85.1f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 25, -85.1f); // top left
       	gl.glEnd();
       	//back interior eagle
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 15, -84.9f); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 15, -84.9f); // bottom right
       		gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 25, -84.9f); // top right
       		gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 25, -84.9f); // top left
       	gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D); // turn it off
            
        // Tower Windows
        gl.glEnable(GL2.GL_TEXTURE_2D); // turn on texture mapping
        kieltykaTowerWindow.bind(); // bind - brick texture is going to be used for subsequent drawing when texture mapping is enabled
        // front exterior window
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 70, -39.9f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 70, -39.9f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 90, -39.9f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 90, -39.9f); // top left
        gl.glEnd();
        //back exterior window
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 70, -60.1f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 70, -60.1f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 90, -60.1f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 90, -60.1f); // top left
       	gl.glEnd();
       	// left exterior window
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(39.9f, 70, -45); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(39.9f, 70, -55); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(39.9f, 90, -55); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(39.9f, 90, -45); // top left
        gl.glEnd();
        //right exterior window 
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(60.1f, 70, -45); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(60.1f, 70, -55); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(60.1f, 90, -55); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(60.1f, 90, -45); // top left
        gl.glEnd();
        
     // front interior window
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 70, -40.1f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 70, -40.1f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 90, -40.1f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 90, -40.1f); // top left
        gl.glEnd();
        //back interior window
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 70, -59.9f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 70, -59.9f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 90, -59.9f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 90, -59.9f); // top left
       	gl.glEnd();
       	// left interior window
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(40.1f, 70, -45); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(40.1f, 70, -55); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(40.1f, 90, -55); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(40.1f, 90, -45); // top left
        gl.glEnd();
        //right interior window 
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(59.9f, 70, -45); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(59.9f, 70, -55); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(59.9f, 90, -55); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(59.9f, 90, -45); // top left
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D); // turn it off
            
        gl.glEnable(GL2.GL_TEXTURE_2D); // turn on texture mapping
        gl.glEnable(GL2.GL_CULL_FACE);
        kieltykaBookShelf.bind();
        // right bookshelf
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(10.1f, 0, -10); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(10.1f, 0, -90); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(10.1f, 30, -90); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(10.1f, 30, -10); // top left 
        gl.glEnd();
        //left bookshelf 
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(89.9f, 30, -90); // top right
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(89.9f,  0, -90); // bottom right
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(89.9f,  0, -10); // bottom left
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(89.9f, 30, -10); // top left
        gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D); // turn it off
        gl.glDisable(GL2.GL_CULL_FACE);
            
        //  Front and Back windows
        gl.glEnable(GL2.GL_TEXTURE_2D); // turn on texture mapping
        kieltykaMainWindow.bind(); // bind - brick texture is going to be used for subsequent drawing when texture mapping is enabled
        // front exterior window
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 30, -39.9f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 30, -39.9f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 50, -39.9f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 50, -39.9f); // top left
        gl.glEnd();
        //back exterior window
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 30, -60.1f); // bottom left
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 30, -60.1f); // bottom right
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 50, -60.1f); // top right
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 50, -60.1f); // top left
       	gl.glEnd();
       	// front interior 
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 30, -40.1f); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 30, -40.1f); // bottom right
       		gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 50, -40.1f); // top right
       		gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 50, -40.1f); // top left
       	gl.glEnd();
       	//back interior window
       	gl.glBegin(GL2.GL_QUADS);
       		gl.glTexCoord2f(0f,1f); gl.glVertex3f(45, 30, -59.9f); // bottom left
       		gl.glTexCoord2f(1f,1f); gl.glVertex3f(55, 30, -59.9f); // bottom right
       		gl.glTexCoord2f(1f,0f); gl.glVertex3f(55, 50, -59.9f); // top right
       		gl.glTexCoord2f(0f,0f); gl.glVertex3f(45, 50, -59.9f); // top left
       	gl.glEnd();
       	gl.glDisable(GL2.GL_TEXTURE_2D); // turn it off
       	
       	// Bell 
       	gl.glPushMatrix();
       	gl.glColor3f(1, .8f, 0f);
       	gl.glTranslatef(50,80,-50);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, .3, .3, 20, 10, 1);
       	gl.glPopMatrix();
       	
       	gl.glPushMatrix();
       	gl.glColor3f(1, .8f, 0f);
       	gl.glTranslatef(50,80,-50);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluDisk(quadric, 5, 7, 10, 10);
       	gl.glPopMatrix();
       	
       	gl.glPushMatrix();
       	gl.glColor3f(0f, 0f, 0f);
       	gl.glTranslatef(50,80,-50);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluDisk(quadric, 0, 2, 10, 10);
       	gl.glPopMatrix();
       	
       	gl.glPushMatrix();
       	gl.glColor3f(1, .8f, 0f);
       	gl.glTranslatef(50,80,-50);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 6, .3, 10, 10, 1);
       	gl.glPopMatrix();
       	//spires:
       	gl.glEnable(GL2.GL_TEXTURE_2D);
       	kieltykaWhiteBrick.bind();
       	// front left spire
       	//base
       	gl.glMatrixMode(GL2.GL_TEXTURE);
    	gl.glPushMatrix();
    		gl.glScalef(5f,4f,1);
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
       	
       	gl.glPushMatrix();
       	gl.glTranslatef(43,100,-43);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 3, 15, 10, 1);
       	gl.glPopMatrix();
       	// top
       	gl.glPushMatrix();
       	gl.glTranslatef(43,115,-43);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 1, 5, 10, 1);
       	gl.glPopMatrix();
       
       	gl.glMatrixMode(GL2.GL_TEXTURE);
       	gl.glPopMatrix();
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
       	
       	//vertical of cross	
       	gl.glPushMatrix();
       	gl.glTranslatef(43,120,-43);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
       	// horizontal of cross
       	gl.glPushMatrix();
       	gl.glTranslatef(40.5f,122.5f,-43);
       	gl.glRotatef(90,0, 1, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
		        
       	// back left spire
       	gl.glMatrixMode(GL2.GL_TEXTURE);
    	gl.glPushMatrix();
    		gl.glScalef(5f,4f,1);
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
    	// base
       	gl.glPushMatrix();
       	gl.glTranslatef(43,100,-57);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 3, 15, 10, 1);
       	gl.glPopMatrix();
       	// top
       	gl.glPushMatrix();
       	gl.glTranslatef(43,115,-57);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 1, 5, 10, 1);
       	gl.glPopMatrix();
       	gl.glMatrixMode(GL2.GL_TEXTURE);
       	gl.glPopMatrix();
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
       	//vertical of cross	
       	gl.glPushMatrix();
       	gl.glTranslatef(43,120,-57);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
       	// horizontal of cross
       	gl.glPushMatrix();
       	gl.glTranslatef(40.5f,122.5f,-57);
       	gl.glRotatef(90,0, 1, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
       	
       	// front right spire
       	gl.glMatrixMode(GL2.GL_TEXTURE);
    	gl.glPushMatrix();
    		gl.glScalef(5f,4f,1);
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
       	// base
       	gl.glPushMatrix();
       	gl.glTranslatef(57,100,-43);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 3, 15, 10, 1);
       	gl.glPopMatrix();
       	// top
       	gl.glPushMatrix();
       	gl.glTranslatef(57,115,-43);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 1, 5, 10, 1);
       	gl.glPopMatrix();
       	gl.glMatrixMode(GL2.GL_TEXTURE);
       	gl.glPopMatrix();
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
       	//vertical of cross	
       	gl.glPushMatrix();
       	gl.glTranslatef(57,120,-43);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
       	// horizontal of cross
       	gl.glPushMatrix();
       	gl.glTranslatef(54.5f,122.5f,-43);
       	gl.glRotatef(90,0, 1, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
       	
       	// back right spire
       	gl.glMatrixMode(GL2.GL_TEXTURE);
    	gl.glPushMatrix();
    		gl.glScalef(5f,4f,1);
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
    	// base
       	gl.glPushMatrix();
       	gl.glTranslatef(57,100,-57);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 3, 15, 10, 1);
       	gl.glPopMatrix();
       	// top
       	gl.glPushMatrix();
       	gl.glTranslatef(57,115,-57);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, 3, 1, 5, 10, 1);
       	gl.glPopMatrix();
       	gl.glMatrixMode(GL2.GL_TEXTURE);
       	gl.glPopMatrix();
    	gl.glMatrixMode(GL2.GL_MODELVIEW);
       	//vertical of cross	
       	gl.glPushMatrix();
       	gl.glTranslatef(57,120,-57);
       	gl.glRotatef(-90,1, 0, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
       	// horizontal of cross
       	gl.glPushMatrix();
       	gl.glTranslatef(54.5f,122.5f,-57);
       	gl.glRotatef(90,0, 1, 0);
       	glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
       	gl.glPopMatrix();
       	gl.glDisable(GL2.GL_TEXTURE_2D);
       	
       	
	        	
	        	
       	// Plot of land
       	gl.glEnable(GL2.GL_TEXTURE_2D);
       	kieltykaGrass.bind();
       	gl.glEnable(GL2.GL_TEXTURE_GEN_S);
       	gl.glEnable(GL2.GL_TEXTURE_GEN_T);
       	gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       	gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       	float[] coef_s = {.5f,0,0,0};
       	gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
       	float[]	coef_t = {0,.25f,.25f,0};
       	gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
       
       	//left long rect
       	gl.glBegin(GL2.GL_QUADS);
   			gl.glVertex3f( 0,  0, 0); // bottom left
   			gl.glVertex3f(10,  0, 0); // bottom right
   			gl.glVertex3f(10, 0, -100); // top right
   			gl.glVertex3f( 0, 0, -100); // top left
   		gl.glEnd();
   		// right long rect
   		gl.glBegin(GL2.GL_QUADS);
   			gl.glVertex3f( 90,  0, 0); // bottom left
   			gl.glVertex3f(100,  0, 0); // bottom right
   			gl.glVertex3f(100, 0, -100); // top right
   			gl.glVertex3f( 90, 0, -100); // top left
   		gl.glEnd();
   		
   	// front long rect
   		gl.glBegin(GL2.GL_QUADS);
   			gl.glVertex3f( 10,  0, 0); // bottom left
   			gl.glVertex3f( 90,  0, 0); // bottom right
   			gl.glVertex3f( 90, 0, -10); // top right
   			gl.glVertex3f( 10, 0, -10); // top left
   		gl.glEnd();
   		
   	// back long rect
   		gl.glBegin(GL2.GL_QUADS);
   			gl.glVertex3f( 10,  0, -90); // bottom left
   			gl.glVertex3f( 90,  0, -90); // bottom right
   			gl.glVertex3f( 90, 0, -100); // top right
   			gl.glVertex3f( 10, 0, -100); // top left
   		gl.glEnd();
   		
   	// front short rect
   		gl.glBegin(GL2.GL_QUADS);
   			gl.glVertex3f( 30,  0, -10); // bottom left
   			gl.glVertex3f(70,  0, -10); // bottom right
   			gl.glVertex3f(70, 0, -15); // top right
   			gl.glVertex3f( 30, 0, -15); // top left
   		gl.glEnd();
   		
   	// back short rect
   		gl.glBegin(GL2.GL_QUADS);
   			gl.glVertex3f(30,  0, -85); // bottom left
   			gl.glVertex3f(70,  0, -85); // bottom right
   			gl.glVertex3f(70, 0, -90); // top right
   			gl.glVertex3f(30, 0, -90); // top left
   		gl.glEnd();
       	gl.glDisable(GL2.GL_TEXTURE_2D);
       	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
       	gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
	       
       	// Red Carpet
       	gl.glEnable(GL2.GL_TEXTURE_2D);
       	kieltykaRedCarpet.bind();
       	gl.glEnable(GL2.GL_TEXTURE_GEN_S);
       	gl.glEnable(GL2.GL_TEXTURE_GEN_T);
       	gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       	gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       	// float[] coef_s = {.5f,0,0,0};
       	gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
       	//float[] coef_t = {0,.25f,0,0};
       	gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
       		gl.glBegin(GL2.GL_QUADS);
       		// left rect
       		gl.glVertex3f(10, 0, -10); // bottom left 
       		gl.glVertex3f(30, 0, -10); // bottom right
       		gl.glVertex3f(30, 0, -90); // top right
       		gl.glVertex3f(10, 0, -90); // top left
       		// right rect
       		gl.glVertex3f(70, 0, -10); // bottom left 
       		gl.glVertex3f(90, 0, -10); // bottom right
       		gl.glVertex3f(90, 0, -90); // top right
       		gl.glVertex3f(70, 0, -90); // top left
       		// Middle rect 
       		gl.glVertex3f(30, 0, -15); // bottom left 
       		gl.glVertex3f(70, 0, -15); // bottom right
       		gl.glVertex3f(70, 0, -85); // top right
       		gl.glVertex3f(30, 0, -85); // top left
       	gl.glEnd();
       	gl.glDisable(GL2.GL_TEXTURE_2D);
       	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
       	gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
	       
	         
       	// Brick Structure Texturing 
       	gl.glEnable(GL2.GL_TEXTURE_2D);
       	kieltykaWhiteBrick.bind();
       	gl.glEnable(GL2.GL_TEXTURE_GEN_S);
       	gl.glEnable(GL2.GL_TEXTURE_GEN_T);
       	gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       	gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       	//float[] coef_s = {.5f,0,0,0};
       	gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
       	// float[] coef_t = {0,.25f,0,0};
       	gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
       		gl.glBegin(GL2.GL_QUADS);
       		// Tower Structure:
       		// tower front wall
       		gl.glVertex3f(40, 30, -40); // bottom left 
       		gl.glVertex3f(60, 30, -40); // bottom right
       		gl.glVertex3f(60, 100, -40); // top right
       		gl.glVertex3f(40, 100, -40); // top left
       		// tower back wall 
       		gl.glVertex3f(40, 30, -60); // bottom left 
       		gl.glVertex3f(60, 30, -60); // bottom right
       		gl.glVertex3f(60, 100, -60); // top right
       		gl.glVertex3f(40, 100, -60); // top left
       		// tower roof
       		gl.glVertex3f(40, 100, -40); // bottom left 
       		gl.glVertex3f(60, 100, -40); // bottom right
       		gl.glVertex3f(60, 100, -60); // top right
       		gl.glVertex3f(40, 100, -60); // top left
       		// front decorative wall
       		gl.glVertex3f(48, 100, -40); // bottom left 
       		gl.glVertex3f(52, 100, -40); // bottom right
       		gl.glVertex3f(52, 105, -40); // top right
       		gl.glVertex3f(48, 105, -40); // top left
       		// back decorative wall
       		gl.glVertex3f(48, 100, -60); // bottom left 
       		gl.glVertex3f(52, 100, -60); // bottom right
       		gl.glVertex3f(52, 105, -60); // top right
       		gl.glVertex3f(48, 105, -60); // top left
       		
       		
       		// Outer Structure 
       		// front left rect
       		gl.glVertex3f(10, 0, -10); // bottom left 
       		gl.glVertex3f(30, 0, -10); // bottom right
       		gl.glVertex3f(30, 40, -10); // top right
       		gl.glVertex3f(10, 40, -10); // top left
       		// front left triangle
       		gl.glVertex3f(10, 40, -10); // bottom left 
       		gl.glVertex3f(30, 40, -10); // bottom right
       		gl.glVertex3f(20, 60, -10); // top right
       		gl.glVertex3f(20, 60, -10); // top left
       		// front left little rect face
       		gl.glVertex3f(30, 0, -15); // bottom left 
       		gl.glVertex3f(40, 0, -15); // bottom right
       		gl.glVertex3f(40, 40, -15); // top right
       		gl.glVertex3f(30, 40, -15); // top left
       		
       		
       		// back left rect
       		gl.glVertex3f(10, 0, -90); // bottom left 
       		gl.glVertex3f(30, 0, -90); // bottom right
       		gl.glVertex3f(30, 40,-90); // top right
       		gl.glVertex3f(10, 40,-90); // top left
       		// back left triangle
       		gl.glVertex3f(10, 40, -90); // bottom left 
       		gl.glVertex3f(30, 40, -90); // bottom right
       		gl.glVertex3f(20, 60, -90); // top right
       		gl.glVertex3f(20, 60, -90); // top left 
       		// back left little rect face
       		gl.glVertex3f(30, 0, -85); // bottom left 
       		gl.glVertex3f(40, 0, -85); // bottom right
       		gl.glVertex3f(40, 40, -85); // top right
       		gl.glVertex3f(30, 40, -85); // top left
       		
       		
			// front right rect
			gl.glVertex3f(70, 0, -10); // bottom left 
			gl.glVertex3f(90, 0, -10); // bottom right
			gl.glVertex3f(90, 40, -10); // top right
			gl.glVertex3f(70, 40, -10); // top left
			// front right triangle
			gl.glVertex3f(70, 40, -10); // bottom left 
			gl.glVertex3f(90, 40, -10); // bottom right
			gl.glVertex3f(80, 60, -10); // top right
			gl.glVertex3f(80, 60, -10); // top left 
			// front right little rect face
			gl.glVertex3f(60, 0, -15); // bottom left 
			gl.glVertex3f(70, 0, -15); // bottom right
			gl.glVertex3f(70, 40, -15); // top right
			gl.glVertex3f(60, 40, -15); // top left
			
			// back right rect
			gl.glVertex3f(70, 0, -90); // bottom left 
			gl.glVertex3f(90, 0, -90); // bottom right
			gl.glVertex3f(90, 40,-90); // top right
			gl.glVertex3f(70, 40,-90); // top left
			// back right triangle
			gl.glVertex3f(70, 40, -90); // bottom left 
			gl.glVertex3f(90, 40, -90); // bottom right
			gl.glVertex3f(80, 60, -90); // top right
			gl.glVertex3f(80, 60, -90); // top left
			// back right little rect face
			gl.glVertex3f(60, 0, -85); // bottom left 
			gl.glVertex3f(70, 0, -85); // bottom right
			gl.glVertex3f(70, 40, -85); // top right
			gl.glVertex3f(60, 40, -85); // top left
			
			// front wall left
			gl.glVertex3f(40, 0, -15); // bottom left 
			gl.glVertex3f(45, 0, -15); // bottom right
			gl.glVertex3f(45, 30, -15); // top right
			gl.glVertex3f(40, 30, -15); // top left
			// front wall top
			gl.glVertex3f(40, 8, -15); // bottom left 
			gl.glVertex3f(60, 8, -15); // bottom right
			gl.glVertex3f(60, 30, -15); // top right
			gl.glVertex3f(40, 30, -15); // top left
			// front wall right
			gl.glVertex3f(55, 0, -15); // bottom left 
			gl.glVertex3f(60, 0, -15); // bottom right
			gl.glVertex3f(60, 30, -15); // top right
			gl.glVertex3f(55, 30, -15); // top left
			// back wall left 
			gl.glVertex3f(40, 0, -85); // bottom left 
			gl.glVertex3f(45, 0, -85); // bottom right
			gl.glVertex3f(45, 30, -85); // top right
			gl.glVertex3f(40, 30, -85); // top left
			// back wall top
			gl.glVertex3f(40, 8, -85); // bottom left 
			gl.glVertex3f(60, 8, -85); // bottom right
			gl.glVertex3f(60, 30, -85); // top right
			gl.glVertex3f(40, 30, -85); // top left
			// back wall right
			gl.glVertex3f(55, 0, -85); // bottom left 
			gl.glVertex3f(60, 0, -85); // bottom right
			gl.glVertex3f(60, 30, -85); // top right
			gl.glVertex3f(55, 30, -85); // top left
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T);
			
			// All sides white brick walls Roof
			gl.glEnable(GL2.GL_TEXTURE_2D);
			kieltykaWhiteBrick.bind();
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glEnable(GL2.GL_TEXTURE_GEN_T);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			float[] coef_s1 = {0f,0,.5f,0};
			gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
			float[] coef_t1 = {0,.25f,0,0};
			gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
				gl.glBegin(GL2.GL_QUADS);
				// tower right wall
	       		gl.glVertex3f(60, 30, -60); // bottom left 
	       		gl.glVertex3f(60, 30, -40); // bottom right
	       		gl.glVertex3f(60, 100, -40); // top right
	       		gl.glVertex3f(60, 100, -60); // top left
	       		// tower left wall
	       		gl.glVertex3f(40, 30, -40); // bottom left 
	       		gl.glVertex3f(40, 30, -60); // bottom right
	       		gl.glVertex3f(40, 100, -60); // top right
	       		gl.glVertex3f(40, 100, -40); // top left
	       		// left decorative wall
	       		gl.glVertex3f(40, 100, -48); // bottom left 
	       		gl.glVertex3f(40, 100, -52); // bottom right
	       		gl.glVertex3f(40, 105, -52); // top right
	       		gl.glVertex3f(40, 105, -48); // top left
	       		// right decorative wall
	       		gl.glVertex3f(60, 100, -48); // bottom left 
	       		gl.glVertex3f(60, 100, -52); // bottom right
	       		gl.glVertex3f(60, 105, -52); // top right
	       		gl.glVertex3f(60, 105, -48); // top left
	       		// front left little rect side
	       		gl.glVertex3f(30, 0, -10); // bottom left 
	       		gl.glVertex3f(30, 0, -15); // bottom right
	       		gl.glVertex3f(30, 40, -15); // top right
	       		gl.glVertex3f(30, 40, -10); // top left
	       		//front left side little rec 
	       		gl.glVertex3f(40, 30, -15); // bottom left 
	       		gl.glVertex3f(40, 30, -40); // bottom right
	       		gl.glVertex3f(40, 40, -40); // top right
	       		gl.glVertex3f(40, 40, -15); // top left
	       		// back left little rect side
	       		gl.glVertex3f(30, 0, -90); // bottom left 
	       		gl.glVertex3f(30, 0, -85); // bottom right
	       		gl.glVertex3f(30, 40, -85); // top right
	       		gl.glVertex3f(30, 40, -90); // top left
	       		//back left side little rec 
	       		gl.glVertex3f(40, 30, -85); // bottom left 
	       		gl.glVertex3f(40, 30, -60); // bottom right
	       		gl.glVertex3f(40, 40, -60); // top right
	       		gl.glVertex3f(40, 40, -85); // top left
	       		// left exterior wall
	       		gl.glVertex3f(10, 0, -10); // bottom left 
	       		gl.glVertex3f(10, 0, -90); // bottom right
				gl.glVertex3f(10, 40,-90); // top right
				gl.glVertex3f(10, 40,-10); // top left
				// front right little rect side
				gl.glVertex3f(70, 0, -10); // bottom left 
				gl.glVertex3f(70, 0, -15); // bottom right
				gl.glVertex3f(70, 40, -15); // top right
				gl.glVertex3f(70, 40, -10); // top left
				// front right side little rec
				gl.glVertex3f(60, 30, -15); // bottom left 
				gl.glVertex3f(60, 30, -40); // bottom right
				gl.glVertex3f(60, 40, -40); // top right
				gl.glVertex3f(60, 40, -15); // top left
				// back right little rect side
				gl.glVertex3f(70, 0, -90); // bottom left 
				gl.glVertex3f(70, 0, -85); // bottom right
				gl.glVertex3f(70, 40, -85); // top right
				gl.glVertex3f(70, 40, -90); // top left
				// back right side little rec
				gl.glVertex3f(60, 30, -85); // bottom left 
				gl.glVertex3f(60, 30, -60); // bottom right
				gl.glVertex3f(60, 40, -60); // top right
				gl.glVertex3f(60, 40, -85); // top left
				// right exterior wall
				gl.glVertex3f(90, 0, -10); // bottom left 
				gl.glVertex3f(90, 0, -90); // bottom right
				gl.glVertex3f(90, 40,-90); // top right
				gl.glVertex3f(90, 40,-10); // top left
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
			
			// All side green roof
			gl.glEnable(GL2.GL_TEXTURE_2D);
			kieltykaGreenRoof.bind();
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glEnable(GL2.GL_TEXTURE_GEN_T);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
			gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
			gl.glEnable(GL2.GL_CULL_FACE);
				gl.glBegin(GL2.GL_QUADS);
				 // left left roof
	            gl.glVertex3f(10, 40, -90); // top left 
                gl.glVertex3f(10, 40, -10); // bottom left
                gl.glVertex3f(20, 60,-10); // bottom right
                gl.glVertex3f(20, 60,-90); // top right
                // left right roof
	            gl.glVertex3f(30, 40, -10); // bottom left 
                gl.glVertex3f(30, 40, -90); // bottom right
                gl.glVertex3f(20, 60,-90); // top right
                gl.glVertex3f(20, 60,-10); // top left
                 // right left roof
	            gl.glVertex3f(70, 40, -90); // top left 
                gl.glVertex3f(70, 40, -10); // bottom left
                gl.glVertex3f(80, 60,-10); // bottom right
                gl.glVertex3f(80, 60,-90); // top left
                // right right roof
	            gl.glVertex3f(90, 40, -10); // bottom left 
                gl.glVertex3f(90, 40, -90); // bottom right
                gl.glVertex3f(80, 60,-90); // top right
                gl.glVertex3f(80, 60,-10); // top left
				
				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
			gl.glDisable(GL2.GL_CULL_FACE);
			
			//ceiling 
			gl.glEnable(GL2.GL_TEXTURE_2D);
			kieltykaWoodCeiling.bind();
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glEnable(GL2.GL_TEXTURE_GEN_T);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
			gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
			gl.glEnable(GL2.GL_CULL_FACE);
				gl.glBegin(GL2.GL_QUADS);
				// side ceilings
				 // left left roof 
	            gl.glVertex3f(10, 40, -10); // bottom left 
                gl.glVertex3f(10, 40, -90); // bottom right
                gl.glVertex3f(20, 60,-90); // top right
                gl.glVertex3f(20, 60,-10); // top left
                // left right roof 
                gl.glVertex3f(30, 40, -90); // top left 
                gl.glVertex3f(30, 40, -10);// bottom left
                gl.glVertex3f(20, 60,-10); // bottom right
                gl.glVertex3f(20, 60,-90); // top right
                // right left roof working
	            gl.glVertex3f(70, 40, -10); // bottom left 
                gl.glVertex3f(70, 40, -90); // bottom right
                gl.glVertex3f(80, 60,-90); // top right
                gl.glVertex3f(80, 60,-10); // top left
                // right right roof 
                gl.glVertex3f(80, 60,-90); // top left
                gl.glVertex3f(90, 40, -90); // bottom left
	            gl.glVertex3f(90, 40, -10); // bottom right 
	            gl.glVertex3f(80, 60,-10); // top right
                               
               
				
				/*
				//left side ceiling
	       		gl.glVertex3f(39.0f, 40, -85); // top left 
	       		gl.glVertex3f(39.0f, 30, -85); 
	       		gl.glVertex3f(39.0f, 30, -15); 
	       		gl.glVertex3f(39.0f, 40, -15); 

	       		//right side ceiling  
	       		gl.glVertex3f(60.001f, 40, -15); // top left 
	       		gl.glVertex3f(60.001f, 30, -15); 
	       		gl.glVertex3f(60.001f, 30, -85); 
	       		gl.glVertex3f(60.001f, 40, -85); 
	       		*/

				gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
			gl.glDisable(GL2.GL_CULL_FACE);
	         
			// Diffferent ceiling texture
			gl.glEnable(GL2.GL_TEXTURE_2D);
			kieltykaWoodCeiling.bind();
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glEnable(GL2.GL_TEXTURE_GEN_T);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
			gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
			gl.glEnable(GL2.GL_CULL_FACE);
				gl.glBegin(GL2.GL_QUADS);

            // left long roof
            gl.glVertex3f(30, 40, -85); // top left
            gl.glVertex3f(40, 40, -85);
            gl.glVertex3f( 40, 40, -15); 
            gl.glVertex3f(30, 40,  -15);
           // right long roof
			gl.glVertex3f(60, 40, -85); // top left
			gl.glVertex3f(70, 40, -85); 
			gl.glVertex3f(70, 40, -15); 
			gl.glVertex3f(60, 40, -15); 
			
			//front wide roof
			gl.glVertex3f(40, 30, -40); // top left
			gl.glVertex3f(60, 30,  -40); 
			gl.glVertex3f(60, 30, -15); 
			gl.glVertex3f(40, 30, -15);  
			
			//back wide roof 
			gl.glVertex3f(40, 30, -85); // top left
			gl.glVertex3f(60, 30, -85); 
			gl.glVertex3f(60, 30, -60); 
			gl.glVertex3f(40, 30, -60); 
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
			gl.glDisable(GL2.GL_CULL_FACE);
			
			// Black Roof
			gl.glEnable(GL2.GL_TEXTURE_2D);
			kieltykaBlackRoof.bind();
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glEnable(GL2.GL_TEXTURE_GEN_T);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			//float[] coef_s = {.5f,0,0,0};
			gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
			//float[] coef_t = {0,.25f,0,0};
			gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
			gl.glEnable(GL2.GL_CULL_FACE);
				gl.glBegin(GL2.GL_QUADS);
				// left long roof
				gl.glVertex3f( 30, 40, -15); // bottom left
				gl.glVertex3f(40, 40,  -15); // bottom right
				gl.glVertex3f(40, 40, -85); // top right
				gl.glVertex3f(30, 40, -85); // top left
				// right long roof
				gl.glVertex3f(60, 40, -15); // bottom left
				gl.glVertex3f(70, 40,  -15); // bottom right
				gl.glVertex3f(70, 40, -85); // top right
				gl.glVertex3f(60, 40, -85); // top left
				//front wide roof
				gl.glVertex3f(40, 30, -15); // bottom left
				gl.glVertex3f(60, 30,  -15); // bottom right
				gl.glVertex3f(60, 30, -40); // top right
				gl.glVertex3f(40, 30, -40); // top left
				//back wide roof 
				gl.glVertex3f(40, 30, -85); // top left
				gl.glVertex3f(40, 30, -60); // bottom left
				gl.glVertex3f(60, 30, -60); // top right
				gl.glVertex3f(60, 30, -85); // top left
				
			gl.glEnd();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
			gl.glDisable(GL2.GL_CULL_FACE);

			// Green horizontal roofs
	        gl.glEnable(GL2.GL_TEXTURE_2D);
	        kieltykaGreenRoof.bind();
	        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	        //float[] coef_s = {.5f,0,0,0};
	        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	        //float[] coef_t = {0,.25f,0,0};
	        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	        gl.glEnable(GL2.GL_CULL_FACE);
	        	gl.glBegin(GL2.GL_QUADS);
	           
	            // near roof left
	            gl.glVertex3f(30, 40, -40); // bottom left 
                gl.glVertex3f(40, 40, -40); // bottom right
                gl.glVertex3f(40, 60, -50); // top right
                gl.glVertex3f(20, 60, -50); // top left
                // far roof left
                gl.glVertex3f(40, 60, -50); // top left 
                gl.glVertex3f(40, 40, -60); // bottom left
                gl.glVertex3f(30, 40, -60); // bottom right
                gl.glVertex3f(20, 60, -50); // top right
                 // near roof right
                gl.glVertex3f(60, 40, -40); // bottom left 
                gl.glVertex3f(70, 40, -40); // bottom right
                gl.glVertex3f(80, 60,-50); // top right
                gl.glVertex3f(60, 60,-50); // top left
                // far roof right
                gl.glVertex3f(80, 60, -50); // top left 
                gl.glVertex3f(70, 40, -60); // bottom left
                gl.glVertex3f(60, 40,-60); // bottom right
                gl.glVertex3f(60, 60,-50); // top right
                gl.glEnd();
	        gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	        gl.glDisable(GL2.GL_CULL_FACE);
	        
	        gl.glPopMatrix();
	    }

}
