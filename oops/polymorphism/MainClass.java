package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
//		greeting();
//		greeting("mihir", 4);
		
		Dog d = new Dog();   //  runtime polymorphism as we get to know what function is running on execution.
		Pet p = d;
		Animal a = d; // over riding is runtime polymorphism
		
		System.out.println(d.name);
		System.out.println(p.name);
		
		d.walk(); // slower
		p.walk();
	}
		public static void greeting() {
			System.out.println("Hello");   //  compile time polymorphism
		}
		public static void greeting(String s) {
			System.out.println(s);  //over loadingy is runtime polymorphism
		}
		public static void greeting(String s, int count) {
			for(int i=0; i<count; i++)  // faster
			System.out.println(s);
		}	
}



// * imp * methods always override , variables don't,

