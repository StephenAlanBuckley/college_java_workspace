import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class SineWave extends JApplet
{
	public static final int POINT_SIZE=4;
	
	public void paint(Graphics canvas)
	{
		//erase the window
		canvas.setColor(Color.YELLOW);
		canvas.fillRect(0, 0, 1000, 1000);
		
		canvas.setColor(Color.BLACK);
		
		for (int x=0; x<=720; ++x)
		{
			double y = Math.sin(x * Math.PI / 180);
			
			int yCoordinate = (int)(-100* y + 250);
			
			canvas.fillOval(x,yCoordinate, POINT_SIZE, POINT_SIZE);
		}
	}

}
