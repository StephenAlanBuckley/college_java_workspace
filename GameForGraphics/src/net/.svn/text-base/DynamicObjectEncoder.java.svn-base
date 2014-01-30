package net;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import Buildings.Point3D;

//This is currently a skeleton class - will eventually be used by the datatype used over the network
//DynamicObject: the interface that every dynamic object will be forced to implement
public class DynamicObjectEncoder
{
	private String raw_data;
	public static Map<String, DynamicObject> dataMap = Collections.synchronizedMap(new HashMap<String, DynamicObject>());
	public static ClientSpeaker speaker;
	
	/*
	public void encodeAndAppend(DynamicObject data)
	{
		This is the simpler method. Takes a DynamicObject, encodes it, and appends it to the 
		raw_data string so that it can be easily packed into a packet. A client will use this to send data
		to the server.
	}
	*/
	
	/*
	public HashMap<String, DynamicObject> applyEncodedData(HashMap<String, DynamicObject> current, String data)
	{
		This will be the most important method of the class. Takes encoded DynamicObject and applies it to a 
		HashMap, returning the resulting HashMap (which will then be drawn by the client). A client will use this
		to interpret the data it receives from the server
	}
	*/
	
	public byte[] getBytes()
	{
		return raw_data.getBytes();
	}
	
	public int getLength()
	{
		return raw_data.length();
	}
	
	public static String toPacket(String type, String action, String id, Point3D location)
	{
		return type+"|"+"|"+action+"|"+id+"|"+location.getX()+"|"+location.getY()+"|"+location.getZ();
	}
	
	public static String getID(String info)
	{
		StringTokenizer st = new StringTokenizer(info, "|");
		return st.nextToken();
	}
	
	public static Point3D getLocation(String info)
	{
		StringTokenizer st = new StringTokenizer(info, "|");
		st.nextToken();
		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		double z = Double.parseDouble(st.nextToken());
		return new Point3D(x, y, z);
	}
	
	public static void processIncomingData(String data){
		//Create Tokenizer
		StringTokenizer in = new StringTokenizer(data, "|");
		//Find out what object to poke
		String objType = in.nextToken();
		String actType = in.nextToken();
		String objID = in.nextToken();
		if(objType.equals("moveable")){
			processObjects(objID, new MoveableDynamicObj(objID), actType, in);
		}else if(objType.equals("vehicle")){
			//Not Created Yet look at above to implement
		}else{
			System.out.println("Unrecognized Object Received");
		}
	}
	
	private static void processObjects(String objID, DynamicObject newObj, String act, StringTokenizer tokens){
		//dataMap = new HashMap<String, DynamicObject>();
		if( dataMap.containsKey(objID)){
			updateInMap(objID, act, tokens);
		}else{
			addToMap(objID, newObj); //If Object already exists don't worry it will get garbage collected
			updateInMap(objID, act, tokens);
		}

	}
	
	private static void addToMap(String objID, DynamicObject newObj){
		dataMap.put(objID, newObj);
	}
	
	private static void updateInMap(String objID, String act, StringTokenizer tokens){
		dataMap.get(objID).discoverAction(act, tokens);
	}
}
