package nestedForLoop;
import java.util.Scanner;

public class Pattern8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int number = 1;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n-i ; j++)
			{
				System.out.print("  ");
			}
			for(int k=1 ; k<=i; k++)
			{
				System.out.print(number +"   ");   // OR System.out.print(number++ +"   ");
				number = number + 1;
			}
			System.out.println();
		}

	}
}
