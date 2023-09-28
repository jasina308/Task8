package task9;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;  
		System.out.println("Enter three integers: ");  
		Scanner obj = new Scanner(System.in);  
		a=obj.nextInt();  
		b=obj.nextInt();  
		c=obj.nextInt();  
		if (a > b && a > c)  
		System.out.println("The largest number is: "+a);  
		else if (b > a && b > c)  
		System.out.println("The largest number is: "+b);  
		else if (c > a && c > b)  
		System.out.println("The largest number is: "+c);  
		else  
		System.out.println("The numbers are same.");  
		obj.close();
		}

}
