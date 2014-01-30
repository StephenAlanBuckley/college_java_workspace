package PowerUps;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.Player;

import com.jogamp.opengl.util.texture.Texture;

public class Ammo extends PowerUps{

	private Texture boxTexture;
	
	public Ammo(int x, int y, int z, Player player, GL2 gl, GLU glu){
		super();
		t = 0;
		
		
		ammoPwp=true;
		this.x = x;
		this.y = y;
		this.z = z;
		this.player = player;
		eye = player.getEyeLocation();
		
		boxTexture = setupTexture(gl, "ammobox.png");
	}
	

	
	
	public void effects() {
		if(powered){
			disableDraw = true;
			flag = true;
			player.addAmmo(5);
		}
	}

	public void time() {
		//no need for this class because there are no timed booleans
	}
	
	public void draw(GL2 gl, GLU glu) {
		if(!disableDraw)
		{
			t += .008;
			if(t >= 1)
				t = 0;
			gl.glEnable(GL2.GL_TEXTURE_2D);
		    boxTexture.bind();
		        gl.glPushMatrix();
		            gl.glTranslated(x, calculateHeight()+y, z); // 5 feet off of ground
		        	
		        	gl.glBegin(GL2.GL_QUADS);
		        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(2.5f,  0,  0);
	                gl.glTexCoord2f(1f,1f); gl.glVertex3f(2.5f,  2.5f, 0);
	                gl.glTexCoord2f(1f,0f); gl.glVertex3f(0, 2.5f, 0);
	                gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 0);
		    	    gl.glEnd();
		    	    
		    	    gl.glBegin(GL2.GL_QUADS);
		        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(2.5f,  0, 2.5f);
	                gl.glTexCoord2f(1f,1f); gl.glVertex3f(2.5f,  2.5f, 2.5f);
	                gl.glTexCoord2f(1f,0f); gl.glVertex3f(2.5f, 2.5f, 0);
	                gl.glTexCoord2f(0f,0f); gl.glVertex3f(2.5f, 0, 0);
		    	    gl.glEnd();
		    	    
		    	    gl.glBegin(GL2.GL_QUADS);
		        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(2.5f,  2.5f,  2.5f);
	                gl.glTexCoord2f(1f,1f); gl.glVertex3f(0,  2.5f, 2.5f);
	                gl.glTexCoord2f(1f,0f); gl.glVertex3f(0, 2.5f, 0);
	                gl.glTexCoord2f(0f,0f); gl.glVertex3f(2.5f, 2.5f, 0);
		    	    gl.glEnd();
		    	    
		    	    gl.glBegin(GL2.GL_QUADS);
		        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(0,  0,  2.5f);
	                gl.glTexCoord2f(1f,1f); gl.glVertex3f(0,  2.5f, 2.5f);
	                gl.glTexCoord2f(1f,0f); gl.glVertex3f(0, 2.5f, 0);
	                gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 0);
		    	    gl.glEnd();
		    	    
		    	    gl.glBegin(GL2.GL_QUADS);
	                gl.glTexCoord2f(0f,1f); gl.glVertex3f(2.5f, 0, 2.5f);
	                gl.glTexCoord2f(1f,1f); gl.glVertex3f(2.5f,  2.5f, 2.5f);
	                gl.glTexCoord2f(1f,0f); gl.glVertex3f(0,  2.5f,  2.5f);
	                gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 2.5f);
		    	    gl.glEnd();
		    	    
		    	    gl.glBegin(GL2.GL_QUADS);
		        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(0,  0,  2.5f);
	                gl.glTexCoord2f(1f,1f); gl.glVertex3f(2.5f,  0, 2.5f);
	                gl.glTexCoord2f(1f,0f); gl.glVertex3f(2.5f, 0, 0);
	                gl.glTexCoord2f(0f,0f); gl.glVertex3f(0, 0, 0);
		    	    gl.glEnd();
		        gl.glPopMatrix();
	        gl.glDisable(GL2.GL_TEXTURE_2D);
		}
	}
	
	public boolean isPermanent() {return false;}

}
