package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import main.Game;

public class ClientSpeaker 
{
	public static ClientSpeaker currentSpeaker;
	private DatagramSocket speaker_socket;
	private InetAddress address;
	
	public ClientSpeaker()
	{
		try 
		{
			speaker_socket = new DatagramSocket();
			address = InetAddress.getByName(ListeningServer.HOST_NAME);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void sendPacket(String data)
	{
		DatagramPacket packet = new DatagramPacket(data.getBytes(), data.length(), address, ListeningServer.LISTEN_SERVER_PORT);
		trySend(packet);
		//System.out.println("Packet sent.");
	}
	
	public void sendPacket(byte[] data)
	{
		DatagramPacket packet = new DatagramPacket(data, data.length, address, ListeningServer.LISTEN_SERVER_PORT);
		trySend(packet);
	}
	
	private void trySend(DatagramPacket packet){
		try 
		{
			speaker_socket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeSocket()
	{
		speaker_socket.close();
	}
	
	public static void main(String[] args)
	{
		new ClientSpeaker().sendPacket("Hello server.");
	}
}
