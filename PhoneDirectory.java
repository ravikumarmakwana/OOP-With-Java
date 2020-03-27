import java.util.*;
class PhoneDirectory
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		String name;
		long number;
		int c;
		Properties phoneDirectory=new Properties();
		while(true)
		{
			System.out.println("1. Add New Contact ");
			System.out.println("2. Search Contact ");
			System.out.println("3. Exit");
			System.out.print("Enter the Choice : ");
			c=key.nextInt();
			switch(c)
			{
				case 1: System.out.print("Enter the Name : ");
						name=key.next();
						System.out.print("Enter thr PhoneNo : ");
						number=key.nextLong();
						phoneDirectory.put(number,name);
						System.out.println("Your Contact is Successfully is Saved !");
						break;

				case 2:	System.out.print("Enter the Number : ");
						number=key.nextLong();
						if(phoneDirectory.get(number)==null)
							System.out.println("There are No Search Contact found !!");						
						else
							System.out.println("Contact :: "+phoneDirectory.get(number));
						break;

				case 3: System.exit(0);
						break;

				default:System.out.println("Wrong Chocie !!! \n Try Again .");
						break;
			}
		}
	}
}