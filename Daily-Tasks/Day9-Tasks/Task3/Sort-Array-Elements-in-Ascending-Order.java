/*Question:

Write a Java program to sort the elements of an array in ascending order using nested for loops. Compare each element with the remaining elements and swap their positions whenever the current element is greater than the next element.*/

package Package1;

public class Day8 {

	public static void main(String[] args) {
		int temp=0;
		int a[]= {5,1,2,3};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]+" ");
		}

	}

}
