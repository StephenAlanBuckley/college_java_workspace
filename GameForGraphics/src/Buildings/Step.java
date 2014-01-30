package Buildings;
// Step Class
// Provide x and z coordinates of step within building and height of step
// If eye over step and within stepping range, sets y-coordinate of eye to step coordinate + initial height
// Add instances to stepList so modEye will be called for each step

// Must hold down key for a while to go up/down stairs

import Movement.Eye;

public class Step {
	private double x1, x2, y, z1, z2;
	Eye eye;
	
	public Step(double x1, double x2, double y, double z1, double z2, Eye eye)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y = y;
		this.z1 = z1;
		this.z2 = z2;
		this.eye = eye;
	}
	
	public boolean onStep()
	{
		if ( (eye.getX() >= x1 && eye.getX() <= x2) || (eye.getX() <= x1 && eye.getX() >= x2) )
		{
			if ( (eye.getZ() >= z1 && eye.getZ() <= z2) || (eye.getZ() <= z1 && eye.getZ() >= z2) )
			{
				return true;
			}
		}
		return false;
	}
	
	public void modEye(){ 
		if ( (eye.getX() >= x1 && eye.getX() <= x2) || (eye.getX() <= x1 && eye.getX() >= x2) )
		{
			if ( (eye.getZ() >= z1 && eye.getZ() <= z2) || (eye.getZ() <= z1 && eye.getZ() >= z2) )
			{
				if ( (eye.getY()-5 >= (y - eye.getStepSize())) && (eye.getY()-5 <= (y + eye.getStepSize())) )  
				{
					//eye.setStepSize(1);
					eye.setY(y + 5); 
				}
			}
		}
		else
		{
			//eye.returnToDefault();
			eye.setOriginalHeight(); //Fall off steps
		}
	}
}
