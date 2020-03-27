class StringOfHtml
{
	/**
			java StringOfHtml "String"<br/>
			"String" : HTML Document Line<br/>
			i.e. java StringOfHtml "<a href= >Click<span> Here</span></a>"<br/>
	**/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Invalid String");
			System.out.println("java StringOfHtml <String>");
			System.out.println("<String>: HTML Document Line");
			System.out.println("i.e. java StringOfHtml \"<a href= >Click<span> Here</span></a>\"");
			System.exit(0);
		}
		String s=args[0];
		String Ans="";
		int k;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='>' && i< s.length()-1)
			{
				k=i+1;
				while(s.charAt(k)!='<')
				{
					Ans+=s.charAt(k);
					k++;
				}
			}
		}
		System.out.println(Ans);
	}
}