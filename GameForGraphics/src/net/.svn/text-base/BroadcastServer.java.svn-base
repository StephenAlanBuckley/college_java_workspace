package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class BroadcastServer
{
	private static final int BROADCAST_SERVER_PORT = 8766;
	public static final int CLIENT_LISTEN_PORT = 4445;
	public static String HOST = "235.5.5.5";
	private DatagramSocket broadcast_socket;
	private InetAddress group;
	
	public BroadcastServer()
	{
		try
		{	
			broadcast_socket = new DatagramSocket(BROADCAST_SERVER_PORT);	
			group = InetAddress.getByName(HOST);
		} catch(SocketException e)
		{	
			e.printStackTrace();	
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void broadcastData(String info) 	//This String will eventually be a datatype that we create
	{
		DatagramPacket packet = new DatagramPacket(info.getBytes(), info.length(), group, CLIENT_LISTEN_PORT);
		try 
		{
			broadcast_socket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Server broadcasted info: "+info);
	}
}
