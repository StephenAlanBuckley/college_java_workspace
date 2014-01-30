
public class Star {
	public double x,y,dx,dy;
	public float red,green,blue;
	
	public Star(double startX, double startY){
		x= startX;
		y= startY;
	}
	
	public Star(float newX, float newY, float newdx,float newdy,float newred,float newgreen,float newblue){
		x = newX;
		y= newY;
		dx = newdx;
		dy = newdy;
		red = newred;
		green = newgreen;
		blue = newblue;
	}
	
	public void update(){
		x = x +dx;
		y = y +dy;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getXSpeed(){
		return dx;
	}
	
	public double getYSpeed(){
		return dy;
	}
	
	public void setXSpeed(double xFast){
		dx = xFast;
	}
	
	public void setYSpeed(double yFast){
		dy = yFast;
	}
	
	public void setX(double xWhere){
		x = xWhere;
	}
	
	public void setY(double yWhere){
		y = yWhere;
	}
}
