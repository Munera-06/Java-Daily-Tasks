/*Question:

Write a Java program to calculate the discount on a purchased amount using the Scanner class and if-else if-else statements.

Get the total purchase amount from the user and apply the discount according to the following conditions:
- ₹1,000 or below: No discount
- ₹1,001 to ₹5,000: 5% discount
- ₹5,001 to ₹10,000: 10% discount
- Above ₹10,000: 15% discount
Display the purchased amount, discount percentage, discount amount, and final amount payable after deducting the discount.*/

package Package1;
import java.util.Scanner;
public class Day3_Task9 {

	public static void main(String[] args) {
		Scanner bc = new Scanner(System.in);
		System.out.println("Enter purchased amount: ");
		int amt = bc.nextInt();
		if(amt <= 1000) {
			System.out.println("No Discount");
		}
		else if(amt<=5000) {
			System.out.println("5% discount for you!");
			double discount=0.05;
			discount= amt*discount;
			double fi_amount = amt-discount; 
			System.out.println("Purchased Amount is " + amt);
			System.out.println("discount is " + discount);
			System.out.println("discount + final amount is "+ fi_amount);
		}
		else if(amt <= 10000) {
			System.out.println(" 10% Discount for you!");
			double discount=0.10;
			discount= amt*discount;
			double fi_amount= amt - discount ;
			System.out.println("Purchased amount is  "+amt);
			System.out.println("Discount amountt is  "+discount);
			System.out.println("Discount + final amount is " + fi_amount);
		}
		else {
			System.out.println(" 15% Discount for you!");
			double discount=0.15;
			discount=amt*discount;
			double fi_amount= amt - discount ;
			System.out.println("Purchased amount is  "+amt);
			System.out.println("Discount amount is  "+discount);
			System.out.println("Discount + final amount is " + fi_amount);
		}	 

	}

}
