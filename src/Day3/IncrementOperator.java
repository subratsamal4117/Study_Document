package Day3;

public class IncrementOperator {

	public static void main(String[] args)
	{
		
		// ++ is called Increment operator
		
		int a=15;
		System.out.println(a);
		a=a+1;
		System.out.println(a);     // 16
		a++;
		System.out.println(a);     // 17      ('a++'  and  'a+1'  both are equal meaning increased the value of 1)
		
		int Z=a++;				   // It's called PostIncrement
		System.out.println(Z);     //  17   the value of 'a' is increased to 18,but still it is not assign to 'Z'
		
		int res=++a;			   // It's called PreIncrement
		System.out.println(res);   // here the value of 'a' is increased to 19 and then it assign to 'res'
		
	}

}
