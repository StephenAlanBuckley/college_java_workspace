package Bats;
import java.util.LinkedList;
import java.util.List;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.BatObserver;
import main.Player;
import main.PlayerObserver;
import Movement.ControlBehavior;
import Movement.Eye;
import Weapons.ProjectileObserver;
import Weapons.Weapon;


public class BatManager{
	private List<Bats> bats = new LinkedList<Bats>();
	private List<Bats> delete = new LinkedList<Bats>();
	private double maxX, maxZ;
	private int t;
	private int ticks = 500;
	private float playX, playY, playZ;
	private Player player;
	private boolean fired = false;
	private List<BatObserver> observers = new LinkedList<BatObserver>();
	private int score = 0;
	
	public BatManager(Player player, float maxX, float maxZ){
		this.maxX = maxX;
		this.maxZ = maxZ;
		this.player = player;
	}
	
	
	public void startRandomize(GL2 gl, GLU glu){
		t++;
		if(t%ticks == 1){
			createBat(gl, glu);
			System.out.println("Another Bat created!!");
			for (BatObserver obs : observers) {
				obs.updateBatCount(bats.size());
			}
		}
		if(ticks > 60){
		calcTick();
		}
	}
	
	private void calcTick(){
		if(t%100 == 0){
			ticks--;
		}
	}
	
	public void createBat(GL2 gl, GLU glu){
		float tempX, tempZ;
		Bats bat;
		int kind = (int)(Math.random() * 3);
		int conors = (int)(Math.random() * 3);
		if(conors == 0){
			tempX = 0;
			tempZ = (float) maxZ;
		}else if(conors == 1){
			tempX = (float) maxX;
			tempZ = (float) maxZ;
		}else{
			tempX = (float) maxX;
			tempZ = 0;
		}
		
		if (kind == 0){
			bat = new BlackBat(glu, tempX, 0, tempZ, 0);
		}else if (kind == 1){
			bat = new MetalBat(glu, tempX, 0, tempZ, 0);
		}else{
			bat = new YellowBat(glu, tempX, 0, tempZ, 0);
		}
		
		bats.add(bat);
	}
	
	public void draw(GL2 gl, GLU glu){
		if(!bats.isEmpty()){
		for(Bats i: bats){
			i.setPlayLocation((float)playX, (float)playY, (float)playZ);
			i.draw(gl, glu);
			i.move();
		}
		killBat();
		}
	}
	
	public void attackPlayer(){
		int attacking = 0;
		for(Bats i: bats){
			attacking += i.attacking();
		}
		player.reduceHealth(attacking);
	}
	
	
	
	
	
	public void setPlayLocation(Eye eye){
		playX = (float) eye.getX();
		playY = (float) eye.getY();
		playZ = (float) eye.getZ();
	}
	
	public List<Bats> getBats() { return bats; }
	
	public void addBatObserver(BatObserver obs) {
		observers.add(obs);
		obs.updateBatCount(bats.size());
	}

	public void updateProjectile(double x, double y, double z) {
		if(!bats.isEmpty()){
		for(Bats i : bats){
			float a = i.getX();
			float b = i.getY();
			float c = i.getZ();
			
			if((float)x >= a-4 && (float)x <= a+4){
				if((float)y >= b-2 && (float)y <= b+2){
					if((float)z >= c-4 && (float)z <= c+4){
						i.healthTracker(50);
					}
				}
			}
		}
		}
	}
	
	private void killBat(){
		if(!bats.isEmpty()){
		for(Bats i: bats){
			if(i.isDead()){
				delete.add(i);
				score++;
				System.out.println("Your score is : " + score);
			}
		}
		if(!delete.isEmpty()){
			for(Bats i: delete){
				bats.remove(i);
			}
		}
		}
		
		for (BatObserver obs : observers) {
			obs.updateBatCount(bats.size());
		}
	}

}

    