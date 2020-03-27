class TypeWriter extends Thread
{
	String msg;
	TypeWriter(String msg)
	{
		this.msg=msg;
		Thread t= new Thread(this);
		t.start();
	}
	public void run()
	{
		int length=msg.length();
		try
		{
			for(int i=0;i<length;i++)
			{
				System.out.print(msg.charAt(i));
				sleep(400);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	public static void main(String args[])
	{
		TypeWriter tw=new TypeWriter(args[0]);
	}
}