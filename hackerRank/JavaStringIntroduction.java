package hackerRank;
import java.util.Scanner;

public class JavaStringIntroduction {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        System.out.println(length);

        if(A.length() > B.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        String result = A.toUpperCase() + B.toUpperCase();
        System.out.println(result);

	}
}
