package encapsulations;

public class Student 
{
		private int age; // fields // private is an access specifier
		private String name;
		
		public int getAge() // getter function for age // private is an access specifier
		{
			return age;
		}
		
		public void setAge(int age) // setter function for age
		{
			if(age>25)
			{
				System.out.println("Your above the minimum age criteria");
			}
			this.age = age;
		}

		public String getName() // getter function for name
		{
			return name;
		}

		public void setName(String name) // setter function for name
		{
			this.name = name;
		}

		
		
}
	