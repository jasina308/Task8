package exceptionprograms;

import java.util.Scanner;

// creating user defined exception to validate password 
class InvalidPasswordException extends Exception  
{  
	//creating constructor
    public InvalidPasswordException(String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
// creating user defined exception to validate username 
class InvalidUserException extends Exception
{
	public InvalidUserException(String str)
	{
		super(str);
	}
}

public class LoginFailure {
	@SuppressWarnings("resource")
	static void validate(String str1, String str2) throws InvalidPasswordException, InvalidUserException
	{
		//declaring a array for  username and password 
		
		String[] UserName=new String[] {"jasina08", "rizwan07", "hashim15"};
		String[] Password=new String[] {"jasi123", "riz123", "hash1508"};
		Scanner sc=new Scanner(System.in);
		String username_input,password_input,Username_element;
		int Username_Match=0,Password_Match=0,Username_position = 0;
		System.out.println("Enter the username ");
		username_input=sc.nextLine();
		System.out.println("Enter the password ");
		password_input=sc.nextLine();
		for(int i=0;i<UserName.length;i++)
		{
			// if loop to check whether input username is available in the array
			if(UserName[i].equals(username_input))
			{
				//if user is found username is stored in a variable 
				Username_Match=1;
				Username_position=i;
				Username_element=UserName[i];
				
			}
		}
			//if the user exists in the array then input password is checked with password array
			if(Username_Match==1)
			{
				if(Password[Username_position].equals(password_input))
				{
					Password_Match=1;
			     System.out.println("login success");
				}
				else
				{
					throw new InvalidPasswordException("Invalid Password");
				}	
			}
			//if user doesnot exists throw exception 
			else
			{
				throw new InvalidUserException("User doesnot exists");
			}
			
		
		sc.close();
		
	}

	public static void main(String[] args) 
	{
		//try catch to handle the exception

		try
		{
			validate(null, null);
		}
		catch(InvalidPasswordException | InvalidUserException e)
		{
			System.out.println(e);
		}
		
	}

}
