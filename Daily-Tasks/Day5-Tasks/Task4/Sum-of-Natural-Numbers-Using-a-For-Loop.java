/*Question:

Write a Java program to find the sum of natural numbers from 1 to a given number using a for loop.

Initialize a variable number with 5 and a variable sum with 0. Use a for loop to iterate from 1 up to the given number and add each value to the sum variable. Finally, display the total sum.*/

package Package1;

public class Day5_Task3 {

	public static void main(String[] args) {
		int number=5;
		int sum=0;
		
		for(int i=1;i<=number;i++)//i=1 1<=5 i=2 i<=5
		{
			sum=sum+i;// 1 3 6 10 15 //0+1=1 = 1  1+2=3 =
		}
		
		System.out.println("Sum of 1 to "+ number + " Natural Number is "+ sum);

	}

}
