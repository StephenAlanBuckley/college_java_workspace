import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Board extends JComponent implements ActionListener
{	
	private PureBoard playArea = new PureBoard();
	private static int WIDTH = 100;
	private static int HEIGHT = 100;
	private int totWidth = WIDTH * 7;
	private int totHeight = HEIGHT * 6;
	private ComputerThinker bigThoughts = new ComputerThinker();
	
	JFrame frame = new JFrame("Get Four In A Row!");
	
	private JButton firstcol = new JButton("Play 1");
	private JButton secondcol = new JButton("Play 2");
	private JButton thirdcol = new JButton("Play 3");
	private JButton fourthcol = new JButton("Play 4");
	private JButton fifthcol = new JButton("Play 5");
	private JButton sixthcol = new JButton("Play 6");
	private JButton seventhcol = new JButton("Play 7");

	public static void main(String args[]){
		Board firstBoard = new Board();
	}
	
	public Board(){
		JPanel playpanel = new JPanel();
		playpanel.setLayout(new GridLayout(1,0));
		playpanel.add(firstcol);
		playpanel.add(secondcol);
		playpanel.add(thirdcol);
		playpanel.add(fourthcol);
		playpanel.add(fifthcol);
		playpanel.add(sixthcol);
		playpanel.add(seventhcol);
		
		firstcol.addActionListener(this);
		secondcol.addActionListener(this);
		thirdcol.addActionListener(this);
		fourthcol.addActionListener(this);
		fifthcol.addActionListener(this);
		sixthcol.addActionListener(this);
		seventhcol.addActionListener(this);
		
		
		setPreferredSize(new Dimension(totWidth,totHeight));
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(playpanel, BorderLayout.NORTH);
		frame.getContentPane().add(this, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public boolean makeAMove(int col, int who){
		return playArea.makeAMove(col, who);
	}
	
	public void paintComponent(Graphics graphics){
		int i, j =0;
		
		for(i=0;i<7; i++){
			for(j=0 ;j<6; j++){
				graphics.setColor(Color.yellow);
				graphics.fillRect(i*WIDTH, (5-j)*HEIGHT, WIDTH, HEIGHT);
				graphics.setColor(Color.black);
				graphics.drawRect(i*WIDTH, (5-j)*HEIGHT, WIDTH, HEIGHT);
				
				if(playArea.returnPlace(i,j) == 1){
					graphics.fillOval(i*WIDTH, (5-j)*HEIGHT, WIDTH, HEIGHT);
				}else{
					if(playArea.returnPlace(i,j) ==2){
						graphics.setColor(Color.RED);
						graphics.fillOval(i*WIDTH, (5-j)*HEIGHT, WIDTH, HEIGHT);
					}
				}			
			}
		}
	}

	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == firstcol){
			makeAMove(0, 2);
			bigThoughts.Think(playArea);
			repaint();
		}
		
		if(event.getSource() == secondcol){
			makeAMove(1, 2);
			makeAMove(bigThoughts.Think(playArea), 1);
			repaint();
		}
		
		if(event.getSource() == thirdcol){
			makeAMove(2, 2);
			makeAMove(bigThoughts.Think(playArea), 1);
			repaint();
		}
		
		if(event.getSource() == fourthcol){
			makeAMove(3, 2);
			makeAMove(bigThoughts.Think(playArea), 1);
			repaint();
		}
		if(event.getSource() == fifthcol){
			makeAMove(4, 2);
			makeAMove(bigThoughts.Think(playArea), 1);
			repaint();
		}
		if(event.getSource() == sixthcol){
			makeAMove(5, 2);
			makeAMove(bigThoughts.Think(playArea), 1);
			repaint();
		}
		if(event.getSource() == seventhcol){
			makeAMove(6, 2);
			makeAMove(bigThoughts.Think(playArea), 1);
			repaint();
		}
	}

}
