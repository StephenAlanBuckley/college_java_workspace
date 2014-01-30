import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import com.jogamp.opengl.util.texture.Texture;


public class BuckleyBuilding extends Building{
	private Texture stoneTexture;
	private Texture bedTexture;
	private Texture brickTexture;
	private Texture storyWall;
	private Texture ticTacToe;
	private Texture daysWall;
	private Texture groundTexture;
	
	
	
	public BuckleyBuilding(GL2 gl, GLU glu){
		groundTexture = setupTexture(gl, "ground.png");
		stoneTexture = setupTexture(gl, "stonework.png");
		bedTexture = setupTexture(gl, "bedsides.png");
		brickTexture = setupTexture(gl, "bedtop.png");
		storyWall = setupTexture(gl, "StoryWall.png");
		ticTacToe = setupTexture(gl, "tic-tac-toe.png");
		daysWall = setupTexture(gl, "So many days.png");
		
	}

	@Override
	public void draw(GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		
		//drawin' the ground!
		groundTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,100f); gl.glVertex3f(0,  0, 100);
			gl.glTexCoord2f(100f,100f); gl.glVertex3f(100,  0, 100);
			gl.glTexCoord2f(100f,0f); gl.glVertex3f(100, 0, 0);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 0);
		gl.glEnd();
		
		//draw the outer walls
		stoneTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
    		gl.glTexCoord2f(0f,10f); gl.glVertex3f(24,  10, 36);
    		gl.glTexCoord2f(10f,10f); gl.glVertex3f(25,  10, 20);
    		gl.glTexCoord2f(10f,0f); gl.glVertex3f(25, 0, 20);
    		gl.glTexCoord2f(0f,0f); gl.glVertex3f(24, 0, 36);
    	gl.glEnd();
    	
    	gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,10f); gl.glVertex3f(24,  10, 61);
			gl.glTexCoord2f(10f,10f); gl.glVertex3f(25,  10, 45);
			gl.glTexCoord2f(10f,0f); gl.glVertex3f(25, 0, 45);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(24, 0, 61);
		gl.glEnd();
    	
		gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(0f,10f); gl.glVertex3f(24,  10, 86);
			gl.glTexCoord2f(10f,10f); gl.glVertex3f(25,  10,70);
			gl.glTexCoord2f(10f,0f); gl.glVertex3f(25, 0, 70);
			gl.glTexCoord2f(0f,0f); gl.glVertex3f(24, 0, 86);
		gl.glEnd();
		
	gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f,10f); gl.glVertex3f(86,  10, 36);
		gl.glTexCoord2f(10f,10f); gl.glVertex3f(85,  10, 20);
		gl.glTexCoord2f(10f,0f); gl.glVertex3f(85, 0, 20);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(86, 0, 36);
	gl.glEnd();
	
	gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f,10f); gl.glVertex3f(86,  10, 61);
		gl.glTexCoord2f(10f,10f); gl.glVertex3f(85,  10, 45);
		gl.glTexCoord2f(10f,0f); gl.glVertex3f(85, 0, 45);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(86, 0, 61);
	gl.glEnd();
	
	gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f,10f); gl.glVertex3f(86,  10, 86);
		gl.glTexCoord2f(10f,10f); gl.glVertex3f(85,  10, 70);
		gl.glTexCoord2f(10f,0f); gl.glVertex3f(85, 0, 70);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(86, 0, 86);
	gl.glEnd();
	
	//let's make some ceilings
	gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f,10f); gl.glVertex3f(25,  10, 35);
		gl.glTexCoord2f(10f,10f); gl.glVertex3f(85,  10, 35);
		gl.glTexCoord2f(10f,0f); gl.glVertex3f(85, 10, 20);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(25, 10, 20);
	gl.glEnd();
	
	gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f,10f); gl.glVertex3f(25,  10, 60);
		gl.glTexCoord2f(10f,10f); gl.glVertex3f(85,  10, 60);
		gl.glTexCoord2f(10f,0f); gl.glVertex3f(85, 10, 45);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(25, 10, 45);
	gl.glEnd();
	
	gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f,10f); gl.glVertex3f(25,  10, 85);
		gl.glTexCoord2f(10f,10f); gl.glVertex3f(85,  10, 85);
		gl.glTexCoord2f(10f,0f); gl.glVertex3f(85, 10, 70);
		gl.glTexCoord2f(0f,0f); gl.glVertex3f(25, 10, 70);
	gl.glEnd();
		
		drawCell(25,20, gl, glu);
		drawCell(40,20,gl,glu);
		drawCell(55,20, gl, glu);
		drawCell(70,20,gl,glu);
		
		drawCell(25,45, gl, glu);
		drawCell(40,45,gl,glu);
		drawCell(55,45, gl, glu);
		drawCell(70,45,gl,glu);
		
		drawCell(25,70, gl, glu);
		drawCell(40,70,gl,glu);
		drawCell(55,70, gl, glu);
		drawCell(70,70,gl,glu);
	}
	
	public void drawCell(float xDir, float zDir, GL2 gl, GLU glu){
		 gl.glEnable(GL2.GL_TEXTURE_2D);
		 //Things to change:
		 // Random-wall generation (and making sure the textures are correctly matched)
		 // Making doors (random open/close)
		 
		stoneTexture.bind();
		//behind wall
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,10f); gl.glVertex3f(xDir-1,  0, zDir+16);
        	gl.glTexCoord2f(10f,10f); gl.glVertex3f(xDir+16,  0, zDir+16);
        	gl.glTexCoord2f(10f,0f); gl.glVertex3f(xDir+16, 10, zDir+16);
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir-1, 10, zDir+16);
        gl.glEnd();
        
        gl.glBegin(GL2.GL_QUADS);
        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir,  0, zDir);
        	gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir,  0, zDir+15);
        	gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir, 10, zDir+15);
        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir, 10, zDir);
        gl.glEnd();
    
        gl.glBegin(GL2.GL_QUADS);
 			gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir+15,  0, zDir+15);
 			gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+15,  0, zDir);
 			gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+15, 10, zDir);
 			gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+15, 10, zDir+15);
 		gl.glEnd();
		
		 //first wall: left wall
        daysWall.bind();
         gl.glBegin(GL2.GL_QUADS);
             gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir+1,  0, zDir);
             gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+1,  0, zDir+15);
             gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+1, 10, zDir+15);
             gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+1, 10, zDir);
         gl.glEnd();
         
         storyWall.bind();
         //second wall: back wall
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir,  0, zDir+15);
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+15,  0, zDir+15);
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+15, 10, zDir+15);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir, 10, zDir+15);
         gl.glEnd();
         
         ticTacToe.bind();
       //third wall: right wall
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir+14,  0, zDir+15);
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+14,  0, zDir);
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+14, 10, zDir);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+14, 10, zDir+15);
         gl.glEnd();
         
         //fourth wall has 3 parts
       //4:1
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,10f); gl.glVertex3f(xDir,  0, zDir);
         	gl.glTexCoord2f(15f,10f); gl.glVertex3f(xDir+6,  0, zDir);
         	gl.glTexCoord2f(15f,0f); gl.glVertex3f(xDir+6, 7, zDir);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir, 7, zDir);
         gl.glEnd();
         
       //4:2
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,10f); gl.glVertex3f(xDir,  7, zDir);
         	gl.glTexCoord2f(15f,10f); gl.glVertex3f(xDir+15,  7, zDir);
         	gl.glTexCoord2f(15f,0f); gl.glVertex3f(xDir+15, 10, zDir);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir, 10, zDir);
         gl.glEnd();
         
       //4:3
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,10f); gl.glVertex3f(xDir+9,  0, zDir);
         	gl.glTexCoord2f(15f,10f); gl.glVertex3f(xDir+15,  0, zDir);
         	gl.glTexCoord2f(15f,0f); gl.glVertex3f(xDir+15, 7, zDir);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+9, 7, zDir);
         gl.glEnd();
         
         
       //draw the cot
       //cot:top
         brickTexture.bind();
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir+12,  2.5f, zDir+12);
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+15,  2.5f, zDir+12);
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+15, 2.5f, zDir+5);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+12, 2.5f, zDir+5);
         gl.glEnd();
         
         bedTexture.bind();
       //cot:bottom side
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+12,  2.5f, zDir+5);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+15,  2.5f, zDir+5);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir+15, 0, zDir+5);
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+12, 0, zDir+5);
         gl.glEnd();
         
       //cot:left side
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+12,  2.5f, zDir+12);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+12,  2.5f, zDir+5);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir+12, 0, zDir+5);
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+12, 0, zDir+12);
         gl.glEnd();
         
         //cot:top side
         gl.glBegin(GL2.GL_QUADS);
         	gl.glTexCoord2f(1f,0f); gl.glVertex3f(xDir+12,  2.5f, zDir+12);
         	gl.glTexCoord2f(0f,0f); gl.glVertex3f(xDir+15,  2.5f, zDir+12);
         	gl.glTexCoord2f(0f,1f); gl.glVertex3f(xDir+15, 0, zDir+12);
         	gl.glTexCoord2f(1f,1f); gl.glVertex3f(xDir+12, 0, zDir+12);
         gl.glEnd();
      
     gl.glDisable(GL2.GL_TEXTURE_2D);
	}

}
