package main;

import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.media.opengl.awt.GLCanvas;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameConsole extends JPanel implements KeyListener
{
	private GLCanvas canvas;
	private Game game;
	private boolean consoleActivated = false;
	private JTextField input = new JTextField("This is the input box\n");
	private JLabel output = new JLabel("This is the output box\n");
	
	public GameConsole(Game game, GLCanvas canvas)
	{
		super(new GridBagLayout());
		setSize(600,100);
		this.canvas = canvas;
		this.game = game;
		canvas.addKeyListener(this);
		input.setSize(300,50);
		output.setSize(300,50);
		add(input);
		add(output);
	}

	public GameConsole(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public GameConsole(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public GameConsole(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_C)
		{
			System.out.println("Console toggled.");
			consoleActivated = !consoleActivated;
			if(consoleActivated){
				setVisible(true);
			}
			else
			{
				setVisible(false);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
