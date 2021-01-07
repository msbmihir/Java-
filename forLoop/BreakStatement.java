package forLoop;
import java.util.Scanner;

public class BreakStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(;;)
		{
			if ( n<0 )
			{
				break;
			}
		}	
	}
}
