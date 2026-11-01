/*Question:

Write a Java program to print a right-angled triangle star pattern based on the number of rows entered by the user using nested for loops.

Get the number of rows as input from the user. Use an outer for loop to control the number of rows and an inner for loop to print stars (*) in each row.

Start with one star in the first row and increase the number of stars by 1 in each subsequent row.*/

package Package1;

import java.util.Scanner;

public class Day6_Task2 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int line=ac.nextInt();
		int star=1;
		for(int i=0; i<line; i++)
		{
			for(int j=0; j<star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star+=1; 
		}

	}

}
