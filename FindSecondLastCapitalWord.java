class FindSecondLastCapitalWord
{
	public static void main(String args[])
	{
		String s=args[0];
		int l=0,k=0,p=0;
		String part[]=s.split(" ");
		for(int i=part.length-1;i>=0;i--)
		{
			for(int j=0;j<part[i].length();j++)
			{
				if(part[i].charAt(j)>=65 && part[i].charAt(j)<=90)
					l=1;
				else
				{
					l=0;
					break;
				}
			}
			if(l==1)
				p++;
			if(p==2 && l==1)
				System.out.println(part[i]);
		}
	}
}