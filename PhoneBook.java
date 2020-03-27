import java.io.*;
import java.util.*;
class PhoneBook
{
	public static void main(String args[])
	{	
		HashMap <Long,String> phoneBook=new <Long,String> HashMap();
		Scanner key=new Scanner(System.in);
		String name;
		Long number;
		int c;
		while(true)
		{
			System.out.println("1. Add New Contact");
			System.out.println("2. Search Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Show PhoneBook");
			System.out.println("5. Exit");
			System.out.print("Enter the Choice : ");
			c=key.nextInt();
			switch(c)
			{
				case 1: System.out.print("Enter the Name : ");
						name=key.next();
						System.out.print("Enter the Number : ");
						number=key.nextLong();
						phoneBook.put(number,name);
						System.out.println("Contact is Successfully Saved !!!");
						break;

				case 2: System.out.print("Enter the Number : ");
						number=key.nextLong();
						name=phoneBook.get(number);
						if(name==null)
							System.out.println("No Such Contact Found.");
						else
							System.out.print("Contact is Found !!!\n"+number+" --> "+name);
						break;
			
				case 3: System.out.print("Enter the Number : ");
						number=key.nextLong();

						if(phoneBook.remove(number)==null)
							System.out.println("No Such Contact Found.");
						else
							System.out.print("Contact is Successfully Deleted.");
						break;

				case 4: System.out.println("***#*** PhoneBook ***#***\nNumber\t\tName");
						for(Map.Entry i:phoneBook.entrySet())
						{
							System.out.println(i.getKey()+" -->  "+i.getValue());
						}
						break;

				case 5: System.exit(0);
						break;

				default:System.out.println("Wrong Choice !!!!!!!\nTry Again.");
						break;
			}
			System.out.println("\n");
		}
	}	
}
