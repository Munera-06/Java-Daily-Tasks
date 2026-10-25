/*Write a Java program to check whether a given year is a leap year or not using the Scanner class
 *  and if-else statements.*/

package Package1;
import java.util.Scanner;

public class Day3_Task3 {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		System.out.println("Enter a Year:");
		int a= ac.nextInt();
		
		if(a%4==0 && a%100!=0 || a%400==0)
		{
			System.out.println(a+ " Is a Leap Year");
		}
		
		else
		{
			System.out.println(a+ " Is not a Leap Year");
		}

	}

}
