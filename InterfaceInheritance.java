interface P
{
	int pVar=5;
	public void displayP();
}
interface P1 extends P
{
	int p1Var=10;
	public void displayP1();
}
interface P2 extends P
{
	int p2Var=15;
	public void displayP2();
}
interface P12 extends P1,P2
{
	int p12Var=20;
	public void displayP12();
}
class Q implements P12
{
	public void displayP()
	{
	System.out.println("P.pVar = "+ P.pVar);
	}
	public void displayP1()
	{
		System.out.println("P1.p1Var = "+P1.p1Var);
	}
	public void displayP2()
	{
		System.out.println("P2.p2Var = "+P2.p2Var);
	}
	public void displayP12()
	{
		System.out.println("P12.p12Var = "+P12.p12Var);
	}
}
class InterfaceInheritance
{
	public static void main(String args[])
	{
		Q q=new Q();
		q.displayP();
		q.displayP1();
		q.displayP2();
		q.displayP12();
	}
}