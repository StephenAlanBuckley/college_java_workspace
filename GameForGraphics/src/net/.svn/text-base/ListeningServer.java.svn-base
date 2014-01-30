package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListeningServer extends Thread 
{
	private DatagramSocket recv_socket;
	private BroadcastServer b_server;
	public static final int LISTEN_SERVER_PORT = 4442;
	public static final String HOST_NAME = "cs.bc.edu";
	
	public ListeningServer(BroadcastServer b_server)
	{
		super("ListeningServer");
		try 
		{
			recv_socket = new DatagramSocket(LISTEN_SERVER_PORT);
			this.b_server = b_server;
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		while(true)
		{			
			try 
			{
				byte[] buf = new byte[256];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				recv_socket.receive(packet);
				String info = new String(packet.getData(), 0, packet.getLength());
				//System.out.println("ListeningServer received info: "+info);
				b_server.broadcastData(info);
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
	
	public static void main(String[] args)
	{
		BroadcastServer b = new BroadcastServer();
		new ListeningServer(b).run();
	}
}
