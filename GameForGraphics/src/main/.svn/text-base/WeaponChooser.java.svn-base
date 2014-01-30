package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.media.opengl.awt.GLCanvas;

public class WeaponChooser implements KeyListener {
	
	private Player player;
	private GLCanvas canvas;
	
	public WeaponChooser(Player player, GLCanvas canvas) {
		this.player = player;
		this.canvas = canvas;
		canvas.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_1) {
			player.setWeapon(0);
		} else if(key == KeyEvent.VK_2) {
			player.setWeapon(1);
		} else if(key == KeyEvent.VK_3) {
			player.setWeapon(2);
		} else if(key == KeyEvent.VK_4) {
			player.setWeapon(3);
		} else if(key == KeyEvent.VK_5) {
			player.setWeapon(4);
		} else if(key == KeyEvent.VK_6) {
			player.setWeapon(5);
		} else if(key == KeyEvent.VK_7) {
			player.setWeapon(6);
		} else if(key == KeyEvent.VK_8) {
			player.setWeapon(7);
		} else if(key == KeyEvent.VK_9) {
			player.setWeapon(8);
		} else if(key == KeyEvent.VK_0) {
			player.setWeapon(9);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}

	@Override
	public void keyTyped(KeyEvent e) {		
	}

}
