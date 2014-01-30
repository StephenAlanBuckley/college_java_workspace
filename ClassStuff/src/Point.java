
public class Point {
	
	private int x,y;
	
	//Constructor
	public Point (int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}
	
	//Default Constructor
	public Point() {
		x = y = 0;
	}
	
	//Accessors~ snags the x value from whatever you send it at.  Returns an int, which is why it's public int
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//Mutators~ take and modify the x by or to whatever you pass it to.  This doesn't return anything, hence the "void" after public.  Why do we make the x's and y's private?
	public void setx(int initialX) {
		x = initialX;
	}
	
	public void setY(int initialY) {
		y = initialY;
	}
	
	//Get R (radius) of the polar coordinate.  Why does a point have a radius?  No idea.  Obviously the radius is also the distance between them.  Ah, this is for polar coordinates, as in R thetha rotations.
	public double getRadius() {
		return Math.sqrt(x*x + y*y);
	}
	
	//Get angle of the polar coordinate
	public double getTheta() {
		return Math.toDegrees( Math.atan2(y, x) );
		
	}
	
	public void move(int dx, int dy) {
		x +=dx;
		y +=dy;
	}
}
