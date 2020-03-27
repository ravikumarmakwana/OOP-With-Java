public class Anagram
{
	/**
			java Anagram "String1" "String2" <br/>
			"String1": Any String<br/>
			"String2": Any String<br/>
			i.e. java Anagram ravi avir
	**/
	public static void main(String args[])
	{
		if(args.length != 2)
		{
			System.out.println("Invalid Argument");
			System.out.println("java Anagram <String1> <String2>");
			System.out.println("<String1>: First String");
			System.out.println("<String2>: Second String");
			System.out.println("i.e. java Anagram ravi iavr");
			System.exit(0);
		}
		String s1=new String(args[0]);
		String s2=new String(args[1]);

		if(s1.length()!=s2.length())
		{
			System.out.println("Given String is Not Anagram Strings.");
			System.exit(0);
		}
		int l=s1.length();
		for(int i=0;i<l;i++)
		{
			if(!(s2.indexOf(s1.charAt(i))!=-1 && s1.indexOf(s2.charAt(i))!=-1))
			{
				System.out.println("Given String is Not Anagram	Strings.");
				System.exit(0);
			}
		}
		System.out.println("Given String is Anagram Strings");
	}
}