package learning;
import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number you want the table of:");
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 0 ; i <= 10; i++) {
			result = i * n;
			System.out.println(result);
		} 
	}
}
