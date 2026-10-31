/*Question:

Write a Java program to find the factorial of a given number using a for loop.

Initialize the variable number with 5 and the variable factorial with 1. Use a for loop to multiply all numbers from 1 up to the given number and store the result in the factorial variable. Finally, display the calculated factorial.*/

package Package1;

public class Day5_Task7 {

	public static void main(String[] args) {
		int number=5;
		int factorial=1;
		
		for(int i=1; i<=number; i++)//i=1 1<=5 i=2 i<=5
		{
			factorial= factorial*i; //1*1=1  1*2=2 
			
		}
		System.out.println(factorial);
		
	}

}
