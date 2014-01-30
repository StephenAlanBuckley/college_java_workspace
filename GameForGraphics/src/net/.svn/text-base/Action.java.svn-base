package net;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.*;

/**
 * The Action Class should be extended by classes that keep track of data that will need to be known by all clients
 * @author Christopher
 * Examples of such data is ObjectMove (or ObjectNewLocation) and ObjectHealthChange (which either contains a new health or a decrement or increment
 */
public abstract class Action {
	String objectHash;
	DynamicObject parent;
	String type;
	
	Action(DynamicObject parent){
		this.parent = parent;
	}
	
	/**
	 * 
	 * @param objHash A network unique object hash that will be used to keep track of all objects in the world
	 * @return 
	 */
	public void setOwner(String objHash){
		objectHash = objHash;
	}
	
	
	/**
	 * This will encode the data into a 'compressed' format for transport over the network;
	 * @return Byte[] packet
	 * @throws IOException 
	 */
	String packetize(){
		return type + "|" + objectHash + "|" + encode();
	}
	/**
	 * Inheriting class must call this to send data.
	 * @param out
	 * @throws IOException 
	 */
	abstract String encode();
	
	abstract void decode(StringTokenizer in);
	
	double nextDouble(StringTokenizer in){
		return Double.parseDouble(in.nextToken());
	}
	
}
