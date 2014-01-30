package Buildings;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
/**
 * 
 * @author Doug Hernandez
 * Graphics AMES
 *
 */

public class archerTargets {
	private GLUquadric quadric; // to control properties of quadric-based objects
//	private GLUquadric triangle;
//	private GLUquadric circle;
	
	
    public archerTargets(GL2 gl, GLU glu) {
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, true);        // use true to generate texture coordinates

        
    }
    //draws the side for the target[triangles]
    private void drawside(GL2 gl, GLU glu, double r){
    	gl.glColor3f(1f, .5f, .2f);
    	gl.glPushMatrix();
    		
    		gl.glTranslated(0,0,0);
    		
    		
    		gl.glPushMatrix();
    			
    			for(int thick=0;thick<=30;thick++){
    			gl.glBegin(GL2.GL_TRIANGLES);
    			gl.glVertex3d(-r, 0, 0);
    			gl.glVertex3d(-r, -r,-r/2);
    			gl.glVertex3d(-r, -r, r/2);
    			gl.glEnd();
    			gl.glTranslated(.01, 0, 0);

    			}
    			
    			
    		gl.glPopMatrix();
    	gl.glPopMatrix();
    	
    }
    //Draws the target and attaches the sides
    public void body(GL2 gl, GLU glu, double lRadius){
    	gl.glColor3d(0, 0, 0);
    	
    	double largestR=lRadius;
    	
    		gl.glPushMatrix();
    			gl.glTranslated(0,0,0);
    			drawCircle(largestR,50,gl);
    		
    			gl.glTranslated(0,0,.01);
    			gl.glColor3d(0, 0, 1);
    			drawCircle(largestR/2,50,gl);
    		
    			gl.glTranslated(0,0,.01);
    			gl.glColor3d(1, 0, 0);
    			drawCircle(largestR/4,50,gl);
    		
    			gl.glTranslated(0,0,.01);
    		gl.glColor3d(1, 1, 0);
    		drawCircle(largestR/8,50,gl);
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    		drawside(gl,glu,largestR);
    		gl.glTranslated(2*largestR, 0, 0);
    		drawside(gl,glu,largestR);
    	gl.glPopMatrix();
    		
   
    		
    		
    		
    }
    //Draws the target Circle
    private void drawCircle(double r,double incr, GL2 gl){
	
	double increment=2*Math.PI/incr;
	gl.glBegin(GL2.GL_TRIANGLE_FAN);
		gl.glVertex3d(0,0,0);
		
	for(double angle=0; angle<=2*Math.PI;angle+=increment){
		gl.glVertex3d(Math.cos(angle)* r, Math.sin(angle)* r, 0);
		gl.glVertex3d(Math.cos(angle + increment)*r, Math.sin(angle + increment)*r,0);
  		

	}
	gl.glEnd();
    }
    //creates arrows, of length X, y and z effect arrowhead size and feathers
   public void drawArrow(GL2 gl, GLU glu, double x, double y,double z){
	   double factor=.02;
	   //double triangleFactor=.59;
	   gl.glColor3d(.53,.2,0);
	   gl.glBegin(GL2.GL_LINES);
		   gl.glVertex3d(x, y, z);
		   gl.glVertex3d(-x,y,z);			//the main shaft
		gl.glEnd();
		   
		gl.glPushMatrix(); 
		gl.glColor3d(.1,.2,.8);
			for(int i=0;i<=2;i++){
			gl.glRotated(90, 1, 0, 0);
				gl.glPushMatrix(); 
		   		
		   		for(int j=0;j<=2;j++){
		   		gl.glBegin(GL2.GL_LINES);
		   		gl.glVertex3d(-x+factor, y, z);
		   		gl.glVertex3d(-x*(factor*60), y, z+factor);		//feathers
		   		gl.glEnd();
		  		gl.glTranslated(.1, 0, 0);
		   		}
		   		gl.glPopMatrix();
			}
			
		gl.glPopMatrix();
		gl.glColor3d(.5,.5,.5);
	gl.glPushMatrix();
		for(int i=0;i<=10;i++){
		
		gl.glBegin(GL2.GL_TRIANGLES);					//arrowhead
		gl.glVertex3d(x, y, z+(factor*1.4));
		gl.glVertex3d(x, y, z-(factor*1.4));
		gl.glVertex3d(x+(factor*3), y, z);
		gl.glEnd();
		gl.glRotated(36,1,0,0);
		}
	gl.glPopMatrix();
	
	
	   

		   
	   
	   
   }
}
