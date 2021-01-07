package oops;

class Cat // cat class
{
	boolean hasFur;
	String color, breed;   // these are states 
	int legs, eyes;
	
	public void walk()  // this is a function, behaviour
	{
		System.out.println("Cat is walking");
	}
	public void eat()
	{
		System.out.println("Cat is eating");
	}
	public void description()
	{
		System.out.println("My cat has "+ legs +"legs "+ eyes +"eyes ");
	}
}

class dog
{
	String breed, name;
	
	public void jump() // function
	{
		System.out.println("My dog " + name + " jumped");
	}
	public void description()
	{
		System.out.println("My dogs name is " + name + " & his breed is " + breed);
	}
	
}

public class declaration 
{
	public static void main(String args[])
	{
		Cat cat1 = new Cat(); // This is object of Cat class
		Cat cat2 = new Cat();
		
		cat1.eat(); // eat is a function
		cat2.walk();
		
		cat1.legs = 4;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 2;
		
		cat1.description();
		cat2.description();
		
		dog dog1 = new dog();
		dog dog2 = new dog();
		
		dog1.breed = "Pug";
		dog2.breed = "Labrador";
		
		dog1.name = "Sheero";
		dog2.name = "Tuffy";
		
		dog1.jump();
		dog1.description();
		
		dog2.jump();
		dog2.description();	
	}
}
