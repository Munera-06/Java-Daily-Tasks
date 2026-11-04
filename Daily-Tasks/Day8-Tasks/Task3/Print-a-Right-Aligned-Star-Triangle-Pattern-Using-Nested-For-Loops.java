/*Question:

Write a Java program to print a right-aligned triangle star pattern based on the number of rows entered by the user using nested for loops.

Get the number of rows as input from the user. Use an outer for loop to control the rows, a first inner for loop to print spaces, and a second inner for loop to print stars (*).

Start with one star in the first row and increase the number of stars by 1 in each subsequent row. At the same time, decrease the number of spaces by 1 in each row.*/

package Package1;
import java.util.Scanner;

public class Day6_Task5 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int line= ac.nextInt();
		int space=line-1;
		int star=1;
		
		for(int i=0; i<line; i++)//0<3-t //1<3-t //2<3-t
		{
			for(int j=0; j<space; j++)//0<2-t 1<2-t 2<2-f //0<1-t 1<1-f //0<0-f 
			{
				System.out.print(" ");//s s //s //
			}
			for(int k=0; k<star; k++)//0<1-t 1<1-f //0<2-t 1<2-t 2<2-f //0<3-t 1<3-t 2<3-t 3<3-f
			{
				System.out.print("*");//s s st //s st st // st st st
			}
			System.out.println( );
			star+=1;// 2 //3 //4
			space--;//1 //0 //
		}
	}
}
