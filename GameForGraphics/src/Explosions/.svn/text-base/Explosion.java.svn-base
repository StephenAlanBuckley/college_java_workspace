package Explosions;

import java.util.LinkedList;
import java.util.List;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Explosion {

/* 
 * Two constructors:
 * Use Explosion.createNewExplosion(double xLoc,double yLoc,double zLoc) to create an explosion that loops 10 times
 * Use Explosion.createNewExplosion(double xLoc,double yLoc,double zLoc, double radius, int loopNum) to create an explosion with specific radius / loop
 */
	private double xLoc,yLoc,zLoc;
	private double radius;
	private int state;
	private int loopNum;
	
	private static List<Explosion> explosionList = new LinkedList<Explosion>();
	private static int numState = 50;
	private static GLUquadric sphereQuadric;
	private static int slices = 10;
	private static int stacks = 10;
	private static int defaultRadius = 10;
	private static int defaultLoopNum = 10;
   
    
	//Private constructor for adding one explosion
	private Explosion(double xLoc, double yLoc, double zLoc,int state, double radius, int loopNum){
		
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.zLoc = zLoc;
		this.state = state % numState;
		this.radius = radius;
		this.loopNum = loopNum;
		
	}

	//Public static constructors
	public static void createNewExplosion(double xLoc,double yLoc,double zLoc){

		explosionList.add(new Explosion(xLoc,yLoc,zLoc,0,defaultRadius,defaultLoopNum));
		
	}
	//Take in Location x, y, z, explosion radius, and number of loops to repeat
	public static void createNewExplosion(double xLoc,double yLoc,double zLoc, double radius, int loopNum){

		explosionList.add(new Explosion(xLoc,yLoc,zLoc,0,radius,loopNum));
		
	}
	
	public static void drawAllExplosions(GL2 gl, GLU glu){
		
		if(sphereQuadric == null){
			sphereQuadric = glu.gluNewQuadric();
			glu.gluQuadricDrawStyle(sphereQuadric, GLU.GLU_FILL);
			glu.gluQuadricNormals  (sphereQuadric, GLU.GLU_NONE);
			glu.gluQuadricTexture  (sphereQuadric, false);
		}
		    
		List<Explosion> removeList = new LinkedList<Explosion>();
		
		for(Explosion ex : explosionList){
			
			ex.draw(gl, glu);
			
			if(ex.getLoopNum()<0){
				removeList.add(ex);
			}
		}
		
		for(Explosion ex : removeList){
			explosionList.remove(ex);
		}
	}

	//Draw explosion, increment state and decrement loopNum as needed
	public void draw(GL2 gl, GLU glu)
	{	
		gl.glPushMatrix();
			gl.glColor3d(1, ((double) state)/numState, 0f);
	        gl.glTranslated(xLoc, yLoc, zLoc); // 5 feet off of ground
			glu.gluSphere(sphereQuadric, radius*state/numState, slices, stacks);
		gl.glPopMatrix();
		
		state++;
		if(state>=numState){
			loopNum--;
			state = state % numState;
		}	
	}
	
	public int getLoopNum(){
		return loopNum;
	}

}
