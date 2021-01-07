package methods;

public class PassByValue 
{

	public static void main(String[] args) 
	{
		int c = 34;
		int d = 12;
		
		swap(c,d);
		System.out.println(c +" "+ d); // this proves that java is call by value as the OG vales don't change.
		
	}
	static void swap(int a, int b) 
	{
		int temp = a ;
		a = b;
		b = temp;
	}
	
	class dog
	{
		int legs;
	}
}
