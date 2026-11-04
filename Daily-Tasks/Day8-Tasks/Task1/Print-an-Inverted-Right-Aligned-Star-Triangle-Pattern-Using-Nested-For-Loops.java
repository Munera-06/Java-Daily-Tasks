/*Question:

Write a Java program to print an inverted right-aligned triangle star pattern based on the number of rows entered by the user using nested for loops.

Get the number of rows as input from the user. Use an outer for loop to control the rows, a first inner for loop to print spaces, and a second inner for loop to print stars (*).

Start with the maximum number of stars in the first row and decrease the number of stars by 1 in each subsequent row. At the same time, increase the number of spaces by 1 in each row.*/

package Package1;
import java.util.Scanner;

public class Day6_Task3 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int line=ac.nextInt();
		int star=line;
		int space=0;
		
		for(int i=1; i<=line;i++)//1<=3-t //2<=3-t //3<=3-t //4<=3-f
		{
			for(int j=1; j<=space; j++)//1<=0-f //1<=1-t //1<=2-t 2<=2-t 3<=2-f
			{
				System.out.print(" ");//s //s s
			}
			
			for(int k=1; k<=star; k++)//1<=3-t 2<=3-t 3<=3-t 4<=3-f //1<=2-t 2<=2-t 3<=2-f //1<=1-t 2<=1-f
			{
				System.out.print("*");//st st st // s st st // s s st
			}
			
			System.out.println();
			space++;//1 //2 //1
			star--;//2 //1 //0
		}
	}
}
