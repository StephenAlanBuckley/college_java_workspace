import java.awt.*;

public class Star {
	
	private Point top, left, right, bottomLeft, bottomRight;
	
	//general Constructor
	public Star(Point iTop, Point iLeft, Point iRight, Point iBottomLeft, Point iBottomRight)
	{
		top = iTop;
		left = iLeft;
		right = iRight;
		bottomLeft = iBottomLeft;
		bottomRight = iBottomRight;
		
	}
	
	//default Constructor~ good to have in order to CYA
	public Star()
	{
		top = new Point(10, 0);
		left = new Point(0, 5);
		right = new Point(20, 5);
		bottomLeft = new Point(5, 20);
		bottomRight = new Point(15, 20);
	}
	
	public void move(int dx, int dy)
	{
		//move all of the points that determine this star
		top.move(dx,dy);
		left.move(dx,dy);
		right.move(dx,dy);
		bottomRight.move(dx,dy);
		bottomLeft.move(dx,dy);
	}
	
	public void draw(Graphics g)
	{
		g.drawLine(top.getX(), top.getY(), bottomLeft.getX(), bottomLeft.getY());
		g.drawLine(top.getX(), top.getY(), bottomRight.getX(), bottomRight.getY());
		g.drawLine(left.getX(), left.getY(), right.getX(), right.getY());
		g.drawLine(left.getX(), left.getY(), bottomRight.getX(), bottomRight.getY());
		g.drawLine(right.getX(), right.getY(), bottomLeft.getX(), bottomLeft.getY());
	}
}
