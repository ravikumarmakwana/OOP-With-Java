import java.io.*;
class CountFive
{
	public static void main(String args[])
	throws Exception
	{
		File f=new File(args[0]);
		FileReader fr=new FileReader(f);
		int countFive=0,c;
		long l=f.length();
		System.out.println(l);
		while(l>0)
		{
			c=fr.read();
			System.out.print((char)c);
			l--;
		}
		fr.close();
//		System.out.println("Number of Occuren of Five ::"+countFive);
	}
}