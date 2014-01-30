package PowerUps;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.Player;

import com.jogamp.opengl.util.texture.Texture;

public class FreezeItem extends PowerUps
{
    private GLUquadric canQuadric, quadric; 
    private Texture freeze;
	
	public FreezeItem(int x1, int y1, int z1, Player player, GL2 gl, GLU glu)
	{
		super();
		t = 0; 
		s=0; 
		angle = 4;
		
		x = x1;
		y = y1;
		z = z1;
		eye = player.getEyeLocation();
		this.player = player;
		freezePwp = true;
		
		canQuadric = glu.gluNewQuadric();		
        glu.gluQuadricDrawStyle(canQuadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (canQuadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (canQuadric, true);        // use true to generate texture coordinates
        
        quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL);
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); 
        glu.gluQuadricTexture  (quadric, false);        
        
		freeze = setupTexture(gl, "freeze.png");
	}
	
	public void draw(GL2 gl, GLU glu){
		if(!disableDraw)
		{
		t += .008;
		if(t >= 1)
			t = 0;
		angle += 4;
		gl.glEnable(GL2.GL_TEXTURE_2D);
	    freeze.bind();
	        gl.glPushMatrix();
	            gl.glTranslated(x, calculateHeight()+6, z); // 5 feet off of ground
	            gl.glRotated(angle,0,1,0);
	        	gl.glRotatef(90,1,0,0);
	            glu.gluCylinder(canQuadric, 1., 1, 4, 10, 1);
	            drawTop(gl, glu);
	        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);
		}
	}
	
	public void drawTop(GL2 gl, GLU glu){
		gl.glPushMatrix();
			gl.glColor3f(.1f,.1f,.1f);
			
			glu.gluDisk(quadric, 0, 1, 10, 10);
		gl.glPopMatrix();
	}

	public boolean isPermanent()
	{
		return false;
	}
	
	public void effects()
	{
		if(powered){
			freeze(true);
			time();
			disableDraw = true;
		}
		}
	public void time(){
		s += 1;
	if(s >= 100)
	{
		//System.out.println("AAAAAAAAAAAAAAA");
		s = 0;
		powered = false;
		freeze(false); //Change speed back
		
			flag = true;

		}

	}
	
	private void freeze(boolean freeze)
	{
		player.setImmobile(freeze);
	}
}
