package task8;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int num;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the value of num :");
        num=obj.nextInt();
        if (num%2==0) {
        	System.out.println("Number is a even number");
        }
        	else
        	{
        		System.out.println("Number is a odd number");
        	}
        obj.close();
        }
 

}
