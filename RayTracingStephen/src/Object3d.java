public class Object3d {
	
	private Color myHue;
	private Point3d center;
	
	public Color getColor(Point3d where){
		
		return myHue;
	}
	
	public double getIntersection(Ray incoming){
		//This will be extended by the sphere and plane classes respectively.
		return 0;
	}
	
	public Ray getNormal(Point3d where){
		//This will be the ray of the normal from the object at the point
		return new Ray(center, where);
		//Also, this is maybe not a ray?  Might want to return a point
	}

}
