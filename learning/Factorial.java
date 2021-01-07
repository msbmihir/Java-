package learning;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want the Factorial of : ");
		int f = sc.nextInt();
		int result = 1;
		
		for(int i=f; i>=1; i--) {
			
			result = result * i;
			
		}
		System.out.println(result);
	}
}
