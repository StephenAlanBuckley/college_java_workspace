package Buildings;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

public class Stairs {
    private float stepYSize;
    private float stepZSize;
    private float stepXSize;
	private int numSteps;
	
	
	public Stairs(GL2 gl, GLU glu, float height, float width, float depth, int numSteps) {
        
        stepYSize = height/ numSteps;
        stepXSize = width;
        stepZSize = depth/ numSteps;
        this.numSteps = numSteps;
		
    }

    public void draw(GL2 gl, GLU glu) {
    	//Draw Fronts
    	gl.glColor3f(0f, 1f, 1f);
    	gl.glBegin(GL2.GL_QUADS);
    	for(int i = 0; i<numSteps; i++){
	  	        gl.glVertex3f(0,i*stepYSize,i*-stepZSize);
	  	        gl.glVertex3f(0,(i+1)*stepYSize,i*-stepZSize);
	  	        gl.glVertex3f(stepXSize,(i+1)*stepYSize,i*-stepZSize);
	  	        gl.glVertex3f(stepXSize,i*stepYSize,i*-stepZSize);
    	}
    	gl.glEnd();
    	
    	
    	//Draw Sides
        gl.glBegin(GL2.GL_QUADS);
    	for(int i = 0; i<numSteps; i++){
  	        gl.glVertex3f(stepXSize,i*stepYSize,i*-stepZSize);
  	        gl.glVertex3f(stepXSize,(i+1)*stepYSize,i*-stepZSize);
  	        gl.glVertex3f(stepXSize,(i+1)*stepYSize,-stepZSize*numSteps);
  	        gl.glVertex3f(stepXSize,i*stepYSize,-stepZSize*numSteps);
		}
    	for(int i = 0; i<numSteps; i++){
  	        gl.glVertex3f(0,i*stepYSize,i*-stepZSize);
  	        gl.glVertex3f(0,(i+1)*stepYSize,i*-stepZSize);
  	        gl.glVertex3f(0,(i+1)*stepYSize,-stepZSize*numSteps);
  	        gl.glVertex3f(0,i*stepYSize,-stepZSize*numSteps);
		}
		gl.glEnd();
    	
    	
    	//Draw Tops
    	gl.glColor3f(.5f, 1f, 1f);
    	gl.glBegin(GL2.GL_QUADS);
    	for(int i = 0; i<numSteps; i++){
	  	        gl.glVertex3f(0,(i+1)*stepYSize,i*-stepZSize);
	  	        gl.glVertex3f(0,(i+1)*stepYSize,(i+1)*-stepZSize);
	  	        gl.glVertex3f(stepXSize,(i+1)*stepYSize,(i+1)*-stepZSize);
	  	        gl.glVertex3f(stepXSize,(i+1)*stepYSize,i*-stepZSize);
    	}
    	gl.glEnd();
   }
}
