package Weapons;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import Movement.Eye;

import main.Game;
import main.Player;
import main.SketchupModelJAXB;
import main.Sounds;
public class Turret{
	private float x,y,z;
	private double direction;
	private boolean attackOn = true;
	private float charge=100;
	private GLUquadric quadric;
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	private GLU glu;
	private GL2 gl;
	private SketchupModelJAXB turret;
	private Player player;
	private Sounds gameSounds;
	
	public Turret(Player player, SketchupModelJAXB turret, float x, float z, float direction, GLU glu, GL2 gl, Sounds gameSounds, GLUquadric quadric){
		this.x=x;
		this.y= (float) -2.5;
		this.z=z;
		this.glu=glu;
		this.gl=gl;
		this.direction= direction;
		this.turret = turret;
		this.quadric= quadric;
		this.player=player;
		this.gameSounds=gameSounds;
	}

	public void update(Eye eye){
		
		
		if(attackOn){
			if(y<0){
				y+=.1;
			}
			else{
				if(charge==100){
					attack(eye);
					charge=0;
				}
				else
					charge+=4;
			}
		}
		if(!attackOn){
			if(y>-2.5){
				y-=.05;
			}
		}
		gl.glPushMatrix();
			gl.glTranslatef(x, y, z);	
			gl.glRotated(direction, 0, 1, 0);
			turret.draw(gl, glu);
		gl.glPopMatrix();
	}
	
	public void activate(){
		attackOn=true;
	}
	public void deactivate(){
		attackOn=false;
	}
	public void attack(Eye eye){
		gl.glPushMatrix();
		gl.glTranslated(x,4,z);
		gl.glColor3f(256, 0, 0);
		glu.gluSphere(quadric, 3, 10, 10);
		gl.glPopMatrix();
		player.reduceHealth(10);
		gameSounds.turret.play();
	}
}
