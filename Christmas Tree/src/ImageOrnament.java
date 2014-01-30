import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class ImageOrnament extends Ornament{
	
	Image ornamentimage = Toolkit.getDefaultToolkit().getImage("ornament.gif");
	
	public void draw(Graphics graphics){
		graphics.drawImage(ornamentimage, x, y, x+20, y+20, 0, 0, 176, 218, null);
		
	}

}
