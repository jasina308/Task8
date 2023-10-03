package task10;

import java.util.Scanner;


public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// objects created for class blacktea,greentea,herbaltea
		Tea obj=new Tea();
		BlackTea bobj=new BlackTea();
		GreenTea gobj=new GreenTea();
		HerbalTea hobj= new HerbalTea();
		System.out.println("Enter the Tea which you want to consume");
		Scanner sc = new Scanner(System.in);
		int choice= sc.nextInt();
		switch(choice)
		{
		case 1:
			bobj.prepareTea();
			
			break;
		case 2:
			gobj.prepareTea();
			break;
		case 3:
			hobj.addMilk();
			hobj.addSugar();
			hobj.prepareTea();
			break;
		}
		sc.close();
	

	}

}