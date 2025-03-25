
package Day5;

public class Whileloop_Demo {

	public static void main(String[] args) 
	{
//			int s=1;          //  initialization
//			
//			while (s<=10)     //  condition
//			{
//				System.out.println(s);        // It is printed from 1 to 10
//				s++;          //  increment
//			}    

		//  example 2:  print name 10 times
		/*  int s=1;
		
		while (s<=10)
		{
			System.out.println("Tukua");       //  It is printed Tukua name 10 times
			s++;
		}  */
		
		//  Example 3: Print even numbers between 1 to 10.
		
      //   Approach 1:
		
	/*	int s=2;
		
		while (s<=10)
		{
			System.out.println(s);
			s+=2;   // s=s+2;        same meaning
		}     */
		
		// approach 2:
		
	/*	int s=1;
		
		while (s<=10)
		{
			if (s%2==0)
			{
			System.out.println(s);
			}
			s++;
		}     */
		
		//  Example 4: 1 to 10 numbers define 'even' or 'odd'
		
		    int i=1;
		while (i<=10)
		{
			if (i%2==0)
			{
				System.out.println(i + " Even");
			}
			else
			{
				System.out.println(i + " Odd");
			}
			i++;
		}      
		
		//  Example 5:  Print from 10 to 1.
		
	/*	int s=10;
		
		while (s>0)
		{
			System.out.println(s);
			s--;
		} */
	}

}
