package main;

import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.GL2;

enum Direction
{
	FORWARD, BACKWARD, LEFT, RIGHT;
}

public class UserCollision 
{
	private int boxWidth, boxHeight;
	private FloatBuffer bufTopCent, bufBottCent, bufLeftMid, bufRightMid;
	private float [] depthArr;
	private static final float DEPTH_THRESH = .967f; 
	private boolean turnedOff;
	
	public void turnOff() { turnedOff = true; }
	public void turnOn() { turnedOff = false; }
	public boolean isTurnedOff(){ return turnedOff; }
	
	public boolean collisionHere(Direction dir)
	{	
		if(turnedOff)
			return false;
		if(dir.equals(Direction.FORWARD))
		{
			depthArr = bufTopCent.array();
			for(int i=0; i<depthArr.length; i++)
			{
				if(depthArr[i]<DEPTH_THRESH)
					return true;
			}
		}
		else if(dir.equals(Direction.BACKWARD))
		{
			depthArr = bufBottCent.array();
			for(int i=0; i<depthArr.length; i++)
			{
				if(depthArr[i]<DEPTH_THRESH)
					return true;		
			}
		}
		else if(dir.equals(Direction.LEFT))
		{
			depthArr = bufLeftMid.array();
			for(int i=0; i<depthArr.length; i++)
			{
				if(depthArr[i]<DEPTH_THRESH)
					return true;
			}
		}
		else
		{//Right
			depthArr = bufRightMid.array();
			for(int i=0; i<depthArr.length; i++)
			{
				if(depthArr[i]<DEPTH_THRESH)
					return true;
			}
		}
		return false;
	}
	
	public void readBuff(GL2 gl)
	{
		clearBuff();
		//forward
		gl.glReadPixels( 	boxWidth, 
							2*boxHeight, 
							boxWidth, boxHeight, 
							GL2.GL_DEPTH_COMPONENT, GL.GL_FLOAT, 
							bufTopCent );
		//back
		gl.glReadPixels( 	boxWidth, 
							0, 
							boxWidth, boxHeight, 
							GL2.GL_DEPTH_COMPONENT, GL.GL_FLOAT, 
							bufBottCent );
		
		//leftStrafe
		gl.glReadPixels( 	0, 
							boxHeight, 
							boxWidth, boxHeight, 
							GL2.GL_DEPTH_COMPONENT, GL.GL_FLOAT, 
							bufLeftMid );
		//rightStrafe
		gl.glReadPixels( 	2*boxWidth, 
							boxHeight, 
							boxWidth, boxHeight, 
							GL2.GL_DEPTH_COMPONENT, GL.GL_FLOAT, 
							bufRightMid );
	}
	
	private void clearBuff()
	{
		bufTopCent.clear();
		bufBottCent.clear();
		bufLeftMid.clear();
		bufRightMid.clear();
	}
	
	public UserCollision(int w, int h)
	{
		boxWidth = w/3;
		boxHeight = h/3;
		
		bufTopCent = FloatBuffer.allocate(boxWidth * boxHeight);
		bufBottCent = FloatBuffer.allocate(boxWidth * boxHeight);
		bufLeftMid = FloatBuffer.allocate(boxWidth * boxHeight);
		bufRightMid = FloatBuffer.allocate(boxWidth * boxHeight);
		
		turnedOff = false;
	}
}
