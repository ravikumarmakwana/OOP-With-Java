import java.util.*;
class ListMover
{
	public static void main(String args[])
	throws Exception 
	{
		ArrayList subject=new ArrayList();
		subject.add("ADA");
		subject.add("JAVA");
		subject.add("MPI");
		subject.add("SP");
		subject.add("CS");
		System.out.println(subject);
		ArrayList newSubject =new ArrayList();
		int c;
		String name;
		Scanner key=new Scanner(System.in);
		System.out.print("How many subject that you want to move ? ");
		c=key.nextInt();
		while(c>0)
		{
			System.out.print("Enter the Name :");
			name=key.next();
			newSubject.add(name);
			subject.remove(name);
			c--;
		}
		System.out.println("Remaning Subjects :: "+subject);
		System.out.println("New ArrayList :: "+newSubject);
	}
}