import java.util.LinkedList;


public class Sphere extends Object3D{
	private double radius;
	private Point3D center;
	private Color color;
	private boolean mirrored;
	
	public Sphere(){
	}
	
	public Sphere(Point3D centerIn, double radiusIn, Color colorIn, boolean mirroredIn){
		center = centerIn;
		radius = radiusIn;
		color = colorIn;
		mirrored = mirroredIn;
	}
	
	public Color getColor(Point3D point, Point3D light, Ray inRay, LinkedList<Object3D> objects){
		Color adjustedColor = color;
		
		if(!mirrored){
			/*
			 * shoot ray out from center to the point you're looking at
			 * shoot different ray out from point you're looking at to the light
			 * find the angle between their UNIT VECTORS using cos theta = dot Product
			 * adjust the color by a percent based on size of the angle: the smaller the angle, the larger the percent
			 */
			Ray toLight = new Ray(point, light);
			Ray surfaceN = new Ray(center, point);
			
			Point3D toLightUnitVector = toLight.getUnitVector();
			Ray toLightUnit = new Ray(toLightUnitVector);
			Point3D surfaceNUnitVector = surfaceN.getUnitVector();
			Ray surfaceNUnit = new Ray(surfaceNUnitVector);
			
			double cosTheta = toLightUnit.dotProduct(surfaceNUnit);
			
			
			//add 0.2 whenever adjusting color, such that there is a much brighter-than-normal spot toward the light, and the darkest it can get is 20% of the full color
			if(cosTheta>=0 && cosTheta<=1){
				adjustedColor.setColor(adjustedColor.getRed()*(cosTheta+0.2), adjustedColor.getGreen()*(cosTheta+0.2), adjustedColor.getBlue()*(cosTheta+0.2));
			}else{
				adjustedColor.setColor(adjustedColor.getRed()*(0.2), adjustedColor.getGreen()*(0.2), adjustedColor.getBlue()*(0.2));
			}
			
			return adjustedColor;
		}else{
			return color;
			
			/*
			 * need to come back to fix this method
			 */
		}
	}
	
	public double getT(Ray shot){
		double cx = center.getX();
		double cy = center.getY();
		double cz = center.getZ();
		double x0 = shot.getOriginX();
		double y0 = shot.getOriginY();
		double z0 = shot.getOriginZ();
		Point3D unitShot = shot.getUnitVector();
		double x1 = shot.getEndX();
		double y1 = shot.getEndY();
		double z1 = shot.getEndZ();
		
		double discriminate = 4*Math.pow((cx - x0)*(x0 - x1) + (cy - y0)*(y0 - y1) + (cz - z0)*(z0 - z1),2) - 4*(Math.pow(cx,2) - Math.pow(radius,2) - 2*cx*x0 + Math.pow(x0,2) + Math.pow(cy - y0,2) +Math.pow(cz - z0,2))*(Math.pow(x0 - x1,2) + Math.pow(y0 - y1,2) + Math.pow(z0 - z1,2));
		
		if(discriminate == 0){
			double t1 = (Math.pow(x0,2) + cx*x1 - x0*(cx + x1) - cy*y0 + Math.pow(y0,2) + cy*y1 -y0*y1 - cz*z0 + Math.pow(z0,2) + Math.sqrt(discriminate)/2.+ cz*z1 - z0*z1)/(Math.pow(x0 - x1,2) + Math.pow(y0 - y1,2) + Math.pow(z0 - z1,2));
			return t1;
		}else if(discriminate > 0){
			double t1 = (Math.pow(x0,2) + cx*x1 - x0*(cx + x1) - cy*y0 + Math.pow(y0,2) + cy*y1 - y0*y1 - cz*z0 + Math.pow(z0,2) + Math.sqrt(discriminate)/2.+ cz*z1 - z0*z1)/(Math.pow(x0 - x1,2) + Math.pow(y0 - y1,2) + Math.pow(z0 - z1,2));
			double t2 = (Math.pow(x0,2) + cx*x1 - x0*(cx + x1) - cy*y0 + Math.pow(y0,2) + cy*y1 -y0*y1 - cz*z0 + Math.pow(z0,2) - Math.sqrt(discriminate)/2.+ cz*z1 - z0*z1)/(Math.pow(x0 - x1,2) + Math.pow(y0 - y1,2) + Math.pow(z0 - z1,2));
			
			if(t1<t2 && t2>0)
				return t1;
			else
				return t2;
		}else{
			double t = -1;
			return t;
		}
	
	
	}	
	
}
