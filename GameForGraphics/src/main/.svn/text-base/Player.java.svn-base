package main;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;

import javax.media.opengl.GL2;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

import Buildings.Point3D;
import Movement.ControlBehavior;
import Movement.Eye;
import Movement.EyeController;
import Movement.LookBehavior;
import Movement.RunningBehavior;
import Movement.WalkingBehavior;
import PowerUps.PowerUps;
import Vehicles.Vehicle;
import Weapons.BasicWeaponController;
import Weapons.Famas;
import Weapons.Projectile;
import Weapons.ProjectileManager;
import Weapons.Weapon;

public class Player implements CheatsObserver, EyeController {

	private List<PlayerObserver> playerObservers = new LinkedList<PlayerObserver>();

	// This class will have to inplement DynamicObject once the interface is
	// create. Eye should should not be a member
	// of this class, eye is a property of the client drawing system, not the
	// player.

	public int health = 100;
	private Weapon[] weapons = new Weapon[10]; // not sure how many weapons we
												// will make
	private Weapon currentWeapon;
	private int numWeapons = 0;
	private int speedVal = 1;
	private PowerUps powerup;
	private boolean changeable;
	private Eye eye;
	private ControlBehavior current_cb; // we can either be walking or running
	private LookBehavior current_lb;
	private Game game;
	private GLCanvas canvas;
	private Famas famas;
	private ProjectileManager projectileManager;
	private boolean godMode = false;
	private boolean allWeapons = false;
	private boolean unlimitedAmmo = false;
	private boolean speed = false;
	private boolean onShot = false;

	private double c=.9;

	

	private CrossHair crossHair;
	private boolean crossHairOn = true;


	public Player(Game game, GLCanvas canvas, Eye eye) {
		this.eye = eye;
		current_cb = new WalkingBehavior(game, canvas, eye, this);
		current_lb = new LookBehavior(game, canvas, eye);
		this.game = game;
		this.canvas = canvas;
		new WeaponChooser(this, canvas);
		crossHair = new CrossHair();
	}

	public void setWeapon(Weapon w) {
		if (currentWeapon != null) {
			currentWeapon.stopListening();
		}
		currentWeapon = w;
		if (currentWeapon != null) {
			currentWeapon.startListening();
			for (PlayerObserver obs : playerObservers) {
				obs.updateWeaponChange(currentWeapon);
			}
		}
		addWeapon(currentWeapon);
	}

	public void setWeapon(int i) {
		if (i > weapons.length) {
			i = weapons.length -1;
		}
		if (currentWeapon != null) {
			currentWeapon.stopListening();
		}
		currentWeapon = weapons[i];
		if (currentWeapon != null) {
			currentWeapon.startListening();
		}
		for (PlayerObserver obs : playerObservers) {
			obs.updateWeaponChange(currentWeapon);
		}
	}

	public void setDefaultWeapon() {
		currentWeapon = new Famas(canvas.getGL().getGL2(), game.getGLU(), game);
		if (currentWeapon != null) {
			currentWeapon.startListening();
			for (PlayerObserver obs : playerObservers) {
				obs.updateWeaponChange(currentWeapon);
			}
		}
		addWeapon(currentWeapon);
	}

	public void draw(GL2 gl, GLU glu) {

			if (currentWeapon != null) {
				drawWeapon(gl, glu);
				if (crossHairOn) {
					crossHair.draw(gl, glu, (float) eye.getLookX(),
							(float) eye.getLookY(), (float) eye.getLookZ(),
							eye.getDirection(), eye.getTilt());
				}
			}
			
			current_cb.update();
			
			current_lb.update();
			
	}


	private void drawWeapon(GL2 gl, GLU glu) {
	
		gl.glPushMatrix();
		gl.glTranslated(
				eye.getX() + c * Math.cos(Math.toRadians(eye.getDirection())),
				eye.getY() - .4,
				eye.getZ() - c * Math.sin(Math.toRadians(eye.getDirection())));
		gl.glRotated(eye.getDirection() + 90, 0, 1, 0);
		gl.glRotated(-eye.getTilt(), 1, 0, 0);
		gl.glTranslated(-0.5, 0, 0);
		
		
		currentWeapon.drawGunMove(gl, glu, current_cb.getForG());
		
		gl.glPopMatrix();
	}
	
	public void addWeapon(Weapon w) {
		if (numWeapons > 4) {
			numWeapons = 4; // this will always overwrite the 5 weapon
		}
		weapons[numWeapons] = w;
		numWeapons++;
	}

	// returns whether the shot was actually fired
	public boolean fireWeapon() {
		if (currentWeapon.getAmmo() > 0) {
			currentWeapon.decreaseAmmo();
			// Projectile p = new Projectile(eye.getX()+c*Math.cos(Math.toRadians(eye.getDirection())),eye.getY()-.4,eye.getZ()-c*Math.sin(Math.toRadians(eye.getDirection())),eye.getDirection(),eye.getTilt());
			Projectile p = new Projectile(eye.getX(),eye.getY(),eye.getZ(),eye.getDirection(),eye.getTilt());
			projectileManager.addProjectile(p);
			if (!unlimitedAmmo) {
				for (PlayerObserver obs : playerObservers) {
					obs.updateWeaponFired(); // reduce ammo on gui by one
				}
			}
			return true;
		}
		return false; // gun is empty
	}

	public Weapon getWeapon() {
		return currentWeapon;
	}

	public boolean setHealth(int h) {

		if (changeable)
			return true;

		health = h;
		if (health <= 0) {
			health = 0;
		} else if (health >= 100) {
			health = 100;
		}
		for (PlayerObserver obs : playerObservers) {
			obs.updateHealth(health);
		}
		if (health == 0) {
			return false;
		}
		return true; // if the player is alive or dead
	}

	public boolean reduceHealth(int decrease) {
		if (!godMode) {
			int val = health - decrease;
			if (val <= 0) {
				return setHealth(0);
			} else {
				return setHealth(val);
			}
		} else { // player is in god mode so he is not effected by anything
			return true; // this means that the player is still alive
		}
	}

	public void increaseHealth(int increase) {
		setHealth(health + increase);
	}

	public int getHealth() {
		return health;
	}

	public void addPlayerObserver(PlayerObserver obs) {
		playerObservers.add(obs);
		obs.updateHealth(health);
	}

	public void setControlBehavior(ControlBehavior cb) {
		this.current_cb = cb;
		for (PlayerObserver obs : playerObservers) {
			obs.updateControlBehavior(current_cb);
		}
	}

	public void setHealthUnchangeable(boolean invinsible) {
		changeable = invinsible;
	}

	public void setImmobile(boolean turnOn) {
		if (turnOn) {
			current_cb.setImmobile();
		} else {
			current_cb.setDefaultStepSize();
		}
	}

	public void setDefaultStepSize() {
		current_cb.setDefaultStepSize();
	}

	public ControlBehavior getControlBehavior() {
		return current_cb;
	}

	public LookBehavior getLookBehavior() {
		return current_lb;
	}

	public Eye getEyeLocation() {
		return eye;
	}

	public void setEyeLocation(Eye eye) {
		this.eye = eye;
	}

	public void addAmmo(int ammo) {
		currentWeapon.addAmmo(ammo);
		for (PlayerObserver obs : playerObservers) {
			obs.updateBulletCount();
		}
	}

	@Override
	public void godModeChanged(boolean turnOn) {
		godMode = turnOn;
	}

	@Override
	public void allWeaponsChanged(boolean turnOn) {
		allWeapons = turnOn;
	}

	@Override
	public void unlimitedAmmoChanged(boolean turnOn) {
		unlimitedAmmo = turnOn;
	}

	@Override
	public void speedChanged(boolean turnOn) {
		speed = turnOn;
		current_cb.stopListening();
		if (turnOn) {
			current_cb = new RunningBehavior(game, canvas, eye, this);
			;
		} else {
			current_cb = new WalkingBehavior(game, canvas, eye, this);
			;
		}
		for (PlayerObserver obs : playerObservers) {
			obs.updateControlBehavior(current_cb);
		}
	}

	@Override
	public void oneShotChanged(boolean turnOn) {
		onShot = turnOn;
	}

	public void turnOnCrossHair(boolean turnOn) {
		crossHairOn = turnOn;
	}
	public void stopListening() {
		current_cb.stopListening();
		current_lb.stopListening();
	}

	public void setEyeLocation(Point3D point) {
		this.eye.setPoint(point);
	}

	@Override
	public Point3D getLocation() {
		return new Point3D(eye.getX(), eye.getY(), eye.getZ());
	}

	@Override
	public void startListening() {
		current_cb.startListening();
		current_lb.startListening();
	}
}
