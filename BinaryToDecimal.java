class BinaryToDecimal
{
	public static void main(String args[])
	{
		int a,sum,l,i;
		int number=Integer.parseInt(args[0]);
		int conversionType=Integer.parseInt(args[1] );
		if(conversionType==1)
		{	
			l=1;
			sum=0;
			while(number>0)
			{
				a=number%10;
				sum=sum+a*l;
				l=l*2;
				number=number/10;
			}
			System.out.println("Binary To Decimal :"+sum);
		}
		else
		{
			i=0;
			int arr[]=new int[10];
			while(number>0)
			{
				a=number%2;
				arr[i]=a;
				number=number/2;
				i++;
			}
			System.out.println("Decimal To Binary :");		
			for(int p=i-1;p>=0;p--)	
				System.out.print(arr[p]);
		}
	}
}	