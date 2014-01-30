package Buildings;
// CS333 Fall 2010
// Initial written by Ames

import Movement.Eye;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import main.FileHelper;


import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;

public abstract class Building implements Comparable<Building>
{
    private boolean firstTime = true; // for creation of display list
    private int displayList = -1;
    private static int totalTextureMemoryUsed = 0;
    private static int numberOfTexturesRead = 0;
    private static int buildingcounter=0;
    private static NumberFormat formatter = new DecimalFormat("#,##0");
	private static TextureHandler textureHandler = new TextureHandler();
    private double nonMovingDrawTime  = 0; // milliseconds
    private double nonMovingDrawCount = 0; // milliseconds
    private long movingDrawTime  = 0;
    private long movingDrawCount = 0;
    public static String paths;
    
    public final void drawWithDisplayList(GL2 gl,GLU glu) {
    	if (firstTime) {
            displayList = gl.glGenLists(1);
            gl.glNewList(displayList, GL2.GL_COMPILE_AND_EXECUTE);
                draw(gl, glu);
            gl.glEndList();
            firstTime = false;
            buildingcounter++;
        } else {
            // measure how long this takes, so we know what to optimize
            // to improve the frame rate.
            long startTime = System.nanoTime();
                gl.glCallList(displayList);
            long stopTime = System.nanoTime();
            nonMovingDrawTime += (stopTime-startTime)/1000000.;
            ++nonMovingDrawCount;
        }
    }
    
    // draw the building and contents.  Called from the main class's display()
    abstract public void draw(GL2 gl, GLU glu);
    
    public void drawMoving(GL2 gl, GLU glu) {
        // override if needed
    }
    
    public void measuredDrawMoving(GL2 gl, GLU glu, double eyeX, double eyeY, double eyeZ) {
        long startTime = System.nanoTime();
            drawMoving(gl, glu);
            drawMoving(gl, glu, eyeX, eyeY, eyeZ);
        long stopTime = System.nanoTime();
        movingDrawTime += (stopTime-startTime)/1000000.;
        ++movingDrawCount;
    }
    
    // //override if you have moving stuff in your room
    // Location of eye is available if needed
    // Eye coordinates are relative to the location of the room, not absolute
    public void drawMoving(GL2 gl, GLU glu, double eyeX, double eyeY, double eyeZ) {
        // some buildings might need this
    }
    
    public void drawSteps(GL2 gl, GLU glu, Eye eye, ArrayList stepList, float xt, float yt, float zt)
    {
    	// only if building has steps
    	// input eye to modify, stepslist to add steps, translation coordinates to move steps with building
    }
    
    protected static final boolean isPowerOf2(int n) {
        return n == (n & -n);
    }
    
    public static final Texture setupTexture(GL2 gl, String filename, int filter) {
        return setupTexture(gl, filename, "textures", filter);
    }

    public static final Texture setupTexture(GL2 gl, String filename) {
     //   paths = paths + "\""+ "textures" + File.separatorChar + filename + "\",";
    	return setupTexture(gl, filename, "textures");
    }
    
    public static final Texture setupTexture(GL2 gl, String filename, String texPath) {
        return setupTexture(gl, filename, texPath, GL2.GL_NEAREST);
    }

    // Read gif, jpg, png, or tiff file (or a few other less common ones)
    // *** MUST BE A POWER OF 2 IN EACH DIRECTION ***
    public static final Texture setupTexture(GL2 gl, String filename, String texPath, int filter) {
        String path = texPath + "/" + filename;
    	Texture texture=null;
  /*  	Graphics2D g;
        BufferedImage img=null;
        BufferedImage argbImg;
     	try {
			img = ImageIO.read(FileHelper.getFileInputStream(path));
		} catch (IOException e) {
            System.out.println("Unable to read texture file: " + e);
			e.printStackTrace();
			System.exit(1);
		}
		argbImg = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB_PRE);
		g = argbImg.createGraphics();
		g.drawImage(img, 0, 0, null); 
		texture = AWTTextureIO.newTexture(gl.getGLProfile(),argbImg,false); */ 
    	try{
    		texture = AWTTextureIO.newTexture(gl.getGLProfile(),textureHandler.getMap().get(path).getArgbimg(),false); 
    	}
    	catch(NullPointerException e){
    		textureHandler.createARGB(path);
    		texture = AWTTextureIO.newTexture(gl.getGLProfile(),textureHandler.getMap().get(path).getArgbimg(),false); 
    		System.out.println("Not read from hashmap");
    	} 
    	
        
        // consider using ImageUtil.flipImageVertically(BufferedImage image)
        //boolean flip = texture.getMustFlipVertically();
        //System.out.println("Flip: " + flip);
        texture.setTexParameteri(GL2.GL_TEXTURE_MAG_FILTER,filter); // GL_LINEAR or GL_NEAREST
        if (filter != GL2.GL_LINEAR)
            texture.setTexParameteri(GL2.GL_TEXTURE_MIN_FILTER,filter); // GL_LINEAR or GL_NEAREST
        else
            texture.setTexParameteri(GL2.GL_TEXTURE_MIN_FILTER,GL2.GL_LINEAR_MIPMAP_LINEAR); // GL_LINEAR or GL_NEAREST            
        texture.setTexParameteri(GL2.GL_TEXTURE_WRAP_S,GL2.GL_REPEAT); // or GL_CLAMP
        texture.setTexParameteri(GL2.GL_TEXTURE_WRAP_T,GL2.GL_REPEAT); // or GL_CLAMP

        if (!isPowerOf2(texture.getImageWidth()) || !isPowerOf2(texture.getImageHeight())) {
            System.out.println(filename + " texture is not power of 2! Size is "
                               + texture.getImageWidth() + "x" + texture.getImageHeight());
            System.exit(1);
        } else {
            totalTextureMemoryUsed += texture.getEstimatedMemorySize();
            numberOfTexturesRead++;
            System.out.println(filename + " texture " + numberOfTexturesRead + " loaded, size is "
                               + texture.getImageWidth() + "x" + texture.getImageHeight()
                               + ", memoryused="+texture.getEstimatedMemorySize()
                               + ", cumulative memory used=" + formatter.format(totalTextureMemoryUsed));
        }
        return texture;
    }
    
    public double getAverageNonMovingDrawTimeMillis() {
        return nonMovingDrawTime/nonMovingDrawCount;
    }
    
    public double getAverageMovingDrawTimeMillis() {
    	if(movingDrawCount==0)
    		movingDrawCount=1;
        return movingDrawTime/movingDrawCount;
    }
    
    // comparable interface, for sorting buildings by draw time in the shutdown hook
    public int compareTo(Building other) {
        // This isn't precise, it assumes the same draw counts, but it's awfully close.
        return (int)((movingDrawTime+nonMovingDrawTime) - (other.movingDrawTime+other.nonMovingDrawTime));
    }
    
    public String toString() {
        return this.getClass().getName() + " drawTime=" + (movingDrawTime+nonMovingDrawTime) +
             "ms,  nonMoving=" + nonMovingDrawTime + ",  moving="+movingDrawTime;
    }
}