class FindCapatialWord
{
	public static void main(String args[])
	{
		String s=args[0];
		int l=0;
		String part[]=s.split(" ");
		for(int i=0;i<part.length;i++)
		{
			l=0;
			for(int j=0;j<part[i].length();j++)
			{
				if(part[i].charAt(j)>= 65 && part[i].charAt(j)<= 90)
					l=1;
				else
				{
					l=0;
					break;
				}
			}
			if(l==1)
				System.out.println(part[i]);
		}
	}
}