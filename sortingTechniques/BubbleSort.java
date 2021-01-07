package sortingTechniques;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[] = {7,5,4,2,0,-1,9,10,11,15,55};
		int n = a.length;
		int temp = 0;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)//to make the code even more optimised me can --> for(int j=0; j<n-1-i; j++) bcoz in BS the largest element is at nth location so no need to scan the whole thing again & again.
			{
				if(a[j+1] < a[j])
				{
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int item: a)
		{
			System.out.print(item + "  ");
		}
	}
}
