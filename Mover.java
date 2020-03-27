import java.io.*;
import java.util.*;
class Mover
{
	public static void main(String args[])
	throws Exception 
	{
		Scanner key=new Scanner(System.in);
		int c,no,s;
		ArrayList subjects=new ArrayList();
		ArrayList selectedSubjects=new ArrayList();
		subjects.add("Java");
		subjects.add("CS");
		subjects.add("SP");
		subjects.add("MPI");
		subjects.add("ADA");
		subjects.add("DE");
		while(true)
		{
			System.out.println("1. Inter the Subjects ");
			System.out.println("2. Select Subjects");
			System.out.println("3. Display ");
			System.out.println("4. Exit");
			System.out.print("Enter the choie : ");
			c=key.nextInt();
			switch(c)
			{
				case 1: System.out.print("Enter the Subject : ");
						subjects.add(key.next());
						System.out.println("Your Subject is SuccessFully Inserted ");
						break;
						
				case 2: for(int i=0;i<subjects.size();i++)
							System.out.println(i+" : "+subjects.get(i));
						System.out.print("How Many Subjects That you need to move : ");
						no=key.nextInt();
						int counter=0;
						while(no>counter)
						{
							System.out.print("Enter the No. ");
							s=key.nextInt()-counter;
							selectedSubjects.add(subjects.get(s));
							subjects.remove(s);
							counter++;
						}
						break;
						
				case 3: System.out.println("Subjetc : ");
						System.out.print(subjects);
						System.out.println();
						System.out.println("Selected Subjects : ");
						System.out.print(selectedSubjects);
						break;
						
				case 4: System.exit(0);
						break;
			}
			System.out.println();
		}
	}
}