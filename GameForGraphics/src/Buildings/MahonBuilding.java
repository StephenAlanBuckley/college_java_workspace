package Buildings;

import java.awt.Font;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.MahonFountain;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class MahonBuilding extends Building {
	private static GLUquadric quadric;
	private static Texture grassTexture, woodTexture, wallPaintingTexture, sidingTexture, roofingTexture, stoneTexture;
	private Point3D[] frontRoofCurve;
	private Point3D[] backRoofCurve;
//	private int count = 0;
	
	
	private static final double X_WIDTH = 60;
	private static final double Z_DEPTH = 30;
	private static final double Y_HEIGHT = 15;
	private static final double FLB_X = 20; //front left bottom corner
	private static final double FLB_Y = 0;
	private static final double FLB_Z = 40;
	private static final double DOOR_WIDTH = X_WIDTH/6;
	private static final double TOWER_RADIUS = X_WIDTH/7;
	private static final double ROOF_INCR = 5;
	private static final int ARRAY_SIZE = (int) (X_WIDTH/ROOF_INCR);
	
	private static MahonFountain fountain;
	private TextRenderer renderer;

	
	public MahonBuilding(GL2 gl, GLU glu){
		renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
	    
		if(quadric==null){
		quadric = glu.gluNewQuadric();
		glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL);
		glu.gluQuadricNormals(quadric, GLU.GLU_NONE);
		glu.gluQuadricTexture(quadric, true);
		
		grassTexture = setupTexture(gl, "mahonGrass.png");
		sidingTexture = setupTexture(gl, "mahonSidingTexture.png");
		roofingTexture = setupTexture(gl, "mahonRoofingTexture.png");
		stoneTexture = setupTexture(gl, "mahonStoneTexture.png");
		woodTexture = setupTexture(gl, "mahonWoodTexture.png");
		wallPaintingTexture = setupTexture(gl, "mahonWallPainting.png");

		fountain = new MahonFountain(gl, glu);
		}
		buildRoof();
	}
	
	
	//public void drawMoving(GL2 gl, GLU glu, float eyeX, float eyeY, float eyeZ) {
	//}
	
	private void buildRoof(){
        
	   

		
		frontRoofCurve = new Point3D[ARRAY_SIZE+1];
		backRoofCurve = new Point3D[ARRAY_SIZE+1];
		double beginX = FLB_X;
		double midX = FLB_X+X_WIDTH/2;
		double endX = FLB_X+X_WIDTH;
		
		int i = 0;
		for(double x = beginX; x<=endX; x=x+ROOF_INCR){ //increment by number of horizontal segments on roof
			if(x<=midX){
				frontRoofCurve[i] = new Point3D(x, ((x-beginX)*(x-beginX))/40+Y_HEIGHT, FLB_Z);
			}else{
				frontRoofCurve[i] = new Point3D(x, (x-X_WIDTH-beginX)*(x-X_WIDTH-beginX)/40+Y_HEIGHT, FLB_Z);
			}
			i++;
		}
		
		int j = 0;
		for(double x = beginX; x<=endX; x=x+ROOF_INCR){ //increment by number of horizontal segments on roof
			if(x<=midX){
				backRoofCurve[j] = new Point3D(x, ((x-beginX)*(x-beginX))/40+Y_HEIGHT, FLB_Z+Z_DEPTH);
			}else{
				backRoofCurve[j] = new Point3D(x, (x-X_WIDTH-beginX)*(x-X_WIDTH-beginX)/40+Y_HEIGHT, FLB_Z+Z_DEPTH);
			}
			j++;
		}
		
		//for(int k = 0; k<=frontRoofCurve.length-1; k++ ){
		//	System.out.println("x:"+frontRoofCurve[k].getX()+", y:"+frontRoofCurve[k].getY());
		//}
	}
	   public void drawMoving(GL2 gl, GLU glu) {
		   // Mahon Building Text
        gl.glPushMatrix();
            gl.glRotated(180, 0, 1, 0);
            gl.glTranslated(-60, 15, -39.5);
            renderer.begin3DRendering();
            renderer.setColor(.6f, .1f, 1, 1);
            renderer.draw3D("The Fantastic Mr Fox", 0f, 0f,0, .25f*1f/9);
            renderer.end3DRendering();
    gl.glPopMatrix();

	    }



	@Override
	public void draw(GL2 gl, GLU glu) {
		
		//drawing the water fountain Sketchup Model
		gl.glPushMatrix();
			gl.glTranslated(43, 0, 35);
			gl.glScaled(1, 2.5, 1);
			fountain.draw(gl, glu);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glScaled(1, 2.5, 1);
			gl.glTranslated(60, 0, 35);
			fountain.draw(gl, glu);
		gl.glPopMatrix();

		
		//sketching the ground******************************************
		gl.glEnable(GL2.GL_TEXTURE_2D);
			grassTexture.bind();

            gl.glBegin(GL2.GL_QUADS);
            	gl.glTexCoord2i(0, 0);gl.glVertex3d(0,0,0);
            	gl.glTexCoord2i(3, 0);gl.glVertex3d(100,0,0);
            	gl.glTexCoord2i(3, 3);gl.glVertex3d(100,0,100);
            	gl.glTexCoord2i(0, 3);gl.glVertex3d(0,0,100);
            gl.glEnd();
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        //sketching the house walls***************************************
        gl.glEnable(GL2.GL_TEXTURE_2D);//side walls
        sidingTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s = {0,0,0.1f,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
            float[] coef_t = {0,0.05f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
            gl.glEnable(GL2.GL_BLEND);
            gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
            gl.glEnable(GL2.GL_CULL_FACE);
	        gl.glBegin(GL2.GL_QUADS); //side walls - exterior
		    	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
		    	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z);
		    	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z);
		    	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z+Z_DEPTH);
		    	
		    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y+Y_HEIGHT, FLB_Z);
		    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
		    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y, FLB_Z+Z_DEPTH);
		    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y, FLB_Z);
	        gl.glEnd();
	        gl.glDisable(GL2.GL_CULL_FACE);
            gl.glDisable(GL2.GL_BLEND);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);  
        
        gl.glEnable(GL2.GL_TEXTURE_2D); //front and back walls - includes peak and door frame - exterior
        sidingTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s2 = {0.1f,0,0,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s2, 0);
            float[] coef_t2 = {0,0.05f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t2, 0);
            gl.glEnable(GL2.GL_BLEND);
            gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
            
            gl.glEnable(GL.GL_CULL_FACE); //front wall with opening for door - exterior
   	        gl.glBegin(GL2.GL_QUADS);
	        	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z);
	        	gl.glVertex3d(FLB_X+(X_WIDTH/2-DOOR_WIDTH/2), FLB_Y+Y_HEIGHT, FLB_Z);
	        	gl.glVertex3d(FLB_X+(X_WIDTH/2-DOOR_WIDTH/2), FLB_Y, FLB_Z);
	        	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z);

	        	gl.glVertex3d(FLB_X+(X_WIDTH/2+DOOR_WIDTH/2), FLB_Y + Y_HEIGHT, FLB_Z);
	        	gl.glVertex3d(FLB_X+(X_WIDTH), FLB_Y+Y_HEIGHT, FLB_Z);
	        	gl.glVertex3d(FLB_X+(X_WIDTH), FLB_Y, FLB_Z);
	        	gl.glVertex3d(FLB_X+(X_WIDTH/2+DOOR_WIDTH/2), FLB_Y, FLB_Z);
	        gl.glEnd();

	        gl.glBegin(GL2.GL_QUADS); //back wall - exterior
		    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
		    	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
		    	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z+Z_DEPTH);
		    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y, FLB_Z+Z_DEPTH);
		    gl.glEnd();

		    gl.glBegin(GL2.GL_QUADS); // front wall peak - exterior
	        	for(int i = 0; i<=frontRoofCurve.length-2; i++){
	        		Point3D p= frontRoofCurve[i];
	        		Point3D p2 = frontRoofCurve[i+1];
		    		double a = p.getX();
		    		double b = p.getY();
		    		double c = p.getZ();
		    		double d = p2.getX();
		    		double e = p2.getY();
		    		double f = p2.getZ();
		    		gl.glVertex3d(a, b, c);
		    		gl.glVertex3d(d, e, f);
		    		gl.glVertex3d(d, FLB_Y+Y_HEIGHT, f);
		    		gl.glVertex3d(a, FLB_Y+Y_HEIGHT, c);
	        	}
	        gl.glEnd();
	        
		    gl.glBegin(GL2.GL_QUADS);  // back wall peak - exterior
	        	for(int i =backRoofCurve.length-2; i>=0; i--){
	        		Point3D p= backRoofCurve[i];
	        		Point3D p2 = backRoofCurve[i+1];
		    		double a = p.getX();
		    		double b = p.getY();
		    		double c = p.getZ();
		    		double d = p2.getX();
		    		double e = p2.getY();
		    		double f = p2.getZ();
		    		gl.glVertex3d(a, FLB_Y+Y_HEIGHT, c);
		    		gl.glVertex3d(d, FLB_Y+Y_HEIGHT, f);
		    		gl.glVertex3d(d, e, f);
		    		gl.glVertex3d(a, b, c);
	        	}
	        gl.glEnd();
    	gl.glDisable(GL.GL_CULL_FACE);
        gl.glDisable(GL2.GL_BLEND);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);  

        gl.glColor3d(0.65, 0.65, 0.1);
        gl.glEnable(GL.GL_CULL_FACE);
	    gl.glBegin(GL2.GL_QUADS); // front wall peak - interior
	    	for(int i = 0; i<=frontRoofCurve.length-2; i++){
	    		Point3D p= frontRoofCurve[i];
	    		Point3D p2 = frontRoofCurve[i+1];
	    		double a = p.getX();
	    		double b = p.getY();
	    		double c = p.getZ();
	    		double d = p2.getX();
	    		double e = p2.getY();
	    		double f = p2.getZ();
	    		gl.glVertex3d(a, FLB_Y+Y_HEIGHT, c);
	    		gl.glVertex3d(d, FLB_Y+Y_HEIGHT, f);
	    		gl.glVertex3d(d, e, f);
	    		gl.glVertex3d(a, b, c);
	    	}
	    gl.glEnd();
	    gl.glBegin(GL2.GL_QUADS);//front wall w/ opening for door - interior
	    	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z);
	    	gl.glVertex3d(FLB_X+(X_WIDTH/2-DOOR_WIDTH/2), FLB_Y, FLB_Z);
	    	gl.glVertex3d(FLB_X+(X_WIDTH/2-DOOR_WIDTH/2), FLB_Y+Y_HEIGHT, FLB_Z);
        	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z);

        	gl.glVertex3d(FLB_X+(X_WIDTH/2+DOOR_WIDTH/2), FLB_Y, FLB_Z);
        	gl.glVertex3d(FLB_X+(X_WIDTH), FLB_Y, FLB_Z);
        	gl.glVertex3d(FLB_X+(X_WIDTH), FLB_Y+Y_HEIGHT, FLB_Z);
        	gl.glVertex3d(FLB_X+(X_WIDTH/2+DOOR_WIDTH/2), FLB_Y + Y_HEIGHT, FLB_Z);
        gl.glEnd();
	    gl.glBegin(GL2.GL_QUADS);  // back wall peak - interior
	    	for(int i =backRoofCurve.length-2; i>=0; i--){
	    		Point3D p= backRoofCurve[i];
	    		Point3D p2 = backRoofCurve[i+1];
	    		double a = p.getX();
	    		double b = p.getY();
	    		double c = p.getZ();
	    		double d = p2.getX();
	    		double e = p2.getY();
	    		double f = p2.getZ();
	    		gl.glVertex3d(a, b, c);
	    		gl.glVertex3d(d, e, f);
	    		gl.glVertex3d(d, FLB_Y+Y_HEIGHT, f);
	    		gl.glVertex3d(a, FLB_Y+Y_HEIGHT, c);
	    	}
	    gl.glEnd();
	    gl.glBegin(GL2.GL_QUADS); //back wall - interior
	    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y, FLB_Z+Z_DEPTH);
	    	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z+Z_DEPTH);
	    	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
	    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
	    gl.glEnd();
        gl.glBegin(GL2.GL_QUADS); //side walls - interior
	    	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z+Z_DEPTH);
	    	gl.glVertex3d(FLB_X, FLB_Y, FLB_Z);
	    	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z);
	    	gl.glVertex3d(FLB_X, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
	    	
	    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y, FLB_Z);
	    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y, FLB_Z+Z_DEPTH);
	    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH);
	    	gl.glVertex3d(FLB_X+X_WIDTH, FLB_Y+Y_HEIGHT, FLB_Z);
		gl.glEnd();
    	gl.glDisable(GL.GL_CULL_FACE);

        //sketching the roof******************************************
        gl.glEnable(GL2.GL_TEXTURE_2D);
        roofingTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s3 = {0,0,0.2f,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s3, 0);
            float[] coef_t3 = {0,-0.2f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t3, 0);
            gl.glEnable(GL2.GL_BLEND);
            gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
            gl.glEnable(GL.GL_CULL_FACE);

	        gl.glBegin(GL2.GL_TRIANGLE_STRIP); //outside of roof
	        	gl.glVertex3d(FLB_X+X_WIDTH + 2, FLB_Y+Y_HEIGHT, FLB_Z+Z_DEPTH+2);
	        	gl.glVertex3d(FLB_X+X_WIDTH + 2, FLB_Y+Y_HEIGHT, FLB_Z-2);
		        for(int i = frontRoofCurve.length-1; i>=0; i--){
	        		Point3D p= backRoofCurve[i];
		    		double a = p.getX();
		    		double b = p.getY();
		    		double c = p.getZ();
		    		gl.glVertex3d(a, b, c+3);
		    		
	        		Point3D q= frontRoofCurve[i];
		    		double d = q.getX();
		    		double e = q.getY();
		    		double f = q.getZ();
		    		gl.glVertex3d(d, e, f-3);
		    	}
	        gl.glEnd();
	        gl.glDisable(GL.GL_CULL_FACE);
	        
            gl.glPushMatrix(); //tower "cap"
	        	gl.glTranslated(FLB_X+X_WIDTH+TOWER_RADIUS, Y_HEIGHT*3, FLB_Z+Z_DEPTH/2);
	        	gl.glRotated(-90, 0, 0, 0);
	        	glu.gluCylinder(quadric, TOWER_RADIUS+4, 0, Y_HEIGHT, 10, 1);
	        gl.glPopMatrix();
            gl.glDisable(GL2.GL_BLEND);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);  
       
        gl.glEnable(GL.GL_CULL_FACE); //inside of roof
        gl.glColor3f(0,0,0);
        gl.glBegin(GL2.GL_TRIANGLE_STRIP);
	        for(int i = 0; i<=frontRoofCurve.length-1; i++){
        		Point3D p= backRoofCurve[i];
	    		double a = p.getX();
	    		double b = p.getY();
	    		double c = p.getZ();
	    		gl.glVertex3d(a, b, c+3);
	    		
        		Point3D q= frontRoofCurve[i];
	    		double d = q.getX();
	    		double e = q.getY();
	    		double f = q.getZ();
	    		gl.glVertex3d(d, e, f-3);
	    	}
        gl.glEnd();
        gl.glDisable(GL.GL_CULL_FACE);
        
        gl.glEnable(GL2.GL_TEXTURE_2D); //stone tower
        stoneTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s4 = {0,0,0.2f,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s4, 0);
            float[] coef_t4 = {0,-0.2f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t4, 0);
            gl.glEnable(GL2.GL_BLEND);
            gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
            gl.glEnable(GL.GL_CULL_FACE);

            gl.glPushMatrix();
            	gl.glTranslated(FLB_X+X_WIDTH+TOWER_RADIUS, Y_HEIGHT*3, FLB_Z+Z_DEPTH/2);
            	gl.glRotated(90, 0, 0, 0);
	        	glu.gluCylinder(quadric, TOWER_RADIUS, TOWER_RADIUS, Y_HEIGHT*3, 10, 1);
	        gl.glPopMatrix();

	        gl.glDisable(GL.GL_CULL_FACE);
            gl.glDisable(GL2.GL_BLEND);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);       
        
        gl.glEnable(GL2.GL_TEXTURE_2D); //tree top
        grassTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s5 = {0,0,0.2f,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s5, 0);
            float[] coef_t5 = {0,-0.2f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t5, 0);
            gl.glEnable(GL2.GL_BLEND);
            gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
            gl.glPushMatrix();
            	gl.glTranslated(FLB_X-10, Y_HEIGHT, FLB_Z-10);
            	glu.gluSphere(quadric, 7, 10, 10);
	        gl.glPopMatrix();
            gl.glDisable(GL2.GL_BLEND);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T);  
        
        
        gl.glEnable(GL2.GL_TEXTURE_2D); //tree trunk
        woodTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s6 = {0,0,0.05f,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s6, 0);
            float[] coef_t6 = {0,0.4f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t6, 0);
            gl.glEnable(GL2.GL_BLEND);
            gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
            gl.glPushMatrix();
            	gl.glTranslated(FLB_X-10, Y_HEIGHT, FLB_Z-10);
            	gl.glRotated(90, 0, 0, 0);
            	glu.gluCylinder(quadric, 1, 3, Y_HEIGHT, 10, 1);
	        gl.glPopMatrix();
            gl.glDisable(GL2.GL_BLEND);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
        gl.glDisable(GL2.GL_TEXTURE_GEN_T); 
        
        gl.glEnable(GL2.GL_TEXTURE_2D); //painting
        wallPaintingTexture.bind();
            gl.glEnable(GL2.GL_BLEND);
            gl.glBegin(GL2.GL_QUADS);
	            gl.glTexCoord2i(0, 0);gl.glVertex3d(FLB_X+10, FLB_Y+12, FLB_Z+Z_DEPTH-1);
	            gl.glTexCoord2i(1, 0);gl.glVertex3d(FLB_X+40, FLB_Y+12, FLB_Z+Z_DEPTH-1);
	            gl.glTexCoord2i(1, 1);gl.glVertex3d(FLB_X+40, FLB_Y+3, FLB_Z+Z_DEPTH-1);
	            gl.glTexCoord2i(0, 1);gl.glVertex3d(FLB_X+10, FLB_Y+3, FLB_Z+Z_DEPTH-1);
            gl.glEnd();
            gl.glDisable(GL2.GL_BLEND);
        gl.glDisable(GL2.GL_TEXTURE_2D);
        
        gl.glBegin(GL2.GL_QUADS);
	       gl.glVertex3d(FLB_X+9, FLB_Y+13, FLB_Z+Z_DEPTH-0.5);
	       gl.glVertex3d(FLB_X+41, FLB_Y+13, FLB_Z+Z_DEPTH-0.5);
	       gl.glVertex3d(FLB_X+41, FLB_Y+2, FLB_Z+Z_DEPTH-0.5);
	       gl.glVertex3d(FLB_X+9, FLB_Y+2, FLB_Z+Z_DEPTH-0.5);
	    gl.glEnd();

	}
}
