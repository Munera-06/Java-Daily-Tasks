/*Question:

Write a Java program to print an inverted pyramid star pattern based on the number entered by the user. Use nested for loops to print spaces before the stars. In each row, increase the spaces by one and decrease the stars by two.*/

package Package1;
import java.util.Scanner;

public class InvertedPyramidStarPattern {

	public static void main(String[] args) {
		Scanner ac =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int line=ac.nextInt();
		int space=0;
		int star=line+2;
		
		for(int i=0; i<line; i++)
		{
			for(int j=0; j<space; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star-=2;
		}
	}

}
