package Day5;

public class ContinueStatement {

	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++)
		{
			if (i==5 || i==7 || i==9)      // these numbers are not printed
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
