/*Question:

Write a Java program to print a number pyramid pattern based on the number of rows entered by the user using nested for loops.

Get the number of rows as input from the user. Use an outer for loop to control the rows, a first inner for loop to print the required spaces, and a second inner for loop to print numbers in increasing order.

For each row, decrease the number of spaces by 1 and increase the number of printed values by 2.*/

package Package1;
import java.util.Scanner;
public class NumberPyramidPattern {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int line=ac.nextInt();
		int num=1;
		int space= line-1;
		for(int i=0; i<line; i++)//0<3-t //1<3-t //2<3-t //3<3-f
		{
			for(int j=0; j<space; j++)//0<2-t 1<2-t 2<2-f //0<1-t 1<1-f //0<0-f
			{
				System.out.print(" ");// s s //s //
			}
			for(int k=1; k<=num; k++)//1<=1-t 2<=1-f //1<=3-t 2<=3-t 3<=3-t 4<=3-f //1<=5-t 2<=5-t 3<=5-t 4<=5-t 5<=5-t 6<=5-f
			{
				System.out.print(k);// s s 1 //s 1 2 3 // 1 2 3 4 5
			}
			System.out.println();
			space--; // 1 //0
			num+=2; // 3 //5
		}
	}
}
