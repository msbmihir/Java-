package oops;

// *once a constructor is declared by us we cannot call the default constructor* , but if still want some default vales we will declare an empty constructor.

class Vehicle // vehicle class
{
	int wheels; // state
	String color; // state
	int headlights;
	
	Vehicle(int wheels) // constructor of vehicle class, this is a no argument constructor.
	{
		this.wheels = 4; // advantage of declaring this inside the constructor is that whenever ill make an object of this class wheels will always be defined.
	}

	Vehicle(int wheels, String color) // example of constructor overloading.
	{
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
	
	Vehicle() // this is for default values if requirement arises.
	{
		
	}
}	

class Automobile
{
	int doors; // states
	int headlights;
	
	Automobile(int noOfDoors) //  this is a parameterised constructor of automobile class.
	{
		doors = noOfDoors;
		headlights = 2; // this is used when a certain state has same vales for any type for example any automobile has 2 head lights.
	}
}

class MotorVehicles
{
	int doors; // states
	int headlights;
	
	MotorVehicles(int doors) //  this is a parameterised constructor of automobile class.
	{
		this.doors = doors; // "this" keyword is used to point a current object, when the two objects have same name.
		headlights = 2; // this is used when a certain state has same vales for any type for example any automobile has 2 head lights.
	}
}

public class MyConstructor  // MyConstructor class
{
	MyConstructor() // constructors name is same as that of class name, this is a no argument constructor.
	{
		 System.out.println("Object is now created");
	}
	
	public static void main(String[] args) 
	{
		MyConstructor obj = new MyConstructor(); // object of constructor class
		
		Vehicle car1 = new Vehicle(); //  object of vehicle class
		Vehicle car2 = new Vehicle();
		Vehicle car4 = new Vehicle(4, "red");
		Vehicle car5 = new Vehicle(); // default constructor
//		car.wheels = 4;
		System.out.println("Car 1 has " + car1.wheels + " wheels");
		System.out.println("Car 2 has " + car2.wheels + " wheels"); // because of constructor every object of vehicle class will declare 4 wheels.
		System.out.println("Car 4 has " + car4.wheels + " wheels & color =" + car4.color ); //constructor overloading
		
		Automobile car3 = new Automobile(4); // advantage of PARAMETERISED constructors is that it is customisable every time a object is declared.
		System.out.println("Car 3 has " + car3.doors + " doors");
		System.out.println("Car 3 has " + car3.headlights + " doors");
	}
}
