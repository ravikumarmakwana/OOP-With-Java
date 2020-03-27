public class ValidEmail
{
	/**
			java ValidEmail emailaddreaa@domainname.com<br/>
			Rules of Email:<br/>
			1.Email Address Start with small alphabet<br/>
			2.Email address contain Must be 20 Characters<br/>
			3.Email address must @ sign<br/>
			4.Email address must be one . sing<br/>
			5.Distance between . and @ must be more then 2<br/>
			i.e. java ValidEmail emailaddress@domainname.com
	**/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Invalid Argument");
			System.out.println("i.e. java ValidEmail emailaddress@domainname.com");
			System.exit(0);
		}
		String emailAddress=args[0];
		String errormessage="";
		
		int firstCharacter=emailAddress.codePointAt(0);
		
		if(!((firstCharacter>= 48 && firstCharacter<= 57) || (firstCharacter>= 97 && firstCharacter<= 122)))
		{
			errormessage+="First Character must be small letter or 0 to 9 digits";
		}
		if(emailAddress.indexOf('@')==-1)
		{
			errormessage+="\nOne @ symbole is required";
		}
		
		String emailPart[]=emailAddress.split("@");
		
		if(emailPart[0].length()>20)
		{
			errormessage+="\nLength must be contion 20 character";
		}
		
		int code,l=0;
		for(int i=1;i<emailPart[0].length();i++)
		{
			code=emailPart[0].codePointAt(i);
			if(!((code>= 48 && code<= 57) || (code>= 97 && code<= 122) || (code>= 65 && code<= 90) || code==95 || code==46))
				l=1;
		}
		
		if(l==1)
			errormessage+="\nOnly Underscore and Dot Operator allow";
		
		if(emailAddress.indexOf('@')!=-1)
		{
			if(emailPart[1].indexOf('.')== -1 )
			{
				errormessage+="\nOne dot is required";
			}
			if(emailPart[1].indexOf('.')!= -1)
			{
				if((emailPart[1].indexOf('.') + emailPart[0].length()+1) - emailAddress.indexOf('@') <= 2)
				{
					errormessage+="\nDistance between dot and @ is must be more then 2";
				}
			}
		}
		if(errormessage.length() >0)
		{
			System.out.println(errormessage);
			System.out.println("Invalid Email address");
		}
		else
			System.out.println("Email Address is Valid");
	}
}