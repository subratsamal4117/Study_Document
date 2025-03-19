package Day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) 
	{
		//    char s[]= {'D','F','K','E','H','M'};
		
		String s[]= {"zack","pinky","munal","prakash","rekha","subrat","a"+ "yush"};
		
		System.out.println("Before sorting"+ Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting"+ Arrays.toString(s));
	}
	

}
