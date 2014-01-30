import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.*;
import javax.media.opengl.*;
import javax.media.opengl.awt.*;
import javax.media.opengl.glu.*;

public class RayTracer implements GLEventListener
{
	private static final int WINDOW_SIZE = 400;
	private LinkedList<Object3D> objects;
	private LinkedList<Ray> rays;
	
	private Point3D eye;
	private Point3D light;
		
    private JLabel statusLine = new JLabel(); // for misc messages at bottom of window
    private int framesDrawn=0;
    private GLU glu = new GLU();
            
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.setSwapInterval(1);
        gl.glClearColor(0f,0f,0f,1f); // background color   

        objects = new LinkedList<Object3D>();
        objects.add(new Sphere(new Point3D(40,200,50), 200, new Color(1,0,1), true));
        objects.add(new Sphere(new Point3D(0,-50,50), 100, new Color(0,0,1), true));
        //objects.add(new Sphere(new Point3D(0,0,-50), 100, new Color(1,0,0), true));
        //objects.add(new Plane(1,1,-1,5, new Color(0,0,0), false));
    	
        //**************************NEED TO PLACE EYE CORRECTLY AND HAVE PROPER DIMENSIONS IN GLORTHO IN RESHAPE METHOD
        //I think that this is done- the eye is about 2 screen-lengths from the center of where we should be looking at the objects.
        //Although I'm still unclear about what we're doing in terms of where the eye is looking.

        eye = new Point3D(0,0,-2000000); 
        //**************************

    	
    	light = new Point3D(50,50,0);
        
    	rays = new LinkedList();
    	
    	//************************THIS FOR LOOP MAY NOT BE CORRECT - NEEDS TO GENERATE A RAY FOR EVERY PIXEL**************
        for(double x = -WINDOW_SIZE/2; x<=WINDOW_SIZE/2; x=x+1){
            for(double y = -WINDOW_SIZE/2; y<=WINDOW_SIZE/2; y=y+1){
            	rays.add(new Ray(eye, new Point3D(x,y,0)));
            }
        }    	
        //************************************************************************************************************
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        System.out.println("reshaping to " + width + "x" + height);

        GL2 gl = drawable.getGL().getGL2();
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-200f, 200f, -200f, 200f, 0f, -20000f); //visible field
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();

    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl  = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        
        gl.glBegin(GL2.GL_POINTS);
    	for(Iterator<Ray> it = rays.iterator(); it.hasNext(); ){
    		Ray r = it.next();
    		ObjectPoint objectPoint = r.nearestIntersection(objects);
    		if(objectPoint!=null){
    			Color color = objectPoint.getColor(light, r, objects);
				gl.glColor3d(color.getRed(), color.getGreen(), color.getBlue());
				gl.glVertex3d(objectPoint.getPoint().getX(), objectPoint.getPoint().getY(), objectPoint.getPoint().getZ());
    		}
    		
    	}

        gl.glEnd();

        // check for errors, at least once per frame
        int error = gl.glGetError();
        if (error != GL2.GL_NO_ERROR) {
            System.out.println("OpenGL Error: " + glu.gluErrorString(error));
            System.exit(1);
        }

        //System.out.println("display() done"); // for debugging
        statusLine.setText("There were no errors. Frames drawn: "  +  ++framesDrawn);
    }

    public void dispose(GLAutoDrawable drawable) {
    }

    public static void main(String[] args) {
        GLProfile.initSingleton();
        System.setProperty("sun.awt.noerasebackground", "true"); // sometimes necessary to avoid erasing over the finished window

        JFrame frame = new JFrame("Ray Tracer");
        GLCanvas canvas = new GLCanvas();
        canvas.setPreferredSize(new Dimension(WINDOW_SIZE,WINDOW_SIZE));

        RayTracer renderer = new RayTracer();
        canvas.addGLEventListener(renderer);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(canvas, BorderLayout.CENTER);
        frame.getContentPane().add(renderer.statusLine, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}