class Q
{
	int n;
	boolean available=false;
	synchronized public int get()
	{
		while(available==false)
		{
			try{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Consumer  :: "+n);
		available=false;
		notify();
		return n;
	}
	synchronized public void put(int n)
	{
		this.n=n;
		while(available==true)
		{
			try{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Producer  :: "+n);
		available=true;
		notify();
	}
}
class Producer extends Thread
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			try{
				sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
				q.get();
			try{
				Thread.sleep(1500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class ProducerConsumer
{
	public static void main(String args[])
	{
		Q q=new Q();
		q.n=0;
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
	}
}