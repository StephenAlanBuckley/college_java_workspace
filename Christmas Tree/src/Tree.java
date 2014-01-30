import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class Tree extends JComponent{
	
	Image treeimage;
	
	JFrame frame = new JFrame();
	
	Ornament[] decor = new Ornament[30];
	
	public Tree(){
	
		setPreferredSize(new Dimension(300, 400));
	    frame.setLocation(200,20); 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setVisible(true);
	    frame.setLayout(new BorderLayout());
	    frame.getContentPane().add(this);
	    frame.pack();
		
		treeimage = Toolkit.getDefaultToolkit().getImage("tree.gif");
		repaint();
		
		//set Ornament types, 1/3 chance of each
		
		for(int i =0; i<decor.length; i++){
			double c = Math.random();
			if(c<.3333){
				decor[i] = new Light();
			}
			if(c<.666 && c>.3333){
				decor[i] = new BlinkingLight();
			}
			
			if(c>.6666){
				decor[i] = new ImageOrnament();
			}
		}
	}

	public void paintComponent(Graphics graphics) {
		graphics.drawImage(treeimage, 0, 0, null);
		for(int i=0;i<decor.length; i++)
			decor[i].draw(graphics);
	}
	
	public void run(){
		
		//Graphics graphics = frame.getGraphics();
		
		while(true)
		{
			Thread.currentThread();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			repaint();
		}
		
		
	}
	
	
}
