package objectOrientedProgEncapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
	
		laptop l1 = new laptop();
		l1.setPrice(20000);
		System.out.println(l1.getPrice());
	}
	
	public void doWork() {
		System.out.println("Working in encapsulation class.");
	}
}	
	
	class laptop {
		int ram;
		private int price;
		
		public void setPrice(int price) {
		
		boolean isAdmin = true;
		if(!isAdmin) {
			System.out.println("You cannot set");
		} else {
			this.price = price;
		}
	}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public int getPrice() {
			return price;
		}
}

