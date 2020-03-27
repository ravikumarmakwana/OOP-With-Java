import java.util.*;
import java.io.*;
class StudentDetails
{
	int age,rollNo;
	String name,branch;
	StudentDetails(int rollNo,int age,String name,String branch)
	{
		this.age=age;
		this.rollNo=rollNo;
		this.name=name;
		this.branch=branch;
	}
	public String toString()
	{
		return this.rollNo+" "+this.name+" "+this.age+" "+this.branch+"\n";
	}
}
class LinkedListWithFile
{
	public static void main(String args[])
	throws Exception
	{
		BufferedWriter bw;
		BufferedReader br;
		try{
		File f=new File("G:\\Java\\DetailsOfStudent.csv");
		br=new BufferedReader(new FileReader(f));
		int age,rollNo,c;
		Scanner key=new Scanner(System.in);
		String name,branch,records;
		LinkedList <StudentDetails> studentDetails=new <StudentDetails> LinkedList();
		if(f.length()!=0)
		{
			records=br.readLine();
			String parts[]=records.split(";");
			for(int i=0;i<parts.length;i++)
			{
				String elements[]=parts[i].split(",");
				studentDetails.addLast(new StudentDetails(Integer.parseInt(elements[0]),Integer.parseInt(elements[1]),elements[2],elements[3]));
			}
		}
		while(true)
		{
			System.out.println("1. Add New Student");
			System.out.println("2. Display All Database");
			System.out.println("3. Exit");
			System.out.print("Enter the Choice : ");
			c=key.nextInt();
			switch(c)
			{
				case 1: System.out.print("Enter the Roll No. : ");
						rollNo=key.nextInt();
						System.out.print("Enter the Name : ");
						name=key.next();
						System.out.print("Enter the Age : ");
						age=key.nextInt();
						System.out.print("Enter the branch : ");
						branch=key.next();
						studentDetails.addLast(new StudentDetails(rollNo,age,name,branch));
						System.out.println("New Student Successfully Added .");
						break;

				case 2: System.out.println("Details Of Student");
						for(int i=0;i<studentDetails.size();i++)
							System.out.println(studentDetails.get(i).toString());
						System.out.println();
						break;

				case 3: br.close();
						bw=new BufferedWriter(new FileWriter(f));
						for(int i=0;i<studentDetails.size();i++)
						{
							records=studentDetails.get(i).rollNo+","+
									studentDetails.get(i).age+","+
									studentDetails.get(i).name+","+
									studentDetails.get(i).branch+";";
							bw.write(records.toCharArray());
						}
						bw.close();
						System.exit(0);
						break;

				default:System.out.println("Worng Choice !!!,Try Again");
						break;
			}
		}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}