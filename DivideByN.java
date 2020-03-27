class DivideByN
{
	/**
	java DivideByN "numberToDivide" "number1" "number2"<br/>
	"numberToDivide": Any number<br/>
	"number1": Any number<br/>
	"number2": Any number<br/>
	i.e. java DivideByN 2 1 10
	**/
	public static void main(String args[])
	{
		if(args.length!=3)
		{
			System.out.println("Invalid arguments");
			System.out.println("java DivideByN <numberToDivide> <number1> <number2>");
			System.out.println("<numberToDivide>:  Any number");
			System.out.println("<number1>:  Any number");
			System.out.println("<number2>:  Any number");
			System.out.println("i.e. java DivideByN 2 1 10");
			System.exit(0);
		}
		int numberToDivide=Integer.parseInt(args[0]);
		int number1=Integer.parseInt(args[1]);
		int number2=Integer.parseInt(args[2]);
		for(int i=number1;i<=number2;i++)
		{
			if(i%numberToDivide==0)
				System.out.println(i);
		}
	}
}