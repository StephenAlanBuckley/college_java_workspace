// Sound test
// William Ames Fall 2010
package main;
import java.applet.*;
import java.net.*;

public class Sounds
{
	private boolean soundOn;
	public AudioClip gunshot;
	
	public int current =1;
	
	public AudioClip soundtrack;
	public AudioClip secondTrack;
	public AudioClip thirdTrack;
	
	public AudioClip turret;
	public AudioClip wilhelm;
	
	public AudioClip powerup;
	public AudioClip health;
	public AudioClip star;
	public AudioClip freeze;

	public Sounds(){
		soundOn = true;
		 gunshot = FileHelper.getAudioClip("famasFire1.wav");
		 soundtrack = FileHelper.getAudioClip("soundtrack.wav");
		 turret = FileHelper.getAudioClip("turret.wav");
		 wilhelm = FileHelper.getAudioClip("wilhelm.wav");
		 powerup = FileHelper.getAudioClip("powerup.wav");
		 health = FileHelper.getAudioClip("Health.wav");
		 star = FileHelper.getAudioClip("Star.wav");
		 freeze = FileHelper.getAudioClip("freeze.wav");
		 secondTrack = FileHelper.getAudioClip("InDaClub.wav");
		 thirdTrack = FileHelper.getAudioClip("BusinessTime.wav");

		 soundtrack.loop();
		
	}

	public void endSounds(){
		soundtrack.stop();
	}
	
	//DO NOT DELETE!
	public void toggleSound(){
		if(soundOn){
			soundtrack.stop();
			soundOn=false;
		}
		else{
			soundtrack.loop();
			soundOn=true;
		}
	
	}
	
	public void switchTrack(){
		if(current ==1){
			current =2;
			soundtrack.stop();
			secondTrack.loop();
		}else if(current ==2){
			current =3;
			secondTrack.stop();
			thirdTrack.loop();
		}else if(current ==3){
			current =1;
			thirdTrack.stop();
			soundtrack.loop();
		}
	}

}