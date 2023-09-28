package task9;

import java.util.Scanner;

public class HotelTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_month,number_days;
		float rent_perday;
		double rent;
		Scanner obj = new Scanner(System.in);
        System.out.println("Enter the current month  :");
        number_month=obj.nextInt();
        System.out.println("Enter the no of days staying in hotel:");
        number_days=obj.nextInt();
        System.out.println("Enter the rent per in the hotel:");
        rent_perday=obj.nextInt();
       double inc_tariff=(double) (rent_perday+(rent_perday*0.2));
        switch(number_month)
        {
        case 1: 
        	rent= number_days*rent_perday;
        	System.out.println("\n" +rent);
        	break;
        case 2:
        	rent= number_days*rent_perday;
        	System.out.println("\n" +rent);
        	break;
        case 3:
        	rent= number_days*rent_perday;
        	System.out.println("\n" +rent);
        	break;
        case 4:
        	rent = number_days*inc_tariff;
        	System.out.println("\n" +rent);
        	break;
        case 5:
        	rent = number_days*inc_tariff;
        	System.out.println("\n" +rent);
        	break;
        case 6:
        	rent = number_days*inc_tariff;
        	System.out.println("\n" +rent);
        	break;
        	
        case 7:
        	rent= number_days*rent_perday;
        	System.out.println("\n" +rent);
        	break;
        case 8:
        	rent= number_days*rent_perday;
        	System.out.println("\n" +rent);
        	break;
        case 9:
        	rent= number_days*rent_perday;
        	System.out.println("\n" +rent);
        	break;
        case 10:
        	rent= number_days*rent_perday;
        	System.out.println("\n" +rent);
        	break;
        case 11:
        	rent = number_days*inc_tariff;
        	System.out.println("\n" +rent);
        	break;
        case 12:
        	rent = number_days*inc_tariff;
        	System.out.println("\n" +rent);
        	break;
        default:
        	System.out.println("Invalid number");
        	break;
        	
        	
        }
        obj.close();
        
	}

}
