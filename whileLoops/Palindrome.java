package whileLoops;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		
		while(temp > 0)
		{
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp = temp / 10;
		}
		if( reverse == n )
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
