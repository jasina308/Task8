package task12;
import java.util.ArrayList;
import java.util.Iterator;

public class listOfNames {

	public static void main(String[] args)
	{
		// An array list is created with the implemenation ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("Monica");
		names.add("Joey");
		names.add("Ross");
		names.add("Rachel");
		names.add("Emma");
		
		Iterator<String> i=names.iterator();
		System.out.print("List of names:\n");
		while (i.hasNext())
		{
		System.out.println(i.next());
		
		}
		//Clear method is used to clear all items from arraylist
		names.clear();
		System.out.println("The list is cleared:"+names);

}
}
