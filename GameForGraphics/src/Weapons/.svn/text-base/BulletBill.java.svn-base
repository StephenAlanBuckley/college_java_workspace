package Weapons;

/*
 * Doug Hernandez
 */
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

import main.Game;
import Buildings.Building;

import com.jogamp.opengl.util.texture.Texture;

public class BulletBill extends Weapon{
	private GLUquadric quadric; // to control properties of quadric-based objects
	private double move;		//manipulated by sway()
	private boolean down;		//used by sway()
	//textures
	private Texture famasp1;
	private Texture famasTopB2;
	private Texture famasMain1;
	private Texture famasMostly;
	private Texture famasStock1;
	private Texture famasClip;
	
	private double L=.7;			//BODY LENGTH	more equals longer gun
	private double W=.08;			//Body WIDTH	more equals fatter gun
	
	//private boolean firing;	//isFiring()
	private int firingG=0;	//frame count of firing animation
	private double gun;
	private boolean downG;
	//double s=0;	//trigger animation
	
	//private boolean reloading;
	private double reloadingG;
	private double fall=0;		//fall keeps track of the position of the magazine during reload
	
	public BulletBill(GL2 gl,GLU glu, Game game){
    quadric = glu.gluNewQuadric();
    glu.gluQuadricDrawStyle(quadric, GLU.GLU_FILL); // GLU_POINT, GLU_LINE, GLU_FILL, GLU_SILHOUETTE
    glu.gluQuadricNormals  (quadric, GLU.GLU_NONE); // GLU_NONE, GLU_FLAT, or GLU_SMOOTH
    glu.gluQuadricTexture  (quadric, true);        // use true to generate texture coordinates
    move=.001;
    down=false;		
    
    famasTopB2=Building.setupTexture(gl,"famasTopB2.png");
  
    famasMain1=Building.setupTexture(gl,"famasMain1.png");
    famasMostly=Building.setupTexture(gl,"famasMostly.jpg");
    famasStock1=Building.setupTexture(gl,"famasStock2.png");
    famasClip = Building.setupTexture(gl,"famasClip.jpg");

  
    firing=false;
    
    weaponController = new BasicWeaponController(game, this);
	}
	/*
	 * Sway()
	 * finalD is the distance in which the sway will take place
	 * speed is the speed at which it will take place
	 * after calling sway, put move into a gl.Translate to watch it move back and forth
	 */
	private void swayMove(double finalD,double speed){
		if(move<finalD&&down==false)
			move+=speed;
	
		if(move>=finalD){
			down=true;
		}
		if(down){
			move-=speed;
		}
		if(move<0){
			down=false;
		}
	}
	private void swayGun(double finalD,double speed){
		if(gun<finalD&&downG==false)
			gun+=speed;
	
		if(gun>=finalD){
			downG=true;
		}
		if(downG){
			gun-=speed;
		}
		if(gun<0){
			downG=false;
		}
	}
	/*
	 * DrawGunMove take its account forward, backward and side to side movement in order
	 * to change the guns movement to simulate it being held.
	 * if gunM is 0, the gun will simulate a breathing movement up and down
	 * 
	 * It is also where isFiring checks to see if the gun is firing, if it is, it goes to 
	 * the firing animation instead of the gunM if statements
	 */
	public void drawGunMove(GL2 gl,GLU glu,double gunM){
		
		if(isFiring()){
			gl.glPushMatrix();
			
				drawGunFire(gl,glu);
				drawBody(gl,glu);
				
			gl.glPopMatrix();
			
		}
		else if(isReloading()){
			gl.glPushMatrix();
			
			drawGunReloading(gl,glu);
			drawBody(gl,glu);
			
		gl.glPopMatrix();
			
		}
		else{
		
		//not moving-breathing up and down
		if(gunM==0){
			gl.glPushMatrix();
			swayMove(.05,.0007);
			gl.glTranslated(0,move,0);
			
			drawBody(gl,glu);
			
			gl.glPopMatrix();
		}
		//Move Forward [W] -chugs forward and back
		if(gunM==1){
			gl.glPushMatrix();
			swayMove(.1,.002);
			gl.glTranslated(0,0,move);
			drawBody(gl,glu);
			gl.glPopMatrix();
		}
		//Move right [D]-pulls gun sideways
		if(gunM==2){
			gl.glPushMatrix();
			swayMove(.1,.0008);
			gl.glTranslated(move,0,move);
			gl.glRotated(5,0,1,0);
			drawBody(gl,glu);
			gl.glPopMatrix();
		}
		//move Back [S]-chugs back and forth
		if(gunM==3){
			gl.glPushMatrix();
			swayMove(.1,.002);
			gl.glTranslated(0,0,-move);
			drawBody(gl,glu);
			gl.glPopMatrix();
		}
		//move Left [A]-sideways
		if(gunM==4){
			gl.glPushMatrix();
			swayMove(.1,.001);
			gl.glTranslated(move,0,-move);
			drawBody(gl,glu);
			gl.glPopMatrix();
		}
		
		}
			
	
		
		
		
	}

	/*
	 * DrawGunFiring is the animation method when firing the gun
	 * firingG keeps track of the amount of frames the animations takes up
	 * and it is reset at 30 currently
	 */
	public void drawGunFire(GL2 gl, GLU glu) {
		
		System.out.println(firingG);
		
			
			firingG++;
			gl.glRotated(-firingG*.2,1,0,0);
			swayGun(.2,.01);
			gl.glTranslated(-gun/3,0,-gun);

			
			
			if(firingG==30){			//number of frames allowed for gun animation
			
				firingG=0;
				isFiring(false);
				returnGun();	//brings move to default value
			}
			
	
		
		
	}
	/*
	 * drawGunReloading is the reloading animation
	 * reloadingG keeps track of the frame count and determines which animation will take place
	 * th reloading animation has 4 parts
	 * part1: the rotation of the gun sideways
	 * part2: the release of the magazine and the bob of the gun
	 * part3: the input of new magazine
	 * part4: un rotatation and return to postion
	 * part5: resets the values to prepare for next reload
	 */
	public void drawGunReloading(GL2 gl, GLU glu) {
		
		System.out.println(reloadingG);

		
		if(reloadingG<10)
		reloadingG+=.2;
		else
		reloadingG++;
		
		
		if(reloadingG<10){//part1
			//gl.glTranslated(0,0,reloadingG/20);		other reloading animation
			gl.glRotated(reloadingG*9,0,1,0);
			
			gl.glPushMatrix();
			gl.glTranslated(-.1,0,0);		//for the clip, a translation was needed
			drawClip(gl,glu,W);
			gl.glPopMatrix();
			
		}
		if(reloadingG>=10&&reloadingG<=100){//part 2 --always present during reload animation
			
		
			gl.glRotated(reloadingG*.2,1,0,0);
			swayGun(.3,.01);
			gl.glRotated(90,0,1,0);
			gl.glTranslated(0,gun,.5);
			
			
			if(reloadingG<30){//keeps the mag attached to the gun before removal

		
			gl.glPushMatrix();
			
				gl.glTranslated(-.1,0,0);
				drawClip(gl,glu,W);
			gl.glPopMatrix();
		}
		if(reloadingG>=30&&reloadingG<60){//part 3	--removal of mag
			gl.glPushMatrix();
				fall-=.025;
				gl.glTranslated(-.1,fall,0);
				drawClip(gl,glu,W);
			gl.glPopMatrix();
		}
		if(reloadingG>=60)			//part 4 --new mag
		{
			gl.glPushMatrix();
			fall+=.02;
			if(fall>=.04)
				fall=.04;
			gl.glTranslated(-.1,fall,0);
			drawClip(gl,glu,W);
			gl.glPopMatrix();
		}

		
		}
		if(reloadingG>=100)	//return of gun position
		{
			
		gl.glRotated(-(reloadingG-100)+9,0,1,0);	//turns gun opposite rotate in preparation to return it to normal position
		gl.glTranslated(0,0,-(reloadingG%100)/40);	//brings the gun back to the normal position
		
		gl.glPushMatrix();
		gl.glTranslated(-.1,0,0);
		drawClip(gl,glu,W);	
		gl.glPopMatrix();

		}

		
		if(reloadingG>110){			//number of frames allowed for gun animation to reload after which everything is reset
		
			reloadingG=0;
			fall=0;
			isReloading(false);
			returnGun();
		}
		
		
		
	}

	/*
	 * drawBody contains all the glVertex calls and texture mapping
	 * Contains comments that go with my notes and are not coherent 
	 * to humans, and should be ignored
	 * Only contains Vertex calles and texture calls
	 */
	public void drawBody(GL2 gl, GLU glu){

		
		double factorS=.15;		//dont touchhhh
		double factorL=.85;
		
		double tT=.04;		//used for the top of the gun
	
			gl.glColor3f(.01f, .01f, .01f);
			
			
			gl.glPushMatrix();
			gl.glTranslated(-.1,0,0);
 			 gl.glEnable(GL2.GL_TEXTURE_2D);  
	 			 famasMain1.bind();
			gl.glBegin(GL2.GL_QUADS);
			gl.glTexCoord2f(5f,1f);gl.glVertex3d(0, 0, 0);
			gl.glTexCoord2f(0f,1f);gl.glVertex3d(0, 0, L);
			gl.glTexCoord2f(0f,0f);gl.glVertex3d(0, .2, L);
			gl.glTexCoord2f(5f,0f);gl.glVertex3d(0, .2, 0);
			gl.glEnd();
			 gl.glDisable(GL2.GL_TEXTURE_2D); 

 	 		
 	 		
 	 		gl.glBegin(GL2.GL_QUADS);
 	 			gl.glVertex3d(0, .2, 0);
 	 			gl.glVertex3d(0, .2, L);
 	 			gl.glVertex3d(W, .2, L);
 	 			gl.glVertex3d(W, .2, 0);
 	 			gl.glEnd();
 	 		 gl.glEnable(GL2.GL_TEXTURE_2D);  
	 			 famasMain1.bind();
	 			gl.glBegin(GL2.GL_QUADS);
	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W, .2, L);
	 			gl.glTexCoord2f(5f,0f);gl.glVertex3d(W, .2, 0);
	 			gl.glTexCoord2f(5f,1f);gl.glVertex3d(W, 0, 0);
	 			gl.glTexCoord2f(0f,1f);gl.glVertex3d(W, 0, L);
 	 			gl.glEnd();
 	 			 gl.glDisable(GL2.GL_TEXTURE_2D);
 	 			
 	 			gl.glBegin(GL2.GL_QUADS);
	 			gl.glVertex3d(W, 0, 0);
 	 			gl.glVertex3d(W, 0, L);
 	 			gl.glVertex3d(0, 0, L);
 	 			gl.glVertex3d(0, 0, 0);
 	 			//the little boxes
 	 			gl.glVertex3d(0, 0, 0);
 	 			gl.glVertex3d(W, 0, 0);
 	 			gl.glVertex3d(W, .2, 0);
 	 			gl.glVertex3d(0, .2, 0);
 	 			
 	 			gl.glVertex3d(0, 0, L);
 	 			gl.glVertex3d(W, 0, L);
 	 			gl.glVertex3d(W, .2, L);
 	 			gl.glVertex3d(0, .2, L);
 	 		gl.glEnd();
 	 			
 	 			//top of gun
 	 		
 	 			//backtop
 	 			gl.glPushMatrix();
 	 			
 	 			
 	 			gl.glBegin(GL2.GL_QUADS);
 	 				gl.glVertex3d(W, .2, 0);
 	 				gl.glVertex3d(0, .2, 0);	//1
 	 				gl.glVertex3d(W*factorS, .35, 0);
 	 				gl.glVertex3d(W*factorL, .35, 0);
 	 				gl.glEnd();
 	 				
 	 		     
 	 		        //famasTopB2.bind();
 	 			 gl.glEnable(GL2.GL_TEXTURE_2D);  
 	 			 famasTopB2.bind();
 	 			 gl.glBegin(GL2.GL_QUADS);
 	 		      gl.glTexCoord2f(0f,1f);gl.glVertex3d(W, .2, 0);
 	 		      gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorL, .35, 0);		//2
 	 		      gl.glTexCoord2f(1f,0f);gl.glVertex3d(W*factorL, .3475, .05);
 	 		      gl.glTexCoord2f(1f,1f);gl.glVertex3d(W, .1975, .05);
 	 		      
 	 			gl.glEnd();
 	 				
 	 			gl.glDisable(GL2.GL_TEXTURE_2D);
 	 			gl.glBegin(GL2.GL_QUADS);
 	 				gl.glVertex3d(W, .1975, .05);
 	 				gl.glVertex3d(0, .1975, .05);			//3
 	 				gl.glVertex3d(W*factorS, .3475, .05);
 	 				gl.glVertex3d(W*factorL, .3475, .05);
 	 				gl.glEnd();
 	 				
 	 	 		gl.glEnable(GL2.GL_TEXTURE_2D);
 	 	 			famasTopB2.bind();
 	 	 			gl.glBegin(GL2.GL_QUADS);
 	 	 			gl.glTexCoord2f(1f,0f);gl.glVertex3d(W*factorS, .3475, .05);
 	 	 			gl.glTexCoord2f(1f,1f);gl.glVertex3d(0, .1975, .05);			//4
 	 	 			gl.glTexCoord2f(0f,1f);gl.glVertex3d(0, .2, 0);
 	 	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorS, .35, 0);	
 	 	 			gl.glEnd();
 	 	 		gl.glDisable(GL2.GL_TEXTURE_2D);
 	 			
 	 			gl.glPopMatrix();
 	 			
 	 			gl.glPushMatrix();
 	 			/*
 	 			 * letters are in reference to my notes
 	 			 */
	 			 gl.glEnable(GL2.GL_TEXTURE_2D);  
 	 			 famasMostly.bind();
 	 			 
 	 			gl.glBegin(GL2.GL_QUADS);
 	 			gl.glTexCoord2f(1f,0f);gl.glVertex3d(W, .2, L);	//d
 	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(0, .2, L);	//c
 	 			gl.glTexCoord2f(0f,1f);	gl.glVertex3d(W*factorS, .3, L);//a
 	 			gl.glTexCoord2f(1f,1f);gl.glVertex3d(W*factorL, .3, L);//b
 	 			gl.glEnd();
 	 			gl.glDisable(GL2.GL_TEXTURE_2D);
 	 		
 	 			gl.glBegin(GL2.GL_QUADS);
 	 				gl.glVertex3d(W, .20025, L-.05);//h
 	 				gl.glVertex3d(0, .20025, L-.05);//g
 	 				gl.glVertex3d(W*factorS, .30025, L-.05);//e
 	 				gl.glVertex3d(W*factorL, .30025, L-.05);//f
 	 			gl.glEnd();
 	 			
 	 			gl.glEnable(GL2.GL_TEXTURE_2D);
 	 			gl.glBegin(GL2.GL_QUADS);
 	 			gl.glTexCoord2f(1f,0f);gl.glVertex3d(W, .2, L);	//d
 	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorL, .3, L);	//b
 	 			gl.glTexCoord2f(0f,1f);gl.glVertex3d(W*factorL, .30025, L-.05);//f
 	 			gl.glTexCoord2f(1f,1f);gl.glVertex3d(W, .20025, L-.05);//h
 	 			gl.glEnd();
 	 			
 	 			gl.glBegin(GL2.GL_QUADS);
 	 			gl.glTexCoord2f(1f,0f);gl.glVertex3d(0, .2, L);//c
 	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorS, .3, L);//a
 	 			gl.glTexCoord2f(0f,1f);gl.glVertex3d(W*factorS, .30025, L-.05);//e
 	 			gl.glTexCoord2f(1f,1f);gl.glVertex3d(0, .20025, L-.05);//g
 	 			gl.glEnd();
 	 			
 	 			gl.glDisable(GL2.GL_TEXTURE_2D); 
 	 				
 	 				
 
 	 		gl.glPopMatrix();
 	 		
 	 		//top top
 	 		//tT currently equals .04
	 		gl.glPushMatrix();
	 
	 		 gl.glEnable(GL2.GL_TEXTURE_2D);  
 			 famasTopB2.bind();
	 	 		gl.glBegin(GL2.GL_QUADS);
	 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(W*factorS, .3, L);//a
	 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorL, .3, L);//b
	 	 		gl.glTexCoord2f(0f,.5f);gl.glVertex3d(W*factorL, .35, 0);//y			//base of top top
	 	 		gl.glTexCoord2f(1f,.5f);gl.glVertex3d(W*factorS, .35, 0);//z			//1
 	 				
	 	 		gl.glTexCoord2f(1f,0f);	gl.glVertex3d(W*factorS, .3+tT, L);//a'
	 	 		gl.glTexCoord2f(0f,0f);	gl.glVertex3d(W*factorL, .3+tT, L);//b'
	 	 		gl.glTexCoord2f(0f,.5f);	gl.glVertex3d(W*factorL, .35+tT, 0);//y'		//base with y increase
	 	 		gl.glTexCoord2f(1f,.5f);	gl.glVertex3d(W*factorS, .35+tT, 0);//z'		//2
 	 				
 	 			gl.glTexCoord2f(1f,0f);gl.glVertex3d(W*factorS, .3, L);//a
 	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorS, .3+tT, L);//a'
 	 			gl.glTexCoord2f(0f,2f);gl.glVertex3d(W*factorS, .35+tT, 0);//z'		//3
 	 			gl.glTexCoord2f(1f,2f);gl.glVertex3d(W*factorS, .35, 0);//z
 					
  				gl.glTexCoord2f(1f,0f);	gl.glVertex3d(W*factorL, .3, L);//b
	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorL, .3+tT, L);//b' 	 				
	 			gl.glTexCoord2f(0f,2f);gl.glVertex3d(W*factorL, .35+tT, 0);//y'		//4
 	 			gl.glTexCoord2f(1f,2f);gl.glVertex3d(W*factorL, .35, 0);//
 	 			
 	 			gl.glTexCoord2f(1f,0f);gl.glVertex3d(W*factorS, .35, 0);//z
 	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorS, .35+tT, 0);//z'
 	 			gl.glTexCoord2f(0f,.5f);gl.glVertex3d(W*factorL, .35+tT, 0);//y'		//5
 				gl.glTexCoord2f(1f,.5f);gl.glVertex3d(W*factorL, .35, 0);//y
  				
	 			gl.glTexCoord2f(1f,0f);gl.glVertex3d(W*factorS, .3, L);//a
 	 			gl.glTexCoord2f(0f,0f);gl.glVertex3d(W*factorS, .3+tT, L);//a'
				gl.glTexCoord2f(0f,.5f);gl.glVertex3d(W*factorL, .3+tT, L);//b'			//6
  				gl.glTexCoord2f(1f,.5f);gl.glVertex3d(W*factorL, .3, L);//b
 	 				
 	 				
 	 			gl.glEnd();
 	 			gl.glDisable(GL2.GL_TEXTURE_2D); 
	 	
	 	 	gl.glPopMatrix();
 	 		
	 	 	drawStock(gl,glu);
	 	 	
	 	 	gl.glPushMatrix();
	 	 		gl.glTranslated(W,0,0);	//opposite side of gun
	 	 		drawStock(gl,glu);
	 	 	gl.glPopMatrix();
	 	 	
	 	 	drawStockWidth(gl, glu,W);
	 	 	
	 	 	
	 	 	gl.glPushMatrix();
 	 			gl.glTranslated(W/3,.2,L/2);
 	 			
 	 			
 	 				gl.glPushMatrix();
 	 				
 	 				if(isFiring()){
 	 					
 	 				swayGun(.15,.001);		//charging Handle kicks back if firing
 	 				gl.glTranslated(0,0,-gun);
 	 				}
 	 				
	 	 				drawChargingHandle(gl,glu,L);		//draws it no matter what
 	 				gl.glPopMatrix();
 	 			
 	 		gl.glPopMatrix();
 	 		
 	 			
 	 		//behind main
 	     	gl.glEnable(GL2.GL_TEXTURE_2D);	
 	    	famasMain1.bind();
			gl.glPushMatrix();
			//barrel
				gl.glTranslated(W*.5, .1, L);
				glu.gluCylinder(quadric, .04, .04, .1, 10,10);
				
				gl.glTranslated(0, 0,.1);
				glu.gluCylinder(quadric, .025, .025, .3, 10,10);
			
				
				gl.glTranslated(0, 0,.3);
				glu.gluCylinder(quadric, .035, .035, .125, 10,10);
			gl.glPopMatrix();
			gl.glDisable(GL2.GL_TEXTURE_2D);
		if(false){
			//muzzle flash
			gl.glColor3d(1,1,0);
			gl.glPushMatrix();
			gl.glTranslated(W/2, .08,.55+L);
			//gl.glRotated(0,1, 0,1);
			double a=40;
			double b=-270;
			//glu.gluCylinder(quadric, .015, .015, .125, 10,10);
			
			gl.glRotated(b,1, 0,0);
			gl.glRotated(a,0, 1,0);
			
			glu.gluCylinder(quadric, .015, .015, .125, 10,10);
			
			gl.glRotated(b,1, 0,0);
			gl.glRotated(a,0, 1,0);
			
			glu.gluCylinder(quadric, .015, .015, .125, 10,10);
			//gl.glRotated(a,0, 1,0);
			gl.glRotated(b,1, 0,0);
			gl.glRotated(a,0, 1,0);
			
			glu.gluCylinder(quadric, .015, .015, .125, 10,10);
			//gl.glRotated(a,0, 1,0);
			gl.glRotated(b,1, 0,0);
			gl.glRotated(a,0, 1,0);
			glu.gluCylinder(quadric, .015, .015, .125, 10,10);

			gl.glPopMatrix();
		}
			
			/*
			 * if the gun isnt in reload animation, drawBody will draw the clip
			 */
			//gl.glPushMatrix();
				if(!isReloading())
					drawClip(gl,glu,W);

			
			drawGrip(gl, glu, W, L);
		gl.glPopMatrix();
		
		
		
	}
	private void drawStock(GL2 gl,GLU glu){
	   	gl.glEnable(GL2.GL_TEXTURE_2D);	
 	    famasStock1.bind();
 	   gl.glEnable(GL2.GL_TEXTURE_GEN_S);
       gl.glEnable(GL2.GL_TEXTURE_GEN_T);
           gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
           gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
           float[] coef_s = {0f,0f,1f,0};
           gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
           float[] coef_t = {0,1f,0,0};
           gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		
 	 	gl.glPushMatrix();
 	 	gl.glBegin(GL2.GL_POLYGON);
 	 	
 	 	gl.glVertex3d(0,0,0);
 	 	//back a little[factor of .06]
 	 	gl.glVertex3d(0,0,-.06);		//1 factor
 	 	//diagnol up left
 	 	gl.glVertex3d(0,.01,-.12);	//1
 	 	//diagonal down left
 	 	gl.glVertex3d(0,-.05,-.24);	//2
 	 	//back a little
 	 	gl.glVertex3d(0,-.05,-.3);
 	 	
 	 	gl.glVertex3d(0,0,-.3);
 	 	
 	 	gl.glVertex3d(0,.2,-.3);

 	 	gl.glVertex3d(0,.2,0);
 	 	gl.glEnd();
 	 	
	     gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	     gl.glDisable(GL2.GL_TEXTURE_GEN_T);
 	 	gl.glDisable(GL2.GL_TEXTURE_2D);
 	 	
	   	gl.glEnable(GL2.GL_TEXTURE_2D);	
 	    famasStock1.bind();
 	   gl.glEnable(GL2.GL_TEXTURE_GEN_S);
       gl.glEnable(GL2.GL_TEXTURE_GEN_T);
           gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
           gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
           float[] coef_s1 = {0f,0f,1f,0};
           gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s1, 0);
           float[] coef_t1 = {0,2.5f,0,0};
           gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t1, 0);
 	 	gl.glBegin(GL2.GL_POLYGON);
 	 	//*****stock
 	 	
 	 	gl.glVertex3d(0,0,-.3);
 	 	//spot for magazine
 	 	gl.glVertex3d(0,0,-.54);	//4
 	 	//back [2.5x]
 	 	gl.glVertex3d(0,0,-.69);	//2.5
 	 	//diag bot left
 	 	gl.glVertex3d(0,-.1,-.84);	//2.5
 	 	//back half
 	 	gl.glVertex3d(0,-.1,-.87);	//.5
 	 	//up past all [.25]
 	 	gl.glVertex3d(0,.25,-.87);	//same
 	 	//forward
 	 	gl.glVertex3d(0,.25,-.36);	
 	 	//down to [.2]
 	 	gl.glVertex3d(0,.2,-.3);

 	 	
 	 	
 	 	
 	 	gl.glEnd();
 	 	
 	 	
	 			
	     gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	     gl.glDisable(GL2.GL_TEXTURE_GEN_T);
 	 	gl.glDisable(GL2.GL_TEXTURE_2D);	
	 	
		
		gl.glPopMatrix();
		
	}
	/*
	 * More Vertex calls, this one controls the thickness of the stock
	 */
	public void drawStockWidth(GL2 gl,GLU glu, double w){
	   	gl.glEnable(GL2.GL_TEXTURE_2D);	
 	    famasStock1.bind();
 	   gl.glEnable(GL2.GL_TEXTURE_GEN_S);
       gl.glEnable(GL2.GL_TEXTURE_GEN_T);
           gl.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
           gl.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
           float[] coef_s = {0f,0f,1f,0};
           gl.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, coef_s, 0);
           float[] coef_t = {0,1f,0,0};
           gl.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, coef_t, 0);
		gl.glBegin(GL2.GL_QUADS);
 	 		gl.glVertex3d(0,.2,-.3);
 	 		gl.glVertex3d(0,.2,0);
 	 		gl.glVertex3d(w,.2,0);
 	 		gl.glVertex3d(w,.2,-.3);

 	 		
	 		gl.glVertex3d(0,.2,-.3);
	 		gl.glVertex3d(0,.25,-.36);
	 		gl.glVertex3d(w,.25,-.36);
	 		gl.glVertex3d(w,.2,-.3);
	 		
	 		gl.glVertex3d(0,.25,-.36);
	 		gl.glVertex3d(0,.25,-.87);
	 		gl.glVertex3d(w,.25,-.87);
	 		gl.glVertex3d(w,.25,-.36);
	 		
	 		gl.glVertex3d(0,.25,-.87);
	 		gl.glVertex3d(w,.25,-.87);		//furthest back part of stock
	 		gl.glVertex3d(w,-.1,-.87);
	 		gl.glVertex3d(0,-.1,-.87);
	 		
	 		gl.glVertex3d(w,-.1,-.87);
	 		gl.glVertex3d(0,-.1,-.87);
	 		gl.glVertex3d(0,-.1,-.84);
	 		gl.glVertex3d(w,-.1,-.84);
	 		
	 		gl.glVertex3d(0,-.1,-.84);
	 		gl.glVertex3d(w,-.1,-.84);
	 		gl.glVertex3d(w,0,-.54);
	 		gl.glVertex3d(0,0,-.54);
	 		
	 		
	 		
			
		 	gl.glEnd();
	 		
		   	gl.glDisable(GL2.GL_TEXTURE_2D);	
	 	   gl.glDisable(GL2.GL_TEXTURE_GEN_S);
	       gl.glDisable(GL2.GL_TEXTURE_GEN_T);
	 	 	
	 	
	 		
	 		
	 		
	 
 	 	
 	 	
		
	}
	/*
	 * The hook inside of the gun
	 * It moves on its own when the gun is fired
	 */
	public void drawChargingHandle(GL2 gl, GLU glu,double L){
		double t=.0033;//translate
		
		gl.glPushMatrix();
			for(int k=0;k<10;k++){		
			gl.glColor3f(0f,0f,0f);
			gl.glBegin(GL2.GL_POLYGON);
			gl.glVertex3d(0,0,0);
			gl.glVertex3d(0,.025,0);
			gl.glVertex3d(0,.065,L/36);
			gl.glVertex3d(0,.075,L/18);
			gl.glVertex3d(0,.085,L/12);
			gl.glVertex3d(0,.084,L/12);
			gl.glVertex3d(0,.0749,(L/18));
			gl.glVertex3d(0,.02,L/36);
			gl.glVertex3d(0,.02,(L/12));
			gl.glVertex3d(0,.02,L/6);
			gl.glVertex3d(0,0,L/6);
			
			
			gl.glEnd();
			gl.glTranslated(t,0,0);
			}
		gl.glPopMatrix();
		gl.glPushMatrix();
			
			gl.glBegin(GL2.GL_LINES);
			gl.glVertex3d(0,.085,L/12);
			gl.glVertex3d(t,.085,L/12);
			gl.glEnd();
			
			
			
		gl.glPopMatrix();
		gl.glColor3f(0f,0f,0f);
			
	}
	public void drawClip(GL2 gl, GLU glu,double w){
	   	gl.glEnable(GL2.GL_TEXTURE_2D);	
 	    famasClip.bind();
 	    
 	 	gl.glPushMatrix();
 	 //	if(isReloading());
 	// 	gl.glTranslated(0,fall, 0);
 	 	gl.glBegin(GL2.GL_QUADS);
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(.001,0,-.3);
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(.001,-.2,-.3);		//.001 to avoid cliping
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(.001,-.2,-.54);
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(.001,0,-.54);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(w-.001,0,-.3);
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(w-.001,-.2,-.3);		//.001 to avoid cliping
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(w-.001,-.2,-.54);
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(w-.001,0,-.54);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(.001,0,-.54);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(.001,0,-.3);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(w-.001,0,-.3);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(w-.001,0,-.54);//bot
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(.001,-.2,-.54);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(.001,-.2,-.3);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(w-.001,-.2,-.3);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(w-.001,-.2,-.54);//top
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(.001,-.2,-.3);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(w-.001,-.2,-.3);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(w-.001,0,-.3);//front
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(.001,0,-.3);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(.001,-.2,-.54);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(w-.001,-.2,-.54);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(w-.001,0,-.54);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(.001,0,-.54);//back
 	 	gl.glEnd();
 	 	
 	 	
 	 	gl.glPopMatrix();
 	 	
 		gl.glDisable(GL2.GL_TEXTURE_2D);

	}
	/*
	 * Draws Grip
	 * adjust grip size with d and e
	 * decrease e for greater size
	 */
	public void drawGrip(GL2 gl, GLU glu,double w,double L){
		double d=7;	//farther back on the Z axis
		double e=5;
		
		double f=.06;
	   	gl.glEnable(GL2.GL_TEXTURE_2D);	
 	    famasTopB2.bind();
 	    
 	 	gl.glPushMatrix();
 	 	gl.glBegin(GL2.GL_QUADS);
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(0,0,L/e);
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(0,-.2,L/e);		
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(0,-.2,L/d);
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(0,0,L/d);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(w,0,L/e);
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(w,-.2,L/e);		
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(w,-.2,L/d);
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(w,0,L/d);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(0,0,L/d);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(0,0,L/e);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(w,0,L/e);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(w,0,L/d);//bot				L/d .54    L/e .3
 	 		gl.glColor3d(0,1,0);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(0,-.2,L/d);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(0,-.2,L/e);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(w,-.2,L/e);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(w,-.2,L/d);//top
 	 		gl.glColor3d(0,0,1);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(0,-.2,L/e);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(w,-.2,L/e);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(w,0,L/e);//front
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(0,0,L/e);
 	 		gl.glColor3d(0,0,0);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(0,-.2,L/d);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(w,-.2,L/d);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(w,0,L/d);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(0,0,L/d);//back
 	 		/*
 	 		 * u and v shrink the thickness of the trigger
 	 		 */
 	 		double v=(w*3)/4;	//w but not as thick
 	 		double u=w/4;		//0 but not as thick
 	 		double c=-.195;		//vertical thickness
 	 		//horizontal
 	 		gl.glColor3d(1,1,0);
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(v,-.2,L/e);
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(u,-.2,L/e);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(u,-.2,L/e+f);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(v,-.2,L/e+f);
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(v,c,L/e);//4
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(u,c,L/e);//1
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(u,c,L/e+f);//2
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(v,c,L/e+f);//3
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(u,c,L/e+f);//2
 	 		gl.glTexCoord2f(0f,1f);gl.glVertex3d(v,c,L/e+f);//3
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2,L/e+f);
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2,L/e+f);
 	 		//slight incline

 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(u,c,L/e+f);//2
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(v,c,L/e+f);//3
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(v,c+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(u,c+.02,L/e+(f*2.5));
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(u,-.2,L/e+f);//2
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(v,-.2,L/e+f);//3
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(v,-.2+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(u,-.2+.02,L/e+(f*2.5));
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(v,c+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(u,c+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(u,-.2+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(v,-.2+.02,L/e+(f*2.5));
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(v,-.2+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(u,-.2+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(u,-.2+.17,L/e+(f*4));
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(v,-.2+.17,L/e+(f*4));
 	 		
 	 		gl.glTexCoord2f(0f,0f);gl.glVertex3d(v,c+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(0f,2f);gl.glVertex3d(u,c+.02,L/e+(f*2.5));
 	 		gl.glTexCoord2f(2f,2f);gl.glVertex3d(u,c+.17,L/e+(f*4));
 	 		gl.glTexCoord2f(2f,0f);gl.glVertex3d(v,c+.17,L/e+(f*4));
 	 		
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.17,L/e+(f*4));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.17,L/e+(f*4));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,0,L/e+(f*4));
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,0,L/e+(f*4));
 	 		gl.glEnd();
 	 		gl.glDisable(GL2.GL_TEXTURE_2D);
 	 		
 	 		if(isFiring()){

 	 			gl.glTranslated(0,0,-.04);		//pull trigger if firing
 
 	 		}
 	 		gl.glBegin(GL2.GL_QUADS);
 	 		//trigger
 	 		gl.glColor3d(0,0,0);
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,0,L/d+(f*2));
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,0,L/d+(f*2));
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.16,L/d+(f*2));//back long
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2));
 	 		
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.16,L/d+(f*2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.15,L/d+(f*2.5));	//back slant
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.15,L/d+(f*2.5));
 	 		
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,0,L/d+(f*2.2));
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,0,L/d+(f*2.2));
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.16,L/d+(f*2.2));	//front long
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2.2));
 	 		
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.16,L/d+(f*2.2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2.2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.15,L/d+(f*2.7));	//front slant
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.15,L/d+(f*2.7));
 	 		
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.15,L/d+(f*2.7));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2.2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2));		//front and back slant V
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.15,L/d+(f*2.5));
 	 		

	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,0,L/d+(f*2.2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,0,L/d+(f*2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2));
 	 		gl.glTexCoord2f(1f,1f);gl.glVertex3d(v,-.2+.16,L/d+(f*2.2));
 	 		

 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,0,L/d+(f*2));
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,0,L/d+(f*2.2));
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.16,L/d+(f*2.2));	//front long
 	 		gl.glTexCoord2f(1f,0f);gl.glVertex3d(u,-.2+.16,L/d+(f*2));//back long


 	 		
 	 		
 	 		
 	 	gl.glEnd();
 	 	
 	 	
 	 	gl.glPopMatrix();
 	 	


	}
	
	public void returnMove(){
		move=.001;
	}
	public void returnGun(){
		gun=.001;
	}
	public double getReloadingG(){
		return reloadingG;
	}
	public double getFiringG(){
		return firingG;
	}
}
