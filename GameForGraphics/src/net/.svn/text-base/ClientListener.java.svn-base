package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.HashMap;
import java.util.Map;

import Buildings.Point3D;

import main.Game;

public class ClientListener extends Thread 
{
	private MulticastSocket recv_socket;
	private InetAddress group;
	private Game game;
	private Map<String, VisualPlayer> map;
	private Map<String, DynamicObject> dataMap;
	
	public ClientListener(Game game)
	{
		super("ClientListener");
		this.game = game;
		map = game.getOnlinePlayers();
		dataMap = game.getOnlineObjects();
		DynamicObjectEncoder.dataMap = dataMap;
		DynamicObjectEncoder.speaker = game.speaker;
		
		try 
		{
			recv_socket = new MulticastSocket(BroadcastServer.CLIENT_LISTEN_PORT);
			group = InetAddress.getByName(BroadcastServer.HOST);
			recv_socket.joinGroup(group);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		while(true)
		{
			try 
			{
				byte[] buf = new byte[1000];
				DatagramPacket received = new DatagramPacket(buf, buf.length);
				recv_socket.receive(received);
				String info = new String(received.getData(), 0, received.getLength());
				//System.out.println("Client received data: "+info);
				//String id = DynamicObjectEncoder.getID(info);
				DynamicObjectEncoder.processIncomingData(info);
				/*
				Point3D location = DynamicObjectEncoder.getLocation(info);
				
				if(!map.containsKey(id))
					map.put(id, new VisualPlayer(location));
				else
					map.get(id).updateLocation(location);
				game.updateOnlinePlayers(map);
				*/
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	public static void main(String[] args)
	{
		new ClientListener(null).run();
	}
}
