import java.io.*;
import java.util.*;
class CopyMoveFile
{
	public static void main(String args[])
	throws Exception
	{
		String fileName;
		Scanner key=new Scanner(System.in);
		System.out.print("Enter the Source File Name : ");
		fileName=key.next();
		File f1=new File(fileName);
		FileInputStream fis=new FileInputStream(f1);
		System.out.print("Enter the Destination File Name : ");
		fileName=key.next();
		File f2=new File(fileName);
		byte data[]=new byte[1024*2];
		FileOutputStream fos=new FileOutputStream(f2);
		System.out.println("1. Copy File ");
		System.out.println("2. Move File ");
		System.out.print("Enter the Choice : ");
		int c;
		c=key.nextInt();
		try{
			switch(c)
			{
				case 1:	while(fis.read(data)!=-1)
							fos.write(data);
						System.out.println("File is Successfully Copy.");
						fis.close();
						fos.close();
						break;

				case 2:	while(fis.read(data)!=-1)
							fos.write(data);
						fis.close();
						fos.close();
						f1.delete();
						System.out.println("File is Successfully Move.");
						break;

				case 3: System.out.println("Wrong Choice !!!");
						break;
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			fis.close();
			fos.close();
		}
	}	
}