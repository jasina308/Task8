package com.example.hr;

public class Employee {
    // Employee class having methods 
	int id;
	String name;
	double salary;
	public void printName(String n) {
		System.out.println("Employee Name is "+n);
	}
	public void printSalary(double d) {
		System.out.println("Employee Salary is :"+d);
		
	}
	
	public static void main(String[] args)
	{	
	 
		Employee obj=new Employee();
		obj.printName("Priya");
		obj.printSalary(8900);

	}

}
