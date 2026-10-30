/*Question:

Write a Java program to print numbers from 33 to 1 in descending order using a for loop.

Initialize the variable i with 33, check the condition i >= 1, and decrement the value of i by 1 in each iteration. Display each number from 100 to 1 on a separate line.*/

package Package1;

public class Day5_Task2 {

	public static void main(String[] args) {
		for(int i=33; i>=1; i--)//i=33 33>=1 i=32 i>=1 
		{
			System.out.println(i);
		}
	}

}
