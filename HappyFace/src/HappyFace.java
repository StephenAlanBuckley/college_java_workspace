/*
 * HW#1 B
 * Stephen Buckley
 * 9/9/09
 */
import javax.swing.*;
import java.awt.*;

public class HappyFace extends JApplet
{
	public void paint(Graphics canvas)
	{
		canvas.setColor(Color.RED); 
        canvas.drawOval(100, 50, 200, 200); 
        canvas.fillOval(155, 100, 10, 20); 
        canvas.fillOval(230, 100, 10, 20); 
        canvas.drawArc(150, 160, 100, 50, 180, 180); 
	}
}
