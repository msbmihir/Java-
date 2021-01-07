package conditionalStatements;

public class NestedIfElse 
{
	public static void main(String[] args) 
	{
		int a=10 , b=20 , c=15;
		int result = 0;
		
//		if(a > b)
//		{
//			if(a > c)
//			{
//			System.out.println("Largest No. is a");
//			}
//		}
//		else
//		{
//			System.out.println("Largest No. is c");
//		}
//		else
//		{
//		if(b > c)
//		{
//			System.out.println("Largest No. is b");
//		}
//	}
//}
		result = a > b ? a > c ? a : c : b > c ? b : c ;
	
		System.out.println(result);
	}
}	

