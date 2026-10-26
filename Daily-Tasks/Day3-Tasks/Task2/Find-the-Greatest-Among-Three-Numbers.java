/*Question:

Write a Java program to find the greatest among three integer numbers entered by the user using the Scanner class and if-else if-else statements.

Get three numbers as input from the user and compare them using conditional and logical operators. Display which number (A, B, or C) is the greatest. If no single number is greater than the other two, display "Please Enter any Greatest Number".*/


package Package1;

import java.util.Scanner;

public class Day3_Task5 {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a= ac.nextInt();
		int b= ac.nextInt();
		int c= ac.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A Is Greater");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("B Is Greater");
		}
		
		else if(c>a && c>b)
		{
			System.out.println("C Is Greater");
		}
		
		else
		{
			System.out.println("Please Enter any Greatest Number");
		}
		
	}

}
