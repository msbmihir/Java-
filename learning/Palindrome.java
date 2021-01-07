package learning;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		
		while(temp>0) {
			
			int lastDigit = temp % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			temp = temp / 10;
		}
		if(reversedNumber == n) {
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
}
