package task9;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string:");
		original=obj.nextLine();
		int length=original.length();
		  for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		  System.out.println("The reversed string is:"+reverse);
		  obj.close();
	}

}
