/*Question:

Write a Java program to reverse a given integer using a while loop.

Initialize the variable n with 123 and the variable m with 0. Use a while loop to extract the last digit of the number using the modulus operator (%), add the extracted digit to the reversed number, and remove the last digit using division (/). Repeat until the original number becomes 0.

Finally, display the original number and its reversed number.*/

package Package1;

public class ReverseNumber {

	public static void main(String[] args) {
		  int n=123;
		  int m=0;
		  System.out.println("Original Number: " +n);
		  while(n !=0)
		  {
			  int x=n %10;//1%10 = 1
			  m =m * 10 + x; //0*10+3=3 3*10 30 32 32*10 320+1 321
			  n/=10; //123/10=12 1/10=1 0
		  }
		  System.out.println("Reversed Number: " +m); //54321

	}

}
