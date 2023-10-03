package task10;

import java.util.Scanner;

public class Employee {

	int id,salary,percentage;
	String firstName,lastName,name,Employee;
	public Employee(int id,String firstName, String lastName,int salary )
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		}
	//getter and setter method to get the assign values to variables
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setPercentage(int percentage)
	{
		this.percentage=percentage;
	}
	public int getPercentage()
	{
		return percentage;
	}
	//getName method concatenate first name and last name and returns the name of employee
	public String getName(String firstName, String lastName)
	{
		this.name=firstName+lastName;
		return name;
		
	}
	//getAnnualSalary method returns the annual salary of the employee
	public int getAnnualSalary(int annualSalary)
	{
		annualSalary=salary*12;
		return annualSalary;
		
	}
	//raiseSalary method used to calculate the percentage increase in salary and returns the increased salary
	public int raiseSalary(int percentage,int salary)

	{	
	
		 int raisesalary=(int) (salary+(salary*percentage/100));
		 return raisesalary;
		
	}
	// toString method to display the employee details
	public String toString(int id,String firstName, String lastName,int salary)
	{
		String Employee= "["+id+" "+firstName+" "+lastName+" "+salary+"]";
		return Employee;
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee emp = new Employee(0, null, null, 0);
		Scanner sc = new Scanner(System.in);
		// Input from the user
		System.out.println("Enter the employee id:");
		int id= sc.nextInt();
		System.out.println("Enter the first name");
		String firstName=sc.next();
		System.out.println("Enter the last name");
		String lastName=sc.next();
		System.out.println("Enter the employee salary:");
		int salary= sc.nextInt();
		System.out.println("Enter the percentage to raise salary:");
		int percentage= sc.nextInt();
		//object used to call the getter and setter methods
		emp.setID(id);
		emp.getID();
		emp.setFirstName(firstName);
		emp.getFirstName();
		emp.setLastName(lastName);
		emp.getLastName();
		emp.setSalary(salary);
		emp.getSalary();
		emp.setPercentage(percentage);
		emp.getPercentage();
		// methods called by passing approriate parameters 
		System.out.println("\n Employee Details :"+emp.toString(id,firstName,lastName,salary));
		System.out.println("\n Name of Employee is:"+emp.getName(firstName, lastName));
		System.out.println("\n Anuual salary of the employee is :"+emp.getAnnualSalary(salary));
		System.out.println("\n Raise in salary is :"+emp.raiseSalary(percentage,salary));
		sc.close();
				
	}

}
