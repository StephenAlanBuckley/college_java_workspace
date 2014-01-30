import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TehInterface implements ActionListener{
	
	JFrame frame = new JFrame("Get Four In A Row");
	
	private JButton firstcol = new JButton("Play 1");
	private JButton secondcol = new JButton("Play 2");
	private JButton thirdcol = new JButton("Play 3");
	private JButton fourthcol = new JButton("Play 4");
	private JButton fifthcol = new JButton("Play 5");
	private JButton sixthcol = new JButton("Play 6");
	private JButton seventhcol = new JButton("Play 7");
	
	
	public TehInterface(){
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
		
		frame.setLayout(new GridLayout(0,1));
		frame.getContentPane().add(playpanel);
		frame.getContentPane().add(new Board());
	}


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
