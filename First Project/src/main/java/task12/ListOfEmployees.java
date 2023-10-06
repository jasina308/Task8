package task12;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListOfEmployees {

	public static void main(String[] args)
	{
		//Tree Map created with its implemention  
		TreeMap<Integer,String> emp=new TreeMap<Integer,String>();
		emp.put(5140, "Priya");
		emp.put(9140, "Divya");
		emp.put(4140, "Suresh");
		emp.put(3140, "Arun");
		emp.put(2140,"Venkat");
		System.out.println("Employee list before sorting :");
		for(Map.Entry entry:emp.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		//Treemap values converted to Treeset for sorting
		
		TreeSet<String> s=new TreeSet<String>(emp.values());
		
		Iterator<String> i=s.iterator();
		System.out.print("List of Employees after sorting:\n");
		while (i.hasNext())
		{
		System.out.println(i.next());
		
		}
		
	}

}
