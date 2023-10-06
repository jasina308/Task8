package exceptionprograms;

	class InvalidAgeException  extends Exception  
	{  
	    public InvalidAgeException(String str)  
	    {  
	        // calling the constructor of parent Exception  
	        super(str);  
	    }  
	}  
	    
	// class that uses custom exception InvalidAgeException  
	public class CustomException  
	{  
	  
	    // method to check the age  
	    static void validate (int age) throws InvalidAgeException
	    {    
	       if(age < 18) 
	  
	        // throw an object of user defined exception  
	        throw new InvalidAgeException("Invalid age not eligible to vote");    
	       
	         
	       else 
	       
	        System.out.println("Eligible to vote");   
	           
	     
	    }
	    
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            // calling the method   
	            validate(13);  
	        }  
	        catch (InvalidAgeException e)  
	        {  
	            System.out.println(e);  
	    
	             
	        }  
	  
	    }     
	}
	  
	
