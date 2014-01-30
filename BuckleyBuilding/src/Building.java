// CS333 Fall 2010
// Initial written by Ames

import java.io.File;
import java.io.IOException;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.TextureIO;

public abstract class Building
{
    // draw the building and contents.  Called from the main class's display()
    abstract public void draw(GL2 gl, GLU glu);
    
    // override if you have moving stuff in your room
    // Location of eye is available if needed
    // Eye coordinates are relative to the location of the room, not absolute
    public void drawMoving(GL2 gl, GLU glu, float eyeX, float eyeY, float eyeZ) {
        // some buildings might need this
    }
    
    private static boolean isPowerOf2(int n) {
        return n == (n & -n);
        //This is the most concise line of code I've ever seen.  This is beautiful.
    }
    
    // Read gif, jpg, png, or tiff file (or a few other less common ones)
    // *** MUST BE A POWER OF 2 IN EACH DIRECTION ***
    public static Texture setupTexture(GL2 gl, String filename) {
        Texture texture=null;
        try {
            texture = TextureIO.newTexture(new File(filename), false);
        } catch (IOException e) {
            System.out.println("Unable to read texture file: " + e);
            e.printStackTrace();
            System.exit(1);
        }
        // consider using ImageUtil.flipImageVertically(BufferedImage image)
        boolean flip = texture.getMustFlipVertically();
        System.out.println("Flip: " + flip);
        texture.setTexParameteri(GL2.GL_TEXTURE_MAG_FILTER,GL2.GL_LINEAR); // or GL_NEAREST
        texture.setTexParameteri(GL2.GL_TEXTURE_MIN_FILTER,GL2.GL_LINEAR); // or GL_NEAREST
        texture.setTexParameteri(GL2.GL_TEXTURE_WRAP_S,GL2.GL_REPEAT); // or GL_CLAMP
        texture.setTexParameteri(GL2.GL_TEXTURE_WRAP_T,GL2.GL_REPEAT); // or GL_CLAMP

        if (!isPowerOf2(texture.getImageWidth()) || !isPowerOf2(texture.getImageHeight())) {
            System.out.println(filename + " texture is not power of 2! Size is "
                           + texture.getImageWidth() + "x" + texture.getImageHeight());
        } else {
            System.out.println(filename + " texture loaded, size is "
                               + texture.getImageWidth() + "," + texture.getImageHeight());

        }

        return texture;
    }
}