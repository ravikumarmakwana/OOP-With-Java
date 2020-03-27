import java.io.*;
class CountFiveDigit
{
	public static void main(String args[])
	throws Exception 
	{
		File f=new File("G:/Java/CountFiveDigit.java");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.print(s);	
		}
		br.close();
	}
}