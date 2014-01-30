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

import com.jogamp.opengl.util.Animator;
//import com.jogamp.opengl.util.*; // Only needed if the Animator is used (see bottom of main)

public class Gasket implements GLEventListener
{
    private JLabel statusLine = new JLabel(); // for misc messages at bottom of window
    private int framesDrawn=0;
    private GLU glu = new GLU();
    private Cube cardboardBox = new Cube();
    private Transform mover = new Transform();

    public void init(GLAutoDrawable drawable) {
      //drawable.setGL(new DebugGL2(drawable.getGL().getGL2())); // to do error check upon every GL call.  Slow but useful.
      //drawable.setGL(new TraceGL2(drawable.getGL().getGL2(), System.out)); // to trace every call.  Less useful.
        GL2 gl = drawable.getGL().getGL2();
        gl.setSwapInterval(1); // for animation synchronized to refresh rate
        gl.glClearColor(1f,1f,1f,1f); // white background
        mover.rotateX(.5);
        mover.rotateY(.9);
        mover.rotateZ(.7);
        mover.scale(1.0005, 1.0005,1.0005);
        //mover.translate(.01,0,0);
    }

    // I don't know what x,y are; they seem to always be zero (WA)
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        

        GL2 gl = drawable.getGL().getGL2();
      //gl.glViewport(x, y, width, height); // not necessary, jogl does this prior
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-10f, 10f, -10f, 10f, 10000f, -10000f);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        //System.out.println("display() entered"); // for debugging
        GL2 gl  = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        
        cardboardBox.rotateAll(mover);
        gl.glColor3f(1f,0f,0f);
        gl.glLineWidth(2f);

        gl.glPushMatrix();
        	cardboardBox.drawCube(gl);
        gl.glPopMatrix();
        
        System.out.println(mover.toString());

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
        canvas.setPreferredSize(new Dimension(500,500));  // desired size, not guaranteed

        Gasket renderer = new Gasket();
        canvas.addGLEventListener(renderer);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(canvas, BorderLayout.CENTER);
        frame.getContentPane().add(renderer.statusLine, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // make just big enough to hold objects inside
        frame.setVisible(true);

        // if continual automatic redraws are desired:
        Animator animator = new Animator(canvas);
        animator.start();
    }
}