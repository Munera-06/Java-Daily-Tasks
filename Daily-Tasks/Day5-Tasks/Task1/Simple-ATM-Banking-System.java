/*Question:

Write a Java program to create a simple ATM banking system using the Scanner class and if statements.

First, display a welcome message and ask the user to enter their PIN. If the entered PIN matches the correct PIN (123), display the following ATM menu:
1. Cash Withdrawal
2. Cash Deposit
3. Check Balance
4. Exit
Initialize the account balance with ₹2,000 and perform the selected operation based on the user's choice.
- Option 1 – Cash Withdrawal: Get the withdrawal amount and display the available balance after deduction.
- Option 2 – Cash Deposit: Get the deposit amount and display the updated balance.
- Option 3 – Check Balance: Display the current account balance.
- Option 4 – Exit: Display a thank-you message.
If the entered PIN is incorrect, display "Invalid User".*/


package Package1;

import java.util.Scanner;

public class Day4_Task1 {

	public static void main(String[] args) {
		System.out.println("Welcome to State Bank of India");
		Scanner ac= new Scanner(System.in);
		System.out.println("Enter Your PIN:");
		int a= ac.nextInt();
		
		if(a==123) {
			System.out.println("Enter 1 for cash Withdraw");
			System.out.println("2 for cash Deposite");
			System.out.println("3 for Check Balance");
			System.out.println("4 for Exit");
			
			int b =2000;
			System.out.println("Balance Amount:"+b);
		
			System.out.println("Enter a Number Between 1-4: ");
			int c= ac.nextInt();
			
			if(c==1){
				System.out.println("Enter the Amount:");
				int d=ac.nextInt();
				System.out.println("Available Balance:"+(b-d));
			}
			
			if(c==2){
				System.out.println("Enter the Amount:");
				int e=ac.nextInt();
				System.out.println("Available Balance:"+(b+e));
			}	
			
			if(c==3){
				System.out.println("Your Current Balance:"+(b));
			}
			
			if(c==4){
				System.out.println("Thanks for Visting");
			}
		}
		
		else {
			System.out.println("Invalid User");
		}

	}

}
