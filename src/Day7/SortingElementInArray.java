package Day7;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {100,700,943,653,267,845,457,675,386,294};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);   //  sort elements in Array
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(a));
	}

}
