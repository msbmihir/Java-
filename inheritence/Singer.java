package inheritence;

public class Singer extends Person
{
	public Singer(String name)  // constructor
	{
		super(name); // parent class constructor gets called
		System.out.println("Inside singer constructor");
	}
	public void sing()
	{
		System.out.println(name +" is singing");
	}
	public void eat()
	{
		System.out.println("Singer " + name +" is eating");
	}
	public static void laughing()
	{
		System.out.println("Singer is laughing");
	}
}

	