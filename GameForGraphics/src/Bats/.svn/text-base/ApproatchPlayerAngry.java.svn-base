package Bats;
public class ApproatchPlayerAngry implements FlyBehavior{

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
		if(distance > 10) {
			newbatX = batX + (0.6f*disX);
			newbatY = batY + (0.6f*disY);
			newbatZ = batZ + (0.6f*disZ);
			attack = false;
		} else {
			attack = true;
		}
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
	public boolean getAttack() {
		// TODO Auto-generated method stub
		return attack;
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
	    
		return angle;
	}

	@Override
	public int healing() {
		return 0;
	}
	
}