package oops.abstraction;

public class RepairShop {
	
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}
	
	public static void main(String[] args) {
		
		Wagonr wagonR = new Wagonr();
		Audi audi = new Audi();
		
//		Car car = new Car();   OBJ CANNOT BE CREATED OF A ABSTRACT CLASS.
		
		repairCar(wagonR);
		repairCar(audi);
	}
}
