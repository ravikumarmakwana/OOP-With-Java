class PrimeNumber
{
	public static void main(String args[])
	{
		int number=Integer.parseInt(args[0]);
		int i=1,c;
		while(number>0)
		{
			c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c=0;
					break;
				}
				else
					c=1;
			}
			if(i==2)
			{
				System.out.println(i);
				number=number-1;
			}
			if(c==1)
			{
				System.out.println(i);
				number=number-1;
			}
			i++;
		}
	}
}