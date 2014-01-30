package Movement;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseMotionListener;

import javax.media.opengl.awt.GLCanvas;

import main.Game;
import main.Player;

public class LookBehavior implements MouseMotionListener {

	private Eye eye;
	private Game game;
	private GLCanvas canvas;
	private boolean ignoreMouse;
	private int centerX, centerY;
	private Robot robot;
	private Cursor invisibleCursor;
	private int inverted;
	private float sensitivity;
	
	private TimedKeyListener keyListener;
	

	public LookBehavior(Game game, GLCanvas canvas, Eye eye){
		this.eye = eye;
		this.game = game;
		this.canvas = canvas;
		ignoreMouse = false;
		inverted = 1;
		sensitivity = 1;
		
		//set up invisible cursor
		byte[]imageByte=new byte[0];  
		Point myPoint=new Point(0,0);
		Image cursorImage=Toolkit.getDefaultToolkit().createImage(imageByte);
		invisibleCursor=Toolkit.getDefaultToolkit().createCustomCursor(cursorImage,myPoint,"cursor");
		canvas.setCursor(invisibleCursor);

		try{
			robot = new Robot();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		canvas.addMouseMotionListener(this);
	}
	
	private void setCenterPoint() {
		Point topLeft = canvas.getLocationOnScreen();
		centerX = topLeft.x + canvas.getWidth()/2;
		centerY = topLeft.y + canvas.getHeight()/2;
	}
	
	public void stopListening() {
		canvas.removeMouseMotionListener(this);
	}
	
	public void startListening(){
		canvas.addMouseMotionListener(this);
	}
	
	public void mouseDragged(MouseEvent arg0) {}

	public void mouseMoved(MouseEvent e) {
		if (!ignoreMouse) 
		{
			float dx = (e.getXOnScreen() - centerX)*sensitivity;
			eye.addToDirection(-dx/2);
			
			float dy = (e.getYOnScreen() - centerY)*sensitivity;
			eye.addToTilt(inverted*-dy);

			robot.mouseMove(centerX, centerY);

		}
	}

	public void update() 
	{ 
		setCenterPoint();
	}
	
	public void setSensitivity(float sensitivity)
	{
		this.sensitivity = sensitivity;
	}
	
	public void invert()
	{
		inverted = inverted *-1;
	}

	public void setIgnorMouse(boolean ignoreMouse)
	{
		this.ignoreMouse = ignoreMouse;
	}

}

