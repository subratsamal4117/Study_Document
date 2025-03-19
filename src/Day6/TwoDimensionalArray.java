package Day6;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		// Declaring Array
		
		// Approach 1 :
			
		/* int a[][] = new int[3][2];
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		*/
		
		// Approach 2 :
		
		int a[][]= { {100,200}, {300,400}, {500,600} };
		
		// Find size of an Array :
		
		System.out.println("Rows of an Array: "+a.length);
		System.out.println("Columns of an Array: "+a[0].length);
		
		// Read single value from an Array :
		
		System.out.println(a[2][1]);   // Here we are putting the Index number to find the values. i.e means(3rd rows and 2nd column)
		
		
		//  Print all values in a tabular form :
		
		// normal for loop 
		
		for (int r=0;r<a.length;r++) 
		{
			for (int c=0;c<a[0].length;c++)
			{
				System.out.print(a[r][c]+"  ");   // for space purpose using this concatenation
			}
			System.out.println();   // Using it tabular form
		}
		
		// enhanced for loop :
		
		for (int arr[]:a)
		{
			for (int x:arr)
			{
				System.out.print(x+"  ");
			}
			System.out.println();
		}
	}

}
