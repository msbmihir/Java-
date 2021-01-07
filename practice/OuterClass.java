package practice;

public class OuterClass {  // outer class
	int x = 10;
	
	class InnerClass { // inner class
		int y = 21;
	}

	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();  // object of outer class
		OuterClass.InnerClass myInner = myOuter.new InnerClass(); // object of inner class
		
		System.out.println(myOuter.x); 
		System.out.println(myInner.y);
	}
}

