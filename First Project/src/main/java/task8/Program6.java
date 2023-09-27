package task8;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,fact=1;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number :");
		 num=obj.nextInt();	
		 for (i=1;i<=num;i++) {
			 fact=fact*i;
		 }
		 System.out.println("The factorial of the number is "+fact);
		 obj.close();
	}

}
