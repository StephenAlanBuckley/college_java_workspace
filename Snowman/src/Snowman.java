/* 
 * HW #1 C
 * Stephen Buckley
 * 9/10/09
 */

import javax.swing.*;
import java.awt.*;

public class Snowman extends JApplet
{
	public void paint(Graphics canvas)
	{ 
        canvas.drawOval(320, 35, 150, 150); 
        canvas.fillOval(355, 60, 10, 20); 
        canvas.fillOval(430, 60, 10, 20); 
        canvas.drawArc(350, 120, 100, 50, 180, 180);
        canvas.drawOval(295, 185, 200, 200); 
        canvas.drawOval(265, 385, 275, 275); 
	}

}
