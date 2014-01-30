
public class Ray {
	private Point3d start;
	private Point3d second;
	
	public Ray(Point3d begin, Point3d next){
		start = begin;
		second = next;
	}
	
	public Ray returnNormal(){
		double a,b,c,x,y,z, mag;
		
		mag = this.returnMagnitude();
		
		a = start.getX();
		b = start.getY();
		c = start.getZ();
		
		x = second.getX();
		y = second.getY();
		z = second.getZ();
		
		Point3d normalPlace = new Point3d((x-a)/mag, (y-b)/mag, (z-c)/mag);
		return new Ray(start, normalPlace);
	}

	public Point3d normalAsPoint(){
		double a,b,c,x,y,z, mag;
		
		mag = this.returnMagnitude();
		
		a = start.getX();
		b = start.getY();
		c = start.getZ();
		
		x = second.getX();
		y = second.getY();
		z = second.getZ();
		
		Point3d normalPlace = new Point3d((x-a)/mag, (y-b)/mag, (z-c)/mag);
		return normalPlace;
	}
	
	public double returnMagnitude(){
		double a,b,c,x,y,z, result;
		
		a = start.getX();
		b = start.getY();
		c = start.getZ();
		
		x = second.getX();
		y = second.getY();
		z = second.getZ();
		
		result = Math.sqrt(Math.pow((x-a), 2) + Math.pow((y-b), 2) + Math.pow((z-c), 2));
		return result;
	}
	
	public void setStart(Point3d begin){
		start = begin;
	}
	
	public void setSecond(Point3d next){
		second = next;
	}
	
	public void translateTo(Point3d whereTo){
		double x,y,z;
		x= whereTo.getX()- start.getX();
		y= whereTo.getY()- start.getY();
		z= whereTo.getZ() - start.getZ();
		
		start = whereTo;
		second = new Point3d(second.getX()+x, second.getY() +y, second.getZ()+z);
	}
	
	public Point3d getPointAt(double t){
		double x, y, z;
		Point3d myNorm = this.normalAsPoint();
		
		x = start.getX() + t*myNorm.getX();
		y= start.getY() + t* myNorm.getY();
		z= start.getZ() + t* myNorm.getZ();
		
		return new Point3d(x,y,z);
	}
}
