import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EditorFrame implements ActionListener{
	
		/*Early attempts at a visualizer not working out.  I've commented them out where they occur.  Or deleted them.
		 private VisualizingWindow soundseeing = new VisualizingWindow();
		private int soundseeingcount = 0;
		private boolean visuals = false;
		*/
		private Audio music = new Audio("Vivaldi.wav");
		private JButton playButton = new JButton("Play");
	    private JButton stopButton = new JButton("Stop");
		private JButton maxButton = new JButton("Maximize");
	    private JButton quietButton = new JButton("Quieter");
	    private JButton monoButton = new JButton("Mono");
	    private JButton reverseButton = new JButton("Reverse");
	    private JButton echoButton = new JButton("Echo");
	    private JButton fastButton = new JButton("Faster");
	    private JButton loudButton = new JButton("Louder");
	    private JButton distortButton = new JButton("Distort");
	    //private JButton visualButton = new JButton("Visualize");
	    private JButton saveButton = new JButton("Save");

	    public EditorFrame() {
	        JFrame frame = new JFrame("Sound Manipulation");
	        frame.getContentPane().setLayout(new GridLayout(6,2));

	        frame.getContentPane().add(playButton);
	        frame.getContentPane().add(stopButton);
	        frame.getContentPane().add(maxButton);
	        frame.getContentPane().add(quietButton);
	        frame.getContentPane().add(monoButton);
	        frame.getContentPane().add(reverseButton);
	        frame.getContentPane().add(echoButton);
	        frame.getContentPane().add(fastButton);
	        frame.getContentPane().add(loudButton);
	        frame.getContentPane().add(distortButton);
	        //frame.getContentPane().add(visualButton);
	        frame.getContentPane().add(saveButton);

	        playButton.addActionListener(this);
	        stopButton.addActionListener(this);
	        maxButton.addActionListener(this);
	        quietButton.addActionListener(this);
	        monoButton.addActionListener(this);
	        reverseButton.addActionListener(this);
	        echoButton.addActionListener(this);
	        fastButton.addActionListener(this);
	        loudButton.addActionListener(this);
	        distortButton.addActionListener(this);
	        saveButton.addActionListener(this);
	        //visualButton.addActionListener(this);
	       

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.pack();
	        frame.setVisible(true);
	}
		public void mono(){
			
			float[] left = music.getLeftChannel();
			float[] right = music.getRightChannel();

			
			for(int i = 0; i<left.length;++i)
			{
				left[i]= (right[i]+left[i])/2;
			}
			
			music.setLeftChannel(left);
			music.setRightChannel(left);
		}
		
		public void maximize()
		{
			float[] left = music.getLeftChannel();
			float[] right = music.getRightChannel();
			
			double a = 0;
			double b = 0;
			
			for(int i =1; i< left.length;i=i+2)
			{
				double t;
				t= Math.max(Math.abs(left[i]), Math.abs(left[i-1]));
				a= Math.max(Math.abs(t), Math.abs(a));
			}
			
			for(int i =1; i< right.length;i=i+2)
			{
				double t;
				t= Math.max(Math.abs(right[i]), Math.abs(right[i-1]));
				b= Math.max(Math.abs(t), Math.abs(b));
			} 
			
			for(int i = 0; i<left.length;++i)
			{
				left[i] = (float) (left[i] * (1/a)); 
			}
			
			for(int i = 0; i<right.length;++i)
			{
				right[i] = (float) (right[i] * (1/b)); 
			}
			
			music.setLeftChannel(left);
			music.setRightChannel(right);
			
		}
		
		public void quiet()

		{
			float left[] = music.getLeftChannel();
			
			for(int i=0; i<left.length; ++i)
			{
				left[i]= left[i]/2;
			}
		
			float right[] = music.getRightChannel();
			
			for(int i=0; i<right.length; ++i)
			{
				right[i]= right[i]/2;
			}
			
			music.setRightChannel(right);
			music.setLeftChannel(left);
		}

		
		public void reverseLeft()

		{
			float left[] = music.getLeftChannel();
			float revleft[] = new float[left.length];
			
			for(int i=0;i<=left.length-1;++i) 
			{
				revleft[left.length-i-1] = left[i];
			}
			
			music.setLeftChannel(revleft);
		}
		
		public void reverseRight()
		{
			float right[] = music.getRightChannel();
			float revright[] = new float[right.length];
			
			for(int i=0;i<=right.length-1;++i) 
			{
				revright[(right.length-i-1)] = right[i];
			}
			
			music.setRightChannel(revright);
		}
		
		//calls reverseLeft and reverseRight
		public void reverse()
		{
			reverseRight();
			reverseLeft();
		}
		
		//echoes at a rate per second equal to 1second/persecond on the right channel
		public void echoRight(int persecond)
		{
			float right[] = music.getRightChannel();
			int delta = 44100/persecond; 
			
			for(int i =delta;i<right.length; ++i)
			{
				
					right[i] = (float)(.25*right[i]+.75*right[i-delta]);
				
			}
			music.setRightChannel(right);
		}
		
		//echoes at a rate per second equal to 1second/persecond on the right channel
		public void echoLeft(int persecond)
		{
			float left[] = music.getLeftChannel();
			int delta = 44100/persecond;
			
			for(int i=delta; i<left.length;++i)
			{
				
					left[i] = (float)(.25*left[i]+.75*left[i-delta]);
			
			}
			music.setLeftChannel(left);
			
		}
		
		//calls echoRight and echoLeft and sends them both persecond=8, as Ames specified
		public void echo()
		{
			echoRight(8);
			echoLeft(8);
		}
		
		//makes an array that is left/fraction long and stores values at left/fraction in it
		public void speedLeft(double fraction)
		{
			float left[] = music.getLeftChannel();
			float speedleft[] = new float[(int)(left.length/fraction)];
			
			for(int i =0;i<left.length;++i)
			{
				if(i%fraction==0)
				{
					speedleft[(int) (i/fraction)]=left[i];
				}
			}
			music.setLeftChannel(speedleft);
			
		}
		
		//makes an array that is right/fraction long and stores values at right/fraction in it
		public void speedRight(double fraction)

		{
			float right[] = music.getRightChannel();
			float speedright[] = new float[(int)(right.length/fraction)];
			
			for(int i =0;i<right.length;++i)
			{
				if(i%fraction==0)
				{
					speedright[(int) (i/fraction)]=right[i];
				}
			}
			
			music.setRightChannel(speedright);
		}
		
		//calls speedLeft and speedRight with fraction = 2
		public void faster()
		{
			speedLeft(2);
			speedRight(2);
		}
		
		//raises each value in the set of the leftChannel by power
		public void volumeLeft(double power)
		{
			float left[] = music.getLeftChannel();
			
			for(int i = 0;i<left.length;++i)
			{
				if(left[i]>0)
				{
					left[i]= (float)(Math.pow((double)left[i], power));
				}
				
				if(left[i]<0)
				{
					left[i] = -left[i];
					left[i]= (float)(Math.pow((double)left[i], power));
					left[i]= - left[i];
				}
			}
			
			music.setLeftChannel(left);
		}
		
		//raises each value in the set of the rightChannel by power
		public void volumeRight(double power)
		{
			float right[] = music.getRightChannel();
			
			for(int i = 0;i<right.length;++i)
			{
				if(right[i]>0)
				{
					right[i]= (float)(Math.pow((double)right[i], power));
				}
				
				if(right[i]<0)
				{
					right[i] = -right[i];
					right[i]= (float)(Math.pow((double)right[i], power));
					right[i]= - right[i];
				}

			}
			
			music.setRightChannel(right);
		
		}
		
		//calls volumeRight and Left at (0.8)
		public void louder()
		{
			volumeRight(0.8);
			volumeLeft(0.8);
		}
		
		//distorts the left channel
		public void freakifyLeft()
		{
			float left[] = music.getLeftChannel();
			
			for(int i=0;i<left.length;++i)
			{
				if(left[i]>0)
					left[i]=1;
				
				if(left[i]<0)
					left[i]=-1;
			}
			
			music.setLeftChannel(left);
		}
		
		//distorts the right channel
		public void freakifyRight()
		{
			float right[] = music.getRightChannel();
			
			for(int i=0;i<right.length;++i)
			{
				if(right[i]>0)
					right[i]=1;
				
				if(right[i]<0)
					right[i]=-1;
			}
			
			music.setRightChannel(right);
		}
		
		//calls both freakifies (left and right)
		public void distort()
		{
			freakifyRight();
			freakifyLeft();
		}
		
		public void play() throws InterruptedException
		{
			/*Again,this is for that visualizer.
			float left[] = music.getLeftChannel();
			music.play();
			if(visuals == true){
				for(int i = 0; i<left.length;++i){
					visualize(i);
				}
				
			}
			*/
			music.play();
		}
		
		public void stop()
		{
			music.stop();
		}

/*Sorry about this.  Early attempts at a visualizer.
		public void visualize(int i) throws InterruptedException
		{
			float left[] = music.getLeftChannel();
			float right[] = music.getRightChannel();
			Graphics canvas = soundseeing.getGraphics();
			
			soundseeing.drawline((int)left[i], (int)right[i], (int)(left[i]+right[i]));
			canvas.wait((long).02);
			
		
		}
		*/

		public void actionPerformed(ActionEvent event) {
	    	
	    	if(event.getSource() == playButton)
	    	{
	    	 	try {
					play();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	if(event.getSource() == stopButton)
	    	{
	    		stop();
	    	}
	        if(event.getSource() == maxButton)
	        {
	        	maximize();
	        }
	        if(event.getSource() == quietButton)
	        {
	        	quiet();
	        }
	        if(event.getSource() == monoButton)
	        {
	        	mono();
	        }
	        if(event.getSource() == reverseButton)
	        {
	        	reverse();
	        }
	        if(event.getSource() == echoButton)
	        {
	        	echo();
	        }
	        if(event.getSource() == fastButton)
	        {
	        	faster();
	        }
	        if(event.getSource() == loudButton)
	        {
	        	louder();
	        }
	        if(event.getSource() == distortButton)
	        {
	        	distort();
	        }
	        /*
	        if(event.getSource() == visualButton)
	        {
	        	visuals = true;
	        }
	        */
	        if(event.getSource() == saveButton)
	        {
	        	music.save("EditedNewMusic.wav");
	        }
	    
	    }
	    
	    public static void main(String[] args){
	    	EditorFrame mashup = new EditorFrame();
	    }
	    
	}

