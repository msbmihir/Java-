package rough;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
		char[] c = s.toCharArray();
		int lowerCase = 0;
		int upperCase = 0;
		int specialCase = 0;
		int numericCase = 0;
		
		for(int i=0 ;i<s.length(); i++){
			if(Character.isUpperCase(c[i])){
				System.out.println("upperCase");
				
			}else if(Character.isLowerCase(c[i])){
				System.out.println("LowerCase");
				
			}else if(Character.isDigit(c[i])){
				System.out.println("Digit");
				
			}else {
				System.out.println("SpecialCase");
				break;
			}
		}
	}
}
