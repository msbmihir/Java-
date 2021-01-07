package practice;
import java.time.*;

public class DateClass {

	public static void main(String[] args) {
	
		LocalDate myObj = LocalDate.now();
		LocalTime myObj1 = LocalTime.now();
		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println(myObj);
		System.out.println(myObj1);
		System.out.println(myObj2);

	}
}
