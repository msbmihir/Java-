package encapsulations;
import java.util.Scanner;

public class EncapsulationsIntroduction 
{
	public static void main(String[] args) 
	{
		Student obj = new Student();
		
		obj.setAge(32);
		System.out.println("your age is " + obj.getAge());
		
		Scanner sc = new Scanner(System.in);	
	}
}
