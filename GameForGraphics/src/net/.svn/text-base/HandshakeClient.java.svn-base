package net;
import java.net.*;
import java.io.*;

public class HandshakeClient 
{
	private static String id = null;
	
	public static String getIDFromServer()
	{
		if(id==null){
			Socket echoSocket = null;
			BufferedReader in = null;
			try {
				echoSocket = new Socket(HandshakeServer.hostname, HandshakeServer.port);
				in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
				id = in.readLine(); //does this work? -Chris
				in.close();
				echoSocket.close();
			} catch (UnknownHostException e) {
				System.err.println("Don't know about host: cslab.bc.edu");
				System.err.println(e);
				System.exit(1);
			} catch (IOException e) {
				System.err.println("Couldn't get I/O for the connection to: cslab.bc.edu");
				System.err.println(e);
				e.printStackTrace();
				System.exit(1);
			}
		}	
		return id;
	}
}
