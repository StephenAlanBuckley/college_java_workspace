package Buildings;
//###############################################################
//
//	   ______ _____    _____ _____ _____
//	  / ____// ___/   |__  /|__  /|__  /
//	 / /     \__ \     /_ <  /_ <  /_ < 
//	/ /___  ___/ /   ___/ /___/ /___/ / 
//	\____/ /____/   /____//____//____/  
//	                                    
//	   ______                                 __             
//	  / ____/____   ____ ___   ____   __  __ / /_ ___   _____
//	 / /    / __ \ / __ `__ \ / __ \ / / / // __// _ \ / ___/
//	/ /___ / /_/ // / / / / // /_/ // /_/ // /_ /  __// /    
//	\____/ \____//_/ /_/ /_// .___/ \__,_/ \__/ \___//_/     
//	                       /_/                               
//	   ______                     __     _            
//	  / ____/_____ ____ _ ____   / /_   (_)_____ _____
//	 / / __ / ___// __ `// __ \ / __ \ / // ___// ___/
//	/ /_/ // /   / /_/ // /_/ // / / // // /__ (__  ) 
//	\____//_/    \__,_// .___//_/ /_//_/ \___//____/  
//	                  /_/                             
//
//
//	Le Zhang
//	Homework 5 - Game Scene and Motion
//	Due 10/28/2010
//
//	Homework Tasks:
//	1. Create a house with at least 2 doorways
//	2. Use at least one quadric
//	3. Create at least 2 objects for the house
//
//	Control keys:
//	w - forward
//	a - left
//	s - backward
//	d - right
//	q - strafe left
//	e - strafe right
//
//############################################################### 

/*	Texture List (textures can be changed by changing texturedir)
	 1. grass
	 2. smooth stone
	 3. dirt
	 4. grassy dirt
	 5. wood planks
	 6. half stone side
	 7. half stone top
	 8. brick
	 9. tnt side
	 10. tnt top
	 11. tnt bot
	 ~
	 17. cobblestone
	 18. bedrock
	 19. sand
	 20. gravel
	 21. tree side
	 22. tree top
	 ~
	 26. chest top
	 27. chest side
	 27. chest front
	 ~
	 33. gold ore
	 34. iron ore
	 35. coal
	 36. bookshelf
	 37. mossy cobblestone
	 38. obsidian
	 ~
	 42. long chest left
	 43. long chest right
	 44. craft table top
	 45. oven front
	 46. oven side
	 ~ 
	 50. glass
	 51. diamond ore
	 52. redstone ore
	 53. tree leaves clear
	 54. tree leaves opaque
	 ~
	 58. long chest back left
	 59. long chest back right
	 60. craft side 1
	 61. craft side 2
	 62. oven front on
*/

import java.awt.Font;
import java.io.File;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import SketchupModels.LeZhangLion;
import SketchupModels.LeZhangSanta;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;


public class ZhangBuilding extends Building
{
	private final String texturedir = "zhang_textures/"; //default_textures or painterly_textures
	
	private static GLUquadric quadric; // to control properties of quadric-based objects here 
	
	private static Texture[] textures = new Texture[256];
	private float defaultCubeSize = 4f;
	
	private Texture currentlyBoundTexture = null;
	
	private LeZhangLion lion;

	private LeZhangSanta santa;
	private TextRenderer renderer;

	
	public ZhangBuilding(GL2 gl, GLU glu)
	{
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
		//Edit by Melvin Ross
		if(quadric==null){
		quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, true);        // false, or true to generate texture coordinates
        
        for(int i=1;i<=102;i++)
        	textures[i] = zhangSetupTexture(gl, texturedir + "LZ_" + i + ".png");
        
        // Lion near right tree stump, and santa inside building.
        lion = new LeZhangLion(gl, glu);
        santa = new LeZhangSanta(gl, glu);
		}
	}
	
	private void bind(Texture texture)
	{
	    if (texture != currentlyBoundTexture)
	        texture.bind();
	}
	
	   public void drawMoving(GL2 gl, GLU glu) {
	        	    // Zhang Building Text
	           gl.glPushMatrix();
	               gl.glRotated(180, 0, 1, 0);
	               gl.glTranslated(-70, 8, -14.5);
	               renderer.begin3DRendering();
	               renderer.setColor(0, 0, 0, 1);
	               renderer.draw3D("Napoleon Dynamite", 0f, 0f,0, .25f*1f/9);
	               renderer.end3DRendering();
	          gl.glPopMatrix();

	    }

	
	@Override
	public void draw(GL2 gl, GLU glu)
	{
	       
	   
		
		currentlyBoundTexture = null; // can't count on the bind in this class in previous draw, some other class probably bound somthing different
	  gl.glPushMatrix();
	    gl.glTranslatef(0,0,100);
		// Ground
		// left side grass
		quad(gl, glu, textures[1], 	0, 	0, 	0,
									0,	0, 	-100,
									26,	0,	-100,
									26,	0,	0);
		// bottom side grass
		quad(gl, glu, textures[1], 	26, 0,	0,
									26, 0,	-42,
									44, 0,	-42,
									44, 0,	0);
		quad(gl, glu, textures[1], 	56, 0,	0,
									56, 0,	-42,
									74, 0,	-42,
									74, 0,	0);
		// top side grass
		quad(gl, glu, textures[1], 	26,	0,	-82,
									26,	0,	-100,
									74,	0,	-100,
									74,	0,	-82);
		// right side grass
		quad(gl, glu, textures[1], 	74,	0,	0,
									74,	0,	-100,
									100,0,	-100,
									100,0,	0);
		// house floor
		quad(gl, glu, textures[5], 	26, 0,	-42,
									26, 0,	-82,
									74, 0,	-82,
									74, 0,	-42);
		// manually textured gravel path
		gl.glEnable(GL2.GL_TEXTURE_2D);
	        bind(textures[20]);
	        gl.glBegin(GL2.GL_QUADS);
	            gl.glTexCoord2f(0f,10f); gl.glVertex3f(44,  0, 0);
	            gl.glTexCoord2f(3f,10f); gl.glVertex3f(56,  0, 0);
	            gl.glTexCoord2f(3f,0f); gl.glVertex3f(56,  0, -42);
	            gl.glTexCoord2f(0f,0f); gl.glVertex3f(44,  0, -42);
	        gl.glEnd();
	    gl.glDisable(GL2.GL_TEXTURE_2D);
		
		// The House
		// front
		cubeGrow(gl, glu, textures[5], 26f, 2f, -42f, 5, 3, -1);
		cubeGrow(gl, glu, textures[5], 58f, 2f, -42f, 5, 3, -1);
		// back
		cubeGrow(gl, glu, textures[5], 26f, 2f, -82f, 10, 3, -1);
		cubeGrow(gl, glu, textures[5], 70f, 2f, -82f, 2, 3, -1);
		cubeGrow(gl, glu, textures[5], 66f, 10f, -82f, 1, 1, 1);
		// sides
		cubeGrow(gl, glu, textures[5], 26f, 2f, -46f, 1, 3, -9);
		cubeGrow(gl, glu, textures[5], 74f, 2f, -46f, 1, 3, -9);
		// roof
		cubeGrow(gl, glu, textures[5], 30f, 14f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 34f, 18f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 38f, 22f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 42f, 26f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 46f, 30f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 50f, 30f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 54f, 30f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 58f, 26f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 62f, 22f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 66f, 18f, -46f, 1, 1, -9);
		cubeGrow(gl, glu, textures[5], 70f, 14f, -46f, 1, 1, -9);
		
		cubeGrow(gl, glu, textures[5], 30f, 14f, -42f, 11, 1, 1);
		cubeGrow(gl, glu, textures[5], 34f, 18f, -42f, 3, 1, 1);
		cubeGrow(gl, glu, textures[5], 58f, 18f, -42f, 3, 1, 1);
		cubeGrow(gl, glu, textures[5], 38f, 22f, -42f, 7, 1, 1);
		cubeGrow(gl, glu, textures[5], 42f, 26f, -42f, 5, 1, 1);
		cubeGrow(gl, glu, textures[5], 46f, 30f, -42f, 3, 1, 1);
		
		cubeGrow(gl, glu, textures[5], 30f, 14f, -82f, 11, 1, 1);
		cubeGrow(gl, glu, textures[5], 34f, 18f, -82f, 3, 1, 1);
		cubeGrow(gl, glu, textures[5], 58f, 18f, -82f, 3, 1, 1);
		cubeGrow(gl, glu, textures[5], 38f, 22f, -82f, 7, 1, 1);
		cubeGrow(gl, glu, textures[5], 42f, 26f, -82f, 5, 1, 1);
		cubeGrow(gl, glu, textures[5], 46f, 30f, -82f, 3, 1, 1);

		
		// front door
		cubeGrow(gl, glu, textures[5], 42f, 2f, -38f, 1, 2, 1);
		cubeGrow(gl, glu, textures[5], 58f, 2f, -38f, 1, 2, 1);
		cubeGrow(gl, glu, textures[5], 42f, 10f, -38f, 5, 1, 1);
		
		// brick wall
		cubeGrow(gl, glu, textures[17], 26f, 2f, -14f, 1, 1, -7);
		cubeGrow(gl, glu, textures[17], 30f, 2f, -14f, 3, 1, 1);
		cubeGrow(gl, glu, textures[17], 74f, 2f, -14f, 1, 1, -7);
		cubeGrow(gl, glu, textures[17], 70f, 2f, -14f, -3, 1, 1);
		
		// Objects inside the house
		// chest 1
		cube(gl, glu, textures[27], textures[42], textures[27], textures[27], textures[26], textures[26], 30f, 2f, -50f, defaultCubeSize);
		cube(gl, glu, textures[27], textures[43], textures[27], textures[27], textures[26], textures[26], 30f, 2f, -54f, defaultCubeSize);
		// chest 2
		cube(gl, glu, textures[27], textures[42], textures[27], textures[27], textures[26], textures[26], 30f, 2f, -58f, defaultCubeSize);
		cube(gl, glu, textures[27], textures[43], textures[27], textures[27], textures[26], textures[26], 30f, 2f, -62f, defaultCubeSize);
		// work bench
		cube(gl, glu, textures[60], textures[61], textures[60], textures[61], textures[44], textures[44], 30f, 2f, -66f, defaultCubeSize);
		// furnace
		cube(gl, glu, textures[46], textures[45], textures[46], textures[46], textures[2], textures[2], 30f, 2f, -70f, defaultCubeSize);
		
		// row of tnt...
		cubeGrow(gl, glu, textures[9], textures[9], textures[9], textures[9], textures[10], textures[10], 70f, 2f, -54f, 1, 1, -4);
		
		// quadric tree
		cubeGrow(gl, glu, textures[21], textures[21], textures[21], textures[21], textures[22], textures[22], 34f, 2f, -26f, 1, 6, 1);
		gl.glEnable(GL2.GL_TEXTURE_2D);
        bind(textures[54]);
        gl.glPushMatrix();
            gl.glTranslatef(34, 7, -26);
            gl.glRotatef(-90, 1, 0, 0);
            //glu.gluSphere(quadric, 15, 10, 10);
            glu.gluCylinder(quadric, 9, .1, 25, 10, 1);
        gl.glPopMatrix();
	    gl.glDisable(GL2.GL_TEXTURE_2D);
    
	    // tree stump
		cube(gl, glu, textures[21], textures[21], textures[21], textures[21], textures[22], textures[22], 66f, 2f, -26f, defaultCubeSize);
      gl.glPopMatrix();
      
      // Lion and Santa placement
      gl.glPushMatrix(); 
		gl.glTranslatef(50f, 0f, 50f);
		gl.glRotatef(-90, 0, 1, 0);
		santa.draw(gl, glu);
	  gl.glPopMatrix(); 
	  
	  gl.glPushMatrix(); 
		gl.glTranslatef(66f, 0f, 66f);
		gl.glRotatef(-180, 0, 1, 0);
		gl.glScalef(2, 2, 2);
		lion.draw(gl, glu);
	  gl.glPopMatrix(); 
	}
	
	private void quad(GL2 gl, GLU glu, Texture texture,
					float x1, float y1, float z1,
					float x2, float y2, float z2,
					float x3, float y3, float z3,
					float x4, float y4, float z4)
	{
		float a,b,c,a2,b2,c2 = 0;
		// invert textures cause opengl loads them backwards
		float factor = -1/defaultCubeSize;
	
		if ((max(x1,x2,x3,x4)-min(x1,x2,x3,x4)) == 0)
		{
			a = 0;
			b = 0;
			c = factor;
			a2 = 0;
			b2 = factor;
			c2 = 0;
		}
		else if ((max(y1,y2,y3,y4)-min(y1,y2,y3,y4)) == 0)
		{
			a = factor;
			b = 0;
			c = 0;
			a2 = 0;
			b2 = 0;
			c2 = factor;
		}
		else
		{
			a = factor;
			b = 0;
			c = 0;
			a2 = 0;
			b2 = factor;
			c2 = 0;
		}
		
		float[] coef_s = {a,b,c,0};
        float[] coef_t = {a2,b2,c2,0};
		
		gl.glEnable(GL2.GL_TEXTURE_2D);
        bind(texture);
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glBegin(GL2.GL_QUADS);
                gl.glVertex3f( x1, y1, z1);
                gl.glVertex3f( x2, y2, z2);
                gl.glVertex3f( x3, y3, z3);
                gl.glVertex3f( x4, y4, z4);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	}
	
	private void cube(GL2 gl, GLU glu, Texture texture, float Cx, float Cy, float Cz, float side)
	{
		cube(gl, glu, texture, texture, texture, texture, texture, texture, Cx, Cy, Cz, side);
	}
	
	private void cube(GL2 gl, GLU glu, Texture t1, Texture t2, Texture t3, Texture t4, Texture t5, Texture t6, float Cx, float Cy, float Cz, float side)
	{
		side = side/2;
		quad(gl, glu, t1, Cx-side, Cy-side, Cz-side, Cx+side, Cy-side, Cz-side, Cx+side, Cy+side, Cz-side, Cx-side, Cy+side, Cz-side);
		quad(gl, glu, t2, Cx+side, Cy-side, Cz-side, Cx+side, Cy-side, Cz+side, Cx+side, Cy+side, Cz+side, Cx+side, Cy+side, Cz-side);
		quad(gl, glu, t3, Cx+side, Cy-side, Cz+side, Cx-side, Cy-side, Cz+side, Cx-side, Cy+side, Cz+side, Cx+side, Cy+side, Cz+side);
		quad(gl, glu, t4, Cx-side, Cy-side, Cz+side, Cx-side, Cy-side, Cz-side, Cx-side, Cy+side, Cz-side, Cx-side, Cy+side, Cz+side);
		quad(gl, glu, t5, Cx-side, Cy-side, Cz-side, Cx+side, Cy-side, Cz-side, Cx+side, Cy-side, Cz+side, Cx-side, Cy-side, Cz+side);
		quad(gl, glu, t6, Cx-side, Cy+side, Cz-side, Cx+side, Cy+side, Cz-side, Cx+side, Cy+side, Cz+side, Cx-side, Cy+side, Cz+side);
	}
	
	private void cubeGrow(GL2 gl, GLU glu, Texture texture, float x, float y, float z, float xgrow, float ygrow, float zgrow)
	{
		for(int i=0;i<Math.abs(xgrow);i++)
			for(int j=0;j<Math.abs(ygrow);j++)
				for(int k=0;k<Math.abs(zgrow);k++)
				{
					// xgrow/Math.abs(xgrow) and like allows me to grow in negative directions. preserves sign.
					cube(gl, glu, texture, x+(xgrow/Math.abs(xgrow))*i*defaultCubeSize, y+(ygrow/Math.abs(ygrow))*j*defaultCubeSize, z+(zgrow/Math.abs(zgrow))*k*defaultCubeSize, defaultCubeSize);
				}
	}
	private void cubeGrow(GL2 gl, GLU glu, Texture t1, Texture t2, Texture t3, Texture t4, Texture t5, Texture t6, float x, float y, float z, float xgrow, float ygrow, float zgrow)
	{
		for(int i=0;i<Math.abs(xgrow);i++)
			for(int j=0;j<Math.abs(ygrow);j++)
				for(int k=0;k<Math.abs(zgrow);k++)
				{
					// xgrow/Math.abs(xgrow) and like allows me to grow in negative directions. preserves sign.
					cube(gl, glu, t1, t2, t3, t4, t5, t6, x+(xgrow/Math.abs(xgrow))*i*defaultCubeSize, y+(ygrow/Math.abs(ygrow))*j*defaultCubeSize, z+(zgrow/Math.abs(zgrow))*k*defaultCubeSize, defaultCubeSize);
				}
	}
	
	// Helper Methods
	
	private float max(float a, float b, float c, float d)
	{
		return (Math.max(Math.max(Math.max(a, b),c),d));
	}
	
	private float min(float a, float b, float c, float d)
	{
		return (Math.min(Math.min(Math.min(a, b),c),d));
	}
	
	
	// I used the alternate setupTexture method to use the GL_NEAREST parameter
	// so my textures wouldn't blur (they're supposed to be bit-ty)
    public static Texture zhangSetupTexture(GL2 gl, String filename) {
        return setupTexture(gl, filename, GL2.GL_NEAREST);
    }
}
