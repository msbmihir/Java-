package conditionalStatements;

public class ShorthandIfElse 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int maxOfTwo = 0;
		
		maxOfTwo = a > b  ? a : b ;
		
		System.out.println("Greater number between two is " + maxOfTwo);
		
	}
}
