package practice;

public class MainTwo {
	
	private String name;

	public String getName() { // getter gets the value of String name
		return name;
	}
	public void setName(String newName) { // sets the desired value in the variable
		this.name = newName;
	}
	
	public static void main(String[] args) {
		MainTwo obj = new MainTwo();
		obj.setName("Titu"); // setting custom variable name 
		System.out.println(obj.getName());
	}
}
