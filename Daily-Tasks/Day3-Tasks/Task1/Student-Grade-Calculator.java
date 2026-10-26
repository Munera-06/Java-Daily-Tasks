/*Question:

Write a Java program to calculate a student's grade based on the marks entered by the user using the Scanner class and if-else if-else statements.

Get the student's mark as input (out of 100) and display the corresponding grade according to the following criteria:
- 0–40: F Grade
- 41–60: D Grade
- 61–80: B Grade
- 81–90: B+ Grade
- 91–100: A Grade
If the entered mark is outside the valid range of 0 to 100, display "Invalid".*/


package Package1;

import java.util.Scanner;

public class Day3_Task4 {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		System.out.println("Enter Your Mark:");
		int a= ac.nextInt();
		
		if(a>0 && a<=40)
		{
			System.out.println("F Grade");
		}
		
		else if(a>40 && a<=60)
		{
			System.out.println("D Grade");
		}
		
		else if(a>60 && a<=80)
		{
			System.out.println("B Grade");
		}
		
		else if(a>80 && a<=90)
		{
			System.out.println("B+ Grade");
		}
		
		else if(a>90 && a<=100)
		{
			System.out.println("A Grade");
		}
		
		else
		{
			System.out.println("Invalid");
		}
	}

}
