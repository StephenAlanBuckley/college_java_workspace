package Buildings;
/* Vinodh Mechery 
 * Plane class
 * 10/28/10
 */

import java.awt.Color;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import com.jogamp.opengl.util.texture.Texture;


public class Plane {
	
	private double x, y, z, width, length;
	private Color color;
	private Texture texture;
	private String plane;
	public Plane(String plane, double x, double y, double z, double width, double length, Color color, Texture texture)
	{
	
		this.x = x;
		this.y = y;
		this.z = z;
		this.width = width;
		this.length = length;
	    this.color = color;
	    this.texture = texture;
	    this.plane = plane;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Texture getTexture() {
		return texture;
	}
	public void setTexture(Texture texture) {
		this.texture = texture;
	}
	public String getPlane() {
		return plane;
	}
	public void setPlane(String plane) {
		this.plane = plane;
	}

	public void draw(GL2 gl, GLU glu)
	{
		gl.glEnable(GL2.GL_TEXTURE_2D);
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        texture.bind();
        
    	
    	if(plane =="xy")
    	{
        
            float[] coef_s = {.5f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            float[] coef_t = {0,1f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3d(x,y,z);
                gl.glVertex3d(x,y+length,z);
                gl.glVertex3d(x+width,y+length,z);
                gl.glVertex3d(x+width,y,z);
            gl.glEnd();
    	}
    
    	else if(plane=="yz")
        {
        
            float[] coef_s = {0,0,.5f,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            float[] coef_t = {0,1f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3d(x,y,z);
                gl.glVertex3d(x,y,z+width);
                gl.glVertex3d(x,y+length,z+width);
                gl.glVertex3d(x,y+length,z);
            gl.glEnd();
	    }
    	
    	else if(plane == "xz")
 	   {   
 		   
	            float[] coef_s = {.5f,0,0,0};
	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
	            float[] coef_t = {0,0,1f,0};
	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	            gl.glBegin(GL2.GL_QUADS);
	            gl.glVertex3d(x,y,z);
                gl.glVertex3d(x,y,z+length);
                gl.glVertex3d(x+width,y,z+length );
                gl.glVertex3d(x+width,y,z);
	            gl.glEnd();
	        
 	   }
    	
    	else
    	{
    		System.out.println("uh oh");
    	}	

    
	
    	gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);	 
	
	}
 
	
	
}

