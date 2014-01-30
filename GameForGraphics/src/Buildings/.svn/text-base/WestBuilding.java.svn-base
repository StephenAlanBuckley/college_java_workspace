package Buildings;
// CS333 Fall 2010
// Initial written by Ames

//import java.io.File;
//import java.io.IOException;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.*	;

import main.SketchupModelJAXB;

import SketchupModels.WestElevator;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;
//import com.jogamp.opengl.util.texture.TextureIO;
import java.awt.Font;
import java.lang.Math;


public class WestBuilding extends Building {
	private static Texture grassTexture;
	private static Texture concreteTexture;
	private static Texture floorTexture;
	private static Texture brickTexture;
	private static Texture boardTexture;
	private static WestElevator elevator;
	private TextRenderer renderer;

	
	public WestBuilding(GL2 gl, GLU glu) { 
	
	    renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
		
		//Edit Done By Melvin Ross
	if(grassTexture==null)
	{
		grassTexture     = setupTexture(gl, "westGrass.png");
		concreteTexture  = setupTexture(gl, "westConcrete.png");
		floorTexture     = setupTexture(gl, "westWood.png");
		brickTexture	 = setupTexture(gl, "westBrick.png");
		boardTexture	 = setupTexture(gl, "westChess.png");
		elevator = new WestElevator(gl,glu);
	}
	
	}

	private GLUquadric quadric;
	
	   public void drawMoving(GL2 gl, GLU glu) {
	        		// West Building Text
        gl.glPushMatrix();
            gl.glRotated(120, 0, 1, 0);
            gl.glTranslated(-80, 0, 47);
            renderer.begin3DRendering();
            renderer.setColor(.5f, 0, 0, 1);
            renderer.draw3D("Tower of Terror", 0f, 0f,0, .25f*1f/6);
            renderer.end3DRendering();
         gl.glPopMatrix();
 
	    }

	
	// draw the building and contents.  Called from the main class's display()
	public void draw(GL2 gl, GLU glu) {
	

		
		quadric = glu.gluNewQuadric();
		
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, false);        // false, or true to generate texture coordinates
        
		//gl.glPolygonMode( GL2.GL_FRONT_AND_BACK, GL2.GL_LINE ); //wireframe
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE);	
		//drawBuilding( a,  y, b,  theta,  floors,  height,  gl,  glu)
		//drawSnowGlobe( x,  y,  z, gl, glu)
		//drawTable( x,  y,  z, gl, glu)
		//drawGrass(xmin, xmax, zmin, zmax, y, gl, glu)

		drawGrass(0d,100d,0d,100d,0d,gl,glu);
		drawBuilding(50d,.5,50d,0d,50d,500d,gl,glu);
		//drawBuilding(60d,1,60d,0d,50d,3d,gl,glu);
		//drawSnowGlobe(60,2,60,gl,glu);
		drawTable(40,3,40,gl,glu);
		gl.glPushMatrix();
			gl.glColor4f(.5f, .5f, .4f, 1);	
			gl.glTranslated(40,.5,15);
			gl.glRotated(-90, 0, 1, 0);
			elevator.draw(gl,glu);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glColor4f(.5f, .5f, .4f, 1);	
			gl.glTranslated(40,490.5,15);
			gl.glRotated(-90, 0, 1, 0);
			elevator.draw(gl,glu);
		gl.glPopMatrix();
		//gl.glPolygonMode( GL2.GL_FRONT_AND_BACK, GL2.GL_FILL ); //turn wireframe off
	}
	void drawBuilding(double a, double y,double b, double theta, double floors, double height, GL2 gl, GLU glu) {
		float correction = 500f/((float) height);
		double floorHeight = height/floors; // Height of each floor
		int sides       = 06; // number of walls, assuming each floor is a regular n-gon.
		int missing     =  1; // number of missing triangles
		double r           = 4.5*floorHeight; // original radius of circle on which all points lay
		double doorCutOutRadius = 4*floorHeight;
		double deltaTheta  = .05; // amount each floor is rotated compared to floor below
		double deltaR      = 0; // amount each floor's radius differs from floor below
		double c = 0, cPrime=c+deltaTheta;
		double yPrime = y + floorHeight;

		//setup first two floor
		double[] x = new double[sides]; 
		double[] z = new double[sides];
		double xPrime[] = new double[sides]; 
		double zPrime[] = new double[sides];
		double sd = (2*Math.PI)/sides;

		//create first floor (x and y)
		for (int j = 0; j<sides; j++) {
			x[j] = a + r * Math.cos(theta+sd*j);
			z[j] = b + r * Math.sin(theta+sd*j);
		}
		//create doors (by making cutout smaller)
		double door1[] = new double[4];

		door1[0] = a+doorCutOutRadius * Math.cos(theta); //x
		door1[1] = a+doorCutOutRadius * Math.cos(theta+deltaTheta); //x'
		door1[2] = b+doorCutOutRadius * Math.sin(theta); //z
		door1[3] = a+doorCutOutRadius * Math.sin(theta+deltaTheta); //z'

		double door2[] = new double[4];

		door2[0] = a+doorCutOutRadius * Math.cos(theta+sd*(sides-missing)); //x
		door2[1] = a+doorCutOutRadius * Math.cos(theta+deltaTheta+sd*(sides-missing)); //x'
		door2[2] = b+doorCutOutRadius * Math.sin(theta+sd*(sides-missing)); //z
		door2[3] = a+doorCutOutRadius * Math.sin(theta+deltaTheta+sd*(sides-missing)); //z'
		
		//draw first floor
		gl.glEnable(GL2.GL_TEXTURE_2D);
		floorTexture.bind();
		
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			float[] coef_s = {.5f*correction,0*correction,0*correction,0*correction};
				gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
			float[] coef_t = {0*correction,.5f*correction,0*correction,0*correction};
				gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

			gl.glBegin(GL2.GL_TRIANGLE_FAN);
				gl.glVertex3d((double)a,y,(double)b);
				for(int j = 0; j <sides; j++) {
					gl.glVertex3d(x[j],y,z[j]);
				}	
			gl.glEnd();
			
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		//draw first floor cutout
		gl.glEnable(GL2.GL_TEXTURE_2D);
		brickTexture.bind();
		
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
		gl.glEnable(GL2.GL_TEXTURE_GEN_T);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
			gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

			gl.glBegin(GL2.GL_TRIANGLE_STRIP);
				gl.glVertex3d(door1[0],y,door1[2]);
				gl.glVertex3d(door1[1],yPrime,door1[3]);
				gl.glVertex3d(a, y, b);
				gl.glVertex3d(a, yPrime, b);
				gl.glVertex3d(door2[0],y,door2[2]);
				gl.glVertex3d(door2[1],yPrime,door2[3]);
			gl.glEnd();
			
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		gl.glDisable(GL2.GL_TEXTURE_GEN_T);

		r = r + deltaR;
		for (int i = 1; i < floors; i++) { //draw all walls, remaining floors and cutouts
			c = (i-1)*deltaTheta;
			cPrime = i*deltaTheta;
			
			for (int j = 0; j<sides; j++) {
				x[j] = a + r * Math.cos(theta+c+sd*j);
				z[j] = b + r * Math.sin(theta+c+sd*j);
				xPrime[j] = a + r * Math.cos(theta+cPrime+sd*j);
				zPrime[j] = b + r * Math.sin(theta+cPrime+sd*j);

			}
			
			//Draw Walls
			gl.glEnable(GL2.GL_TEXTURE_2D);
			concreteTexture.bind();
			
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glEnable(GL2.GL_TEXTURE_GEN_T);
				gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
				gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
				gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
				gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

				gl.glBegin(GL2.GL_TRIANGLE_STRIP);
					gl.glVertex3d(xPrime[0],yPrime,zPrime[0]);	
					gl.glVertex3d(x[0],y,z[0]);
					
					for(int j = 0; j<sides-missing; j++) {
						gl.glVertex3d(xPrime[j+1], yPrime, zPrime[j+1]);
						gl.glVertex3d(x[j+1],y,z[j+1]);
					}
				gl.glEnd();
				
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T);

			//cutout
			if (i != 1) { //don't draw for first floor
				gl.glEnable(GL2.GL_TEXTURE_2D);
				brickTexture.bind();
				
				gl.glEnable(GL2.GL_TEXTURE_GEN_S);
				gl.glEnable(GL2.GL_TEXTURE_GEN_T);
					gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
					gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
					gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
					gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

					gl.glBegin(GL2.GL_TRIANGLE_STRIP);
						gl.glVertex3d(x[0],y,z[0]);
						gl.glVertex3d(xPrime[0], yPrime, zPrime[0]);
						gl.glVertex3d(a, y, b);
						gl.glVertex3d(a, yPrime, b);
						gl.glVertex3d(x[sides-missing], y, z[sides-missing]);
						gl.glVertex3d(xPrime[sides-missing], yPrime, zPrime[sides-missing]);
					gl.glEnd();
					
				gl.glDisable(GL2.GL_TEXTURE_2D);
				gl.glDisable(GL2.GL_TEXTURE_GEN_S);
				gl.glDisable(GL2.GL_TEXTURE_GEN_T);

			}

			//draw ceiling/floor
			gl.glEnable(GL2.GL_TEXTURE_2D);
			floorTexture.bind();
			
			gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glEnable(GL2.GL_TEXTURE_GEN_T);
				gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
				gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
				gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
				gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);

				gl.glBegin(GL2.GL_TRIANGLE_FAN);
					gl.glVertex3d(a,yPrime,b);
					for(int j = 0; j <sides; j++) {
						gl.glVertex3d(xPrime[j],(double) yPrime,zPrime[j]);
					}
				gl.glEnd();
				
			gl.glDisable(GL2.GL_TEXTURE_2D);
			gl.glDisable(GL2.GL_TEXTURE_GEN_S);
			gl.glDisable(GL2.GL_TEXTURE_GEN_T);

			//setup for next floor
			y += floorHeight;
			yPrime += floorHeight;
			r = r + deltaR;
		}
	}
	void drawGrass(double xmin,double xmax, double zmin,double zmax,double y, GL2 gl, GLU glu) {
		gl.glEnable(GL2.GL_TEXTURE_2D);
		grassTexture.bind();
		
		gl.glEnable(GL2.GL_TEXTURE_GEN_Q);
		gl.glEnable(GL2.GL_TEXTURE_GEN_S);
			gl.glTexGeni(GL2.GL_Q, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			float[] coef_q = {.5f,0,0,0};
				gl.glTexGenfv(GL2.GL_Q, GL2.GL_OBJECT_PLANE, coef_q, 0);
			float[] coef_s = {0,.5f,0,0};
				gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);

			gl.glBegin(GL2.GL_TRIANGLE_STRIP);
				gl.glVertex3d(xmin,y,zmin);
				gl.glVertex3d(xmin,y,zmax);
				gl.glVertex3d(xmax,y,zmin);		
				gl.glVertex3d(xmax,y,zmax);
			gl.glEnd();
			
		gl.glDisable(GL2.GL_TEXTURE_2D);
		gl.glDisable(GL2.GL_TEXTURE_GEN_Q);
		gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	}
	void drawSnowGlobe(double x, double y, double z, GL2 gl, GLU glu) {
		gl.glPushMatrix();
			gl.glColor4f(.5f, .5f, .4f, 1);	
			gl.glTranslated(x,.5,z);
			gl.glRotated(-90, 1, 0, 0);
			glu.gluCylinder(quadric, y+.5,y,.5,10, 1);
		gl.glPopMatrix();
			
		gl.glPushMatrix();
			gl.glColor4f(.5f, .5f, .4f, 1);	
			gl.glTranslated(x,1,z);
			gl.glRotated(90, 1, 0, 0);
			glu.gluDisk(quadric,0,y,10,10);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(x,y,z);
			gl.glColor4f(0.0f, 0.0f, 1.0f, 0.35f);
			gl.glEnable(GL2.GL_BLEND);
				glu.gluSphere(quadric, y, 20, 20);
			gl.glDisable(GL2.GL_BLEND);
		gl.glPopMatrix();
		
	}
	void drawTable(double x, double y, double z, GL2 gl, GLU glu) {
		gl.glPushMatrix();
			gl.glColor4f(1.0f, 0.0f, 0.0f, 1f);
			gl.glTranslated(x,0,z);
			gl.glRotated(-90, 1, 0, 0);
			glu.gluCylinder(quadric, .5,.5,y,10, 1);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glColor4f(1.0f, 0.0f, 0.0f, 1f);
			gl.glTranslated(x+2,0,z);
			gl.glRotated(-90, 1, 0, 0);
			glu.gluCylinder(quadric, .5,.5,y/1.5,10, 1);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glColor4f(.5f, .5f, .4f, 1);	
			gl.glTranslated(x+2,y/1.5,z);
			gl.glRotated(90, 1, 0, 0);
			glu.gluDisk(quadric,0,.5,10,10);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glColor4f(1.0f, 0.0f, 0.0f, 1f);
			gl.glTranslated(x-2,0,z);
			gl.glRotated(-90, 1, 0, 0);
			glu.gluCylinder(quadric, .5,.5,y/1.5,10, 1);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glColor4f(.5f, .5f, .4f, 1);	
			gl.glTranslated(x-2,y/1.5,z);
			gl.glRotated(90, 1, 0, 0);
			glu.gluDisk(quadric,0,.5,10,10);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glColor4f(.5f, .5f, .4f, 1);	
			gl.glTranslated(x,y,z);
			gl.glRotated(90, 1, 0, 0);
			glu.gluDisk(quadric,0,2,10,10);
		gl.glPopMatrix();
		
		gl.glEnable(GL2.GL_TEXTURE_2D);
		boardTexture.bind();
		gl.glBegin(GL2.GL_TRIANGLE_STRIP);
			gl.glTexCoord2d(1,1); gl.glVertex3d(x+.5,y+.1,z+.5);
			gl.glTexCoord2d(1,0); gl.glVertex3d(x+.5,y+.1,z-.5);
			gl.glTexCoord2d(0,1); gl.glVertex3d(z-.5,y+.1,z+.5);		
			gl.glTexCoord2d(0,0); gl.glVertex3d(z-.5,y+.1,z-.5);
		gl.glEnd();
		gl.glDisable(GL2.GL_TEXTURE_2D);
	}
}