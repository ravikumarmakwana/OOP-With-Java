public class BasicCalculate
{
	/**
		java BasicCalculate value1 operator value1<br/>
		value1   : Any Number<br/>
		operator : Arithmetic Operator<br/>
		value2   : Any Number<br/>
		For Example:java BasicCalculate 1 + 3<br/>
	**/
	public static void main(String args[])
	{
		if(args.length!=3)
		{
			System.out.println("Invalid Argument");
			System.out.println("i.e. java BasicCalculate <value1> <operator> <value1>");
			System.out.println("<value1> : Any Number");
			System.out.println("<operator> : Arithmetic Operator ");
			System.out.println("<value2> : Any Number");
			System.out.println("For Example:java BasicCalculate 1 + 3");
			System.exit(0);
		}
		int a=Integer.parseInt(args[0]);
		String Op=args[1];
		char ch=Op.charAt(0);
		int b=Integer.parseInt(args[2]);
		switch(ch)
		{
			case '+' :  System.out.println("Ans: "+(a+b));
						break;
			case '-'  :  System.out.println("Ans: "+(a-b));
						break;
			case '*' :  System.out.println("Ans: "+(a*b));
						break;
			case '/'  :  System.out.println("Ans: "+(a/b));
						break;
			case '%':  System.out.println("Ans: "+(a%b));
						break;
		}
	}
}