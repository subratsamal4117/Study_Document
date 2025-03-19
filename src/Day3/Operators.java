package Day3;

public class Operators {

	public static void main(String[] args)
	{
		// Arithmetic operators  +  -  *  /  %
		
		/*int a=100,b=200;
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Difference of a and b is:"+(b-a));
		System.out.println("Multipication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(b/a));
		System.out.println("Modulo division of a and b is:"+(b%a));
		
		int result=a+b;
		System.out.println("Sum of a and b is:"+result);
		
		// Relational/comparison operators  >  >=  <  <=  !=  ==
		// returns boolean value -- true/false
		
		System.out.println(a>b);  // false
		System.out.println(a<b);  // true
		System.out.println(a>=b);  // false
		System.out.println(a<=b);  // true 
		a=250;
		System.out.println(a<=b);  // false (both cases are false)
		System.out.println(a>=b);  // true  (one option is true)
		System.out.println(a!=b);  // true (both values are different)
		System.out.println(a==b);  // false (values are different)
		
		boolean res=a>b;
		System.out.println(res);*/
		
		// Logical operators   &&  ||  !
		// returns boolean value -- true/false
		// works between 2 boolean values
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);    // false (because one of value is false)
		System.out.println(x||y);   // true (one of value is true)
		System.out.println(!y);     // true (it's value is false)
		System.out.println(!x);     // false (it's value is true)
		
		/*boolean B1=10>25;
		System.out.println(B1);   // false (because 10 less than 25)
		boolean B2=16<25;
		System.out.println(B2);   // true (16 less than 25)
		System.out.println(B1&&B2);
		System.out.println(B1||B2);
		System.out.println(!B1);
		System.out.println(!B2);*/
		

	}

}
