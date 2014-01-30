import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.*;

public class URLFrame<T> implements ActionListener{
	
	private JButton firstButton = new JButton("First");
	private JButton lastButton = new JButton("Last");
	private JButton nextButton = new JButton("Next");
	private JButton prevButton = new JButton("Previous");
	private JButton addHeadButton = new JButton("Add to Head");
	private JButton addTailButton = new JButton("Add to Tail");
	private JButton openButton = new JButton("Open");
	private JButton deleteButton = new JButton("Delete");
	
	private DoublyLinkedList<T> URLList = new DoublyLinkedList();
	
	JLabel staticText = new JLabel("http://www.");
	JTextField editText = new JTextField("http://www.");
	JPanel mainPanel = new JPanel();
	JPanel searchPanel = new JPanel();
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		URLFrame newFrame = new URLFrame();
	}
			
	public URLFrame(){
		staticText.setBounds(0, 0, 200, 20);
		
		JFrame URLWindow = new JFrame("URL Manager Deluxe Special Edition 2.0");
		
		mainPanel.setLayout(new GridLayout(1,6));
		mainPanel.add(firstButton);
		mainPanel.add(prevButton);
		mainPanel.add(openButton);
		mainPanel.add(deleteButton);
		mainPanel.add(nextButton);
		mainPanel.add(lastButton);
		
		searchPanel.setLayout(new GridLayout(1,3));
		searchPanel.add(addHeadButton);
		searchPanel.add(editText);
		searchPanel.add(addTailButton);
		
		firstButton.addActionListener(this);
		prevButton.addActionListener(this);
		openButton.addActionListener(this);
		deleteButton.addActionListener(this);
		nextButton.addActionListener(this);
		addTailButton.addActionListener(this);
		addHeadButton.addActionListener(this);
		lastButton.addActionListener(this);
		
		URLWindow.setLayout(new BorderLayout());
		URLWindow.getContentPane().add(mainPanel, BorderLayout.CENTER);
		URLWindow.getContentPane().add(staticText, BorderLayout.NORTH);
		URLWindow.getContentPane().add(searchPanel, BorderLayout.SOUTH);
		URLWindow.pack();
		URLWindow.setVisible(true);
		
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream("urls.txt"));
			URLList=(DoublyLinkedList<T>)istream.readObject();
			istream.close();
			}catch(Exception e)
			{
			URLList=new DoublyLinkedList<T>(); 
			}
	}

	public void saveList(){
		ObjectOutputStream stream;
		try {
		stream = new ObjectOutputStream(new FileOutputStream("urls.txt"));
		stream.writeObject(URLList);
		stream.close();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
}

	public void actionPerformed(ActionEvent event) {
		
		
		if(event.getSource() == firstButton){
			String first;
			first = URLList.first().toString();
			staticText.setText(first);
		}
		
		if(event.getSource() == lastButton){
			staticText.setText(URLList.last().toString());
		}
		
		if(event.getSource() == openButton){
			if(URLList.isEmpty()){
				staticText.setText("There is no URL saved to go to!");
			}else{
				try{
					Desktop.getDesktop().browse(new URI(staticText.getText()));
				}catch (IOException e1){
					e1.printStackTrace();
				}catch (URISyntaxException e1){
					e1.printStackTrace();
				}
			}
		}
		
		if(event.getSource() == deleteButton){
			URLList.delete();
			editText.setText("http://www.");
		}
		
		if(event.getSource() == prevButton){
			String prevText = (String) URLList.prev();
			staticText.setText(prevText);
		}
		
		if(event.getSource() == nextButton){
			String nextText = (String) URLList.next();
			staticText.setText(nextText);
		}
		
		if(event.getSource() == addTailButton){
			URLList.addToTail((T)editText.getText());
			staticText.setText(editText.getText());
		}
		
		if(event.getSource() == addHeadButton){
			String newText ="" + editText.getText();
			URLList.addToHead((T)newText);
			staticText.setText(newText.toString());
		}
		
	}
}
