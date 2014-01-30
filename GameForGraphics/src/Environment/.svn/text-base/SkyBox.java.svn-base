package Environment;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.FileHelper;

import Movement.Eye;

import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;

public class SkyBox {

	private static Texture northTexture;
	private static Texture southTexture;
	private static Texture eastTexture;
	private static Texture westTexture;
	private static Texture upTexture;
	private static Texture downTexture;
	private static int size;
	
	public SkyBox(GL2 gl, GLU glu){
		loadDayTexture(gl);
		size = 50;//FIXME	
	}
	
	public void loadDayTexture(GL2 gl) {
		northTexture = setupTexture(gl, "redsky_north.png");
		southTexture = setupTexture(gl, "redsky_south.png");
		eastTexture = setupTexture(gl, "redsky_east.png");
		westTexture = setupTexture(gl, "redsky_west.png");
		upTexture = setupTexture(gl, "redsky_up.png");
		downTexture = setupTexture(gl, "redsky_down.png");
	}
	
	public void loadNightTexture(GL2 gl){
		
		northTexture = setupTexture(gl, "nightsky_north.png");
		southTexture = setupTexture(gl, "nightsky_south.png");
		eastTexture = setupTexture(gl, "nightsky_east.png");
		westTexture = setupTexture(gl, "nightsky_west.png");
		upTexture = setupTexture(gl, "nightsky_up.png");
		downTexture = setupTexture(gl, "nightsky_down.png");
		
	}
	
	public void draw(GL2 gl, GLU glu, Eye eye) {
		//turn off depth buffer
		gl.glDisable(GL2.GL_DEPTH_TEST);
		gl.glDepthMask(false);
	    // invert all textures
	    gl.glMatrixMode(GL2.GL_TEXTURE);
	    gl.glPushMatrix();
	    	gl.glScalef(1,-1,1);
	    	gl.glMatrixMode(GL2.GL_MODELVIEW);
	    
	    	gl.glEnable(GL2.GL_TEXTURE_2D);
		
	    		gl.glPushMatrix();
	    			gl.glTranslated(eye.getX(),eye.getY()-size/12,eye.getZ());

	    			westTexture.bind();
	    			//Drawing West Face
	    			gl.glBegin(GL2.GL_QUADS);
	    				gl.glTexCoord2f(0f,0f);gl.glVertex3f(-size,0,size);
	    				gl.glTexCoord2f(1f,0f);gl.glVertex3f(-size,0,-size);
	    				gl.glTexCoord2f(1f,1f);gl.glVertex3f(-size,size,-size);
	    				gl.glTexCoord2f(0f,1f);gl.glVertex3f(-size,size,size);
	    			gl.glEnd();
			
	    			northTexture.bind();
	    			//Drawing North Face
	    			gl.glBegin(GL2.GL_QUADS);
	    				gl.glTexCoord2f(0f,0f);gl.glVertex3f(-size,0,-size);
	    				gl.glTexCoord2f(1f,0f);gl.glVertex3f(size,0,-size);
	    				gl.glTexCoord2f(1f,1f);gl.glVertex3f(size,size,-size);
	    				gl.glTexCoord2f(0f,1f);gl.glVertex3f(-size,size,-size);
	    			gl.glEnd();
			
	    			//Drawing East Face
	    			eastTexture.bind();
	    			gl.glBegin(GL2.GL_QUADS); 
	    				gl.glTexCoord2f(0f,0f);gl.glVertex3f(size,0,-size);
	    				gl.glTexCoord2f(1f,0f);gl.glVertex3f(size,0,size);
	    				gl.glTexCoord2f(1f,1f);gl.glVertex3f(size,size,size);
	    				gl.glTexCoord2f(0f,1f);gl.glVertex3f(size,size,-size);
	    			gl.glEnd();
			
	    			//Drawing South Face
	    			southTexture.bind();
	    			gl.glBegin(GL2.GL_QUADS); 
	    				gl.glTexCoord2f(0f,0f);gl.glVertex3f(size,0,size);
	    				gl.glTexCoord2f(1f,0f);gl.glVertex3f(-size,0,size);
	    				gl.glTexCoord2f(1f,1f);gl.glVertex3f(-size,size,size);
	    				gl.glTexCoord2f(0f,1f);gl.glVertex3f(size,size,size);
	    			gl.glEnd();
			
	    			//Drawing Top Face
	    			upTexture.bind();
	    			gl.glBegin(GL2.GL_QUADS); 
	    				gl.glTexCoord2f(0f,1f);gl.glVertex3f(size,size,-size);
	    				gl.glTexCoord2f(1f,1f);gl.glVertex3f(-size,size,-size);
	    				gl.glTexCoord2f(1f,0f);gl.glVertex3f(-size,size,size);
	    				gl.glTexCoord2f(0f,0f);gl.glVertex3f(size,size,size);
	    			gl.glEnd();
			
	    			//Drawing Bottom Face
	    			downTexture.bind();
	    			gl.glBegin(GL2.GL_QUADS); 
	    				gl.glTexCoord2f(1f,1f);gl.glVertex3f(-size,0,size);
	    				gl.glTexCoord2f(0f,1f);gl.glVertex3f(size,0,size); 
	    				gl.glTexCoord2f(0f,0f);gl.glVertex3f(size,0,-size);
	    				gl.glTexCoord2f(1f,0f); gl.glVertex3f(-size,0,-size);
	    			gl.glEnd();
			 
	    		gl.glPopMatrix(); 
	    	gl.glDisable(GL2.GL_TEXTURE_2D);
		
	    	// pop texture matrix
	    	gl.glMatrixMode(GL2.GL_TEXTURE);
        gl.glPopMatrix();
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        //re\"{e}nable depth buffering
        gl.glDepthMask(true);
        gl.glEnable(GL2.GL_DEPTH_TEST);

	}
	
	public static final Texture setupTexture(GL2 gl, String filename, int filter) {
	        return setupTexture(gl, filename, "textures" + "/" + "skybox", filter);
	    }

    public static final Texture setupTexture(GL2 gl, String filename) {
    	return setupTexture(gl, filename, "textures" + "/" + "skybox");
    }
    
    public static final Texture setupTexture(GL2 gl, String filename, String texPath) {
        return setupTexture(gl, filename, texPath, GL2.GL_NEAREST);
    }
    
    // Read gif, jpg, png, or tiff file (or a few other less common ones)
    // *** MUST BE A POWER OF 2 IN EACH DIRECTION ***
    public static final Texture setupTexture(GL2 gl, String filename, String texPath, int filter) {
        Texture texture=null;
        String path = texPath + "/" + filename;
        Graphics2D g;
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
		texture = AWTTextureIO.newTexture(gl.getGLProfile(),argbImg,false);
        
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
        } 
        /*
        else {
            totalTextureMemoryUsed += texture.getEstimatedMemorySize();
            numberOfTexturesRead++;
            System.out.println(filename + " texture " + numberOfTexturesRead + " loaded, size is "
                               + texture.getImageWidth() + "x" + texture.getImageHeight()
                               + ", memoryused="+texture.getEstimatedMemorySize()
                               + ", cumulative memory used=" + formatter.format(totalTextureMemoryUsed));
        }*/
        
        return texture;
    }
	
    protected static final boolean isPowerOf2(int n) {
        return n == (n & -n);
    }
    
    private String getExtension(String file) {
    	return file.substring(file.lastIndexOf("."));
    }
    
}
