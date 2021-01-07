package inheritence;

public class Person 
{
	protected String name; // visible / accessible to itself & children
	
	public Person(String name)
	{
		this.name = name;
		System.out.println("Inside teacher constructor");
	}
	
	public void walk()
	{
		System.out.println(name +" is walking");
	}
	public void eat()
	{
		System.out.println(name +" is eating");
	}
	public static void laughing()
	{
		System.out.println("Person is laughing");
	}
}
