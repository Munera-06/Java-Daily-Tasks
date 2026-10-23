/*Write a Java program to swap the values of two integer variables, a and b, without using a third variable.

Initialize a with 20 and b with 10. Swap their values using arithmetic operations and display the values of both variables after swapping.*/

package Package1;

public class Day2_Task3 {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
