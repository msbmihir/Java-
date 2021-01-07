package conditionalStatements;
import java.util.Scanner;

public class ElseIfLadder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float No = sc.nextFloat();
		
		if(No<=10)
		{
			System.out.println("Your Number is lies between 1-10");
		}
		else if(No>10 && No<=20)
		{
			System.out.println("Your Number is lies between 10-20");
		}
		else if(No>20 && No<=30)
		{
			System.out.println("Your Number is lies between 20-30");
		}
		else
		{
			System.out.println("Your Number is greater than 30");
		}
	}
}
