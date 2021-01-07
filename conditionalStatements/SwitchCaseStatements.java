package conditionalStatements;
import java.util.Scanner;

public class SwitchCaseStatements 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week day number:");
		int Day = sc.nextInt();
		
		switch(Day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thursday");
			break;	
		case 5:
			System.out.println("Fri");
			break;	
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;	
		default:
			System.out.println("sleep");
		}
	}
}
