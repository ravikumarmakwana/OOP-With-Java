class Printer
{
	public void print(String msg)
	{	
		System.out.print("[ ");
		try{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.print(msg);
		System.out.print(" ]");
		System.out.println();
	}
}

class User extends Thread
{
	Printer p;
	String printJob;
	User(Printer p,String printJob)
	{
		this.p=p;
		this.printJob=printJob;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(p)
		{
			p.print(printJob);
		}
	}
}

class PrettyPrinter
{
	public static void main(String args[])
	{
		Printer p=new Printer();
		User u1=new User(p,"Print Section 1");
		User u2=new User(p,"Print Section 2");
		User u3=new User(p,"Print Section 3");
		User u4=new User(p,"Print Section 4");
		User u5=new User(p,"Print Section 5");
	}
}