/*Question:

Write a Java program to print the multiplication table of a given number using a do-while loop.

Initialize the variable number with 5 and the counter variable i with 1. Use a do-while loop to multiply the given number by values from 1 to 10. Display the multiplication table in the following format.*/

package Package1;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number=5;
		int i=1;
		do
		{
			System.out.println(i+"x"+ number +"="+(number*i));//1x5=5  2x5=10 
			i++;	
		}
		while(i<=10);
		
	}

}
