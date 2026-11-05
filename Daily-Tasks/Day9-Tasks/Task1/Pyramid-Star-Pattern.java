/*Question:

Write a Java program to print a pyramid star pattern using nested for loops. Print spaces before the stars*/

package Package1;

public class Day6 {

	public static void main(String[] args) {
		int line=3;
		int star=1;
		int space=line-1; //2
		for(int i= 0;i<line;i++)//0<3-t //1<3-t //2<3-t //3<3-f
		{
			for(int j=0;j<space;j++)//0<2-t 1<2-t 2<2-f //0<1-t 1<1-f //0<0-f
			{
				System.out.print(" "); //s s//s 
			}
			for(int j=0;j<star;j++)//0<1-t 1<1-f //0<3-t 1<3-t 2<3-t 3<3 //0<5-t----5<5-f
			{
				System.out.print("*");//s s st //s st st st //st st st st st
			}
			System.out.println();//br //br //br
			star+=2; //3 //5 //7
			space--; //1 //0 //-1
		}

	}

}
