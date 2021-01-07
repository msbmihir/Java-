package learning;

class vehicle {
	
	int wheels;
	int headLights;
	String color;

	vehicle() {
		wheels = 4;
	}
	
	vehicle(int Noofwheels){
		wheels = Noofwheels; 
		headLights = 2;
	}
	
	vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}

public class MyConstructor {
	
	public static void main(String[] args) {
		
		 vehicle safari = new vehicle();
		 vehicle aprilia = new vehicle(2);
		 vehicle activa = new vehicle(3,"yellow");
		 
		 System.out.println("Safari has " + safari.wheels + " wheels");
		 System.out.println("Aprilia has " + aprilia.wheels + " wheels " + aprilia.headLights + " headlights");
		 System.out.println("Activa has " + activa.wheels + " wheels and the color is " + activa.color);
	}
}
