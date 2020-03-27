import java.net.*;
import java.io.*;
class ClientUDP
{
	public static void main(String args[])
	throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		String msg=args[1]; 
		InetAddress ip=InetAddress.getByName(args[0]);
		DatagramPacket client=new DatagramPacket(msg.getBytes(),msg.length(),ip,Integer.parseInt(args[2]));
		ds.send(client);
		ds.close();
	}
}