class GooglePalindrome
{
	public static void main(String args[])
	{
		String s=args[0];
		s=s.toLowerCase();
		String m=new String();
		for(int i=0;i<s.length();i++)
		{
			if(97<=s.codePointAt(i) && s.codePointAt(0)<=122)
				m+=s.charAt(i);
		}
		StringBuffer n=new StringBuffer(m);
		n.reverse();
		if(n.indexOf(m)!=-1)
			System.out.println("true");
		else
			System.out.println("false");
	}	
}