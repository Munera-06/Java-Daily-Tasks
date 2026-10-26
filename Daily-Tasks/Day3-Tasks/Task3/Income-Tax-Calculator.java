/*Question:

Write a Java program to calculate income tax based on the annual income entered by the user using the Scanner class and if-else if-else statements.

Get the annual income from the user and calculate the tax according to the following income slabs:
- Income up to ₹2,50,000: No tax
- Income up to ₹5,00,000: 5% tax
- Income up to ₹10,00,000: 20% tax
- Income above ₹10,00,000: 30% tax
Display the applicable tax rate, annual income, and calculated tax amount.*/

package Package1;
import java.util.Scanner;

public class Day3_Task6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a income Amount");
		int ac=sc.nextInt();
		if(ac <= 250000) {
			System.out.println("No tax");
			System.out.println("Income: ₹" + ac);
		}
		else if (ac <= 500000) {
			System.out.println("there is a %5 added ");
			double tax=0.05;
			tax=ac*tax;		
			System.out.println("Income: ₹" + ac);
			System.out.println("Tax : ₹" + tax);
		}
		else if (ac <= 1000000) {
			System.out.println(" 20% tax added");
			double tax=0.20;
			tax=ac*tax;	
			System.out.println("Income: ₹" + ac);
			System.out.println("Tax : ₹" + tax);
		}
		else {
			System.out.println(" 30% tax added");
			double tax=0.30;
			tax=ac*tax;
			System.out.println("Income: ₹" + ac);
			System.out.println("Tax : ₹" + tax);
		}

	}

}
