package rough;
import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args)  
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int a = sc.nextInt();
			float b = sc.nextFloat();
			double c = sc.nextDouble();
			long l = sc.nextLong();
			byte d = sc.nextByte();
			
			double p = c/b;
			double q = b/a;
			double r = c/a;
			double s = (c/a) + l;
			double result = a/d;
			
			System.out.print(p + " ");
			System.out.print(q + " ");
			System.out.print(r + " ");
			System.out.print(s + " ");
			System.out.print(result + " ");
			t--;
		}
	}
}