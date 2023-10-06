package exceptionprograms;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		

        int ar[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= ar.length; i++)
                System.out.print(ar[i]+" ");
        }
     // array index is from 0 to 4 but here we are trying to access the 5 th element of the array
        catch (ArrayIndexOutOfBoundsException e)  
        {
            System.out.println("\nArray Index out of bound Exception");
        }
	}

}
