interface Interest
{
	public void interest(int noOfYear,int principal,double rate);
}
class SimpleInterest implements Interest
{
	public void interest(int noOfYear,int principal,double rate)
	{
		System.out.println("Simple Interest : "+ (noOfYear*principal*rate)/100);
	}
}
class CompoundInterest implements Interest
{
	public void interest(int noOfYear,int principal,double rate)
	{
		System.out.println("Compound Interest : "+ principal*(Math.pow( (1 + rate/(100*noOfYear)),noOfYear)));
	}
}
public class CalculateInterest
{
	/**
		java CalculateInterest "TypeOfInterst" "noOfYear" "principal" "rate"</br>
		"TypeOfInterst" : 1 . SimpleInterest & 2 . CompoundInterest</br>
		"rate" : In %</br>
		i.e. java CalculateInterest 1 1 100 5
	**/
	public static void main(String args[])
	{
		switch(Integer.parseInt(args[0]))
		{
			case 1: SimpleInterest si=new SimpleInterest();
					si.interest(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Double.parseDouble(args[3]));
					break;
					
			case 2: CompoundInterest ci=new CompoundInterest();
					ci.interest(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Double.parseDouble(args[3]));
					break;
					
			default:System.out.println("Wrong Choice");
					break;
		}
	}
}