import java.util.Iterator;
import java.util.LinkedList;


public class Ray {

	private double  x0, y0, z0, //origin of ray
					x1, y1, z1, //endpoint of ray, specifically the vector that spans the ray
					ux, uy, uz, //unit vector
					vx, vy, vz, //full vector
					mag; //magnitude

	public Ray(Point3D start, Point3D end){
		x0 = start.getX();
		x1 = end.getX();
		
		y0 = start.getY();
		y1 = end.getY();
		
		z0 = start.getZ();
		z1 = end.getZ();
		
		vx = x1-x0;
		vy = y1-y0;
		vz = z1-z0;
		
		mag = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2) + Math.pow(vz,2));
		
		ux = vx/mag;
		uy = vy/mag;
		uz = vz/mag;
	}
	
	public Ray(Point3D point){ //creates a Ray between (0,0,0) and the point, can be used as a representation of a vector
		x0 = 0;
		x1 = point.getX();
		
		y0 = 0;
		y1 = point.getX();
		
		z0 = 0;
		z1 = point.getX();
		
		vx = x1;
		vy = y1;
		vz = z1;
		
		mag = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2) + Math.pow(vz,2));
		
		ux = vx/mag;
		uy = vy/mag;
		uz = vz/mag;
	}
	
	public Point3D getUnitVector(){return new Point3D(ux, uy, uz);}
	public Point3D getFullVector(){return new Point3D(vx, vy, vz);}
	public double getMagnitude(){return mag;}
	public double getOriginX(){return x0;}
	public double getOriginY(){return y0;}
	public double getOriginZ(){return z0;}
	public double getEndX(){return x1;}
	public double getEndY(){return y1;}
	public double getEndZ(){return z1;}
	public Point3D getPointAtT(double t){
		double x = x0+t*(x1-x0);
		double y = y0+t*(y1-y0);
		double z = z0+t*(z1-z0);
		Point3D result = new Point3D(x,y,z);
		return result;}
	
	public ObjectPoint nearestIntersection(LinkedList<Object3D> objects){
		int transactionCount = 0;
		double finalT = Double.MAX_VALUE;
		ObjectPoint objectPoint = new ObjectPoint();
    	for(Iterator<Object3D> it = objects.iterator(); it.hasNext(); ){
    		Object3D thisObject = it.next();
    		double tempT = thisObject.getT(this);
    		if(tempT < finalT && tempT>0.001){ //Parameter T must be positive (in front of eye), but further out than the surface of the eye
    			objectPoint.setData(thisObject, getPointAtT(tempT));
    			finalT = tempT;
    			transactionCount++;
    		}
    	}
    	if(transactionCount==0 || finalT == Double.MAX_VALUE)
    		return null;
    	return objectPoint;
	}
	
	public double dotProduct(Ray otherRay){
		double result;
		
		double xsProd = vx*otherRay.getFullVector().getX();
		double ysProd = vy*otherRay.getFullVector().getY();
		double zsProd = vz*otherRay.getFullVector().getZ();
		
		result = xsProd+ysProd+zsProd;
		
		return result;
	}
	
	
	
}
