import java.io.*;
class ByteStream
{
	public static void main(String args[])
	throws Exception
	{
		File f1=new File(args[0]);
		File f2=new File(args[1]);
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos=new FileOutputStream(f2);
		int b;
		while((b=fis.read())!=-1)
		{
			fos.write(b);
		}
		fis.close();
		fos.close();
	}	
}