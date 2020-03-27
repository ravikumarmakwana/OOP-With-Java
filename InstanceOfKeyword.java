class InstanceOfKeyword
{
	public static void main(String args[])
	{
		InstanceOfKeyword A=new InstanceOfKeyword();
		String C=new String();
		Integer B=new Integer(10);
		System.out.println("A is Instance of Current Class : "+ (A instanceof InstanceOfKeyword));
		System.out.println("B is Instance of Integer  : "+ (B instanceof Integer));
		System.out.println("C is Instance of String  : "+ (C instanceof String));
	}
}