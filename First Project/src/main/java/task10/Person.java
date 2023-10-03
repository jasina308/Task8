package task10;

import java.util.Scanner;

public class Person 
{
	String name;
	int age;
	//Getter and setter method used to get data from user and assign the value to local variable using this operator
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public Person() // Constructor created as the same name as class name 
	{

		this.name=null;
		this.age=0;
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// object created for class person
		Person obj=new Person();
		Scanner sc = new Scanner(System.in);
		// Input from the user
		System.out.println("Enter the name of the person:");
		String name=sc.nextLine();
		System.out.println("Enter the age of the person:");
		int age=sc.nextInt();
		obj.setName(name);// name is set to the instance variable by calling the class object
		obj.setAge(age);
		System.out.println(obj.getName());// getName() method returns the value stored in name variable
		System.out.println(obj.getAge());// getAge() method returns the value stored in name variable
		sc.close();
	}
	

}
