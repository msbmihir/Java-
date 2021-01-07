package practice;

public class MainOne {
	int age = 30; // fields, methods of MainOne class
	static void welcome() {
		System.out.println("Welcome to the program techie! Form a static method :)");
	}
	public void publicMethod() {
		System.out.println("Welcome to the program techie! from a public method ;)");
	}
	
	public static void main(String[] args) {
		
		welcome();
		
		MainOne obj = new MainOne(); // creating an obj of MainOne class
		System.out.println(obj.age);
		obj.publicMethod();
	}
}
