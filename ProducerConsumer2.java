class Q
{
	int n[]=new int[5];
	int ip=-1,ic=-1;
	
	synchronized int get(String cName)
	{    
		if(ic==-1)
		{
			try{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		int y=n[ic];
		notifyAll();
		System.out.println(cName +" :: "+y);
		if(ic==ip)
		{
			ic=ip=-1;
		}
		else
		{
			if(ic==4)
				ic=0;
			else
				ic++;
		}
		return y;
	}
	synchronized void put(int no,String pName)
	{
		if((ic==ip+1) || (ic==0 && ip==4))
		{
			try{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		if(ip==-1)
		{
			ip=ic=0;
		}
		else
		{
			if(ip==4)
				ip=0;
			else
				ip++;
		}
		n[ip]=no;
		notifyAll();
		System.out.println(pName +" :: "+no);
	}
}
class Producer extends Thread
{
	Q q;
	String pName;
	Producer(Q q,String pName)
	{
		this.pName=pName;
		this.q=q;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++,pName);
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
	String cName;
	Consumer(Q q,String cName)
	{
		this.cName=cName;
		this.q=q;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
				q.get(cName);
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
class ProducerConsumer2
{
	public static void main(String args[])
	{
		Q q=new Q();
		Producer p1=new Producer(q,"Producer1");
		Producer p2=new Producer(q,"Producer2");
		Consumer c1=new Consumer(q,"Consumer1");
		Consumer c2=new Consumer(q,"Consumer2");
	}
}