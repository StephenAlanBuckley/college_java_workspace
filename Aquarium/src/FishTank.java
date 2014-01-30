/*
 * Stephen Buckley
 * 10/20/09
 * FishTank class
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class FishTank {
	
	Image fishtankimage;
	JFrame frame = new JFrame("Fish Tank Extraordinaire!"); 
	Fish firstfish = new Fish();
	Fish secondfish = new Fish();
	Fish thirdfish = new Fish();
	
	public FishTank(){
		frame.setSize(1024,768);  
	    frame.setLocation(20,20); 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setVisible(true); 
	    fishtankimage = Toolkit.getDefaultToolkit().getImage("fish_tank.jpg");
	}

	public void run(){
		Graphics graphics = frame.getGraphics();
		int count = 1;
		while(count ==1)
		{		
			//change the fish x and y values
			firstfish.swim();
			secondfish.swim();
			thirdfish.swim();
	
			
			//draw the three fish
			firstfish.draw(graphics);
			secondfish.draw(graphics);
			thirdfish.draw(graphics);
			
			
			//Sleeeeeep.  Sleep toooonight.
			Thread.currentThread();
			try {
				Thread.sleep(291);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//draw background
			graphics.drawImage(fishtankimage, 0, 20, 1024, 768, null);
		}
		
	}
}
