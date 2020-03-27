class OneAnagramToSecondString
{
	public static void main(String args[])
	{
		String s=args[0];
		String t=args[1];
		if(s.length()!=t.length())
		{
			System.out.println("false");
			System.exit(0);
		}
		for(int i=0;i<s.length();i++)
		{
			if(t.indexOf(s.charAt(i))==-1)
			{
				System.out.println("false");
				System.exit(0);
			}
		}
		System.out.println("true");
	}
}