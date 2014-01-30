package Vehicles;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import Movement.*;

public abstract class Vehicle implements EyeController, KeyListener, MouseListener,
MouseMotionListener, MouseWheelListener {
	
	public abstract void drawStill(GL2 gl, GLU glu);

}
