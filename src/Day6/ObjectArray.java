package Day6;

public class ObjectArray {

	public static void main(String[] args) 
	{
		Object a[]= {100,45.75,'A',"Wel Come",true};   // For Object case it store all types of data.
		
	/*  for (Object x:a)
		{
			System.out.println(x);
		}
		*/
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
