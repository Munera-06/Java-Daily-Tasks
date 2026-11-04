/*Question:

Write a Java program to print an inverted left-aligned triangle star pattern based on the number of rows entered by the user using nested for loops.

Get the number of rows as input from the user. Use an outer for loop to control the rows and an inner for loop to print stars (*).

Start with the maximum number of stars in the first row and decrease the number of stars by 1 in each subsequent row until only one star remains.*/

package Package1;

import java.util.Scanner;

public class Day6_Task4 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int line=ac.nextInt();
		int star=line;
		
		for(int i=1; i<=line;i++)
		{	
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}

	}

}
