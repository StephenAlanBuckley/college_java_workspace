//Stephen Buckley
//HW1
//9/21/2010- I joined the class late!
//Computer Graphics

import java.awt.*;
import java.awt.geom.Point2D;
import javax.swing.*;
import javax.media.opengl.*;
import javax.media.opengl.awt.*;
import javax.media.opengl.glu.*;
//import com.jogamp.opengl.util.*; // Only needed if the Animator is used (see bottom of main)

public class Gasket implements GLEventListener
{
    private JLabel statusLine = new JLabel(); // for misc messages at bottom of window
    private int framesDrawn=0;
    private GLU glu = new GLU();

    public void init(GLAutoDrawable drawable) {
      //drawable.setGL(new DebugGL2(drawable.getGL().getGL2())); // to do error check upon every GL call.  Slow but useful.
      //drawable.setGL(new TraceGL2(drawable.getGL().getGL2(), System.out)); // to trace every call.  Less useful.
        GL2 gl = drawable.getGL().getGL2();
        gl.setSwapInterval(1); // for animation synchronized to refresh rate
        gl.glClearColor(1f,1f,1f,1f); // white background

        // Comment these out or delete most of these as soon as you get tired of them:
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("CANVAS GL IS: " + gl.getClass().getName());
        System.out.println("CANVAS GLU IS: "+ glu.getClass().getName());

        System.out.println("OpenGL Version Info:");
        System.out.println("  Vendor:     " + gl.glGetString(GL2.GL_VENDOR));
        System.out.println("  Renderer:   " + gl.glGetString(GL2.GL_RENDERER));
        System.out.println("  Version:    " + gl.glGetString(GL2.GL_VERSION));
      //System.out.println("  Extensions: " + gl.glGetString(GL2.GL_EXTENSIONS));
        System.out.println("GLU Version Info:");
        System.out.println("  Version:    " + glu.gluGetString(GLU.GLU_VERSION));
        System.out.println("  Extensions: " + glu.gluGetString(GLU.GLU_EXTENSIONS));
    }

    // I don't know what x,y are; they seem to always be zero (WA)
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        System.out.println("reshaping to " + width + "x" + height);

        GL2 gl = drawable.getGL().getGL2();
      //gl.glViewport(x, y, width, height); // not necessary, jogl does this prior
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(0f, 500f, 0f, 500f, -1f, +1f);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        //System.out.println("display() entered"); // for debugging
        GL2 gl  = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

        // A triangle
        // Point choices: Point2D.Double, Point2D.Float, Point (int's)
        Point2D.Float triangleVerts[] = { new Point2D.Float(0,0), new Point2D.Float(250,500),
                                          new Point2D.Float(500,0) };

        Point2D.Float p = new Point2D.Float(75,50); // An arbitrary initial point

        gl.glColor3f(0f,0f,1f); // draw in red

        // compute and plot 5000 new points
        gl.glBegin(GL2.GL_POINTS);
            for (int k=0; k<500000; k++)
            {
                int j=(int)(Math.random()*3); // pick a vertex at random

                // Compute point halfway between vertex and previously computed point
                p.setLocation((p.getX()+triangleVerts[j].getX())/2,
                              (p.getY()+triangleVerts[j].getY())/2 );

                // plot new point
                gl.glVertex2d(p.getX(), p.getY());
            }
        gl.glEnd();

        // check for errors, at least once per frame
        int error = gl.glGetError();
        if (error != GL2.GL_NO_ERROR) {
            System.out.println("OpenGL Error: " + glu.gluErrorString(error));
            System.exit(1);
        }

        //System.out.println("display() done"); // for debugging
        statusLine.setText("Frames drawn: "  +  ++framesDrawn
                           + ",  Java Version: " + System.getProperty("java.version")); // only for Gasket
        //statusLine.setText("Frames drawn: "  +  ++framesDrawn);  // normally do something like this
    }

    public void dispose(GLAutoDrawable drawable) {
    }

    public static void main(String[] args) {
        GLProfile.initSingleton();
        System.setProperty("sun.awt.noerasebackground", "true"); // sometimes necessary to avoid erasing over the finished window

        JFrame frame = new JFrame("Gasket Demo");
        GLCanvas canvas = new GLCanvas();
        canvas.setPreferredSize(new Dimension(300,300));  // desired size, not guaranteed

        Gasket renderer = new Gasket();
        canvas.addGLEventListener(renderer);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(canvas, BorderLayout.CENTER);
        frame.getContentPane().add(renderer.statusLine, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // make just big enough to hold objects inside
        frame.setVisible(true);

        // if continual automatic redraws are desired:
        // Animator animator = new Animator(canvas);
        // animator.start();
    }
}