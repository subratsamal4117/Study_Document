package Day3;

public class AssignmentOperators {

	public static void main(String[] args) 
	{
		// Assignment  =  +=  -=  *=  /=  %=
		
		int a=50;
		a+=10;                     //    (increased by 10)
		System.out.println(a);     // 60   
		a+=20;                     //    (increased by 20)
		System.out.println(a);     // 80    
		a-=30;                     //     (decreased by 30)
		System.out.println(a);     // 50  
		a*=3;                      //     (Multiplied by 3)
		System.out.println(a);     // 150
		a/=6;                      //     (Divided by 6)
		System.out.println(a);     // 25
		a%=7;                      //    (Divided by 7 and remainder will be save in 'a')
		System.out.println(a);     // 4

	}

}
