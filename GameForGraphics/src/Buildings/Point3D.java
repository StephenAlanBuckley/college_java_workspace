package Buildings;

public class Point3D {
	private double x, y, z;

	public Point3D(){
		//default set to origin
		x = 0;
		y = 0;
		z = 0;
	}

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // Setters
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }
    
    public void addToX(double delta) { x += delta; }
    public void addToY(double delta) { y += delta; }
    public void addToZ(double delta) { z += delta; }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
    
    public double calcDistance(Point3D secondPoint){
    	return (this.x-secondPoint.x)*(this.x-secondPoint.x)
    	+ (this.y-secondPoint.y)*(this.y-secondPoint.y)
    	+ (this.z-secondPoint.z)*(this.z-secondPoint.z);
    }
    
}