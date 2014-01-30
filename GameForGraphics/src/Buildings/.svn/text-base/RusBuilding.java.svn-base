package Buildings;
import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import com.jogamp.opengl.util.awt.TextRenderer;

import SketchupModels.Lifegaurd;

import main.SketchupModelJAXB;


public class RusBuilding extends Building {

    private SupportBeam beam = null;
    private Lifegaurd lifechair;
    private TextRenderer renderer;

    
	public RusBuilding(GL2 gl, GLU glu){
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		beam = new SupportBeam(gl, glu, 15f);
        lifechair = new Lifegaurd(gl, glu);
	}
	
	public void drawMoving(GL2 gl, GLU glu) {
	    	       // Rus Building Text
	               gl.glPushMatrix();
	                   gl.glRotated(180, 0, 1, 0);
	                   gl.glRotated(270, 1, 0, 0);
	                   gl.glTranslated(-50, 10, .1);
	                   renderer.begin3DRendering();
	                   renderer.setColor(0, 0, 1, 1);
	                   renderer.draw3D("Swim Fan", 0f, 0f,0, .25f*1f/5);
	                   renderer.end3DRendering();
	                 gl.glPopMatrix();

	}
	
	@Override
	public void draw(GL2 gl, GLU glu) {
        

		
	gl.glPushMatrix(); // Ames change
	  gl.glTranslatef(0,0,100); // move to x&y in 0..100 range
	  	lifechair.draw(gl, glu);
		//Draw Pool Deck
		gl.glColor3f(.9f, .9f, .9f);
        gl.glBegin(GL2.GL_QUADS);
        //deck - will be split up
	        //left
		        gl.glVertex3f(0,0,0);
		        gl.glVertex3f(15,0,0);
		        gl.glVertex3f(15,0,-100);
		        gl.glVertex3f(0,0,-100);
		    //closest
		        gl.glVertex3f(0,0,0);
		        gl.glVertex3f(100,0,0);
		        gl.glVertex3f(100,0,-30);
		        gl.glVertex3f(0,0,-30);
		    //farthest
		        gl.glVertex3f(0,0,-100);
		        gl.glVertex3f(100,0,-100);
		        gl.glVertex3f(100,0,-80);
		        gl.glVertex3f(0,0,-80);
		    //right
		        gl.glVertex3f(90,0,0);
		        gl.glVertex3f(100,0,0);
		        gl.glVertex3f(100,0,-100);
		        gl.glVertex3f(90,0,-100);
        //pool walls
		        
	       //roof
	        gl.glVertex3f(5,16,-15);
	        gl.glVertex3f(100,16,-15);
	        gl.glVertex3f(100,16,-100);
	        gl.glVertex3f(5,16,-100);
        gl.glEnd();
        gl.glColor3f(0f, 1f, 1f);
        gl.glBegin(GL2.GL_QUADS);
	      //pool walls
        	//left pool is 4ft deep whole way inclines later
	        gl.glVertex3f(15,0,-80);
	        gl.glVertex3f(15,0,-30);
	        gl.glVertex3f(15,-4,-30);
	        gl.glVertex3f(15,-4,-80);
        	//back pool is 4ft deep whole way inclines later
	        gl.glVertex3f(15,0,-80);
	        gl.glVertex3f(90,0,-80);
	        gl.glVertex3f(90,-4,-80);
	        gl.glVertex3f(15,-4,-80);
	      //front pool is 4ft deep whole way inclines later
	        gl.glVertex3f(15,0,-30);
	        gl.glVertex3f(90,0,-30);
	        gl.glVertex3f(90,-4,-30);
	        gl.glVertex3f(15,-4,-30);
	      //right pool is 4ft deep whole way inclines later
	        gl.glVertex3f(90,0,-80);
	        gl.glVertex3f(90,0,-30);
	        gl.glVertex3f(90,-4,-30);
	        gl.glVertex3f(90,-4,-80);
        gl.glEnd();
        gl.glColor3f(.5f, 1f, 1f);
        gl.glBegin(GL2.GL_QUADS);
	      //pool floor
	        gl.glVertex3f(15,-4,-80);
	        gl.glVertex3f(15,-4,-30);
	        gl.glVertex3f(90,-4,-30);
	        gl.glVertex3f(90,-4,-80);
        gl.glEnd();
        //Draw Roof Support Beams
        // SupportBeam beam = new SupportBeam(gl, glu, 15f); // moved to constructor, WGA
        gl.glPushMatrix();
        	gl.glTranslatef(10,0,-75);
        	beam.draw(gl, glu);
        gl.glPopMatrix();
        gl.glPushMatrix();
	    	gl.glTranslatef(10,0,-25);
	    	beam.draw(gl, glu);
	    gl.glPopMatrix();
	    gl.glPushMatrix();
			gl.glTranslatef(95,0,-75);
			beam.draw(gl, glu);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glTranslatef(95,0,-25);
			beam.draw(gl, glu);
		gl.glPopMatrix();
		
		//Draw Stairs
		Stairs stairs = new Stairs(gl, glu, 4f, 4f, 4f, 8);
		gl.glPushMatrix();
		gl.glTranslatef(15,-4,-76);
		stairs.draw(gl, glu);
		gl.glPopMatrix();
      gl.glPopMatrix();
	}

}
