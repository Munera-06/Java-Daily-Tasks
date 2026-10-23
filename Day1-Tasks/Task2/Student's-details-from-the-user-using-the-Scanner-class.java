/*Write a Java program to get the student's details from the user using the Scanner class and display the entered details on the console.

The program should ask the user to enter the following information:
1. Student Name
2. Age
3. Gender
4. Email Address
5. Phone Number
6. Course Name
7. 10th Mark
8. 12th Mark
After receiving all the inputs, display each detail on the console.*/

package Package1;
import java.util.Scanner;

public class Day2_Task1 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String a=ac.nextLine();
		System.out.println(a);
		
		System.out.println("Age:");
		int b=ac.nextInt();
		System.out.println(b);
		
		ac.nextLine();
		System.out.println("Gender:");
		String c=ac.nextLine();
		System.out.println(c);
		
		System.out.println("Email:");
		String d=ac.nextLine();
		System.out.println(d);
		
		System.out.println("Phone Number:");
		long e=ac.nextLong();
		System.out.println(e);
		
		ac.nextLine();
		System.out.println("Which Course?");
		String f=ac.nextLine();
		System.out.println(f);
		
		System.out.println("10th Mark:");
		int g=ac.nextInt();
		System.out.println(g);
		
		System.out.println("12th Mark:");
		int h=ac.nextInt();
		System.out.println(h);
		
		
	}

}
