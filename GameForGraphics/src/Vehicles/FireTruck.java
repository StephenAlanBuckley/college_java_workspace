package Vehicles;

import javax.media.opengl.GL2;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

import main.Game;
import main.SketchupModelJAXB;
import Movement.Eye;

public class FireTruck extends Car {

	public FireTruck(Game game, GLCanvas canvas, Eye eye, GL2 gl, GLU glu,
			double xLoc, double yLoc, double zLoc) {
		
		super(game, canvas, eye, gl, glu, xLoc, yLoc, zLoc, 5, 1,
				1, 0.1, new SketchupModelJAXB("firetruck2.dae", gl, glu));
	}
	
}
