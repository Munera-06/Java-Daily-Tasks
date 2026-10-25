/*Write a Java program to check whether a given integer is an 
 * even number or an odd number using the Scanner class and if-else statements.*/

package Package1;
import java.util.Scanner;

public class Day3_Task1 {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a= ac.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The Given Number Is Even");
		}
		
		else
		{
			System.out.println("The Given Number Is Odd");
		}
		
	}

}
