package whileLoops;
import java.util.Scanner;

public class SumOfDigits 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 int temp = n;
		 int sum = 0;
		 
		 while( n > 0)
		 {
			 
			 int lastDigit = n % 10;
			 n = n / 10; // OR temp = n / 10;
			 sum = sum + lastDigit;
			 
		 }
		 System.out.println("Sum of digits = "+ sum);
	}

}
