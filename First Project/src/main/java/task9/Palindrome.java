package task9;
import java.util.Scanner;
    
   public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string to check if it is a palindrome");
		original=obj.nextLine();
		int length=original.length();
		  for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse))  
		         System.out.println("Entered string is a palindrome.");  
		      else  
		         System.out.println("Entered string isn't a palindrome.");   
		
		obj.close();
	}

}
