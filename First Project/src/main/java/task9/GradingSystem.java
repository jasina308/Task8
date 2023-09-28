package task9;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S,A,B,C,D,E,F,mark;
		Scanner obj = new Scanner(System.in);
        System.out.println("Enter the mark :");
        mark=obj.nextInt();
        if (mark==100)
        	System.out.println("S");
        else if (mark>100)
        	System.out.println("Invalid input");
        else if (mark>=90 && mark<100)// A ( 99 to 90)
        	System.out.println("A");
        else if(mark>=80 && mark<90)// B (80 to 89)
    	   System.out.println("B");
        else if(mark<80 && mark>=70) // C( 70 to 79)
    	   System.out.println("C");
        else if(mark<70&& mark>=60)// D ( 60 to 69)
    	   System.out.println("D");
        else if(mark<60 && mark>=50) // E ( 50 to 59)
    	   System.out.println("E");
        else if(mark<50)
    	   System.out.println("F");
       obj.close();

	}

}
