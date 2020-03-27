import java.net.*;
import java.io.*;
class ServerTCP
{
	public static void main(String args[])
	throws Exception
	{
		ServerSocket server=new ServerSocket(Integer.parseInt(args[0]));
		Socket s=server.accept();
		InputStream is=s.getInputStream();
		int c = 0;
		String msg = ""; 
		while((c=is.read())!=-1)
			msg+=(char)c;
		System.out.println(msg);
		server.close();
	}
}