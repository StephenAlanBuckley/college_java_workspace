/*
 * Stephen Buckley
 * 10/13/09
 * StockTicking Thinggummy
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;

public class Ticker {
	public static void main(String[] args)
	{
		Stock ibm = new Stock("IBM");
		float ibmPrice = ibm.getPrice();
		
		Stock java = new Stock("JAVA");
		float javaPrice = java.getPrice();
		
		Stock msft = new Stock("MSFT");
		float msftPrice = msft.getPrice();
		
		String listing = ("The computers have gained sentience. Prepare to be destroyed.");
	
		JFrame frame = new JFrame("Stock Ticker"); 
		frame.setSize(300,70);  // width, height 
	    frame.setLocation(20,20);  // location on the screen 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quit program when frame is closed 
	    frame.setVisible(true); 
	    Graphics graphics = frame.getGraphics(); 
	  	    
		
	    while (true)
	    {
	    	int i = 0;
	    	while (i<=310)
	    	{
	    		i= i +2;
	    		graphics.setColor(Color.WHITE);
	    		graphics.fillRect(0, 0, 300, 70);
	    		graphics.setColor(Color.BLACK);
	 		    
	    		graphics.drawString(listing, i, 45);
	    		graphics.drawString(listing, i-310, 45);
	    		
	    		try
	    		{
	    			Thread.currentThread().sleep(50);
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	    		
	    	}
			
	    }
	    
	}
}

    
