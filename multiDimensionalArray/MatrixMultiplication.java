package multiDimensionalArray;
import java.util.Scanner;

public class MatrixMultiplication 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the dimmensions of the matrix");
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		
		System.out.println("Enter matrix A");
		
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter matrix B");
		
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		int c[][] = new int[row][col];
		
		System.out.println("Muktiplication is :");

		for(int k=0 ; k<row ; k++)
		{
			for(int j=0 ; j<col ; j++)
			{
				
			}
		}
		
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
			System.out.println(c[i][j]);
			}
		}
	}

}
