/*
   Spinning Solid Pyramid Demo
   William Ames, Fall 2010
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.media.opengl.*;
import javax.media.opengl.awt.*;
import javax.media.opengl.glu.*;
//import com.jogamp.opengl.util.FPSAnimator;

import com.jogamp.opengl.util.FPSAnimator;

public class Tester implements GLEventListener, KeyListener
{
    private JLabel statusLine;
    //private Lamp lamp = null;
    private Building bb = null;
    private GLU glu = new GLU();
    private int framesDrawn=0;
    private static GLCanvas canvas;
    
    private double eyeX=65, eyeY=4, eyeZ=0;
    private double stepSize = 2;
    private double direction=-90;

    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(1f,1f,1f,1f); // white background
       // lamp = new Lamp(glu);
        bb= new BuckleyBuilding(gl, glu);
        gl.glEnable(GL2.GL_DEPTH_TEST);

        // ************* new texture stuff here *************
        gl.glTexEnvf(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE, GL2.GL_REPLACE); // or GL_MODULATE
        gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST); // or GL_FASTEST
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        
        gl.glLoadIdentity();
        glu.gluLookAt(eyeX,eyeY,eyeZ,    // eye location
                eyeX+Math.cos(Math.toRadians(direction)),
                4f,
                eyeZ-Math.sin(Math.toRadians(direction)),     // point to look at (near middle)
                0.f,1.f,0.f); // the "up" direction


        gl.glPushMatrix();
	        	bb.draw(gl,glu);
        gl.glPopMatrix();
        
        

        // check for errors
        int error = gl.glGetError();
        if (error != GL.GL_NO_ERROR) {
            System.out.println("OpenGL Error: " + glu.gluErrorString(error));
            System.exit(1);
        }
        statusLine.setText("Frames drawn: " + ++framesDrawn);}

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        System.out.println("displayChanged() entered\n");
    }
    
    public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h) {
        System.out.println("Reshaping to " + w + "x" + h);
        GL2 gl  = drawable.getGL().getGL2();
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(70., 1., .5, 1000.); // fov, aspect, near-clip, far clip
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
    
    public void dispose(GLAutoDrawable drawable) { /* ignore */ }

    public static void main(String args[]) {
        GLProfile.initSingleton();
        System.setProperty("sun.awt.noerasebackground", "true");
        JFrame frame = new JFrame("My Building");
        Tester spinner = new Tester();
        spinner.canvas = new GLCanvas(); 
        
        spinner.canvas.addKeyListener(spinner);

        spinner.canvas.addGLEventListener(spinner);
        spinner.canvas.setPreferredSize(new Dimension(400,400));
        spinner.statusLine = new JLabel();
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(spinner.canvas, BorderLayout.CENTER);
        frame.getContentPane().add(spinner.statusLine, BorderLayout.SOUTH);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        spinner.canvas.requestFocus();

        // for continual automatic redraws:
        FPSAnimator animator = new FPSAnimator(canvas, 60);
        animator.start();
    }

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key pressed");
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			direction += 5;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			direction -= 5;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP){
			
			eyeX += stepSize * Math.cos(Math.toRadians(direction));
			eyeZ -= stepSize * Math.sin(Math.toRadians(direction));
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			
			eyeX -= stepSize * Math.cos(Math.toRadians(direction));
			eyeZ += stepSize * Math.sin(Math.toRadians(direction));
		}

		canvas.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// ignore
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// ignore
	}
}