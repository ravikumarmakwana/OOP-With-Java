import java.io.*;
class FileDirCount
{
	public static void main(String args[])
	throws Exception
	{
		try{
		int fileCount=0,directoryCount=0;
		File f=new File(args[0]);
		if(f.isDirectory())
		{
			String[] object=f.list();
			for(int i=0;i<object.length;i++)
			{
				File temp=new File(object[i]);
				if(temp.isFile())
					fileCount++;
				if(temp.isDirectory())
					directoryCount++;
			}
			System.out.println("Number of Files :: "+fileCount);
			System.out.println("Number of Directory :: "+directoryCount);
		}
		else
		{
			System.out.println("There are no surch Directory !!");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}	
}