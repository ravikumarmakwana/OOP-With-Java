import java.net.*;
class Network
{
	public static void main(String args[])
	{
		try
		{
			InetAddress myip[]=InetAddress.getAllByName(args[0]);
			System.out.print("System Ip Address :\n");
			for(int i=0;i<myip.length;i++)
				System.out.println(myip[i]+" ");
			System.out.println("\nSystem Host Name : "+myip[0].getHostName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}