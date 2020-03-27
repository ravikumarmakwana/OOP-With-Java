import java.io.*;
class PrintMyProgram
{
	public static void main(String args[])
	throws Exception
	{
		File f=new File("G:/Java/Ravi.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int c;
		while((c=br.read())!=-1)
		{
			System.out.print((char)c);
		}
		br.close();
	}
}