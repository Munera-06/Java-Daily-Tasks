/*Question:

Write a Java program to print an increasing number triangle pattern based on the number of rows entered by the user. Use nested for loops to print numbers starting from 1 in each row, increasing the number of values by one in every next row.*/

package Package1;
import java.util.Scanner;

public class IncreasingNumberTrianglePattern {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int line= ac.nextInt();
		int num=1;
		
		for(int i=0; i<line; i++)//1<3--t
		{
			for(int j=1; j<=num; j++)//1<1
			{
				System.out.print(j);
			}
			System.out.println();
			num+=1;
		}
	}

}
