package hackerRank;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases:");
		int t = sc.nextInt();
		
		while(t<0) {
			
		System.out.println("Enter the number you want the table of:");
		int n = sc.nextInt();
		
			for(int i=1; i<=10; i++) {
				
				int result = n * i;
				System.out.println(n + " * " + i + " = " + result);
				t--;
				
			}
		}
	}
}
