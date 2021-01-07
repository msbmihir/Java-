package practice;

public class Main {
	
	
	static void run() { // this is a method
		System.out.println("Mihir is running");
	}
	static void MyDescription(String Name, int Age) {
		System.out.println("My name is " + Name + " & my age is " + Age);
	}
	static int addition(int x, int y) {
		return x + y;
	}
	static void CheckAge(int age) { // this is a recursive method
		if(age>18 || age==18) {
			System.out.println("Your an adult");
		} else {
			System.out.println("Hello teeni!");
		}
	}
	static int addition(int a, int b, int c) {
		return a+b+c;
	}
	public static int sum(int k) {
		if(k>0) {
			return k + sum(k-1);
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		MyDescription("Mihir", 20);
		run();
		System.out.println(addition(10,2));
		CheckAge(20);
		System.out.println(addition(10,20,32));
		System.out.println(sum(10));
		
		
	} 
}
