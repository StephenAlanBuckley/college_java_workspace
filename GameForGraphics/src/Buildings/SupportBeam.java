package Buildings;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import com.jogamp.opengl.util.texture.Texture;

public class SupportBeam {
	private static GLUquadric quadric; // to control properties of quadric-based objects
    private static GLUquadric cylinderQuadric; // the beam
    private static Texture brickTexture;     // bricks
	private float size;
    
	public SupportBeam(GL2 gl, GLU glu, float size) {
        this.size = size;
		if(quadric==null){
		quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // use true to generate texture coordinates

        cylinderQuadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cylinderQuadric, GLU.GLU_FILL);
        glu.gluQuadricNormals  (cylinderQuadric, GLU.GLU_NONE);
        glu.gluQuadricTexture  (cylinderQuadric, true); // for Signorile's head

    brickTexture     = Building.setupTexture(gl, "bricks.png");
		}
    }

	public void draw(GL2 gl, GLU glu) {
	    // glu.gluSphere(quadric,  radius, slices, stacks)
	    // glu.gluCylinder quadric, base, top, height, slices, stacks)
	    // glu.gluDisk(quadric, inner radius, outer radius, slices, stacks)

	    gl.glEnable(GL2.GL_TEXTURE_2D);
	    brickTexture.bind();
	    gl.glPushMatrix();
    	    gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright (Y)
    	    glu.gluCylinder(cylinderQuadric, 1., 1, 2, 10, 1);
    	    gl.glPushMatrix();
        	    for(int i = 1; i<size/2; i++){
        	        gl.glTranslatef(0,0,2);
        	        glu.gluCylinder(cylinderQuadric, 1., 1, 2, 10, 1);
        	        //gl.glPushMatrix(); // I don't think this is needed -- Ames
        	    }
        	    //for(int i = 0; i<size/2; i++){
        	        //gl.glPopMatrix(); // I don't think this is needed -- Ames
        	    //}
           gl.glPopMatrix();
        gl.glPopMatrix();
	    gl.glDisable(GL2.GL_TEXTURE_2D);
	}
}
