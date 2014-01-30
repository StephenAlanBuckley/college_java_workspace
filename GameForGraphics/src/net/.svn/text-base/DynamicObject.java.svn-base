package net;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 * Any Object who needs to tell the network about changes to its state
 * @author Christopher
 *
 */
public abstract class DynamicObject {
	static int nextID = 0;
	String type;
	String objHash;
	
	
	public DynamicObject() {
		objHash = HandshakeClient.getIDFromServer() + nextID++;
	}
	
	public DynamicObject(String objHash) {
		this.objHash = objHash;
	}
	
	/**
	 * This will have to be called any time a public change in state occurs
	 * Actions should probably be created using a factory pattern
	 * @param action
	 */
	void sendAction(Action action){
		action.setOwner(objHash);
		String packet = type + "|" + action.packetize();
		DynamicObjectEncoder.speaker.sendPacket(packet);
	}
	
	abstract void discoverAction(String act, StringTokenizer in);
	/**
	 * Will typically send all possible actions to set state.
	 * @param state from TCP
	 */
	abstract void setState(StringTokenizer in);
	/**
	 * This will send a group of actions required to send all info on an object
	 * @return State of the object e.g. location, speed, direction, health, etc
	 */
	abstract void sendCurrentState();
	
	public abstract void draw(GL2 gl, GLU glu, GLUquadric quadric);
	
	void runAction(Action act, StringTokenizer in){
		act.decode(in);
	}
	
}
