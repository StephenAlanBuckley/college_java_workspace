package PowerUps;



import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.Player;


import com.jogamp.opengl.util.texture.Texture;

public class HealthPack extends PowerUps
{
    private Texture healthPack;
	
	public HealthPack(int x1, int y1, int z1, Player player,GL2 gl, GLU glu)
	{

		healthPwp = true;
		this.x = x1;
		this.y = y1;
		this.z = z1;
		this.player = player;
		eye = player.getEyeLocation();
        
		healthPack = setupTexture(gl, "healthPack.png");
	}
	
	private void increaseHealth()
	{
		player.increaseHealth(20);
		
	}
	
	
	public void effects(){
		if(powered){
			disableDraw = true;
			increaseHealth();	
			flag = true;

		}
	}
	
	public void time() {	
		//no need for this class because there are no timed booleans
	}
	
	public void draw(GL2 gl, GLU glu){
		if(!disableDraw)
		{

			gl.glEnable(GL2.GL_TEXTURE_2D);
		    healthPack.bind();
		        gl.glPushMatrix();
		        gl.glTranslated(x, y, z); // 5 feet off of ground
	        	
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
	        	gl.glTexCoord2f(0f,1f); gl.glVertex3f(0,  2.5f,  2.5f);
                gl.glTexCoord2f(1f,1f); gl.glVertex3f(2.5f,  2.5f, 2.5f);
                gl.glTexCoord2f(1f,0f); gl.glVertex3f(2.5f, 0, 2.5f);
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

	public boolean isPermanent()
	{
		return false;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getZ() {
		// TODO Auto-generated method stub
		return 0;
	}



	
}