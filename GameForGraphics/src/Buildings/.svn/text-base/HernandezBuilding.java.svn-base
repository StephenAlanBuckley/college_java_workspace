package Buildings;

import java.awt.Font;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.SketchupModelJAXB;

import SketchupModels.ShieldDoug;

import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.texture.Texture;

public class HernandezBuilding extends Building{

    private static GLUquadric quadric; // to control properties of quadric-based objects
    private static Texture brickTexture;     // gray bricks
    private static Texture gateTexture;
    private static Texture groundTexture;
    private static ShieldDoug myShieldWidget;
    private archerTargets target;
    private TextRenderer renderer;

    
    public HernandezBuilding(GL2 gl, GLU glu) {
    	renderer = new TextRenderer(new Font("SansSerif", Font.BOLD, 72));
        
    	if(quadric==null){
    	quadric = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
        glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
        glu.gluQuadricTexture  (quadric, true);        // use true to generate texture coordinates
        myShieldWidget= new ShieldDoug(gl,glu);
        brickTexture     = setupTexture(gl, "hernandezGbrick.png");
        gateTexture		= setupTexture(gl, "hernandezGate.png");
        groundTexture = setupTexture(gl, "hernandezGroundTexture.png");
        }
        
        target=new archerTargets(gl,glu);
    }

    public void drawMoving(GL2 gl, GLU glu) {
    	// Hernandez Building Text
        gl.glPushMatrix();
            gl.glRotated(90, 0, 1, 0);
            gl.glTranslated(-55, 15, 90.5);
            renderer.begin3DRendering();
            renderer.setColor(0, 0, 0, 1);
            renderer.draw3D("Fort Asno", 0f, 0f,0, .25f*1f/7);
            renderer.end3DRendering();
          gl.glPopMatrix();

    }

    
    public void draw(GL2 gl, GLU glu) {
        // glu.gluSphere(quadric,  radius, slices, stacks)
        // glu.gluCylinder quadric, base, top, height, slices, stacks)
        // glu.gluDisk(quadric, inner radius, outer radius, slices, stacks)


    	
    	drawGround(gl, glu);
    	gl.glColor3f(0f, .4f, .4f);
    	//Cyclinder Pillars
    	gl.glTranslated(0,0,0);
    	gl.glEnable(GL2.GL_TEXTURE_2D);
    	brickTexture.bind();
    	 gl.glPushMatrix();
    	 	gl.glTranslated(20, 0, 20);
    		gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright
    	 	glu.gluCylinder(quadric, 10,10,40,15,1);
    	 	gl.glPushMatrix();
    	 		gl.glRotated(90,1, 0, 0);
    	 		drawCircle(9.99,50,gl,40);
    	 	gl.glPopMatrix();
    	 	
    	 gl.glPopMatrix();

    	 
	 		
    	gl.glEnable(GL2.GL_TEXTURE_2D);	//everytime drawCircle is called, Enable must be called again
    	brickTexture.bind();
    	 gl.glPushMatrix();
 	 		gl.glTranslated(80, 0, 20);
 	 		gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright
 	 		glu.gluCylinder(quadric, 10,10,40,15,1);
    	 	gl.glPushMatrix();
	 			gl.glRotated(90,1, 0, 0);
	 			drawCircle(9.99,50,gl,40);
	 		gl.glPopMatrix();
 	 	 gl.glPopMatrix();
 	 	 
     	gl.glEnable(GL2.GL_TEXTURE_2D);	
    	brickTexture.bind();	 	
    	
 	 	 gl.glPushMatrix();
     	 	gl.glTranslated(80, 0, 80);
     		gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright
     	 	glu.gluCylinder(quadric, 10,10,40,15,1);
    	 	gl.glPushMatrix();
	 			gl.glRotated(90,1, 0, 0);
	 			drawCircle(9.99,50,gl,40);
	 		gl.glPopMatrix();
     	 gl.glPopMatrix();
     	 
     	gl.glEnable(GL2.GL_TEXTURE_2D);	
    	brickTexture.bind();    	 	
    	 gl.glPushMatrix();
 	 		gl.glTranslated(20, 0, 80);
 	 		gl.glRotatef(-90f, 1f, 0f, 0f); // stand upright
 	 		glu.gluCylinder(quadric, 10,10,40,15,1);
    	 	gl.glPushMatrix();
	 			gl.glRotated(90,1, 0, 0);
	 			drawCircle(9.99,50,gl,40);
	 		gl.glPopMatrix();
 	 	 gl.glPopMatrix();
 	 	gl.glDisable(GL2.GL_TEXTURE_2D);
 	 	
 	 	
 	 	//walls
        gl.glEnable(GL2.GL_TEXTURE_2D);
        brickTexture.bind();
 	 	 
 	 	 	gl.glBegin(GL2.GL_QUADS);
 	 	 	gl.glTexCoord2f(0f,0f);gl.glVertex3d(25, 30, 15);
 	 	 	gl.glTexCoord2f(0f,3f);	gl.glVertex3d(25, 0, 15);
 	 	 	gl.glTexCoord2f(4f,3f);	gl.glVertex3d(85, 0, 15);
 	 	 	gl.glTexCoord2f(4f,0f);	gl.glVertex3d(85, 30, 15);
 	 	 	gl.glEnd();
 	 	 	
 	 	  gl.glDisable(GL2.GL_TEXTURE_2D);
 	 	  
 	 	  castleTopX(25,85,30,33,15,gl,glu,4);
 	 	  
	        gl.glEnable(GL2.GL_TEXTURE_2D);
            brickTexture.bind();
            gl.glEnable(GL2.GL_TEXTURE_GEN_S);
            gl.glEnable(GL2.GL_TEXTURE_GEN_T);
                gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
                gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
                float[] coef_s = {.1f,0,0,0};
                gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
                float[] coef_t = {0,.1f,0,0};
                gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
                //brickTexture.bind();
                
	 	 	gl.glBegin(GL2.GL_QUADS);
	 	 		gl.glVertex3d(25, 30, 85);
	 	 		gl.glVertex3d(25, 0, 85);
	 	 		gl.glVertex3d(85, 0, 85);
	 	 		gl.glVertex3d(85, 30, 85);
	 	 	gl.glEnd();
	 	 	 gl.glDisable(GL2.GL_TEXTURE_2D);
		     gl.glDisable(GL2.GL_TEXTURE_GEN_S);
		     gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	 	 
	 	 	  castleTopX(25,85,30,33,85,gl,glu,4);
	 	 
	 	 
	 	//Side with main entrance
		     
	 
	 	 
	 	 
	        gl.glEnable(GL2.GL_TEXTURE_2D);
            brickTexture.bind();
	 	 	gl.glBegin(GL2.GL_QUADS);
	 	 	gl.glTexCoord2f(0f,0f);gl.glVertex3d(90,30,20);
	 	 	gl.glTexCoord2f(0f,2f);gl.glVertex3d(90,10,20);//t is smaller because its not as tall as other walls due to the door
	 	 	gl.glTexCoord2f(4f,2f);gl.glVertex3d(90,10,80);
	 	 	gl.glTexCoord2f(4f,0f);gl.glVertex3d(90,30,80);
	 	 	gl.glEnd();
	 	 	 gl.glDisable(GL2.GL_TEXTURE_2D);
	 	 	 
	 	castleTopZ(20,80,30,33,90,gl,glu,4);
	 	 
	 	 
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gateTexture.bind();
        gl.glEnable(GL2.GL_TEXTURE_GEN_S);
        gl.glEnable(GL2.GL_TEXTURE_GEN_T);
            gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
            float[] coef_s1 = {.3f,0,.4f,0};
            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
            float[] coef_t1 = {0,.3f,0,0};
            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
            
	 	 	gl.glBegin(GL2.GL_POLYGON);
	 	 	gl.glVertex3d(90,0,40);
	 	 	gl.glVertex3d(90,6,40);
	 	 	gl.glVertex3d(89,10,45);
	 	 	gl.glVertex3d(87, 10, 50);
	 	 	gl.glVertex3d(87, 0, 50);
	 	 	gl.glEnd();

	 	 	 
	 	 	 
	   gl.glEnable(GL2.GL_TEXTURE_2D);
	         gateTexture.bind();
	 	 	gl.glBegin(GL2.GL_POLYGON);
	 	 	gl.glVertex3d(93, 0, 50);
	 	 	gl.glVertex3d(93, 10, 50);
	 	 	gl.glVertex3d(91,10,55);
	 	 	gl.glVertex3d(90,6,60);
	 	 	gl.glVertex3d(90,0,60);
	 	 	gl.glEnd();
	 	 	
	 	 	 gl.glDisable(GL2.GL_TEXTURE_2D);
	         gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	         gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	 	 
	 	 //around the door
	         gl.glEnable(GL2.GL_TEXTURE_2D);
	         brickTexture.bind();
	         gl.glEnable(GL2.GL_TEXTURE_GEN_S);
	         gl.glEnable(GL2.GL_TEXTURE_GEN_T);
	             gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	             gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
	             float[] coef_s2 = {0f,0,.1f,0};
	             gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s2, 0);
	             float[] coef_t2 = {0,.1f,0,0};
	             gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t2, 0);
	             
		 	 	gl.glBegin(GL2.GL_QUADS);
		 	 	gl.glVertex3d(90,0,40);
		 	 	gl.glVertex3d(90,0,20);
		 	 	gl.glVertex3d(90,6,20);
		 	 	gl.glVertex3d(90,6,40);
		 	 	gl.glEnd();
	
	        gl.glBegin(GL2.GL_QUADS);
		 	 	gl.glVertex3d(90,6,60);
		 	 	gl.glVertex3d(90,0,60);
		 	 	gl.glVertex3d(90,0,80);
		 	 	gl.glVertex3d(90,6,80);
		 	 	gl.glEnd();

	 	 	gl.glBegin(GL2.GL_POLYGON);
	 	 	gl.glVertex3d(90,6,40);
	 	 	gl.glVertex3d(90,10,45);
	 	 	gl.glVertex3d(90,10,20);
	 	 	gl.glVertex3d(90,6,20);
	 	 	gl.glEnd();

	 	   
	 	 	gl.glBegin(GL2.GL_POLYGON);	
	 	 	gl.glVertex3d(90,10,55);
	 	 	gl.glVertex3d(90,6,60);
	 	 	gl.glVertex3d(90,6,80);
	 	 	gl.glVertex3d(90,10,80);
	 	 	gl.glEnd();
	        gl.glDisable(GL2.GL_TEXTURE_2D);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	        gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	 	 
	 	
//////////////////////////////////////////
	 //side with small door
	     gl.glEnable(GL2.GL_TEXTURE_2D);
	 	 gl.glPushMatrix();
	 	 	gl.glBegin(GL2.GL_QUADS);
	 	 	gl.glTexCoord2f(0f,0f);	gl.glVertex3d(20,30,20);
	 	 	gl.glTexCoord2f(0f,3f);	gl.glVertex3d(20,10,20);
	 	 	gl.glTexCoord2f(4f,3f);	gl.glVertex3d(20,10, 80);
	 	 	gl.glTexCoord2f(4f,0f);	gl.glVertex3d(20,30, 80);
	 	 	gl.glEnd();
	 	 gl.glPopMatrix();
	 	gl.glDisable(GL2.GL_TEXTURE_2D);
	 	
	 	castleTopZ(20,80,30,33,20,gl,glu,4);
	 	
	 	 gl.glEnable(GL2.GL_TEXTURE_2D);
	 	 
 	 	 gl.glPushMatrix();
	 	 	gl.glBegin(GL2.GL_QUADS);
	 	 	gl.glTexCoord2f(0f,0f);gl.glVertex3d(20,0,20);
	 	 	gl.glTexCoord2f(0f,3f);gl.glVertex3d(20,10,20);
	 	 	gl.glTexCoord2f(4f,3f);gl.glVertex3d(20,10, 65);
	 	 	gl.glTexCoord2f(4f,0f);gl.glVertex3d(20,0, 65);
	 	 	gl.glEnd();
	 	 gl.glPopMatrix();
	 	gl.glDisable(GL2.GL_TEXTURE_2D);
	 	
	 	int p=0;
	 	//add archer targets
		 gl.glPushMatrix();
		 	gl.glTranslated(62, 3, 80);
		 	gl.glRotated(180,0,1,0);
		 	for(int i =0; i<=2; i++){
		 	 target.body(gl, glu,3);
		 	 gl.glPushMatrix();
		 	 	gl.glRotated(90, 0, 1, 0);
		 	 	if(p==0){											//different targets have different arrow placement
		 	 		for(int j=0;j<4;j++){
		 	 			
		 	 			target.drawArrow(gl, glu, .5, 0, 0);
		 	 			gl.glTranslated(0,.8,-.3);
		 	 		}
		 	 	}
		 	 	
		 	 	if(p==1){
		 	 		for(int j=0;j<4;j++){
		 	 			target.drawArrow(gl, glu, .5, 0, 0);
		 	 			gl.glTranslated(0,-.4,.6);
		 	 		}
		 	 	}
		 	 	
		 	 	if(p==2){
		 	 		for(int j=0;j<4;j++){
		 	 			target.drawArrow(gl, glu, .5, 0, 0);
		 	 			gl.glTranslated(0,.3,-.2);
		 	 		}
		 	 	}
		 	 gl.glPopMatrix();
		 	gl.glTranslated(12,0,0);
		 	p++;				//switch arrow placement
		 	}
		 gl.glPopMatrix();
		 
		 	//place for sword and shield
		 	//gl.glColor3f(1,0,1);
	        //gl.glBegin(GL2.GL_QUADS);
	 	 	//gl.glVertex3d(90.01,25,45);
	 	 	//gl.glVertex3d(90.01,25,55);
	 	 	//gl.glVertex3d(90.01,15,55);
	 	 	//gl.glVertex3d(90.01,15,45);
	 	 	//gl.glEnd();
		 gl.glPushMatrix();
		 	gl.glTranslated(90.01,15,45);
		 	myShieldWidget.draw(gl, glu);
		 gl.glPopMatrix();

 	 
 	 	
    }
    //this method creates ridges on the walls of the castle along the X Axis
    //input start of x, the end of the x, the bottom and top of y for height, the z axis and the spacing between the ridges
    //xBegin is the smaller x value
    public void castleTopX(int xBegin, int xEnd, int ybot, int ytop, int z,GL2 gl, GLU glu, int spacing ){
	 	 gl.glEnable(GL2.GL_TEXTURE_2D);
	 	 brickTexture.bind();
    	gl.glPushMatrix();
    	int cycles=(((xEnd-xBegin)/2)/spacing);		//this is how many time the ridge needs to be generated taking spacing into account
    	
	 	  for(int i=0; i<=cycles;i++){
	 		 gl.glTranslated(spacing, 0, 0);
	 	  	gl.glBegin(GL2.GL_QUADS);
	 	 	gl.glTexCoord2f(0f,0f); gl.glVertex3d(xBegin, ybot, z);
	 	 	gl.glTexCoord2f(0f,1f);	gl.glVertex3d(xBegin, ytop, z);
	 	 	
	 	 	xBegin=xBegin+spacing;
	 	 	
	 	 	gl.glTexCoord2f(1f,1f);	gl.glVertex3d(xBegin, ytop, z);
	 	 	gl.glTexCoord2f(1f,0f);	gl.glVertex3d(xBegin, ybot, z);
	 	 	gl.glEnd();
	 	 	
	 	 	
	 	  }
	 	 gl.glPopMatrix();
	 	 gl.glDisable(GL2.GL_TEXTURE_2D);
	 	 
	 	
	 	 

}
    //this method creates ridges on the walls of the castle along the Z Axis
    //input start of z, the end of the z, the bottom and top of y for height, the x axis and the spacing between the ridges
    //zBegin is the smaller  value
    public void castleTopZ(int zBegin, int zEnd, int ybot, int ytop, int x,GL2 gl, GLU glu, int spacing ){
	 	 gl.glEnable(GL2.GL_TEXTURE_2D);
	 	 brickTexture.bind();
   	gl.glPushMatrix();
   		int cycles=(((zEnd-zBegin)/2)/spacing);		//this is how many time the ridge needs to be generated taking spacing into account
   		
	 	  for(int i=0;i<cycles;i++){
	 		gl.glTranslated(0, 0, spacing);
	 	  	gl.glBegin(GL2.GL_QUADS);
	 	 	gl.glTexCoord2f(0f,0f); gl.glVertex3d(x, ybot, zBegin);
	 	 	gl.glTexCoord2f(0f,1f);	gl.glVertex3d(x, ytop, zBegin);
	 	 	
	 	 	zBegin=zBegin+spacing;
	 	 	
	 	 	gl.glTexCoord2f(1f,1f);	gl.glVertex3d(x, ytop, zBegin);
	 	 	gl.glTexCoord2f(1f,0f);	gl.glVertex3d(x, ybot, zBegin);
	 	 	gl.glEnd();
	 	 	
	 	 	
	 	 	
	 	  }
	 	 gl.glPopMatrix();
	 	 gl.glDisable(GL2.GL_TEXTURE_2D);

}
public void drawGround(GL2 gl,GLU glu){

	
	//plot of land
	gl.glEnable(GL2.GL_TEXTURE_2D);
	groundTexture.bind();
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0f,0f); gl.glVertex3d(0, 0, 0);
		gl.glTexCoord2f(0f,12f);gl.glVertex3d(0, 0, 100);
		gl.glTexCoord2f(6f,12f);gl.glVertex3d(100, 0, 100);
		gl.glTexCoord2f(6f,0f);	gl.glVertex3d(100, 0, 0);
		gl.glEnd();
	gl.glDisable(GL2.GL_TEXTURE_2D);
}

//was going to be used to cap of the top of the towers, had trouble translating it
    private void drawCircle(double r,double incr, GL2 gl,double y){
	
	double increment=2*Math.PI/incr;
    gl.glEnable(GL2.GL_TEXTURE_2D);
    brickTexture.bind();
    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s = {0,0,.1f,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
        float[] coef_t = {.1f,0,0,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
	gl.glBegin(GL2.GL_TRIANGLE_FAN);
		gl.glVertex3d(0,y,0);
		
	for(double angle=0; angle<=2*Math.PI;angle+=increment){
		gl.glVertex3d(Math.cos(angle)* r,y,  Math.sin(angle)* r);
		gl.glVertex3d(Math.cos(angle + increment)*r,y, Math.sin(angle + increment)*r);
		


	}
	gl.glEnd();
	
   gl.glDisable(GL2.GL_TEXTURE_2D);
	   
	gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	
	
	//auto map the small ridges on the top 
	    
    gl.glEnable(GL2.GL_TEXTURE_2D);
    brickTexture.bind();
    gl.glEnable(GL2.GL_TEXTURE_GEN_S);
    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
        gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
        float[] coef_s1 = {.1f,0,.1f,0};
        gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
        float[] coef_t1 = {0,.1f,0,0};
        gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
	int i=1;
	gl.glBegin(GL2.GL_QUADS);
	for(double angle=0; angle<=2*Math.PI;angle+=increment){
		if(i%2==0){			//creates the ridges by drawing every other quad
	 	gl.glVertex3d(Math.cos(angle)*r, y, Math.sin(angle)*r);
	 	gl.glVertex3d(Math.cos(angle + increment)*r,y, Math.sin(angle + increment)*r);
	 	gl.glVertex3d(Math.cos(angle + increment)*r,y+2, Math.sin(angle + increment)*r);
	 	gl.glVertex3d(Math.cos(angle)*r, y+2, Math.sin(angle)*r);
		}
		i++;
		
	}

	
	gl.glEnd();
    gl.glDisable(GL2.GL_TEXTURE_2D);
   
    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    gl.glDisable(GL2.GL_TEXTURE_GEN_T);
    }

}
