package exceptionprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FilenotFound {

	public static void main(String[] args) 
	{
		try {
			
			FileOutputStream file=new FileOutputStream("abc.txt");
		}
		catch(FileNotFoundException e)
		{
			
			e.printStackTrace();
			
		}
		System.out.println("file not found exception occured");
	}

}
