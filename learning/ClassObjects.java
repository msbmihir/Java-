package learning;

class cat{
	int legs,eyes;
	String color;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("My cat has " + legs + " legs and " + eyes + " eyes");
	}
}
public class ClassObjects {
	
	public static void main(String[] args) {
		
		cat cat1 = new cat();
		cat1.legs = 4;
		cat1.eyes = 2;
		cat1.description();
		cat1.walk();
		cat1.eat();
		
		cat cat2 = new cat();
		cat2.legs = 4;
		cat2.eyes = 2;
		cat2.description();
		
	}
}

