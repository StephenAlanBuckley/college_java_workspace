/*
    Class to represent 3D Points for use with OpenGL
    William Ames, Fall 2010
*/

import javax.media.opengl.*;

public class Point3d
{
    private double x, y, z; // the coordinates

    public Point3d() {
        this(0,0,0);
    }

    public Point3d(double x, double y, double z) {
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

    // Draw the point; assumes we're inside of glBegin(GL_POINTS)/glEnd()
    public void draw(GL2 gl) {
        gl.glVertex3d(x,y,z);
    }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}