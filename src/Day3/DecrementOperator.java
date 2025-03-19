package Day3;

public class DecrementOperator {

	public static void main(String[] args) 
	{
		//  -- is called Decrement operator
		
		int a=25;
		a=a-1;
		System.out.println(a);  //  24
		a--;
		System.out.println(a);  //  23
		int z=a--;				//  It's called PostDecrement
		System.out.println(z);   //  23   But the actual value of a is 22.
		z=a;
		System.out.println(z);   // 22     now the actual updated value of 'a' is now assign to 'z'
		z=--a;					// 	It's called PreDecrement
		System.out.println(z);  // 21     first the decrement process is done and then the value assigned.
		

	}

}
