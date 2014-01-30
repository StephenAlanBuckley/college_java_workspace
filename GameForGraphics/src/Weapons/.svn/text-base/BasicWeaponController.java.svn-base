package Weapons;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.media.opengl.awt.GLCanvas;

import main.Game;

public class BasicWeaponController implements WeaponController {

	private Game game;
	private GLCanvas canvas;
	private Weapon weapon;

	public BasicWeaponController(Game game, Weapon weapon) {
		this.game = game;
		this.weapon = weapon;
		canvas = game.getCanvas();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (!e.isControlDown() && e.getButton() == MouseEvent.BUTTON1) {
			if (!weapon.isFiring() && !weapon.isReloading() && weapon.getCurrentClip() > 0) {
				weapon.isFiring(true);
				game.fireWeapon();
			} else if (!weapon.isFiring() && !weapon.isReloading()) {
				if (!weapon.isReloading() && weapon.getAmmo() > 0) {
					weapon.isReloading(true);
					game.reloadWeapon();
					System.out.println("Reload Weapon");
				}
			}

		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		/*
		 * We may decide to have other keys here
		 */
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_R) {
			if (!weapon.isReloading() && !weapon.isFiring()) {
				weapon.isReloading(true);
				game.reloadWeapon();
				System.out.println("Reload Weapon");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void stopListening() {
		canvas.removeMouseListener(this);
		canvas.removeKeyListener(this);
	}

	public void startListening() {
		canvas.addMouseListener(this);
		canvas.addKeyListener(this);
	}
}
