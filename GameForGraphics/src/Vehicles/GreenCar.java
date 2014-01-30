package Vehicles;

import javax.media.opengl.GL2;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

import Movement.Eye;
import main.Game;
import main.SketchupModelJAXB;

public class GreenCar extends Car {

	public GreenCar(Game game, GLCanvas canvas, Eye eye, GL2 gl, GLU glu, double xLoc, double yLoc, double zLoc){
		
		super(game, canvas, eye, gl, glu, xLoc, yLoc, zLoc, 10, 1, 1, 0.1, new SketchupModelJAXB("luoCar.dae", gl, glu));
	}
}
