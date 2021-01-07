package methods;
import java.util.Scanner;

public class introduction 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int firstNo = 30;
		int secondNo = 40;
		
		int result = maxOf(firstNo, secondNo);
		
		System.out.println(result);
		
		sayHi();
		
//		int firstNumber = 10;
//		double secondNumber = 3.2;		
//		int result1 = maxOf(firstNo, secondNo);
//		System.out.println(result1);
		maxOf(3.2);
	} 
	
	static int maxOf(int a ,int b) // maxOf is a method
	{
		if(a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	static int maxOf(double b) // This is method overloading. Having methods of same name but different datatypes.
	{
		System.out.println(b);
		return 0;
	}
	
	static void sayHi() // sayHi is a method
	{
		System.out.println("hi");
		System.out.println("hello");
	}
}
