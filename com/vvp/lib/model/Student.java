package com.vvp.lib.model;
import java.util.*;
import java.io.*;
public class Student extends User
{
	public int sem,bookBal;
	public int bookCount=4;
	public String branch;
	public String statusOfStudent;	
	public Student(int userId,String name,int sem,int bookBal,String branch,String statusOfStudent)
	{
		super(userId,name);
		this.sem=sem;
		this.bookBal=bookBal;
		this.branch=branch;
		this.statusOfStudent=statusOfStudent;
	}
}