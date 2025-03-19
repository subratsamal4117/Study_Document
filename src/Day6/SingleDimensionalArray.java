package Day6;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{		
      
		//   Declare array and Add values in array :
		
		// Approach 1 :
		
	/*   int a[] = new int[5];
		
		 a[0] = 100;
		 a[1] = 200;
		 a[2] = 300;
		 a[3] = 400;
		 a[4] = 500;
	*/
	    // Approach 2 :
		 
		int a[] = {100,200,300,400,500};
		
	   //  Find length of an array :
		
		System.out.println("Length of an array: "+a.length);
		
	  // Read single value from an array :
		
		System.out.println(a[3]);    // Here 3 is index number.
		
	  //  Read all values from an array :
		
		// Normal for loop : 
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		// Enhanced for loop/ for each loop
		
		for (int x:a)
		{
			System.out.println(x);
		}
	}

}
