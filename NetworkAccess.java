import java.net.*;
import java.io.*;
import java.util.*;
class NetworkAccess
{
	public static void main(String args[])
	throws Exception	
	{
		Socket homePage=null;
		try{
		homePage=new Socket(args[0],Integer.parseInt(args[1]));
		OutputStream os=homePage.getOutputStream();
		os.write("GET / HTTP/1.1\n\r\n\r".getBytes());
		InputStream is=homePage.getInputStream();
		int c = 0;
		String msg = ""; 
		while((c=is.read())!=-1)
			msg+=(char)c;
		System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			homePage.close();
		}
	}	
}
