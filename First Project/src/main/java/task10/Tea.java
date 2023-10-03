package task10;

import java.util.Scanner;

public class Tea 
{
	int hot_water, tea_choice,sugar_level;
	//prepareTea prepares tea with hot water and tea leaves
	public void prepareTea()
		 {
		System.out.println("Enter the hot water boiled or not");
		 Scanner sc = new Scanner(System.in);
		 hot_water=sc.nextInt();
		 switch(hot_water)
		 {
		 case 1:
			
			 System.out.println("Tea leaves added ");
			 System.out.println("Tea is prepared");
			 break;
		 case 2:
			 
			 System.out.println("Wait for water to boil");
			 break;
		 }
		 sc.close();
		 }
		 // addMilk adds milk to tea 
		public void addMilk()
		 {
			 System.out.println("Milk Added");
			 
		 }
		// addSugar to the tea 
		 public void addSugar()
		 {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the sugar level");
			 sugar_level=sc.nextInt();
			 switch(sugar_level)
			 {
			 case 1:
				 System.out.println("Sugar Added");
				 break;
			 case 2:
				 System.out.println("Low sugar Added");
				 break;
			 case 3:
				 System.out.println("No sugar Added");
				 break;
				 
			 }
			 sc.close();
		 }
}
		// Black tea extends parent class tea and prepare tea method is overrided
		 class BlackTea extends Tea
		 
		 {
			 public void prepareTea()
			 {
				 System.out.println("Enter the hot water boiled or not");
				 Scanner sc = new Scanner(System.in);
				 hot_water=sc.nextInt();
				 switch(hot_water)
				 {
				 case 1:
					
					 System.out.println("Tea leaves added ");
					 System.out.println("Black Tea is prepared");
					 break;
				 case 2:
					 
					 System.out.println("Wait for water to boil");
					 break;
			      }
				 sc.close();
			 }
			 
			/* public void addSugar()
			 {
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter the sugar level");
				 sugar_level=sc.nextInt();
				 switch(sugar_level)
				 {
				 case 1:
					 System.out.println("Sugar Added");
					 System.out.println("Black Tea is prepared");
					 break;
				 case 2:
					 System.out.println("Low sugar Added");
					 System.out.println("Black Tea is prepared");
					 break;
				 case 3:
					 System.out.println("No sugar Added");
					 System.out.println("Black Tea is prepared");
					 break;
			 
				 	}
				 sc.close();*/
			 }
		
		 //Green tea class extends parent class tea 
	class GreenTea extends Tea
	{
		public void prepareTea()
		 {
			 System.out.println("Enter the hot water boiled or not");
			 Scanner sc = new Scanner(System.in);
			 hot_water=sc.nextInt();
			 switch(hot_water)
			 {
			 case 1:
				
				 System.out.println("Add green tea bag ");
				 System.out.println("Green Tea is prepared");
				 break;
			 case 2:
				 
				 System.out.println("Wait for water to boil");
				 break;
		      }
				sc.close();
		 }
	}
	//Herbal Tea class extends parent class tea
	class HerbalTea extends Tea
	{
		
			public void addMilk()
			 {
				 System.out.println("Milk Added");
				 
			 }
			 public void addSugar()
			 {	
				 System.out.println("Enter the sugar level");
				 Scanner sc = new Scanner(System.in);
				 sugar_level=sc.nextInt();
				 switch(sugar_level)
				 {
				 case 1:
					 System.out.println("Sugar Added");
					 break;
				 case 2:
					 System.out.println("Low sugar Added");
					 break;
				 case 3:
					 System.out.println("No sugar Added");
					 break;
					 
				 }
				 sc.close();
			 }
				 public void prepareTea()
				 {
				 
					System.out.println("Herbal tea is prepared"); 		 
				 }
			}
	
		 


