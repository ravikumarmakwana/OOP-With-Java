import java.net.*;
import java.io.*;
import java.util.*;
class InetAddressDemo
{
	public static void main(String args[])
	throws Exception 
	{
		InetAddress i[]=InetAddress.getAllByName(args[0]);
		int l=i.length;
		for(int k=0;k<l;k++)
			System.out.println(i[k]);
	}
}