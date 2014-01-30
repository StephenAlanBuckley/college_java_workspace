package Movement;

import Buildings.Point3D;

public class Eye {
	private Point3D point;
	private float direction = -90; // degrees
	private float tilt = 0;
	private float stepSize = 3;
	private float defaultStepSize = 3;
	private float originalStepSize;
	public static float sensitivity = 1.0f;
	private boolean zoomed = false;
	private double initialHeight;

	public Eye(double x, double y, double z) {
		point = new Point3D(x, y, z);
		initialHeight = y;
	}

	public Eye(Point3D point) {
		this.point = point;
	}

	public void addToX(double dx) {
		point.addToX(dx);
	}

	public void addToY(double dy) {
		point.addToY(dy);
	}

	public void addToZ(double dz) {
		point.addToZ(dz);
	}

	public void addToTilt(float dt) {
		setTilt(sensitivity * (tilt + dt));
	}

	public void addToDirection(float dd) {
		direction = sensitivity * (direction + dd);
	}

	public void moveForward() {
		addToX(+stepSize * Math.cos(Math.toRadians(direction)));
		addToZ(-stepSize * Math.sin(Math.toRadians(direction)));
	}

	/*
	 * public void strafeLeft(){
	 * addToX(+stepSize*Math.cos(Math.toRadians(direction+90)));
	 * addToZ(-stepSize*Math.sin(Math.toRadians(direction+90))); }
	 */

	public void strafeRight() {
		addToX(+stepSize * Math.cos(Math.toRadians(direction - 90)));
		addToZ(-stepSize * Math.sin(Math.toRadians(direction - 90)));
	}

	/*
	 * public void moveBackwards(){
	 * addToX(-stepSize*Math.cos(Math.toRadians(direction)));
	 * addToZ(+stepSize*Math.sin(Math.toRadians(direction))); }
	 */

	public Point3D getPoint() {
		return point;
	}

	public double getX() {
		return point.getX();
	}

	public double getY() {
		return point.getY();
	}

	public double getZ() {
		return point.getZ();
	}

	public void setX(double x) {
		point.setX(x);
	}

	public void setY(double y) {
		point.setY(y);
	}

	public void setZ(double z) {
		point.setZ(z);
	}

	public void setPoint(Point3D point) {
		this.point = point;
	}

	public float getDirection() {
		return direction;
	}

	public void setDirection(float direction) {
		this.direction = direction;
	}

	public float getTilt() {
		return tilt;
	}

	public void setTilt(float tilt) {
		if (Math.abs(tilt) < 85)
			this.tilt = tilt;
	}

	public float getStepSize() {
		return stepSize;
	}

	public void setStepSize(float stepSize) {
		this.stepSize = stepSize;
	}

	public void returnToDefault() {
		stepSize = originalStepSize;
	}

	public void setOriginalStepSize(int stepSize) {
		originalStepSize = stepSize;
	}
	
	public void setOriginalHeight()
	{
		this.setY(initialHeight);
	}	

	/*
	 * use the x, y, z position and the direction and tilt angles to map the
	 * "look at" point onto a unit sphere centered at the player's head
	 */
	public double getLookX() {
		return getX() + Math.cos(Math.toRadians(getDirection()))
				* Math.cos(Math.toRadians(getTilt()));
	}

	public double getLookZ() {
		return getZ() - Math.sin(Math.toRadians(getDirection()))
				* Math.cos(Math.toRadians(getTilt()));
	}

	public double getLookY() {
		return getY() + Math.sin(Math.toRadians(getTilt()));
	}

	public float getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(float sensitivity) {
		this.sensitivity = sensitivity;
	}

	// GOING TO NEED A MORE INTUITIVE WAY OF DOING THIS
	// public void zoom(){
	// if(!zoomed){
	// addToX(+30*Math.cos(Math.toRadians(direction)));
	// addToZ(-30*Math.sin(Math.toRadians(direction)));
	// zoomed=true;
	// }
	// else{
	// addToX(-30*Math.cos(Math.toRadians(direction)));
	// addToZ(+30*Math.sin(Math.toRadians(direction)));
	// zoomed=false;
	// }
	// }

}
