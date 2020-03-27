import java.util.*;
import java.io.*;
class Dictionary
{
	public static void main(String args[])
	throws Exception
	{
		Scanner keyword=new Scanner(System.in);
		String word,meaning;
		int c;
		Properties dictionary=new Properties();
		dictionary.put("Ravi","Synonyms of Sun,Means Sun");
		dictionary.put("Apple","One type of Food");
		dictionary.put("Goal","somthing that you achive in life ! !");
		dictionary.put("Mission","An Important Job");
		dictionary.put("Vission","Ideas of somthing");
		dictionary.put("Life","Beautiful Gift of God");
		dictionary.put("Computer","My Heart");
		dictionary.put("Android","Application ");
		dictionary.put("Java","Most Popular Language in World");
		dictionary.put("Teacher","Guid of Life");
		dictionary.put("Speed","Power of Running");
		while(true)
		{
			System.out.println("1. Add New Word");
			System.out.println("2. Surch Meaning");
			System.out.println("3. Exit");
			System.out.print("Enter the Choice : ");
			c=keyword.nextInt();
			System.out.println();
			switch(c)
			{
				case 1: System.out.print("Enter the Word : ");
						word=keyword.nextLine();
						keyword.nextLine();
						System.out.print("Enter the Meaning : ");
						meaning=keyword.next();
						dictionary.put(word,meaning);
						break;
				
				case 2:	System.out.print("Enter the word : ");
						word=keyword.next();
						if(dictionary.get(word)!=null)
							System.out.println(word+" : "+dictionary.get(word));
						else 
							System.out.println("Word Not Found");
						break;
						
				case 3: System.out.println("Thanking for Use");
						System.exit(0);
						break;
			}
			System.out.println();
		}
	}
}