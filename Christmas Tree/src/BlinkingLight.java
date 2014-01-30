import java.awt.Color;
import java.awt.Graphics;


public class BlinkingLight extends Light{
	
	public void draw(Graphics graphics){
		double i =0;
		i=Math.random();
		if(i<=.5){
			maincolor = Color.RED;
		}if(i>.5){
			maincolor = Color.GREEN;
		}
		
		graphics.setColor(maincolor);
		graphics.fillOval(x, y, 5, 10);
	}

}
