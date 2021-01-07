package inheritence;

public class Teacher extends Person
{
	public Teacher(String name)  // constructor
	{
		super(name); // parent class constructor gets called
		System.out.println("Inside teacher constructor");
	}
	public void teach()
	{
		System.out.println(name + " is teaching");
	}
	public void eat()
	{
		super.eat();  //super is used to access something from the parent class
		System.out.println("Teacher " + name +" is eating");
	}
	public static void laughing()
	{
		System.out.println("Teacher is laughing");
	}
}
