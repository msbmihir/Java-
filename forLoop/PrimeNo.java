 package forLoop;
 import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean isPrime = true; 
		
		for(int i=2; i<n ;i++) // for making is more efficient you can use 
							 	// i*i<n;
		{
			if(n%i==0)
			{
				isPrime = false;
				break;
			}
		}
		
			if(n<2) 
			{
				isPrime = false;
			}
		System.out.println("is Prime" + isPrime);
		}
}
