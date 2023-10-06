package exceptionprograms;

import java.util.Scanner;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		s=sc.nextLine();
		int len=s.length();
		//accessing the element greater than the string length
		try
		{
			s.charAt(len+1);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String out of bound exception");
		}
		sc.close();
	}

}
