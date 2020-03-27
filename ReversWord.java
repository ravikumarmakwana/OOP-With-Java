public class ReversWord
{
	/**
			java ReversWord "String"<br/>
			"String" : Any String<br/>
			i.e. java ReversWord "I am Computer"<br/>
	**/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Invalid Argument");
			System.out.println("java ReversWord <String>");
			System.out.println("<String> : Any String ");
			System.out.println("i.e. java ReversWord \"I am Computer\" ");
			System.exit(0);
		}
		StringBuffer s=new StringBuffer(args[0]);
		s.reverse();
		String s1=new String(s);
		String part[]=s1.split(" ");
		String reversString=new String();
		for(int i=0;i<part.length;i++)
		{
			StringBuffer p=new StringBuffer(part[i]);
			reversString += p.reverse() + " ";
		}
		System.out.println("Revers Word : ");
		System.out.println(reversString);
	}
}