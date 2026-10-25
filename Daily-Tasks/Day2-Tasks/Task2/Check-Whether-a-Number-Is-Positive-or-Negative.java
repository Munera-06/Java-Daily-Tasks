/*Write a Java program to check whether a given integer is a positive number or a negative number
 *  using the Scanner class and if-else statements.*/

package Package1;

import java.util.Scanner;

public class Day3_Task2 {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a= ac.nextInt();
		
		if(a>=0)
		{
			System.out.println(a+ " Positive Number");
		}
		
		else
		{
			System.out.println(a+ " Negative Number");
		}
	}

}
