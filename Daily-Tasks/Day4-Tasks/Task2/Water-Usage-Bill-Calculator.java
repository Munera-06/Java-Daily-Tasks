/*Question:

Write a Java program to calculate the water bill based on the number of litres consumed by the user using the Scanner class and if-else if-else statements.

Get the water usage in litres as input and calculate the charges according to the following conditions:
- Up to 1,000 litres: ₹2 per litre
- 1,001 to 5,000 litres: ₹3 per litre
- Above 5,000 litres: ₹5 per litre, with an additional 15% extra charge.
Display the water usage, applicable rate per litre, charge amount, and final bill amount. For usage above 5,000 litres, also display the additional 15% charge.*/


package Package1;
import java.util.Scanner;

public class Day3_Task8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a water usage in litre ");
		int water =scan.nextInt();
			 
		if(water <=1000 ) {
			System.out.println("₹2rs for Per litre ");
			int charge=2;
			charge=water*charge;
			System.out.println("Usage of Water "+water);
			System.out.println("Charge amount is " +charge);
		}
		else if(water <=5000) {
			System.out.println("₹3rs for Per litre");
			int charge=3;
			charge=water*charge;
			System.out.println("Usage of Water"+water);
			System.out.println("Charge amount is " +charge);		
		}
		else {
		    System.out.println("₹5rs for Per litre");
		    int charge = 5;
		    charge = water*charge;
		    System.out.println("Usage of Water " + water);
		    System.out.println("Charge amount is " + charge);
		    double extra = charge*0.15;
		    double final_charge = charge + extra;
		    System.out.println("15% extra charge is " + extra);
		    System.out.println("Final charge is " + final_charge);
		}
	}

}
