package task9;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num,value=1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value :");
        num=obj.nextInt();
        for (i=1;i<=num;i++)
        {
        	for(j=1;j<=i;j++)
        	{
        		System.out.print(value+" ");
        		value++;
        	}
        	System.out.println();
        }
        obj.close();

	}

}
