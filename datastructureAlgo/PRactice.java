package datastructureAlgo;

import java.util.Scanner;

public class PRactice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=0;
		
		while(t-- >0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i = 0;
			
			for(i=0; i<n; i++) {
				a[i] = sc.nextInt();
				int temp = a.length-1;
			
			
			
			for(i=n-1; i>0; i--) {
				a[i] = a[i-1];
			
			a[i] = temp[];
			}
			}
		}
	}
}
