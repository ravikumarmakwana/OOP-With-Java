class ValidEnrollmentNumber
{
	public static void main(String args[])
	{
		String enrollment=args[0];
		int year=Integer.parseInt(enrollment.substring(0,2));
		if(year>15 && year<19){}
		else
		{
			System.out.println("Invalid Enrollment Number");
			System.out.println("Enroment Year are not in Range in 19,17,16");
			System.exit(0);
		}
		int collegeCode=Integer.parseInt(enrollment.substring(2,5));
		if(collegeCode==47){}
		else
		{
			System.out.println("Invalid College Code");
			System.out.println("Invalid Enrollment Number");
			System.exit(0);
		}
		int type=Integer.parseInt(enrollment.substring(5,7));
		if(type== 31 || type==1){}
		else
		{
			System.out.println("Invalid Joining Semester");
			System.out.println("Invalid Enrollment Number");
			System.exit(0);
		}
		int dept=Integer.parseInt(enrollment.substring(7,9));
		if(dept==7){}
		else
		{
			System.out.println("Invalid Department Code");
			System.out.println("Invalid Enrollment Number");
			System.exit(0);
		}
		System.out.println("Valid Enrollment Number");
	}
}
