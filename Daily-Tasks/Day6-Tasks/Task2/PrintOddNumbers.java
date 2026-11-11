/*Question:

Write a Java program to print all odd numbers from 1 to 50 using a for loop.

Initialize the variable i with 1, check the condition i <= 50, and increment the value of i by 2 in each iteration. Display all odd numbers from 1 to 50 on separate lines.*/

package Package1;

public class PrintOddNumbers {

	public static void main(String[] args) {
		for(int i=1; i<=50; i+=2) 
		{
			System.out.println(i);
		}

	}

}
