package task8;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
    	Scanner obj = new Scanner(System.in);
    	 System.out.println("Enter the value of a:");
         a=obj.nextInt();
         System.out.println("Enter the value of b:");
         b=obj.nextInt();
         temp=b;
         b=a;
         a=temp;
         System.out.println("After swapping");
         System.out.println("a="+ a );
         System.out.println("b=" + b);
         obj.close();
       

	}

}
