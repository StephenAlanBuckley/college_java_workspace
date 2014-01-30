package Bats;
public class Fleeing implements FlyBehavior{
	private float playX, playY, playZ;
	private float batX, batY, batZ, newbatX, newbatY, newbatZ;
	private float disX, disY, disZ;
	private float distance;
	private float angle;
	private boolean attack = false;
	
	@Override
	public void setPlayer(float playX, float playY, float playZ) {
		// TODO Auto-generated method stub
		this.playX = playX;
		this.playY = playY;
		this.playZ = playZ;
	}

	@Override
	public void setBat(float batX, float batY, float batZ) {
		// TODO Auto-generated method stub
		this.batX = batX;
		this.batY = batY;
		this.batZ = batZ;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		normalize();
			newbatX = batX-1.2f*disX;
			newbatY = batY-1.2f*disY;
			newbatZ = batZ-1.2f*disZ;
			attack = false;
	}
	
	private void normalize(){
		distance = (float) Math.sqrt(((playX - batX) *  (playX - batX)) + ((playY - batY) *  (playY - batY)) + ((playZ - batZ) *  (playZ - batZ)));
		disX = (playX-batX) / distance;
		disY = (playY-batY) / distance;
		disZ = (playZ-batZ) / distance;
	}

	@Override
	public float getX() {
		// TODO Auto-generated method stub
		return newbatX;
	}

	@Override
	public float getY() {
		// TODO Auto-generated method stub
		return newbatY;
	}

	@Override
	public float getZ() {
		// TODO Auto-generated method stub
		return newbatZ;
	}

	@Override
	public float getAngle() {
		// TODO Auto-generated method stub
		angle = (float) Math.acos(disZ/distance);
	    angle = (float) Math.toDegrees(angle);
	    angle += disX*90;
	    if (disZ < 0){
	    	angle = angle*-1;
	    }
	    
		return -1* angle;
	}

	@Override
	public boolean getAttack() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int healing() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}