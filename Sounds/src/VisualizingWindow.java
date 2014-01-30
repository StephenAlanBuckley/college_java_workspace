import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JFrame;


public class VisualizingWindow extends JApplet{
	static JFrame visualframe = new JFrame("Visualizing Window");
	
	public VisualizingWindow()
	{
		visualframe.setBounds(100, 100, 100, 100);
		visualframe.setVisible(true);
	}
	
	 
	 public void drawline(int red, int green, int blue)
	 {
		 Graphics canvas = visualframe.getGraphics();
		 canvas.drawArc(red, green, blue, red, green, blue);
	 }
}
