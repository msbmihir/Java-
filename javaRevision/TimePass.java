package javaRevision;
import java.util.Scanner;
			
public class TimePass
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the rate");
//		float r = sc.nextFloat();
//		System.out.println("Enter the principle value");
//		int p = sc.nextInt();
//		System.out.println("Enter the time");
//		int t = sc.nextInt();
//		
//		Float si = ( r * p * t )/100;
//		System.out.println("Simple Interest is: " + si);
		
//		int a = 10;
//		int b = 20;
//		int c = a & b;
//		System.out.println(c);
//		System.out.println("Enter a number : ");
//		int no = sc.nextInt();
//		
//		if(no%2 == 0){
//			System.out.println("No is even");
//		}
//		else{
//			System.out.println("No is odd");
//		}
		
//		System.out.println("Enter a number : ");
//		int no = sc.nextInt();
//		
//		if(no<=10) {
//			System.out.println("No is less than or equal to 10");
//		}
//		else if(no>10 && no<20){
//			System.out.println("No is greater than 10 & less than 20");
//		}
//		else if(no>20 && no<30) {
//			System.out.println("No is greater than 20 & less than 30");
//		}
//		else {
//			System.out.println("Entered Number is out of range");
//		}
		
		int a=10, b=20 , c=43;
		int maxOfBoth = 0;
		
		maxOfBoth = (a>b) ? (a>c) ? a : c : (b > c) ? b : c;
		System.out.println("Greatest Number  is " + maxOfBoth);
	}
}