import java.net.*;
import java.io.*;
class ClientTCP
{
	public static void main(String args[])
	throws Exception
	{
		Socket client=new Socket(args[0],Integer.parseInt(args[1]));
		String msg=args[2];
		OutputStream os=client.getOutputStream();
		os.write(msg.getBytes());
		client.close();
	}
}