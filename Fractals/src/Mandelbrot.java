// Mandelbrot, William Ames Spring 2010

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Mandelbrot extends JComponent implements ActionListener {
    private double xmin=-2, xmax=2, ymin=-2, ymax=2;
    private JButton upButton = new JButton("up");
    private JButton downButton = new JButton("down");
    private JButton leftButton = new JButton("left");
    private JButton rightButton = new JButton("right");
    private JButton zoominButton = new JButton("zoom in");
    private JButton zoomoutButton = new JButton("zoom out");
    private JTextField xminField = new JTextField(10);
    private JTextField xmaxField = new JTextField(10);
    private JTextField yminField = new JTextField(10);
    private JTextField ymaxField = new JTextField(10);

    public Mandelbrot() {
    	setPreferredSize(new Dimension(400,400));
    	setBackground(Color.WHITE);

    	setBorder(new LineBorder(Color.BLACK,1));
    	
    	JFrame frame = new JFrame("Mandelbrot Set");
    	setupContent(frame);
    	setupButtons(upButton, downButton, leftButton, rightButton, zoominButton, zoomoutButton);
    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.pack();
    	frame.setVisible(true);
    	
    	
    }
    
    public void setupButtons(JButton... buttons) {
    	for (JButton button: buttons)
    		button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event) {
    	JButton source = (JButton)event.getSource();
    	double width = xmax-xmin;
    	double height = ymax-ymin;

    	if (source == upButton) {
    		ymin -= height/10;
    		ymax -= height/10;

    	} else if (source == downButton) {
    		ymin += height/10;
    		ymax += height/10;

    	} else if (source == leftButton) {
    		xmin -= width/10;
    		xmax -= width/10;

    	} else if (source == rightButton) {
    		xmin += width/10;
    		xmax += width/10;

    	} else if (source == zoominButton) {
    		height= height/2;
    		width = width/2;

    	} else if (source == zoomoutButton) {
    		width = width*2;
    		height = height*2;

    	}
    	
    	xminField.setText(""+xmin);
    	xmaxField.setText(""+xmax);
    	yminField.setText(""+ymin);
    	ymaxField.setText(""+ymax);
    	repaint();
    }
    
    public void setupContent(JFrame frame) {
    	Container content = frame.getContentPane();
    	
    	content.add(this);
    }

    public void paintComponent(Graphics graphics) {
    	System.out.println("Painting");
    	int width  = getWidth();
    	int height = getHeight();
    	graphics.setColor(Color.BLACK);
    	for (int xi=0; xi<width; ++xi) {
    		double x = xmin + (double)xi/width*(xmax-xmin);
    		for (int yi=0; yi<getHeight(); ++yi) {
    			double y = ymin + (double)(height-yi)/height*(ymax-ymin); // y flipped in Java
                Complex k = new Complex(0f, 0f);
                Complex c = new Complex(x,y);

                for (int i=0; i<100; ++i) {
                    k = Complex.add(Complex.mult(k,k), c);
                    if (k.isNan())
                        break;
                }
                if (k.modSquared()<100f) {
                	graphics.drawLine(xi, yi, xi, yi);
                }

    		}
    	}

        // draw axes
    	graphics.setColor(Color.RED);
    	graphics.drawLine(width/2, 0, width/2, height);  // vertical
    	graphics.drawLine(0, height/2, width, height/2); // horizontal
    }

    public static void main(String[] args) {
    	new Mandelbrot();
    }
}