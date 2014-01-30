//
// Transformation class, Fall 2010
// by William Ames and Stephen Buckley
//

public class Transform
{
    private double[][] matrix; // holds current transformation

    // Default constructor makes an identity matrix
    public Transform() {
        matrix = new double[4][4];
        identity();
    }

    // Force current matrix to the identity, erasing previous
    public void identity() {
        for (int i=0; i<4; ++i) {
            for (int j=0; j<4; ++j) {
                if (i==j) matrix[i][j] = 1;
                else      matrix[i][j] = 0;
            }
        }
    }
    
    public void clear() {
        for (int i=0; i<4; ++i) {
            for (int j=0; j<4; ++j) {
               matrix[i][j] = 0;
            }
        }
    }

    // Multiply current matrix by an X rotation matrix
    public void rotateX(double angle) {
        angle = Math.toRadians(angle);
        double c = Math.cos(angle);
        double t = Math.sin(angle);
        
        Transform xRot = new Transform();
        
        xRot.matrix[1][1] =c;
        xRot.matrix[1][2] =-t;
        xRot.matrix[2][1] =t;
        xRot.matrix[2][2] =c;
        
        //System.out.println("Rotation X: " + xRot.toString());
        multiply(xRot);
    }

    // Multiply current matrix by a Y rotation matrix
    public void rotateY(double angle) {
    	angle = Math.toRadians(angle);
        double c = Math.cos(angle);
        double t = Math.sin(angle);
        
        Transform yRot = new Transform();
        
        yRot.matrix[0][0] =c;
        yRot.matrix[2][0] =t;
        yRot.matrix[0][2] =-t;
        yRot.matrix[2][2] =c;
        
        multiply(yRot);
    }

    // Multiply current matrix by a Z rotation matrix
    public void rotateZ(double angle) {
    	angle = Math.toRadians(angle);
        double c = Math.cos(angle);
        double t = Math.sin(angle);
        
        Transform zRot = new Transform();
        
        zRot.matrix[0][0] =c;
        zRot.matrix[1][0] =-t;
        zRot.matrix[0][1] =t;
        zRot.matrix[1][1] =c;
        
        multiply(zRot);
    }

    // Multiply current matrix by a scale matrix
    public void scale(double x, double y, double z) {
        Transform scaleTrans = new Transform();
        scaleTrans.matrix[0][0]= x;
        scaleTrans.matrix[1][1]= y;
        scaleTrans.matrix[2][2]= z;
        scaleTrans.matrix[3][3]= 1;
        multiply(scaleTrans);
    }

    // Multiply current matrix by a translation matrix
    public void translate(double x, double y, double z) {
        matrix[0][0] +=x;
        matrix[1][1] +=y;
        matrix[2][2] +=z;
    }

    // Multiply the current matrix by t2.matrix, with t2 on the right.
    // Result goes into 'this' matrix
    public void multiply(Transform t2) {
        Transform placeHolder = new Transform();
        placeHolder.clear();
    	
    	for(int i=0; i<4; i++){
        	for(int j=0; j<4; j++){
        		for (int k=0; k<4; k++){
        			placeHolder.matrix[i][j]+= matrix[i][k]*t2.matrix[k][j];
        		}
        	}
        }
    	
    	for(int i=0;i<4;i++){
    		for(int j=0; j<4;j++){
    			matrix[i][j]= placeHolder.matrix[i][j];
    		}
    	}
    }

    // Multiply the current matrix by a point p, with p on the right.
    // Return the new point.
    public Point3d multiply(Point3d p) {
        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();
     
        Point3d newPoint = new Point3d();
        
         newPoint.setX(x*matrix[0][0] + y*matrix[1][0] + z*matrix[2][0]);
         newPoint.setY(x*matrix[0][1] + y*matrix[1][1] + z*matrix[2][1]);
         newPoint.setZ(x*matrix[0][2] + y*matrix[1][2] + z*matrix[2][2]);
         
         return newPoint;
    }

    // Show matrix in a nice human readable format
    public String toString() {
        String result = "";
        for (int i=0; i<4; ++i) {
            result = result + "[";
            for (int j=0; j<4; ++j)
                result = result + matrix[i][j] + ' ';
            result = result + "]\n";
        }
        return result;
    }
}