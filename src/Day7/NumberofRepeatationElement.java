package Day7;

public class NumberofRepeatationElement {

	public static void main(String[] args) 
	{
		int a[]= {100,200,300,400,500,500,500,600,700,500};
		int num=500;
		int count=0;
		
		for (int value:a)
		{
			if (value==num)
			{
				count++;
			}
		}
		  System.out.println(count);
	}

}

