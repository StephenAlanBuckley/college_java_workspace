import java.util.LinkedList;


public class ObjectPoint {
	private Object3D object;
	private Point3D point;
	
	public ObjectPoint(){
		object = new Object3D();
		point = new Point3D();
	}
	
	public void setData(Object3D ob, Point3D p){
		object = ob;
		point = p;
	}
	
	public Color getColor(Point3D light, Ray r, LinkedList<Object3D> obs){
		return object.getColor(point, light, r, obs);
	}
	
	public Point3D getPoint(){
		return point;
	}
	
	
}
