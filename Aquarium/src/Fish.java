/* Stephen Buckley
 * 10/20/09
 * Fish class
 */

import java.awt.*;
import javax.swing.JComponent;

public class Fish extends JComponent{
	int x;
	int y;
	int dx;
	int dy;
	Image fishimage;
	
	public Fish()
	{
		fishimage = Toolkit.getDefaultToolkit().getImage("fish.gif");
		x = (int)(Math.random()*800);
		y = (int)(Math.random()*650);
		dx = (int)((Math.random()-.5)*6);
		dy = (int)((Math.random()-.5)*6);
		setPreferredSize(new Dimension(1024, 768));
	}
	
	public void draw(Graphics graphics)
	{
		if(dx<0)
		{
			graphics.drawImage(fishimage, x, y+122, x+180, y, 180, 122, 0, 0, null);
		}
		if(dx>=0)
			{
				graphics.drawImage(fishimage, x, y, null);	
			}	
	}
	
	public void swim(){
		//Change dx if x is out of bounds
		if(x >844)
		{
			x = x -10;
			dx = -dx;
		}
		if(x <=0)
		{
			x = x +10;
			dx = -dx;
		}
		
		//Change dy if y is out of bounds
		if(y>=646)
		{
			y = y -10;
			dy= -dy;
		}
		if(y<=0)
		{
			y = y +10;
			dy= -dy;
		}
		
		x = x + dx;
		y= y + dy;
		
	}

}
