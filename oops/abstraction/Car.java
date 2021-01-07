package oops.abstraction;

public abstract class Car {  // after making a class abstract we cannot make object of that class.

	public abstract void accelerate();  // abstract keyword.
	
	public abstract void breaking();  // now access data form there children class.
	
	public void honk() {  // a non abstract function can be created inside a abstract class.
		
	}
}
 