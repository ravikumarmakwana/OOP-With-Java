import java.util.*;
class Printer
{
	public synchronized void printSection(String msg)
	{
		try
		{
			System.out.print("[ ");
			Thread.sleep(400);
			System.out.print(msg);
			System.out.print(" ]");
			System.out.println();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class ThreadProgramming extends Thread
{
	String msg;
	Printer p;
	ThreadProgramming(Printer p,String msg)
	{
		this.p=p;
		this.msg=msg;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		p.printSection(msg);
	}
	public static void main(String args[])
	{
		Printer p=new Printer();
		ThreadProgramming t1=new ThreadProgramming(p,"Section 1");
		ThreadProgramming t2=new ThreadProgramming(p,"Section 2");
		ThreadProgramming t3=new ThreadProgramming(p,"Section 3");
		ThreadProgramming t4=new ThreadProgramming(p,"Section 4");
		ThreadProgramming t5=new ThreadProgramming(p,"Section 5");
	}
}