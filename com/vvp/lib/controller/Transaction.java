package com.vvp.lib.controller;
import com.vvp.lib.model.*;
import static com.vvp.lib.model.DAO.*;
public class Transaction
{
	public String issueBook(int userId,int isbnNo)
	throws 
	UserNotFoundException,
	BookNotFoundException,
	InsufficentBookBalanceException,
	BookNotAvailableException
	{
		if(!(student.containsKey(userId)))
			throw new UserNotFoundException();
		
		int s=0,h=0;
		
		if(softmedia.containsKey(isbnNo)) 
			s=1;
		else if(hardmedia.containsKey(isbnNo))
			h=1;	
		else	
			throw new BookNotFoundException();

		if(student.get(userId).bookBal==0)
			throw new InsufficentBookBalanceException();
		if(s==1)
		{
			if(softmedia.get(isbnNo).availablity==0)
				throw new BookNotAvailableException();
			else
			{
			String title,author;
			int availablity,size;
			title=softmedia.get(isbnNo).title;
			author=softmedia.get(isbnNo).author;
			availablity=softmedia.get(isbnNo).availablity;
			size=softmedia.get(isbnNo).size;
			softmedia.put(isbnNo,new SoftMedia(isbnNo,title,author,availablity-1,size));
			int sem,bookBal;
			String name,branch,statusOfStudent;
			sem=student.get(userId).sem;
			bookBal=student.get(userId).bookBal;
			name=student.get(userId).name;
			branch=student.get(userId).branch;
			statusOfStudent=student.get(userId).statusOfStudent;
			statusOfStudent+=isbnNo+" ";
			student.put(userId,new Student(userId,name,sem,bookBal-1,branch,statusOfStudent));
			return "Book Issue Successfully ";
			}
		}
		else if(h==1)
		{
			if(hardmedia.get(isbnNo).availablity==0)
				throw new BookNotAvailableException();
			else
			{
			String title,author;
			int availablity,pageNo;
			title=hardmedia.get(isbnNo).title;
			author=hardmedia.get(isbnNo).author;
			availablity=hardmedia.get(isbnNo).availablity;
			pageNo=hardmedia.get(isbnNo).pageNo;
			hardmedia.put(isbnNo,new HardMedia(isbnNo,title,author,availablity-1,pageNo));
			int sem,bookBal;
			String name,branch,statusOfStudent;
			sem=student.get(userId).sem;
			bookBal=student.get(userId).bookBal;
			name=student.get(userId).name;
			branch=student.get(userId).branch;
			statusOfStudent=student.get(userId).statusOfStudent;
			statusOfStudent+=isbnNo+" ";
			student.put(userId,new Student(userId,name,sem,bookBal-1,branch,statusOfStudent));
			return "Book Issue Successfully ";
			}
		}
		else
			throw new BookNotFoundException();
	}
	public String returnBook(int userId,int isbnNo)
	throws 
	UserNotFoundException,
	BookNotFoundException
	{
		if(!(student.containsKey(userId)))
			throw new UserNotFoundException();
		int s=0,h=0;
		if(softmedia.containsKey(isbnNo)) s=1;
		else if(hardmedia.containsKey(isbnNo)) h=1;	
		else	throw new BookNotFoundException();

		if(student.get(userId).bookBal==4)
			return "User Not Issued any Book form Library !!";
		
		if(s==1)
		{
			String statusOfStudent=student.get(userId).statusOfStudent;
			int c=0;
			String part[]=statusOfStudent.split(" ");
			statusOfStudent=" ";

			for(int i=1;i<part.length;i++)
			{
				if(Integer.parseInt(part[i])!=isbnNo)
					statusOfStudent+=part[i]+" ";
				else
					c=1;
			}
			if(c==0)
				return "Wrong isbnNo";
			String title,author;
			int availablity,size;
			title=softmedia.get(isbnNo).title;
			author=softmedia.get(isbnNo).author;
			availablity=softmedia.get(isbnNo).availablity;
			size=softmedia.get(isbnNo).size;
			softmedia.put(isbnNo,new SoftMedia(isbnNo,title,author,availablity+1,size));
			int sem,bookBal;
			String name,branch;
			sem=student.get(userId).sem;
			bookBal=student.get(userId).bookBal;
			name=student.get(userId).name;
			branch=student.get(userId).branch;
			student.put(userId,new Student(userId,name,sem,bookBal+1,branch,statusOfStudent));
			return "Successfully Book is Return";
		}
		else if(h==1)
		{
			String statusOfStudent=student.get(userId).statusOfStudent;
			int c=0;
			String part[]=statusOfStudent.split(" ");
			statusOfStudent=" ";

			for(int i=1;i<part.length;i++)
			{
				if(Integer.parseInt(part[i])!=isbnNo)
					statusOfStudent+=part[i]+" ";
				else
					c=1;
			}
			if(c==0)
				return "Wrong isbnNo";
			String title,author;
			int availablity,pageNo;
			title=hardmedia.get(isbnNo).title;
			author=hardmedia.get(isbnNo).author;
			availablity=hardmedia.get(isbnNo).availablity;
			pageNo=hardmedia.get(isbnNo).pageNo;
			hardmedia.put(isbnNo,new HardMedia(isbnNo,title,author,availablity+1,pageNo));
			int sem,bookBal;
			String name,branch;
			sem=student.get(userId).sem;
			bookBal=student.get(userId).bookBal;
			name=student.get(userId).name;
			branch=student.get(userId).branch;
			student.put(userId,new Student(userId,name,sem,bookBal+1,branch,statusOfStudent));
			return "Successfully Book is Return";
		}
		else
			throw new BookNotFoundException();
	}

	public int checkBal(int userId)
	{
		if(!student.containsKey(userId))
			return -1;
		else
			return student.get(userId).bookBal;
	}
	
	public String searchBook(String name)
	throws BookNotFoundException
	{
		String message="";
		String temp;
		for(int i:softmedia.keySet())
		{
			temp=softmedia.get(i).title;
			if(temp.indexOf(name)!=-1)
				message+=temp+"\n";
		}
		for(int i:hardmedia.keySet())
		{
			temp=hardmedia.get(i).title;
			if(temp.indexOf(name)!=-1)
				message+=temp+"\n";
		}
		if(message.length()==0)
			throw new BookNotFoundException();
		else
			return "\nBook is Found \n"+message;
	}
	public String showStudent(int i)
	{
		return student.get(i).userId+" "+
			   student.get(i).name+" "+
			   student.get(i).bookBal+" "+
			   student.get(i).branch+" "+
			   student.get(i).sem;
	}
	public String showStaff(int i)
	{
		return staff.get(i).userId+" "+
			   staff.get(i).name+" "+
			   staff.get(i).salary+" "+
			   staff.get(i).post;
	} 
	public String showHardMedia(int i)
	{
		return hardmedia.get(i).isbnNo+" "+
			   hardmedia.get(i).title+" "+
			   hardmedia.get(i).author+" "+
			   hardmedia.get(i).pageNo+" "+
			   hardmedia.get(i).availablity;
	}
	public String showSoftMedia(int i)
	{
		return softmedia.get(i).isbnNo+" "+
			   softmedia.get(i).title+" "+
			   softmedia.get(i).author+" "+
			   softmedia.get(i).size+" "+
			   softmedia.get(i).availablity;
	}
	public String status(int userId)
	{
		return student.get(userId).statusOfStudent;
	}
}