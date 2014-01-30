//Stephen Buckley
//HW1
//9/21/2010- I joined the class late!
//Computer Graphics

import java.awt.*;
import javax.xml.parsers.*; 

import org.xml.sax.*;  

import java.io.*;
import java.util.*;
import java.util.List;

import org.w3c.dom.*;

import com.jogamp.opengl.util.Animator;
import com.jogamp.opengl.util.FPSAnimator;

import java.awt.geom.Point2D;
import javax.swing.*;
import javax.media.opengl.*;
import javax.media.opengl.awt.*;
import javax.media.opengl.glu.*;
//import com.jogamp.opengl.util.*; // Only needed if the Animator is used (see bottom of main)

public class Controller implements GLEventListener
{
    private JLabel statusLine = new JLabel(); // for misc messages at bottom of window
    private int framesDrawn=0;
    private GLU glu = new GLU();
    
    private StarList theGalaxy = new StarList();
    private static double GRAVITY = 0.4;
    private Document document;

    public void init(GLAutoDrawable drawable) {
      //drawable.setGL(new DebugGL2(drawable.getGL().getGL2())); // to do error check upon every GL call.  Slow but useful.
      //drawable.setGL(new TraceGL2(drawable.getGL().getGL2(), System.out)); // to trace every call.  Less useful.
        GL2 gl = drawable.getGL().getGL2();
        gl.setSwapInterval(1); // for animation synchronized to refresh rate
        gl.glClearColor(0f,0f,0f,1f); // white background
        
        this.readFile("stars.xml", theGalaxy.getList());
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
        theGalaxy.updateList(GRAVITY);
        
        GL2 gl  = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        Star current = new Star(0,0);
        
        gl.glPointSize(3f);
        
        Point2D.Float p  = new Point2D.Float(75,50);
        
        gl.glBegin(GL2.GL_POINTS);
    	for(int i=0;i<theGalaxy.getSize();i++ ){
    		current = theGalaxy.getIndex(i);
    		gl.glColor3f(current.red, current.green, current.blue);
    		p.setLocation(current.x, current.y);
    		gl.glVertex2d(p.getX(), p.getY());
    		System.out.println("Drew a Star! With rgb:" + current.red + "  " + current.green + "  " +current.blue + "  and x,y position: " + current.x + ", " + current.y + " and dx,dy: " +current.dx+ ",  " +current.dy + ".");
    		}
    	gl.glEnd();
    	}

    public void dispose(GLAutoDrawable drawable) {
    }

    public static void main(String[] args) {
        GLProfile.initSingleton();
        System.setProperty("sun.awt.noerasebackground", "true"); // sometimes necessary to avoid erasing over the finished window

        JFrame frame = new JFrame("Gasket Demo");
        GLCanvas canvas = new GLCanvas();
        canvas.setPreferredSize(new Dimension(300,300));  // desired size, not guaranteed

        Controller renderer = new Controller();
        canvas.addGLEventListener(renderer);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(canvas, BorderLayout.CENTER);
        frame.getContentPane().add(renderer.statusLine, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // make just big enough to hold objects inside
        frame.setVisible(true);

        // if continual automatic redraws are desired:
        FPSAnimator animator = new FPSAnimator(canvas, 90);
        animator.start();
    }
    
    public void readFile(String fileName, List<Star> stars)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
        	   DocumentBuilder builder = factory.newDocumentBuilder();
        	   document = builder.parse(new File(fileName));
        	   Element docElement = document.getDocumentElement();

               	NodeList starNodes = docElement.getElementsByTagName("star");
               	for (int i=0; i<starNodes.getLength(); ++i) {
               	//for (int i=0; i<2; ++i) {
               		Element starE    = (Element)(starNodes.item(i));
               		Element point    = (Element)starE.getElementsByTagName("point").item(0);
               		Element velocity = (Element)starE.getElementsByTagName("velocity").item(0);
               		Element color    = (Element)starE.getElementsByTagName("color").item(0);
               		float x = Float.parseFloat(point.getAttribute("x"));
               		float y = Float.parseFloat(point.getAttribute("y"));
               		float dx = Float.parseFloat(velocity.getAttribute("dx"));
               		float dy = Float.parseFloat(velocity.getAttribute("dy"));
               		float red   = Float.parseFloat(color.getAttribute("red"));
               		float green = Float.parseFloat(color.getAttribute("green"));
               		float blue  = Float.parseFloat(color.getAttribute("blue"));
                  System.out.println(" x=" + x +
 				                       " y=" + y +
				                       " dx=" + dx +
				                       " dy=" + dy +
				                       " red=" + red +
				                       " green=" + green +
				                       " blue=" + blue); 

               		
               		// The next two lines assume you have a Star class,
               		// and some kind of List for the star collection.
               		// You may alter the next two lines if necessary.
               	    Star star = new Star(x,y,dx,dy,red,green,blue);
               	    stars.add(star);
               	}
        } catch (SAXException sxe) {
           System.out.println("Error: " + sxe);
           System.exit(1);
        } catch (ParserConfigurationException pce) {
            System.out.println("Error: " + pce);
            System.exit(1);
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
            System.exit(1);
        }
    }
}