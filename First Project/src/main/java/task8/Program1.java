package task8;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,d;
    	Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        a=obj.nextInt();
        System.out.println("Enter the value of b:");
        b=obj.nextInt();
        System.out.println("Enter the value of c:");
        c=obj.nextInt();
        System.out.println("Enter the value of d:");
        d=obj.nextInt();
        int sum1=a+b;
        int sum2=c+d;
        if(sum1>sum2)
        {
        	 System.out.println("SUM of a&b is greater than SUM of c&d");        
	}
        else {
    	   System.out.println("SUM of c&d is greater than SUM of a&b");
       }
	obj.close();
}
}
