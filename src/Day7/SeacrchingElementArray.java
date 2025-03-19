package Day7;

public class SeacrchingElementArray {

	public static void main(String[] args) 
	{		
		int a[] = {100,200,250,340,460,750,980,980,980,1000};
		int search_element = 980;
		
		boolean status=false;        //      false - Not found              true - found
		
   /*   for (int i=0;i<a.length;i++)
		{
			if (a[i]==search_element)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
		}     */
		
		for (int x:a)
		{
			if (x==search_element)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
		}
			if (status==false)
			{
				System.out.println("Element Not Found");
			}
	} 
}
