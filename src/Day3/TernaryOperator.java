package Day3;

public class TernaryOperator {

	public static void main(String[] args) 
	{
		
		// var=exp ?    result 1:       result 2:
		
		int a=200,b=150;
		int x=(a>b)? a:b;    // (For true case 'a' value will store in 'x')
		
		//int x=(a<b)? a:b;   // (For false case 'b' value will store in 'x')
		
		System.out.println(x);
		
		int z=(3==3)? 250:350;     // For true case first value will assign to 'z'
		System.out.println(z);
//		
//		int m=(1==2)? 250:350;     // For false case second value will assign to 'm'
//		System.out.println(m);
//		
//		int person_age=30;
//		String res=(person_age>=25)? "Eligible":"Not Eligible";
//		System.out.println(res);

	}

}
