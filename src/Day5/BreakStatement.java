package Day5;

public class BreakStatement {

	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++)
		{
			if (i==5)             // when i values becomes 5 then it exit the for loop.
			{
				break;
			}
			System.out.println(i);
		}
	}

}
