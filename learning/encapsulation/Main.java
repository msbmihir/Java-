package learning.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Student obj = new Student();
		
		obj.setAge(20);
		System.out.println(obj.getAge());
		
		obj.setName("mihir");
		System.out.println(obj.getName());
		
	}
}
