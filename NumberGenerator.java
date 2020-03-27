class Player
{
	public synchronized void play(int n)
	{
		try{
			for(int i=n;i<n+10;i++)
			{
				System.out.print(i+" ");
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class NumberGenerator extends Thread
{
	Player p;
	int n;
	NumberGenerator(int n,Player p)
	{
		this.p=p;
		this.n=n;
		Thread t=new Thread(this);
	}
	public void run()
	{
		p.play(n);
	}
	public static void main(String args[])
	throws Exception
	{
		Player p=new Player();
		NumberGenerator n1=new NumberGenerator(1,p);
		n1.start();
		n1.join();
		NumberGenerator n2=new NumberGenerator(11,p);
		n2.start();
		n2.join();
		NumberGenerator n3=new NumberGenerator(21,p);
		n3.start();
		n3.join();
		NumberGenerator n4=new NumberGenerator(31,p);
		n4.start();
		n4.join();
		NumberGenerator n5=new NumberGenerator(41,p);
		n5.start();
		n5.join();
	}
}