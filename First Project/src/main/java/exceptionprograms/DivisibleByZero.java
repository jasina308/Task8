package exceptionprograms;

import java.util.Scanner;

public class DivisibleByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend,divisor,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend ");
		dividend=sc.nextInt();
		System.out.println("Enter the divisor");
		divisor=sc.nextInt();
	
		try {
		n=dividend/divisor;
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero exception occured");
		}
	sc.close();
	}

}
