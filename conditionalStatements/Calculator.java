package conditionalStatements;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number:");
		int b = sc.nextInt();
		
		System.out.println("Enter the operation you want to perform with the 2 numbers:");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(operation)
		{
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;	
		case '%':
			result = a % b;
			break;	
		default:
			System.out.println("Invalid Operator");
			break;
		}
		
		System.out.println("The result is" + " " + result);
		
	}
}
