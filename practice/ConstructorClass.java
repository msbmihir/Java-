package practice;

public class ConstructorClass{ // class
	
	String name;
	int RollNo; // attributes of class
	int weight;
	
	public ConstructorClass(String MyName, int MyRollNo, int wt) { // constructor
		name = MyName;
		RollNo = MyRollNo;
		weight = wt;
	}
	
	public static void main(String[] args) {
		ConstructorClass obj1 = new ConstructorClass("Mihir", 20, 70); // constructor is called when the object is created
		System.out.println(" Name: " + obj1.name + " " + " age: " + obj1.RollNo + " " + " weight: " + obj1.weight);
	}
}
