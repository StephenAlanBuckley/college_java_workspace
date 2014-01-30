/*
 * Stephen Buckley
 * Sound Manipulators
 * 10/28/09
 */

public class SoundManipulators {

	public Audio music = new Audio("short.wav");
	
	//Makes an average of the two sides come out of both headphones.
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
	
	//Multiplies every Value (left and right) by 1/the max on that side
	public void maximize()
	{
		float[] left = music.getLeftChannel();
		float[] right = music.getRightChannel();
		
		double a = 0;
		double b = 0;
		
		for(int i =1; i<= left.length;i=i+1)
		{
			double t;
			t= Math.max(left[i], left[i+1]);
			a= Math.max(t, a);
		}
		
		for(int i =1; i<= right.length;++i)
		{
			double t;
			t= Math.max(right[i], right[i-1]);
			b= Math.max(t, b);
		} 
		
		for(int i = 0; i<left.length;++i)
		{
			left[i] = (float) (left[i] * (1/a)); 
		}
		
		for(int i = 0; i<right.length;++i)
		{
			right[i] = (float) (right[i] * (1/a)); 
		}
		
		music.setLeftChannel(left);
		music.setRightChannel(right);
		
	}
	
	//halves only the left volume (I don't know why only the left, but that's what the homework says)
	public void quiet()

	{
		float left[] = music.getLeftChannel();
		
		for(int i=0; i<left.length; ++i)
		{
			left[i]= left[i]/2;
		}
		
		music.setLeftChannel(left);
	}
	
	//reverses the array for the left channel.
	public void reverseLeft()
	{
		float left[] = music.getLeftChannel();
		float revleft[] = new float[left.length];
		
		for(int i=0;i<=left.length;++i) 
		{
			revleft[left.length-i-1] = left[i];
		}
		
		music.setLeftChannel(revleft);
	}
	
	//reverses the array for the right channel.
	public void reverseRight()
	{
		float right[] = music.getRightChannel();
		float revright[] = new float[right.length];
		
		for(int i=0;i<=right.length;++i) 
		{
			revright[right.length-i-1] = right[i];
		}
		
		music.setLeftChannel(revright);
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
		float delta = 44100/persecond; 
		
		for(int i =0;i<right.length; ++i)
		{
			if(i>delta)
			{
				right[i] = (float)(.25*(int)right[i]+.75*(int)right[i-(int)delta]);
			}
		}
	}
	
	//echoes at a rate per second equal to 1second/persecond on the right channel
	public void echoLeft(int persecond)
	{
		float left[] = music.getLeftChannel();
		float delta = 44100/persecond;
		
		for(int i=0; i<left.length;++i)
		{
			if(i<delta)
			{
				left[i] = (float)(.25*(int)left[i]+.75*(int)left[i-(int)delta]);
			}
		}
		
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
			if(i>0)
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
	
	public void play()
	{
		music.play();
	}
	
	public void stop()
	{
		music.stop();
	}

}
