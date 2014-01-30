package Buildings;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import javax.imageio.ImageIO;

import main.FileHelper;

public class TextureHandler {
	private static HashMap<String, ARGBImage> textureMap = new HashMap<String, ARGBImage>();
	private static String filename = "textureMap.hash";
	private static boolean changed=false;

	public TextureHandler() {

	}

	@SuppressWarnings("unchecked")
	public static void retrieveTextureHash(){
	    long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis =(FileInputStream) FileHelper.getFileInputStream(filename);
			in = new ObjectInputStream(fis);
			textureMap = (HashMap<String, ARGBImage>) in.readObject();
			in.close();
		}  catch (Exception e) {  //I Know generic exception handling is very bad, but I hate multiple catch blocks. Besides, lets pray these don't happen
			e.printStackTrace();
			System.out.println("It appears that the texture cache doesn't exist. It will be written when the game ends");
		}
		long textureHashReadTime = System.currentTimeMillis() - startTime;
		System.out.println(filename + " read time = " + textureHashReadTime/1000. + " seconds");
		
		startTime = System.currentTimeMillis();
		int textureCount=0;
		for(ARGBImage i: textureMap.values()){
			i.process();
			++textureCount;
		}
	    long texProcTime = System.currentTimeMillis() - startTime;
	    System.out.println("Texture file processing time time = " + texProcTime/1000. + " seconds, " +
	                       textureCount + " textures");

	}
	
	public HashMap<String, ARGBImage> getMap(){
		return textureMap;
	}
	
	public BufferedImage createARGB(String filepath) {
		changed=true;
		ARGBImage texture = new ARGBImage(filepath);
		textureMap.put(filepath, texture);
		return texture.getArgbimg();
	}
	
	public static void writeTextureHash() {
		if (changed) {
			FileOutputStream fos = null;
			ObjectOutputStream out = null;
			try {
				fos = new FileOutputStream(filename);
				out = new ObjectOutputStream(fos);
				out.writeObject(textureMap);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class ARGBImage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8888676629962980133L;
	private transient BufferedImage argbImg;
	private transient Graphics2D graphics;
	private SerializableBufferedImage image;
	private int w;
	private int h;

	public ARGBImage(String filepath) {
		try {
			image = new SerializableBufferedImage(ImageIO.read(FileHelper.getFileInputStream(filepath)));
		} catch (IOException e) {
			System.out.println("Unable to read texture file: " + e);
			e.printStackTrace();
			System.exit(1);
		}
		h=image.getBufferedImage().getHeight();
		w=image.getBufferedImage().getWidth();

		argbImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB_PRE);
		graphics = argbImg.createGraphics();
		graphics.drawImage(image.getBufferedImage(),0,0,null);
	}

	public void process() {
		argbImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB_PRE);
		graphics = argbImg.createGraphics();
		graphics.drawImage(image.getBufferedImage(),0,0,null);
	}

	public BufferedImage getArgbimg() {
		return argbImg;
	}


	public Graphics2D getGraphics() {
		return graphics;
	}


	public BufferedImage getImage() {
		return image.getBufferedImage();
	}


}