package Weapons;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.swing.Icon;

import main.SketchupModelJAXB;

public abstract class Weapon {
	protected int clipSize;
	protected int currentClip;
	protected int ammo;
	protected Icon weaponIcon;
	protected int damage; // most likely will be 1 shot kill unless you can play against people
	protected int maxAmmo;
	protected SketchupModelJAXB model;
	protected WeaponController weaponController;
	protected boolean firing;
	protected boolean reloading;
	protected int gunM=0;	//movement of gun with wasd

	public int getClipSize() {
		return clipSize;
	}

	public void decreaseAmmo() {
		if (ammo > 0) {
			ammo--;
			currentClip--;
		}
	}

	public void isFiring(boolean fire) {
		firing = fire;
	}

	public boolean isFiring() {
		return firing;
	}

	public void isReloading(boolean reload) {
		reloading = reload;

		if (reload) {
			if (ammo <= clipSize) {
				currentClip = ammo;
			} else {
				currentClip = clipSize;
			}
		}
	}

	public boolean isReloading() {
		return reloading;
	}

	public int getCurrentClip() {
		return currentClip;
	}

	public int getAmmo() {
		return ammo;
	}

	public void addAmmo(int bullets) {
		ammo += bullets;
		if (ammo > maxAmmo) {
			ammo = maxAmmo;
		}
	}

	public Icon getImage() {
		return weaponIcon;
	}

	public int getDamageEffect() {
		return damage;
	}

	public void drawModel(GL2 gl, GLU glu) {
		model.draw(gl, glu);
	}

	public void draw(GL2 gl, GLU glu) {

	}

	public abstract void drawGunMove(GL2 gl, GLU glu, double gunM);

	public void stopListening() {
		weaponController.stopListening();
	}

	public void startListening() {
		weaponController.startListening();
	}
	public int getGunM(){
		return gunM;
	}
	public void setGunM(int move){
		gunM=move;
	}

}
