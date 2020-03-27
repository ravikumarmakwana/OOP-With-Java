public class CheckAnagram
{
	/**
			java CheckAnagram "String"<br/>
			"String " : Any String<br/>
			i.e. java CheckAnagram "Engineering"<br/>
	**/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Invalid Argument");
			System.out.println("java CheckAnagram <string>");
			System.out.println("<string> : Any String ");
			System.out.println("i.e. java CheckAnagram \"Engineering\"");
			System.exit(0);
		}
		String list="Ravi Makwana Kumar Vvp Engineering Hello College Rajkot Computer Department";
		String part[]=list.split(" ");
		
		for(int k=0;k<part.length;k++)
		{
			
			StringBuffer s1=new StringBuffer(part[k]);
			StringBuffer s2=new StringBuffer(args[0]);
			char ch;
			int l=0,p=1;
			for(int i=0;i<s1.length();i++)
			{
				l=0;
				ch=s1.charAt(i);
				for(int j=0;j<s2.length();j++)
				{
					if(ch==s2.charAt(j))
					{
						s2.setCharAt(j,' ');
						l=1;
						break;
					}
				}
				if(l==1)
				{
					s1.setCharAt(i,' ');
					p=1;
				}
				else
				{
					p=0;
					break;
				}
			}
			if(p==1)
			{
				System.out.println(part[k]);
				System.exit(0);
			}
		}
		System.out.println("Your Spaling not Directonary");
	}
}