package PowerUps;


import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.Player;
import main.Sounds;

import Buildings.Building;
import Movement.Eye;

import com.jogamp.opengl.util.texture.Texture;

/**
 * This is an abstract class that holds methods and variables that are common to all 
 * powerups. If we have to change code in these methods, then we will only need to 
 * change it here rather than in every class.
 */

public abstract class PowerUps 
{
	protected boolean disableDraw = false;
	protected boolean powered = false;  
	protected boolean flag = false;
	protected boolean fourLokoActive = false;
	
	public boolean hiddenPwp = false; //already got this one
	public boolean starPwp = false; //
	public boolean freezePwp = false;
	public boolean ammoPwp = false;
	public boolean lokoPwp = false;
	public boolean healthPwp = false;
	
	protected int x, y, z;
	protected Player player;
	protected Eye eye;
    protected double t = 0,  s = 1, angle = 4;
	protected boolean powerUpActive=true;
    protected static final double PI = 3.14;
	
	public abstract void draw(GL2 gl, GLU glu);
	public abstract void effects();
	public abstract void time();
	public abstract boolean isPermanent();
	
	public boolean nullFlag(){return flag;}
	
	public boolean getLokoActive(){return fourLokoActive;}
	
	public Texture setupTexture(GL2 gl, String filename) {
	    return Building.setupTexture(gl, filename);
    }
	
	public void pickedUp(Sounds gameSounds)
	{
		if((Math.abs(x - eye.getX()) < 6) && 
		   (Math.abs(y - eye.getY()) < 6) &&
		   (Math.abs(z - eye.getZ()) < 6) &&
		   powerUpActive){
			System.out.println("Picked Up");
			powered = true;
			disableDraw = true;
			powerUpActive=false;
			if(hiddenPwp){
				gameSounds.powerup.play();
			}else if(healthPwp){
				gameSounds.health.play();
			}else if(starPwp){
				gameSounds.star.play();
			}else if(freezePwp){
				gameSounds.freeze.play();
			}else{
			gameSounds.wilhelm.play();
			}
		}	
	}
	
	public double getX() {return x;}
	public double getY() {return y;}
	public double getZ() {return z;}
	
	protected double calculateHeight(){
		double height = -2*Math.sin(2*PI*t);
		return height;
	}
}
