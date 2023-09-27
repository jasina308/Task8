package task8;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,flag=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number to check:");
		 num=obj.nextInt();
		 if (num==0||num==1)
		 {
			 flag=1;
		 }
		 for (i=2;i<=num/2;++i) 
		 {
			 if(num % i==0)
			 {
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0)
		 {
			 System.out.println("The number is a prime number");
		 }
			 else 
			 {
				 System.out.println("The number is not a prime number");
			 
			 }
	        obj.close();
		 }
        }
