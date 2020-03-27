class CommonPrefix
{
	public static void main(String args[])
	{
		int l=args.length,k=0;
		String prefix="";
		for(int i=0;i<args[0].length();i++)
		{
			char c=args[0].charAt(i);
			for(int j=1;j<l;j++)
			{
				if(args[j].charAt(i)!=c)
				{
					k=1;
					break;
				}
			}
			if(k==0)
				prefix+=c;
			else
				break;	
		}	
		System.out.println(prefix);
	}
}