package task12;

import java.util.LinkedList;

public class ListToArray {

	public static void main(String[] args) {
		//Linked list created with its implementation
		LinkedList<Integer> list=new LinkedList<Integer>();
		//Adding elements to list using add() method
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("The list is :"+list);
		//declaring a array
		int[] arr=new int[list.size()];
		//coverting a list to array
		// using get method
		for(int i=0;i<list.size();i++)
			arr[i]=list.get(i);
		//Printing array 
		System.out.println("The Array is:");
		for(int x:arr)
			System.out.println(x);
		
		
	}

}
