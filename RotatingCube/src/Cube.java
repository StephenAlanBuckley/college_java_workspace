import javax.media.opengl.GL2;

public class Cube {
	private Point3d[] points= new Point3d[8];
	
	public Cube(){
		points[0] = new Point3d(-3,-3,3);
		points[1] = new Point3d(3,-3,3);
		points[2] = new Point3d(-3,3,3);
		points[3] = new Point3d(3,3,3);
		points[4] = new Point3d(-3,-3,-3);
		points[5] = new Point3d(3,-3,-3);
		points[6] = new Point3d(-3,3,-3);
		points[7] = new Point3d(3,3,-3);
	}
	
	public void rotateAll(Transform t){
		for (int i=0; i<8; i++){
			points[i] = t.multiply(points[i]);
		}
	}
	
	public void drawCube(GL2 gl){
		
		for (int i=0; i<7;i++){
			for (int j=i+1;j<8;j++){
				gl.glBegin(gl.GL_LINES);
				gl.glVertex3d(points[i].getX(), points[i].getY(), points[i].getZ());
				gl.glVertex3d(points[j].getX(), points[j].getY(), points[j].getZ());
				//System.out.println("Point A "+points[i].getX() +"," + points[i].getY()+ "," +points[i].getZ() +" And Point B ");
				//System.out.println(""+points[j].getX() +"," + points[j].getY()+ "," +points[j].getZ() +"");
				gl.glEnd();
			}
		}
	}
}