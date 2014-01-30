package net;
import java.net.*;
import java.io.*;

public class HandshakeServer extends Thread
{
	public static final int port = 8765;
	public static final String hostname = "cs.bc.edu";
	private static String id = "A";
	ServerSocket serverSocket;
	public HandshakeServer()
	{
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.err.println("Could not listen on port: 5000.");
			System.exit(1);
		}
	}
	
	public void run()
	{
		while(true)
		{
			Socket clientSocket = null;
			try {
				clientSocket = serverSocket.accept();
				System.out.println("Got a connection.");
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				String outputLine = id;
				nextID();
				out.println(outputLine);
				out.close();
        		clientSocket.close();
			}  catch (IOException e) {
				System.err.println("Accept failed.");
				System.exit(1);
			}
		}
	}
	
	public static void nextID()//I like this
	{
		if(id.endsWith("Z"))
			id.concat("A");
		else
		{
			int end = (id.charAt(id.length()-1)+1);
			char newEnd = (char) end;
			id = id.substring(0, id.length()-1)+newEnd;
		}
	}
	
	public static String getUID(){
		return id;
	}
	
	public static void main(String[] args)
	{
		new HandshakeServer().run();
	}
}
