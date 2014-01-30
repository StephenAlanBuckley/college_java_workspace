package Buildings;

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.Longshot;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class ParkBuilding extends Building
{
	private static Texture bricks_castle, bricks_well, dirt, fence_post, grass, water, rust, road, purple_wall;
	private static GLUquadric quadric, sphereQuad;
	private static Longshot weapon; 
	private int counter,ladDist, houseSide, side = 100;//length and width
	private float angle, ladderL;//angle of ladder against house, and ladderLength
	private TextRenderer renderer;
	
	public ParkBuilding(GL2 gl, GLU glu)
	{
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		if(weapon==null){
		weapon = new Longshot(gl, glu);
		
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL);//Fill, Point, Silhouette, or Lines
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE);//None, flat, or Smooth//For light
		glu.gluQuadricTexture(quadric, true);
		
		sphereQuad = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(sphereQuad, GLU.GLU_LINE);//Fill, Point, Silhouette, or Lines
		glu.gluQuadricNormals(sphereQuad, GLU.GLU_NONE);//None, flat, or Smooth//For light
		glu.gluQuadricTexture(sphereQuad, true);
		
		bricks_castle = setupTexture(gl,"PARKbricks_castle.png");
		bricks_well = setupTexture(gl,"PARKbricks_well.png");
		purple_wall = setupTexture(gl,"PARKpurple_wall.png");
		dirt = setupTexture(gl,"PARKdirt.png");
		fence_post = setupTexture(gl,"PARKfence_post.png");
		grass = setupTexture(gl,"PARKgrass2.png");
		water = setupTexture(gl,"PARKwater.png");
		rust = setupTexture(gl,"PARKrust.png");
		road = setupTexture(gl,"PARKroad.png");
		}
		
		houseSide = (int)2f*side/3-4-2;//2/3 of plot, -4=-2+-2 to put 2 unit gap from fence, -2 to account for translate
		ladDist=10;//for ladder against house
		ladderL = (float)Math.sqrt(ladDist*ladDist + (side/4)*(side/4));
		angle = (float)Math.toDegrees(Math.acos(ladDist/ladderL));
	}

	public void drawMoving(GL2 gl, GLU glu) {
	    	      // Park Building Text
	              gl.glPushMatrix();
	                  gl.glRotated(180, 0, 1, 0);
	                  gl.glTranslated(-42, 10, -32);
	                  renderer.begin3DRendering();
	                  renderer.setColor(1, 0, 0, 1);
	                  renderer.draw3D("Space Jam", 0f, 0f,0, .25f*1f/7);
	                  renderer.end3DRendering();
	          gl.glPopMatrix();

	}
	
	public void draw(GL2 gl, GLU glu) 
	{	
        
		
		gl.glPushMatrix();
			gl.glTranslatef(50, 3, 12);
			weapon.draw(gl, glu); 
		gl.glPopMatrix();
	
		setColor(gl,0,255,0);//grassy field; base
		drawBox(gl, side, side, side, grass, .2f, .2f, 0);//just 1 side of box: base
		
		setColor(gl,139,69,19);//dirt cube with grassy field as top face; 
		drawBox(gl, side,-side/4,side,dirt,.2f,.2f,2,3,4,5);//just 4 side faces; not base and top of box

		gl.glPushMatrix();//dirt road
			gl.glTranslatef(side/2-3,.1f,0);
			drawBox(gl,4,0,side/3,road,.2f,.2f,0);
			gl.glTranslatef(0,0,side/3-4);
			drawBox(gl,-houseSide/2,0,4,road,.2f,.2f);
		gl.glPopMatrix();
		
		gl.glPushMatrix();//well
			gl.glTranslatef(3f*side/4,5,3f*side/4);//start 5 foot over grassy field
			gl.glRotatef(90,1,0,0);//z axis points towards ground
			gl.glEnable(GL2.GL_TEXTURE_2D);
				bricks_castle.bind();
				gl.glColor3f(220f/255, 220f/255, 220f/255);
				gl.glPushMatrix();
					int split=6;
					for(int i=0; i<=side/4+5; i+=split)//split up to make texture look nicer
					{
						glu.gluCylinder(quadric, 5, 5, (side/4+5)/split, 10, 1);
						gl.glTranslatef(0, 0, (side/4+5)/split);//intervals of 6
					}
				gl.glPopMatrix();
			gl.glDisable(GL2.GL_TEXTURE_2D);
			
			gl.glEnable(GL2.GL_TEXTURE_2D);//ladder
				rust.bind();
				gl.glColor3f(178f/255, 34f/255, 34f/255);
				gl.glTranslatef(0,2,0);//pushes closer to edge of well
				this.drawLadder(gl, glu, side/2+5, 4, .5f, 2, 4);//protrudes +5 out of ground
			gl.glDisable(GL2.GL_TEXTURE_2D);	
		gl.glPopMatrix();

		gl.glPushMatrix();//underground waterway
			gl.glTranslatef(side/2, -side/2, 0);
			setColor(gl,0,0,255);
			drawBox(gl, side/2, side/4, side, water, .2f, .2f, 0);//just 1 side of box: base
			
			setColor(gl,205,201,201);
			drawBox(gl, side/2, side/4, side, bricks_well, .2f, .2f, 1,2,3,4,5);
			//some steps
			gl.glTranslatef(10,0,0);	drawBox(gl,side/2-20,8,20,bricks_castle,.2f,.2f);
			gl.glTranslatef(0,0,20);	drawBox(gl,side/2-20,6,2,bricks_castle,.2f,.2f);
			gl.glTranslatef(0,0,2);		drawBox(gl,side/2-20,4,2,bricks_castle,.2f,.2f);
			gl.glTranslatef(0,0,2);		drawBox(gl,side/2-20,2,2,bricks_castle,.2f,.2f);
		gl.glPopMatrix();	
	
		gl.glPushMatrix();//fence
			gl.glEnable(GL2.GL_TEXTURE_2D);
				fence_post.bind();
				gl.glColor3f(139f/255, 69f/255, 19f/255);
				gl.glTranslatef(2, 0, 2);//2X and 2Z in so posts made completely in plot		
				gl.glRotated(-90, 1, 0, 0);
				for(int i=2; i<side/2-6; i+=4) { pickets(gl, glu, i, side/2-6); }//puts up pickets
				gl.glTranslatef(12,0,0);//space for main gate
				for(int i=2; i<side/2-8; i+=4) { pickets(gl, glu, i, side/2-6); } //more pickets
				for(int j=0; j<3; j++)
				{//other 3, uninterrupted sides
					gl.glRotatef(-90,0,0,1);
					for(int i=2; i<side-2; i+=4)
						pickets(gl, glu, i, side);
				}
			gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glPopMatrix();

		gl.glPushMatrix();//house
			gl.glTranslatef(4, .1f, side/3);
			setColor(gl, 189, 183, 107);
			drawBox(gl, houseSide, side/4, houseSide,purple_wall, .2f, .2f, 1,3,4,5);//roof, and side faces except front

			//front wall of house minus door
			gl.glPushMatrix();
				drawBox(gl, houseSide/4-2,side/4,0,purple_wall,.2f,.2f, 2);//vertical wall right of right door
				gl.glTranslatef(houseSide/4-2, 0, 0);
				
				gl.glPushMatrix();
					gl.glTranslatef(0,8,0);
					drawBox(gl, 4,side/4-8,0,purple_wall,.2f,.2f, 2);//wall above right door
				gl.glPopMatrix();
				
				gl.glTranslatef(4,0,0);
				drawBox(gl, 2*houseSide/4-4,side/4,0,purple_wall,.2f,.2f, 2);//vertical wall left of right door and right of left door
				
				gl.glTranslatef(2*houseSide/4-4, 0, 0);
				
				gl.glPushMatrix();
					gl.glTranslatef(0,8,0);
					drawBox(gl, 4,side/4-8,0,purple_wall,.2f,.2f, 2);//wall above left door
				gl.glPopMatrix();
				
				gl.glTranslatef(4,0,0);
				drawBox(gl, houseSide/4-2,side/4,0,purple_wall,.2f,.2f, 2);//vertical wall left of left door
			gl.glPopMatrix();
		gl.glPopMatrix();
		
		gl.glPushMatrix();//decorate interior
			gl.glTranslatef(4,.1f,side/3);//move to lower right corner of house
			gl.glTranslatef(0,.1f,0);
			gl.glPushMatrix();
				gl.glTranslatef(2,0,2);//move to lower right of court
				gl.glPushMatrix();
					gl.glTranslatef(2,0,2);//move to lower right of inbounds
					gl.glPushMatrix();
						setColor(gl,193,162,80);//court color
						drawBox(gl,47,0,50,0);
						gl.glTranslatef(19,.1f,25);//at FT line
						gl.glRotatef(90,1,0,0);//want to make disk on ground
						setColor(gl,254,199,34);//laker gold
						glu.gluDisk(quadric, 6, 0, 10, 10);//free throw circle
						setColor(gl,125,69,156);//laker purple
						glu.gluDisk(quadric, 20, 19, 10, 10);//3pt circle
						gl.glTranslatef(28,0,0);//at midcourt
						setColor(gl,254,199,34);//laker gold
						glu.gluDisk(quadric, 6, 0, 10, 10);
						gl.glTranslatef(0,0,-.1f);//want to place smaller circle on top of bigger
						setColor(gl,125,69,156);//laker purple
						glu.gluDisk(quadric, 3, 0, 10, 10);
					gl.glPopMatrix();//
					gl.glTranslatef(0,.2f,0);//bump .2 up
					setColor(gl,193,162,80);//court color
					drawBox(gl,19,0,50,0);//redraw court to cover 3 point circle
					gl.glTranslatef(0,.1f,5);
					setColor(gl,125,69,156);//laker purple
					drawBox(gl,19,0,1,0);//straight 3 pt line
					gl.glTranslatef(0,0,14);//lower right of box
					drawBox(gl,19,0,12,0);//box
					gl.glTranslatef(0,0,25);
					drawBox(gl,19,0,1,0);//straight 3 pt line
				gl.glPopMatrix();
				gl.glPushMatrix();//still at lower right of inbounds
					gl.glTranslatef(3,0,25);//making basket
					gl.glRotatef(-90, 1, 0, 0);
					setColor(gl,0,0,0);
					glu.gluCylinder(quadric,.5,.5,10,10,1);//pole
					gl.glTranslatef(.5f,0,10);//top of pole
					gl.glEnable(GL2.GL_BLEND);//semi-transparent backboard
						gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
						gl.glColor4d(205,205,201,.2);
						gl.glBegin(GL2.GL_QUADS);//6 wide, 3.5high
							gl.glVertex3f(0,3,0);
							gl.glVertex3f(0,3,3.5f);
							gl.glVertex3f(0,-3,3.5f);
							gl.glVertex3f(0,-3,0);
						gl.glEnd();
					gl.glDisable(GL2.GL_BLEND);
					gl.glTranslatef(1,0,0);
					setColor(gl,255,69,0);
					glu.gluCylinder(quadric,1,1,.5,10,1);
				gl.glPopMatrix();
				setColor(gl,125,69,156);//laker purple
				drawBox(gl,51,0,2,0);//finish off boundary of court
				gl.glTranslatef(0,0,2);		drawBox(gl,2,0,52);
				gl.glTranslatef(2,0,50);	drawBox(gl,49,0,2,0);
				gl.glTranslatef(47,.2f,-50);	drawBox(gl,2,0,50);
			gl.glPopMatrix();
			gl.glPushMatrix();
				setColor(gl,254,199,34);//laker gold
				drawBox(gl,2,0,houseSide);
				drawBox(gl,houseSide,0,2);
				gl.glTranslatef(0,0,56); drawBox(gl,houseSide,0,4);
				gl.glTranslatef(53,0,-56); drawBox(gl,7,0,houseSide);
			gl.glPopMatrix();
			gl.glPushMatrix();
				gl.glEnable(GL2.GL_TEXTURE_2D);
					rust.bind();
					gl.glTranslatef(houseSide + ladDist+.5f,0,10);//added .5 to account for rail radius
					gl.glRotatef(-90,0,1,0);
					gl.glRotatef(-90,1,0,0);
					gl.glRotatef(90-angle,1,0,0);
					drawLadder(gl, glu, ladderL, 5, .5f, 2, 4);
				gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glPopMatrix();
			
			gl.glPushMatrix();
				setColor(gl,139,69,19);
				gl.glTranslatef(houseSide - 7, 0, 2);//lower right of table, on floor
				gl.glPushMatrix();
					gl.glEnable(GL2.GL_TEXTURE_2D);
						fence_post.bind();
						gl.glTranslatef(.5f,0,.5f);
						gl.glRotatef(-90,1,0,0);
						glu.gluCylinder(quadric, .5, .5, 4, 10, 1);
						gl.glTranslatef(0,-houseSide+4+1,0);
						glu.gluCylinder(quadric, .5, .5, 4, 10, 1);
						gl.glTranslatef(4,0,0);
						glu.gluCylinder(quadric, .5, .5, 4, 10, 1);
						gl.glTranslatef(0,-(-houseSide+4+1),0);
						glu.gluCylinder(quadric, .5, .5, 4, 10, 1);
					gl.glDisable(GL2.GL_TEXTURE_2D);
				gl.glPopMatrix();
				gl.glPushMatrix();
					gl.glTranslatef(0,3,0);//lower right on bott of table
					drawBox(gl,5,1,houseSide-4,fence_post,.5f,.5f);
					gl.glTranslatef(2,1,3);//middle and on top of table
					gl.glRotatef(90,0,1,0);//make trophy face court
					for(int c=0; c<17;c++)
					{
						drawTrophy(gl,glu);
						gl.glTranslatef(-3f,0,0);
					}
				gl.glPopMatrix();
			gl.glPopMatrix();
		gl.glPopMatrix();
	}
	
	public void drawTrophy(GL2 gl, GLU glu)
	{//extends up towards z axis
		gl.glPushMatrix();
			setColor(gl,221,170,15);
			drawBox(gl,1,.25f,1);
			gl.glTranslatef(.5f, .25f, .5f);
			gl.glRotatef(-90,1,0,0);
			glu.gluCylinder(quadric,.5,5f/6,1.25f,10,1);
			gl.glTranslatef(.5f, -.1f,1.25f+.75f);//diameter ball = .75
			glu.gluSphere(quadric, 3./4,10,10);
		gl.glPopMatrix();
	}
	
	public void setColor(GL2 gl, int r, int g, int b) { gl.glColor3f(r/255f,g/255f,b/255f); }
	
	/**
	 * Draws centered at relative origin with height h, and width w, thickness t, and distance dist between steps
	 * Rail spread on x, Extends across z-axis; Can divide into sections for texturing purposes
	 */
	public void drawLadder(GL2 gl, GLU glu, float h, float w, float t, float dist, int sect)
	{
		gl.glPushMatrix();
			gl.glTranslatef(w/2,0,0);
			for(int i=0; i<2; i++)//once for each rail
			{
				gl.glPushMatrix();
				for(int j=0; j<sect; j++)
				{
					glu.gluCylinder(quadric,t,t,h/sect,10,1);
					gl.glTranslatef(0,0,h/sect);
				}
				gl.glPopMatrix();
				
				if(i==0) gl.glTranslatef(-w, 0, 0);//go to other side to draw rail
			}//now at right rail
			gl.glRotatef(90, 0, 1, 0);
			for(float i=dist; i<h;i+=dist)
			{
				gl.glTranslatef(-dist, 0, 0);
				glu.gluCylinder(quadric, t, t, w, 10, 1);
			}
		gl.glPopMatrix();
	}
	
	/**
	 * Sets up texture
	 * s,t are the s&t values, axis1(s)/axis2(t) specifies which axis to apply on
	 * axis1, axis2: 0=x-axis, 1=y, 2=z 
	 */
	public void autoTexture(GL2 gl, Texture tex, float s, float t, int axis1, int axis2)
	{
		gl.glEnable(GL2.GL_TEXTURE_2D);
        	tex.bind();
     
        	gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        	gl.glEnable(GL2.GL_TEXTURE_GEN_T);		
       		gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       		gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
       			float[] coef_s = { 0,0,0,0 };
       			coef_s[axis1] = s;
        		gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        		float [] coef_t = {0,0,0,0};
        		coef_t[axis2] = t;
        		gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	}
	
	public void disableTexture(GL2 gl)
	{
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
	/**
	 * Draws Cube at given location.
	 * l,w,h extend out to positive x,y,z axes
	 * tex specifies which texture to use, and s,t are the autoTexture values
	 * k specifies which faces to draw
	 * if no k, draws all faces
	 * k : 0 = base, 1 = top, 2 = front xy, 3,4,5 are other sides clockwise
	 * 		Ex: drawBox(gl, 5, 10, 7, 0, 1, 3) draws a 5X10X7 box with just a base, top, and left side 
	 */
	public void drawBox(GL2 gl, float l, float w, float h, Texture tex, float s, float t, int ... faces)
	{
		for(int f : faces)
		{
			if(f==0)
			{//base
				if(tex!=null) { autoTexture(gl,tex,s,t,0,2); }
				
				gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(0,0,0);
					gl.glVertex3f(l,0,0);
					gl.glVertex3f(l,0,h);
					gl.glVertex3f(0,0,h);
				gl.glEnd();
				
				if(tex!=null) { disableTexture(gl); }
			}
			else if(f==1)
			{	//top
				if(tex != null) { autoTexture(gl,tex,s,t,0,2); }
				
				gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(0,w,0);
					gl.glVertex3f(l,w,0);
					gl.glVertex3f(l,w,h);
					gl.glVertex3f(0,w,h);
				gl.glEnd();
				
				if(tex!=null) { disableTexture(gl); }
			}
			else if(f==2)
			{	//front
				if(tex != null) { autoTexture(gl,tex,s,t,0,1); }
				
				gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(0,0,0);
					gl.glVertex3f(l,0,0);
					gl.glVertex3f(l,w,0);
					gl.glVertex3f(0,w,0);
				gl.glEnd();
				
				if(tex!=null) { disableTexture(gl); }			
			}
			else if(f==3)
			{	//left
				if(tex != null) { autoTexture(gl,tex,s,t,1,2); }
				
				gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(l,0,0);
					gl.glVertex3f(l,0,h);
					gl.glVertex3f(l,w,h);
					gl.glVertex3f(l,w,0);
				gl.glEnd();
				
				if(tex!=null) { disableTexture(gl); }			
			}
			else if(f==4)
			{	//back
				if(tex != null) { autoTexture(gl,tex,s,t,0,1); }
				
				gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(0,0,h);
					gl.glVertex3f(l,0,h);
					gl.glVertex3f(l,w,h);
					gl.glVertex3f(0,w,h);
				gl.glEnd();
				
				if(tex!=null) { disableTexture(gl); }	
			}
			else if(f==5)
			{	//right
				if(tex != null) { autoTexture(gl,tex,s,t,1,2); }
				
				gl.glBegin(GL2.GL_QUADS);
					gl.glVertex3f(0,0,0);
					gl.glVertex3f(0,0,h);
					gl.glVertex3f(0,w,h);
					gl.glVertex3f(0,w,0);
				gl.glEnd();
				
				if(tex!=null) { disableTexture(gl); }			
			}
		}
	}
	
	public void drawBox(GL2 gl, float l, float w, float h, Texture tex, float s, float t)
	{
		int [] faces = { 0,1,2,3,4,5 };
		drawBox(gl,l,w,h,tex,s,t,faces);
	}
	public void drawBox(GL2 gl, float l, float w, float h)
	{
		int [] faces = { 0,1,2,3,4,5 };
		drawBox(gl, l, w, h, faces);
	}
	public void drawBox(GL2 gl, float l, float w, float h, int ... faces)
	{
		drawBox(gl, l, w, h, null, 0, 0, faces);
	}	
	public void pickets(GL2 gl, GLU glu, int i, int limit)
	{
		glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
		gl.glTranslatef(4, 0, 0);
		
		float xx;
		if(i+4 < limit)
		{//board to connect pickets
			xx = (float)(Math.cos(i));
			gl.glPushMatrix();
				gl.glRotatef(-90, 0, 1, 0);//horizontal-ish post
				gl.glTranslatef(2.5f,0,0);//initially put post at midpoint
				gl.glTranslatef(xx,0,0);//some deviance
				gl.glRotatef(-xx*20, 0, 1, 0);//some deviance
				glu.gluCylinder(quadric, .5, .5, 5, 10, 1);
			gl.glPopMatrix();
		}
	}

	public void drawTriforce(GL2 gl, int triSide)
	{//draws in a box area +triSide up and right, -triSide left and down
		gl.glPushMatrix();
			gl.glPushMatrix();
				gl.glRotatef(counter,1,1,0);
					drawTri(gl, triSide);
			gl.glPopMatrix();
			gl.glTranslatef(triSide/2,-triSide,0);
			gl.glPushMatrix();
				gl.glRotatef(-counter,0,1,1);
				drawTri(gl, triSide);
			gl.glPopMatrix();
			gl.glTranslatef(-triSide,0,0);
			gl.glPushMatrix();
				gl.glRotatef(counter,1,0,1);
				drawTri(gl, triSide);
			gl.glPopMatrix();
		gl.glPopMatrix();
		counter+=2;
	}
	
	public void drawTri(GL2 gl, int triSide)
	{//base of Triangle at origin
		gl.glBegin(GL2.GL_QUADS);
			gl.glVertex3f(-triSide/2,0,0);
			gl.glVertex3f(triSide/2,0,0);
			gl.glVertex3f(0,triSide,0);
			gl.glVertex3f(-triSide/2,0,0);
		gl.glEnd();
	}
	
	@Override
	public void drawMoving(GL2 gl, GLU glu, double eyeX, double eyeY, double eyeZ) 
	{
		gl.glPushMatrix();
			gl.glTranslatef(3*side/4, -side/2 + 18, 10);//triforce drawn in that cave
			drawTriforce(gl,4);
		gl.glPopMatrix();
	}
}