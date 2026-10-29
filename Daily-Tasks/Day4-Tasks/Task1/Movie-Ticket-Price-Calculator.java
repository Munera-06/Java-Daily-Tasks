/*Question:

Write a Java program to calculate the movie ticket price based on the age entered by the user using the Scanner class and if-else if-else statements.

Get the user's age as input and display their age and the applicable ticket price according to the following conditions:
- Below 12 years: ₹100 (Kids Ticket)
- 12 to 60 years: ₹150 (Regular Ticket)
- Above 60 years: ₹120 (Senior Citizen Ticket)*/

package Package1;
import java.util.Scanner;

public class Day3_Task7 {

	public static void main(String[] args) {
			
		Scanner tick= new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=tick.nextInt();
		
		if(age < 12) {
			
			System.out.println("Your age is "+age);
			
			int amt=100;
			System.out.println("Kid Ticket Price :" + amt);
		}
		else if(age <= 60) {
			
			System.out.println("Your age is "+age);
			
			int amt=150;
			System.out.println("Your Ticket Price is :" + amt);
		}
		else{
			System.out.println("Your age is "+age);
			
			int amt=120;
			System.out.println("Your Ticket Price is :" + amt);
		}

	}

}
