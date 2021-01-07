package forLoop;

public class ContinueStatement 
{
	public static void main(String[] args) 
	{	
		for(int i=0; i<=100; i++)
		{	
			if(i>=50 && i<=90)
			continue;
			{
				System.out.println(i);
			}	
		}
	}
}
