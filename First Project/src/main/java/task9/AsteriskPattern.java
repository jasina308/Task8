package task9;

import java.util.Scanner;

public class AsteriskPattern {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,j,n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value :");
        n=obj.nextInt();
        int m=n;// copy of n should be needed to decrement
        for (i=1;i<=n;i++)
        {
        	for (j=n;j>=1;j--)
        	{
        		if (j==i||j==m) 
        			System.out.print("*");
        			else
        		System.out.print(" ");	
        		
        	}
        	m=m-1;
        	System.out.println();
        }
        
        obj.close();

	}

}
