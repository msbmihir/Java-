package arrays;
import java.util.Scanner;

public class AverageMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students" + " ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		System.out.println("Enter the marks");
		
		for(int i=0; i<n; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		int sum = 0;
		int average = 0;
		
		for(int i=0; i<n; i++)
		{
			sum = sum + marks[i];
		}
		
		average = sum / n;
		System.out.println("Average is :" + average);	
	}
}
