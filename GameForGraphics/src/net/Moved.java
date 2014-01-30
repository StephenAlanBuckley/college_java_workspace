package net;

import java.io.*;
import java.util.StringTokenizer;

public class Moved extends Action {

	private double x, y, z;
	
	Moved(MoveableDynamicObj parent) {
		super(parent);
		this.type = "moved";
	}
	
	Moved(MoveableDynamicObj parent, double newX, double newY, double newZ) {
		this(parent);
		x = newX;
		y = newY;
		z = newZ;
	}



	@Override
	String encode(){
		return x + "|" + y + "|" + z;
	}



	@Override
	void decode(StringTokenizer in){
		((MoveableDynamicObj)parent).setLocation(nextDouble(in), nextDouble(in), nextDouble(in));
		
	}

}
