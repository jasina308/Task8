package task10;

import java.util.Scanner;

public class ArrayofObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea [] obj=new Tea[4];
		obj[0]=new Tea();
		obj[1]=new BlackTea();
		obj[2]= new GreenTea();
		obj[3]= new HerbalTea();
		System.out.println("Enter the Tea which you want to consume");
		Scanner sc = new Scanner(System.in);
		int choice= sc.nextInt();
		switch(choice)
		{
		case 1:
			obj[1].prepareTea();
		
			break;
		case 2:
			obj[2].prepareTea();
			break;
		case 3:
			obj[3].addMilk();
			obj[3].addSugar();
			obj[3].prepareTea();
			break;
		}
		sc.close();
	}

}
