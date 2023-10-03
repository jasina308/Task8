package task10;

import java.util.Scanner;

public class Circle {
		 double radius; 
		 
			public Circle()
			{
				radius=5;
			}
			public Circle(double rad)
			{
				radius=rad;
			}
			public double circumference() 
			{
			double circumference=2*3.14*radius;
			return circumference;
			
			}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Circle c1=new Circle(4);
		 c.circumference();//call constructor with no args
		 c1.circumference();// call constructor with args
		 
		 System.out.println("The Circumference of circle is:\n"+c.circumference());
		 System.out.println("The Circumference of circle is:\n"+c1.circumference());

	}

}
