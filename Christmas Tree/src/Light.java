import java.awt.Color;
import java.awt.Graphics;


public class Light extends Ornament{
	
	Color maincolor;
	
	public Light(){
		double i =0;
		i=Math.random();
		if(i<=.5){
			maincolor = Color.RED;
		}else{
			maincolor = Color.GREEN;
		}
		 
	}
	
	
	public void draw(Graphics graphics)
	{
		graphics.setColor(maincolor);
		graphics.fillOval(x, y, 5, 10);
	}
	
}
