
public class Color {
	double red, green, blue;
	
	public Color(){
		this(0,0,0);
	}
	
	public Color(double redIn, double greenIn, double blueIn){
		red = redIn;
		green = greenIn;
		blue = blueIn;
	}
	
	public double getRed(){return red;}
	public double getGreen(){return green;}
	public double getBlue(){return blue;}
	
	public void setColor(double redIn, double greenIn, double blueIn){
		red = redIn;
		green = greenIn;
		blue = blueIn;
	}
	
	public void setRed(double redIn){red = redIn;}
	public void setGreen(double greenIn){green = greenIn;}
	public void setBlue(double blueIn){blue = blueIn;}


}
