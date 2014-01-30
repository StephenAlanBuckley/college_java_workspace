import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*Stephen Buckley's
 * Sudoku
 * SetterUpper Class
 * It sets stuff up!
 */

public class SetterUpper implements ActionListener, Runnable{
	
	private JButton checkButton = new JButton("Check");
	private JButton loadButton = new JButton("Load");
	private JButton solveButton = new JButton("Solve");
	
	private JFileChooser fileChooser = new JFileChooser("."); 
	
	private JTextField textFields[][] = new JTextField[9][9];
	private JTextField rightornot = new JTextField();
	
public SetterUpper()
	{
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,0));
		buttonPanel.add(checkButton);
		buttonPanel.add(loadButton);
		buttonPanel.add(solveButton);
		checkButton.addActionListener(this);
		loadButton.addActionListener(this);
		solveButton.addActionListener(this);
		
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new GridLayout(9,9));
		
		
		
		for(int i=0; i<9; ++i){
			for(int j=0; j<9; ++j){
				textFields[i][j] = new JTextField(1);
				textFields[i][j].setText("");
				textPanel.add(textFields[i][j]);
			}
		}
		
		JFrame frame = new JFrame("Sudoku");
		frame.setLayout(new BorderLayout());
		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
		frame.getContentPane().add(textPanel, BorderLayout.CENTER);
		frame.getContentPane().add(rightornot, BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
public void run(){
	rightornot.setText("Thinking..");
	if(solve()){
		rightornot.setText("Solved");
		
	}else{
		rightornot.setText("Not Solvable");
	}
}
	
private File getFileToReadFrom() {
        fileChooser.setDialogTitle("Choose file to copy from:"); // Optional, affects title bar of chooser
        int returnVal = fileChooser.showOpenDialog(null); // This shows dialog, waits for user to pick something
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            System.out.println("Debug: file chosen for reading is " + file.getPath()); // for debugging
            return file;
        }else{
        return null; // canceled
        }
    }
	
public boolean solve(){
	for(int i =0; i<9; ++i){
		for(int j=0; j<9; ++j){
			if(textFields[i][j].getText().equalsIgnoreCase("")){
				for(int guess=1; guess<10; guess++){
					String guessString = ""+guess;
					textFields[i][j].setText(guessString);
					if(checkcell(i,j)){
						if(solve()){
							return true;
						}
					}
					
				}
				textFields[i][j].setText("");
				return false;
			}
			
		}
	}
	return true;
	
}

public static void main(String[] args)


	{
		SetterUpper board = new SetterUpper();
	}

public boolean checkBoard(){
	
	
	for(int i =0; i<9; ++i){
		for(int j=0; j<9; ++j){
			if(checkcell(i,j)){
				
			}else{
				return false;
			}
		}
			
	}
	return true;
}

public void actionPerformed(ActionEvent event) {
	
	if(event.getSource() == checkButton){
    		
    		if(checkBoard()){
    			rightornot.setText("Totally all good.");
    		}else{
    			rightornot.setText("Not so good.");
    		}
    	}
	
	if(event.getSource() == loadButton){
		for(int k =0; k<9; ++k){
			for(int l=0; l<9; ++l){
				textFields[k][l].setText("");
			}
		}
		File numbersfile;
		numbersfile = getFileToReadFrom();
		Scanner fileScanner ;
		int i=-1 , j =0;
		try {
			fileScanner = new Scanner(numbersfile);
			while(fileScanner.hasNext()){
				String number = fileScanner.next();
				if(i<8){
					i=i+1;
				}else{
					i=0;
					j =j +1;
				}
				if(number.equalsIgnoreCase("0")){
					textFields[j][i].setText("");
				}else{
				textFields[j][i].setText(number);
				}
			}
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		
	}
	
	if(event.getSource() == solveButton){
		(new Thread(this)).start();
	}
}

public boolean checkcell(int i, int j){
	if(textFields[i][j].getText().equalsIgnoreCase("")){
		return true;
	}else{
		if(checkrow(i,j, textFields[i][j].getText()) ==true && checkcol(i, j, textFields[i][j].getText()) == true && checkcluster(i, j, textFields[i][j].getText())==true){
			return true;
		}else
			return false;
	}
}

public boolean checkrow(int row, int col, String number)
{
	
	for(int i = 0; i<9; ++i)
	{
		if(i != col){
		if(textFields[row][i].getText().equalsIgnoreCase(number)){
			return false;
		}
		}
	}
	return true;
}

public boolean checkcol(int row, int col, String number)

{	
	for(int j = 0; j<9; ++j)
	{
		if(j != row){
			if(textFields[j][col].getText().equalsIgnoreCase(number)){
				return false;
				}
			}
	}
	return true;
}

public boolean checkcluster(int row, int col, String number){
	
	int newrow = row/3 * 3 +1;
	int newcol = col/3 * 3 +1;
	
			for(int j=-1;j<2;j++)
			{
				for(int k =-1;k<2;k++)
				{
					if(newrow+j== row && newcol+k == col){
					
					}else
					{
					if(textFields[newrow+j][newcol+k].getText().equalsIgnoreCase(number))
						{
						return false;
						}
					}
				}
			}
			return true;
		
}
}