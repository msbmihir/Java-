package objectOrientedProgramming;

import objectOrientedProgEncapsulation.EncapsulationIntro;

public class InOneVideo {

	public static void main(String[] args) {
		
		person p1 = new person();
		p1.name = "Mihir";
		p1.age = 20;
		
		person p2 = new person();
		p2.name = "Titu";
		p2.age = 20;
		
		person p3 = new person(50, "Mihir S. Bhokre");
		p3.walk();
		p3.walk(2000);
				
		System.out.println(p1.age + " " + p1.name);
		System.out.println(p2.age + " " + p2.name);
		
		p1.eat();
		p2.walk();
		p2.walk(1000);
		
		System.out.println("Person class is executed " + person.count + " times.");
		
		developer d1 = new developer(24, "Mihir Sanjay Bhokre");
		d1.walk();
		d1.doWork();
		d1.code();
		
		EncapsulationIntro obj = new EncapsulationIntro();
		obj.doWork();
		
	}
}
 
	class developer extends person {
		
		public developer(int age, String name) {
			super(age,name);
		}
		void walk() {
			System.out.println("Developer " + name +" is walking.");
		}
	}

	class person {
		
		String name;
		int age;
		static int count;
		
		public person() {
		count++;
		System.out.println("Creating an object");
		}
		
		public person(int age, String name) {
			this();
			this.name = name;
			this.age = age;
		}
		
		void walk() {
			System.out.println(name + " is walking.");
		}
		
		void eat() {
			System.out.println(name + " is eating.");
		}
		
		void walk(int steps) {
			System.out.println(name + " walked " + steps + " steps");
		}
		void doWork() {
			System.out.println("Person is working.");
		}
		void code() {
			System.out.println(name + " developer is coding.");
		}
}
