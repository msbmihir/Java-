package learning;

public class MethodsFunctions {

	public static void main(String[] args) {
		
		int firstNumber = 25;
		int secondNumber = 21;
		int result = 0;
		result = maxOf(firstNumber, secondNumber);
		System.out.println("Largest no is " + result);

		

	}
	
	static int maxOf(int a ,int b) {
		
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	
}

	
