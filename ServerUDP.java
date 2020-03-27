import java.net.*;
import java.io.*;
class ServerUDP
{
	public static void main(String args[])
	throws Exception
	{
		DatagramSocket server=new DatagramSocket(Integer.parseInt(args[0]));
		byte []data=new byte[1024*10];
		DatagramPacket dp=new DatagramPacket(data,1024);
		server.receive(dp);
		String s=new String(dp.getData(),0,dp.getLength());
		System.out.println(s);
		server.close();
	}
}