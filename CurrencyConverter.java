 public class CurrencyConverter
{
	/**
	java CurrencyConverter "currency" "currencyTpye" <br/>
	"currency" : Value of Currency <br/>
	"currencyTpye" : Type of Currency <br/>
	1. USD to INR <br/>
	2. INR to USD <br/>
	i.e. java CurrencyConverter 10 1 <br/>
	
	**/
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Invalid Argument");
			System.out.println("java CurrencyConverter <Currency> <currencyTpye>");
			System.out.println("<currency> : Value of Currency");
			System.out.println("<currencyTpye> : \n 1. USD to INR\n 2. INR to USD");
			System.out.println("i.e. java CurrencyConverter 10 1");
			System.exit(0);
		}
		float currency=Float.parseFloat(args[0]);
		float rate=70;
		int currencyTpye=Integer.parseInt(args[1]);
		if (currencyTpye==1)
			System.out.println("$ "+currency +" = "+  (currency*rate) +" INR");
		else
		 	System.out.println("INR "+currency + " = " +(currency/rate)+ " USD");
	}
}