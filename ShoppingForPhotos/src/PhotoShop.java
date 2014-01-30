/*
 * Stephen Buckley
 * 11/12/09
 * ShoppingForPhotos:PhotoShop
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PhotoShop extends JComponent implements ActionListener{
	
	public String filename = JOptionPane.showInputDialog("Please enter the name of the file to edit.  Include the file extension!");
	
	public Color[][] picture = ImageReader.getImage(filename);
	
	private int height = picture.length-1;
	private int width = picture[1].length-1;
	
	private int lightcount = 0;
	private int flipcount = 0;
	private int blurcount = 0;
	private int graycount =0;
	private int darkcount = 0;
	private int shakecount =0;
	
	
	private JButton lightenButton = new JButton("Lighten");
    private JButton darkenButton = new JButton("Darken");
    private JButton negativeButton = new JButton("Negative");
	private JButton flipButton = new JButton("Flip" );
    private JButton blurButton = new JButton("Blur");
    private JButton grayButton = new JButton("Gray");
    private JButton ungrayButton = new JButton("Ungray"); //This is just something I wanted to try out.  I was hoping to store all of the variations the user performs and then redo them without graying.
    private JButton unblurButton = new JButton("Unblur"); //This does the same thing as "ungray" but for blur.  It "unblurs" once.
	private JButton shakeButton = new JButton("Shake");
	private JButton shakeloopButton = new JButton("Supershake");//shakes the image 1000 times.
    
	public static void main(String[] args)
	{
		PhotoShop imagemanipulator = new PhotoShop();
	}
    
    public PhotoShop()
	{
		
		JPanel photoPanel = new JPanel();
		photoPanel.setLayout(new GridLayout(2,0));
		photoPanel.add(lightenButton);
		photoPanel.add(darkenButton);
		photoPanel.add(flipButton);
		photoPanel.add(grayButton);
		photoPanel.add(blurButton);
		photoPanel.add(ungrayButton);
		photoPanel.add(unblurButton);
		photoPanel.add(shakeButton);
		photoPanel.add(shakeloopButton);
		photoPanel.add(negativeButton);
		
		lightenButton.addActionListener(this);
        darkenButton.addActionListener(this);
        flipButton.addActionListener(this);
        grayButton.addActionListener(this);
        blurButton.addActionListener(this);
        ungrayButton.addActionListener(this);
        unblurButton.addActionListener(this);
        shakeButton.addActionListener(this);
        shakeloopButton.addActionListener(this);
        negativeButton.addActionListener(this);
		
		setPreferredSize(new Dimension(width, height));
		JFrame frame = new JFrame("Image Manipulation");
		frame.setLayout(new BorderLayout());
		frame.getContentPane().add(photoPanel, BorderLayout.NORTH);
		frame.getContentPane().add(this, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	public void paintComponent(Graphics graphics) {
		int row =0, col = 0;
		for(row =0; row<height; row++)
		{
			for(col = 0; col<width; col++)
			{
				graphics.setColor(picture[row][col]);
				graphics.drawLine(col, row, col, row);
			}
		}
		
	}
	
	public void lighten(){ //this is the method that lightens everything.
		int row =0, col = 0;
		int red =0, green=0, blue=0;
		int newRed = 0, newGreen = 0, newBlue = 0;
		for(row =0; row<height; row++)
		{
			for(col = 0; col<width; col++)
			{
				red = picture[row][col].getRed();
				blue = picture[row][col].getBlue();
				green = picture[row][col].getGreen();
				
				newRed = (int)(Math.sqrt(red/255.)*255);
				newGreen = (int)(Math.sqrt(green/255.)*255);
				newBlue = (int)(Math.sqrt(blue/255.)*255);
				
				Color newColor = new Color (newRed, newGreen, newBlue);
				picture[row][col] = newColor;
				                           
			}
		}
		
		repaint();
		
	}
	
	public void darken(){// this is the method that darkens everything

		int row =0, col = 0;
		int red =0, green=0, blue=0;
		int newRed = 0, newGreen = 0, newBlue = 0;
		for(row =0; row<height; row++)
		{
			for(col = 0; col<width; col++)
			{
				red = picture[row][col].getRed();
				blue = picture[row][col].getBlue();
				green = picture[row][col].getGreen();
				
				newRed = (int)(Math.pow(red/255., 2)*255);
				newGreen = (int)(Math.pow(green/255., 2)*255);
				newBlue = (int)(Math.pow(blue/255., 2)*255);
				
				Color newColor = new Color (newRed, newGreen, newBlue);
				picture[row][col] = newColor;
				                           
			}
		}
		
		repaint();
		
	}
	
	public void gray(){//this makes everything gray
		int row =0, col = 0;
		int red =0, green=0, blue=0;
		int newGray =0;
		for(row =0; row<height; row++)
		{
			for(col = 0; col<width; col++)
			{
				red = picture[row][col].getRed();
				blue = picture[row][col].getBlue();
				green = picture[row][col].getGreen();
				
				newGray = (int)((red*.3)+(green*.59)+ (blue*.11));
				
				Color newColor = new Color (newGray, newGray, newGray);
				picture[row][col] = newColor;
				                           
			}
		}
		repaint();
	
	}
	
	public void negative(){
		int row =0, col =0;
		int red=0, green=0, blue =0;
		for(row =0; row<height; row++){
			for(col =0; col<width; col++){
				red = 255-(picture[row][col].getRed());
				green = 255- (picture[row][col].getGreen());
				blue = 255 - (picture[row][col].getBlue());
				
				Color newColor = new Color(red, green, blue);
				picture[row][col] = newColor;
			}
		}
	}
	
	public void flip(){//this flips the image.
		int row =0, col = 0;
		Color[][] newpic= new Color[height][width];
		for(row =0; row<height; row++)
		{
			for(col = 0; col<width; col++)
			{
				newpic[row][width-1-col] = picture[row][col];
			}
		
		}
		picture= newpic;
		
		repaint();
		
	}
	
	public void blur(){//this blurs the image.

		int row =1, col = 1;
		int red =0, green=0, blue=0;
		Color[][] newpic= picture;
		for(row = 1; row<height-1; row++)
		{
			for(col =1; col<width-1; col++)
			{
				for(int j=-1;j<2;j++)
				{
					for(int k =-1;k<2;k++)
					{
						if(k!=0 || j!=0)
						{
							red = red+picture[row+j][col+k].getRed();
							green = green+picture[row+j][col+k].getGreen();
							blue = blue+picture[row+j][col+k].getBlue();
						}
					}
				}
			
			red = red/9;
			green = green/9;
			blue = blue/9;
			
			newpic[row][col] = new Color(red, green, blue);
			}
		}
		picture = newpic;
		
		repaint();
		
	}

	public void ungray(){// this undoes the graying
		
		picture = ImageReader.getImage(filename);
		
		for(int i =0; i<lightcount; i++)
		{
			lighten();
			repaint();
		}
		for(int j =0; j<darkcount; j++)
		{
			darken();
			repaint();
		}
		for(int k =0; k<flipcount; k++)
		{
			flip();
			repaint();
		}
		for(int l =0; l<blurcount; l++)
		{
			blur();
			repaint();
		}
		for(int m = 0; m<shakecount; m++)
		{
			shake();
		}
		
		repaint();
	}
	
	public void unblur(){ //this undoes blur
		
		picture = ImageReader.getImage(filename);
		
		for(int i =0; i<lightcount; i++)
		{
			lighten();
			repaint();
		}
		for(int j =0; j<darkcount; j++)
		{
			darken();
			repaint();
		}
		for(int k =0; k<flipcount; k++)
		{
			flip();
			repaint();
		}
		for(int l =0; l<blurcount-1; l++)
		{
			blur();
			repaint();
		}
		for(int m = 0; m<shakecount; m++)
		{
			shake();
		}
		
		if(graycount!=0)
			gray();
		
		blurcount = blurcount-1;
		repaint();
	}
	
	public void shake(){//this scrambles the picture a little.
		int row =0, col = 0;
		Color[][] otherside = picture;
		for(row =0; row<height; row++)
		{
			for(col = 0; col<width; col++)
			{
				if(row>1 &&col>1){
					otherside[row][col] = picture[row+(int)(Math.random()-(Math.random())*2)][col+(int)(Math.random()-(Math.random())*2)];	
				}
				
			}
		}
		picture = otherside;
		repaint();
			
	}
	
	public void actionPerformed(ActionEvent event) {
    	
    	if(event.getSource() == lightenButton)
    	{
    	 	lightcount = lightcount +1;
    		lighten();
    	}
    	if(event.getSource() == negativeButton)
    	{
    		negative();
    	}
    	if(event.getSource() == darkenButton)
    	{
    		darkcount = darkcount +1;
    		darken();
    	}
        if(event.getSource() == flipButton)
        {
        	flipcount = flipcount +1;
        	flip();
        }
        if(event.getSource() == grayButton)
        {
        	graycount = graycount+1;
        	gray();
        }
        if(event.getSource() == blurButton)
        {
        	blurcount = blurcount +1;
        	blur();
        }
        if(event.getSource() == ungrayButton)
        {
        	if(graycount>0){
        		graycount = graycount-1;
        	}
        	ungray();
        }
        if(event.getSource() == unblurButton)
        {
        	if(blurcount>0){
        		blurcount = blurcount-1;
        	}
        	unblur();
        }
        
        if(event.getSource()== shakeButton)
        {
        	shakecount=shakecount+1;
        	shake();
        }
        
        if(event.getSource() == shakeloopButton)//shakes it 1000 times.
        {
        	for(int i=0; i<1000; i++){
        		shake();
        	}
        }
	}
}
