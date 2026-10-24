/*Write a Java program to perform basic arithmetic operations using two integers entered by the user with the help of the Scanner class.

Create an Arithmetic class with separate methods for the following operations:

1. Addition – Add two numbers.
2. Subtraction – Subtract the second number from the first number.
3. Multiplication – Multiply two numbers.
4. Division – Divide the first number by the second number.
5. Modulus – Find the remainder when the first number is divided by the second number.

In the main() method, create an object of the Arithmetic class and call its methods. Get the input values from the user and display the results of all five arithmetic operations.*/

package Package1;  

import java.util.Scanner;

class Arithmetic 
{
	void add(int a, int b)
	{

	}
	
	void sub()
	{

	}
	
	void multi()
	{

	}
	
	void div()
	{

	}
	
	void modul()
	{

	}

}

public class Day2_Task2 {

	public static void main(String[] args) {
		Arithmetic ac=new Arithmetic();
		ac.add(5,10);
		ac.sub();
		ac.multi();
		ac.div();
		ac.modul();
		
		
		Scanner bc=new Scanner(System.in);
		
		System.out.println("Addition");
		int a=bc.nextInt();
		int b=bc.nextInt();
		System.out.println(a+b); 
		
		System.out.println("Subtraction");
		int c=bc.nextInt();
		int d=bc.nextInt();
		System.out.println(c-d);
		
		System.out.println("Multiplication");
		int e=bc.nextInt();
		int f=bc.nextInt();
		System.out.println(e*f);
		
		System.out.println("Divison");
		int g=bc.nextInt();
		int h=bc.nextInt();
		System.out.println(g/h);
		
		System.out.println("Modules");
		int i=bc.nextInt();
		int j=bc.nextInt();
		System.out.println(i%j);

	}

}
