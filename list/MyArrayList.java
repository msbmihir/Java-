package list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList();
		LinkedList<String> vegetables = new LinkedList();
		
		fruits.add("Orange");
		fruits.add("Apple");
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		System.out.println(fruits.set(0, "kiwi"));
		System.out.println(fruits.contains("kiwi"));
		
		vegetables.add("Pineapple");
		vegetables.add("banana");
		
		fruits.addAll(vegetables);
		System.out.println(fruits);
		
		
		ArrayList<Integer> marks = new ArrayList();
		
		marks.add(22);
		marks.add(33);
		System.out.println(marks);
		
		Pair<String, Integer> p1 = new Pair("Anuj", 234);
		Pair<Boolean, String> p2 = new Pair(true, "hey bro");
		
		p1.getDescription();
		p2.getDescription();
	}
}
