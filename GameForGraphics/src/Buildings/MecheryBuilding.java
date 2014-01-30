package Buildings;
/*
 * Vinodh Mechery
 * Main Building
 * 10/28/10
 */


import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.SketchupModelJAXB;

import SketchupModels.VinodhStereo;

import com.jogamp.opengl.util.texture.Texture;


public class MecheryBuilding extends Building{ 
//	private GLUquadric quadric; // to control properties of quadric-based objects
    private static Texture brickTexture;     // bricks
    private static Texture grassTexture;
    private static Texture ceilingTexture;
    private static Texture woodfloorTexture;
	private static Texture stoneTexture;
	private static Texture innerwallTexture;
	
    private List<Plane> walls = new LinkedList<Plane>();
    private List<Plane> rungs = new LinkedList<Plane>();
	
	private Plane frontlowerleft, frontlowerright, frontupper,backlowerleft, backlowerright, backupper, sideleft, sideright;
    private Plane frontleftinnerlowerleft, frontleftinnerlowerright, frontleftupper, backleftinnerlowerleft, backleftinnerlowerright,backleftupper;
    private Plane frontrightinnerlowerleft, frontrightinnerlowerright, frontrightupper;
    private Plane backrightinnerlowerleft, backrightinnerlowerright,backrightupper, innersidefront, innersideback;
    private Plane innersideleftlowerleft, innersideleftlowerright, innersideleftupper, innersiderightlowerleft, innersiderightlowerright, innersiderightupper;
	
    private Plane leftbeam_left, leftbeam_right, leftbeam_front, leftbeam_back;
    private Plane rightbeam_left, rightbeam_right, rightbeam_front, rightbeam_back;
    private Plane top_rung, bottom_rung, front_rung, back_rung;
    
    private Plane tablestand_left, tablestand_right,tablestand_front,tablestand_back;
    private Plane tabletop_left, tabletop_right, tabletop_back, tabletop_front, tabletop_top;
    private Plane frontgrass, backgrass, leftsidegrass,rightsidegrass;
    private Plane ceilingleft, ceilingright, ceilingback, ceilingfront;
    private Plane floor;
    private String xy = "xy";
    private String xz = "xz";
    private String yz = "yz";
    private VinodhStereo myWidget;
    
    public MecheryBuilding(GL2 gl, GLU glu)
    {
    	//Edit by Melvin Ross
    	if(brickTexture==null){
    	brickTexture     = setupTexture(gl, "vinodhbricks.png");
    	grassTexture	 = setupTexture(gl, "vinodhgrass.png");
    	ceilingTexture   = setupTexture(gl, "vinodhceilingtile.png");
    	woodfloorTexture = setupTexture(gl, "vinodhwoodfloort.png");
    	stoneTexture = setupTexture(gl, "vinodhstone.png");
    	innerwallTexture = setupTexture(gl,"vinodhinnerwallpaper.png");
    	}
    	
    	myWidget = new VinodhStereo(gl,glu);
    	
        Color white = new Color(0,0,0);
        
        // set up grass
        leftsidegrass = new Plane(xz,0.,0.,100.,10.,-100.,white,grassTexture);
        rightsidegrass = new Plane(xz,90.,0.,100.,10.,-100.,white,grassTexture);
        frontgrass = new Plane(xz,10.,0.,100.,80.,-10.,white,grassTexture);
        backgrass = new Plane(xz,10.,0.,10.,80.,-10.,white,grassTexture);
        
        // ceiling
        
        ceilingleft = new Plane(xz, 10.,21.,90.,37.,-80.,white,ceilingTexture);
        ceilingright = new Plane(xz, 52.,21.,90.,38.,-80.,white,ceilingTexture);
        ceilingback = new Plane(xz, 47.,21.,10.,5.,41.4,white,ceilingTexture);
        ceilingfront = new Plane(xz, 47.,21.,90.,5.,-36.,white,ceilingTexture);
        
        // floor
        
        floor = new Plane(xz,10.0,0.,90.,80.,-80.,white,woodfloorTexture);

        // front wall
        frontlowerleft = new Plane(xy,10.0,0.0,90.0,38.0,7.0,white,brickTexture);
        frontlowerright= new Plane(xy,52.0,0.0,90.0,38.0,7.0,white,brickTexture); 
        frontupper = new Plane(xy,10.0,7.0,90.0,80.0,14.0,white,brickTexture);
        	
        // back wall
        backlowerleft = new Plane(xy,10.0,0.0,10.0,38.0,7.0,white,brickTexture);
        backlowerright= new Plane(xy,52.0,0.0,10.0,38.0,7.0,white,brickTexture); 
        backupper = new Plane(xy,10.0,7.0,10.0,80.0,14.0,white,brickTexture);
                    
        // outer side walls
        sideleft = new Plane(yz,10.0,0.0,90.0,-80.0,21.0,white,brickTexture);
        sideright = new Plane(yz,90.0,0.0,90.0,-80.0,21.0,white,brickTexture);
        
        // front inner left wall
        frontleftinnerlowerleft = new Plane(xy,10.0,0.0,65.0,10.0,7.0,white,innerwallTexture);
        frontleftinnerlowerright = new Plane(xy,25.0,0.0,65.0,10.0,7.0,white,innerwallTexture);
        frontleftupper = new Plane(xy,10.0,7.0,65.0,25.0,14.0,white,innerwallTexture);
        
        // back inner left wall
        backleftinnerlowerleft = new Plane(xy,10.0,0.0,35.0,10.0,7.0,white,innerwallTexture);
        backleftinnerlowerright = new Plane(xy,25.0,0.0,35.0,10.0,7.0,white,innerwallTexture);
        backleftupper = new Plane(xy,10.0,7.0,35.0,25.0,14.0,white,innerwallTexture);

        // front inner right wall
        frontrightinnerlowerleft = new Plane(xy,65.0,0.0,65.0,10.0,7.0,white,innerwallTexture);
        frontrightinnerlowerright = new Plane(xy,80.0,0.0,65.0,10.0,7.0,white,innerwallTexture);
        frontrightupper = new Plane(xy,65.0,7.0,65.0,25.0,14.0,white,innerwallTexture);

        // back inner right wall
        backrightinnerlowerleft = new Plane(xy,65.0,0.0,35.0,10.0,7.0,white,innerwallTexture);
        backrightinnerlowerright = new Plane(xy,80.0,0.0,35.0,10.0,7.0,white,innerwallTexture);
        backrightupper = new Plane(xy,65.0,7.0,35.0,25.0,14.0,white,innerwallTexture);
         
        // inner side left yz plane
        innersideleftlowerleft = new Plane(yz,35.0,0.0,35.0,12.0,7.0,white,innerwallTexture);
        innersideleftlowerright = new Plane(yz,35.0,0.0,53.0,12.0,7.0,white,innerwallTexture);
        innersideleftupper = new Plane(yz,35.0,7.0,35.0,30.0,14.0,white,innerwallTexture);
        
        // inner side right yz plane
        innersiderightlowerleft = new Plane(yz,65.0,0.0,35.0,12.0,7.0,white,innerwallTexture);
        innersiderightlowerright = new Plane(yz,65.0,0.0,53.0,12.0,7.0,white,innerwallTexture);
        innersiderightupper = new Plane(yz,65.0,7.0,35.0,30.0,14.0,white,innerwallTexture);
        
        
        innersidefront = new Plane(xy,35.0,0.0,65.0,30.0,21.0,white,innerwallTexture);
        innersideback = new Plane(xy,35.0,0.0,35.0,30.0,21.0,white,innerwallTexture);

        // ladder beams
        leftbeam_front = new Plane(xy,49.5,0.0,51.5,.2,21.0,white,stoneTexture);
        leftbeam_back = new Plane(xy,49.5,0.0,51.2,.2,21.0,white,stoneTexture);
        rightbeam_front = new Plane(xy,51.0,0.0,51.5,.2,21.0,white,stoneTexture);
        rightbeam_back = new Plane(xy,51.0,0.0,51.2,.2,21.0,white,stoneTexture);
        leftbeam_left = new Plane(yz,49.5,0.0,51.5,-.3,21.0,white,stoneTexture);
        leftbeam_right = new Plane(yz,49.7,0.0,51.5,-.3,21.0,white,stoneTexture);
        rightbeam_left = new Plane(yz,51.0,0.0,51.5,-.3,21.0,white,stoneTexture);
        rightbeam_right = new Plane(yz,51.2,0.0,51.5,-.3,21.0,white,stoneTexture);
        
        // rung
        
        top_rung = new Plane(xz,49.7,20.2,51.5,1.3,-.3,white,stoneTexture);
        bottom_rung = new Plane(xz,49.7,20.0,51.5,1.3,-.3,white,stoneTexture);
        front_rung = new Plane(xy,49.7,20.0,51.5,1.3,.2,white,stoneTexture);  
        back_rung = new Plane(xy,49.7,20.0,51.2,1.3,.2,white,stoneTexture);        
        
        rungs.add(top_rung);
        rungs.add(bottom_rung);
        rungs.add(front_rung);
        rungs.add(back_rung);
        
        // table
        
        tablestand_left = new Plane(yz,48.0,0.0,77.0,-.5,3.0,white,stoneTexture);
        tablestand_right = new Plane(yz,48.5,0.0,77.0,-.5,3.0,white,stoneTexture);
        tablestand_front = new Plane(xy,48.0,0.0,77.0,.5,3.0,white,stoneTexture);
        tablestand_back = new Plane(xy,48.0,0.0,76.5,.5,3.0,white,stoneTexture);

        tabletop_left = new Plane(yz,43.0,3.0,80.0,-6.0,-.3,white,stoneTexture);
        tabletop_right = new Plane(yz,53.5,3.0,80.0,-6.0,-.3,white,stoneTexture);
        tabletop_back = new Plane(xy,43.0,3.0,80.0,10.5,-.3,white,stoneTexture); 
        tabletop_front = new Plane(xy,43.0,3.0,74.0,10.5,-.3,white,stoneTexture); 
        tabletop_top = new Plane(xz,43.0,3.0,80.0,10.5,-6.0,white,stoneTexture);
        
        walls.add(frontlowerleft);
        walls.add(frontlowerright);
        walls.add(frontupper);
        walls.add(backlowerleft);
        walls.add(backlowerright);
        walls.add(backupper);
        walls.add(frontleftinnerlowerleft);
        walls.add(frontleftinnerlowerright);
        walls.add(frontleftupper);
        walls.add(backleftinnerlowerleft);
        walls.add(backleftinnerlowerright);
        walls.add(backleftupper);
        walls.add(frontrightinnerlowerleft);
        walls.add(frontrightinnerlowerright);
        walls.add(frontrightupper);
        walls.add(backrightinnerlowerleft);
        walls.add(backrightinnerlowerright);
        walls.add(backrightupper);
        walls.add(innersidefront);
        walls.add(innersideback);
        walls.add(leftbeam_front);
        walls.add(leftbeam_back);
        walls.add(rightbeam_front);
        walls.add(rightbeam_back);
        walls.add(sideleft);
        walls.add(sideright);
        walls.add(innersideleftlowerleft);
        walls.add(innersideleftlowerright);
        walls.add(innersideleftupper);
        walls.add(innersiderightlowerleft);
        walls.add(innersiderightlowerright);
        walls.add(innersiderightupper);
        walls.add(leftbeam_left);
        walls.add(leftbeam_right);
        walls.add(rightbeam_left);
        walls.add(rightbeam_right);
        walls.add(tablestand_left);
        walls.add(tablestand_right);
        walls.add(tablestand_front);
        walls.add(tablestand_back);
        walls.add(tabletop_left);
        walls.add(tabletop_right);
        walls.add(tabletop_front);
        walls.add(tabletop_back);
        walls.add(tabletop_top);
        walls.add(leftsidegrass);
        walls.add(rightsidegrass);
        walls.add(frontgrass);
        walls.add(backgrass);
        walls.add(ceilingleft);
        walls.add(ceilingright);
        walls.add(ceilingfront);
        walls.add(ceilingback);
        walls.add(floor);
    }

    
	public void draw(GL2 gl, GLU glu) {
		
	gl.glPushMatrix();

    for(Plane wall: walls)
    {
    		wall.draw(gl,glu);

    }
    
    
    // need to do this because the rungs are translated -1 in the y direction. Calling rung.setY(-1) does not work.
    
    gl.glEnable(GL2.GL_TEXTURE_2D);
	gl.glEnable(GL2.GL_TEXTURE_GEN_S);
    gl.glEnable(GL2.GL_TEXTURE_GEN_T);
    gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
    gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
    
    for(int i = 1; i<19;i++)
    {
       for(Plane rung: rungs)
       {
    	   double x = rung.getX();
           double y = rung.getY()-i*1;
           double z = rung.getZ();
           double l = rung.getLength();
           double w = rung.getWidth();
           rung.getTexture().bind();
           
    	   if(rung.getPlane() =="xy")
       	   {
    		   
    	            float[] coef_s = {.5f,0,0,0};
    	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
    	            float[] coef_t = {0,.25f,0,0};
    	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
    	            gl.glBegin(GL2.GL_QUADS);
    	            gl.glVertex3d(x,y,z);
    	            gl.glVertex3d(x,y+l,z);
    	            gl.glVertex3d(x+w,y+l,z);
    	            gl.glVertex3d(x+w,y,z);
    	            gl.glEnd();
    	       
       	   }
    	   
    	   
    	  
    	  
    	   else if(rung.getPlane() == "xz")
    	   {   
    		   
   	            float[] coef_s = {.5f,0,0,0};
   	            gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
   	            float[] coef_t = {0,.25f,0,0};
   	            gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
   	            gl.glBegin(GL2.GL_QUADS);
   	         gl.glVertex3d(x,y,z);
             gl.glVertex3d(x,y,z+l);
             gl.glVertex3d(x+w,y,z+l);
             gl.glVertex3d(x+w,y,z);
   	            gl.glEnd();
   	        
    	   }
    	   
        }
       
        
    }
       
    gl.glDisable(GL2.GL_TEXTURE_2D);
    gl.glDisable(GL2.GL_TEXTURE_GEN_S);
    gl.glDisable(GL2.GL_TEXTURE_GEN_T);	  
    
    gl.glTranslated(47.5, 3,78);
    myWidget.draw(gl, glu);
    gl.glPopMatrix();
    
	}

}
