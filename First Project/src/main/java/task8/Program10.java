package task8;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number :");
		 num=obj.nextInt();
		 while(num!=0)
		 {
			 num=num/10;
			 count++;
		 }
		 System.out.println("No of digits in an integer:"+count);
		 obj.close();
	}

}
