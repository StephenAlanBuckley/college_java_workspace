package PowerUps;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.Player;

import com.jogamp.opengl.util.texture.Texture;

public class Star extends PowerUps
{
    private Texture star;
	
	public Star(int x1, int y1, int z1, Player player, GL2 gl, GLU glu)
	{
		super();
		s = 0; 
		angle = 4;
		
		x = x1;
		y = y1;
		z = z1;
		this.player = player;  
		eye = player.getEyeLocation();
        
		star = setupTexture(gl, "star.png");
	}	
	
	private void maintainHealth()
	{
		if(powered)
			player.setHealthUnchangeable(true);
		else
			player.setHealthUnchangeable(false);
	}
	
	
	public void draw(GL2 gl, GLU glu)
	{
		if(!disableDraw){
		angle += 4;
		gl.glEnable(GL2.GL_TEXTURE_2D);
	    star.bind();
	        gl.glPushMatrix();
	            gl.glTranslated(x, 5, z); // 5 feet off of ground
	            gl.glRotated(angle,0,1,0);
	        	gl.glRotatef(90,1,0,0);
	        	
	        	gl.glBegin(GL2.GL_QUADS);
	        	gl.glTexCoord2f(0f,0f); gl.glVertex3f(0,  0, 0);
                gl.glTexCoord2f(1f,0f); gl.glVertex3f(2.5f,  0, 0);
                gl.glTexCoord2f(1f,1f); gl.glVertex3f(2.5f, 0, 2.5f);
                gl.glTexCoord2f(0f,1f); gl.glVertex3f(0, 0, 2.5f);
	    	    gl.glEnd();
	        gl.glPopMatrix();
        gl.glDisable(GL2.GL_TEXTURE_2D);
		}
	}

	public boolean isPermanent()
	{
		return false;
	}

	public void effects() {
			
		maintainHealth();
			if(powered){
				time();
				disableDraw = true;
			}
	
			
	}

	public void time() {
		s += 1;
		if(s >= 200)
		{
			//System.out.println("AAAAAAAAAAAAAAA");
			s = 0;
			powered = false;
			maintainHealth(); //Change health back to normal back
			
			flag = true;
				
			
		}
		
	}
}