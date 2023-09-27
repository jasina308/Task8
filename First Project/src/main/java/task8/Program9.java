package task8;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the age:");
		 age=obj.nextInt();
		 if(age>=60)
		 {
			 System.out.println("The person is a senior citizen");
		 }
			 else
			 {
				 System.out.println("The person is not senior citizen");
	 	     }
		 
		 obj.close();
		 }

}
