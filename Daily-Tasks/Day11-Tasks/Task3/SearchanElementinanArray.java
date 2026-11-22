/*Question: Write a Java program to search for a particular element in an array entered by the user. Display whether the element is found or not.*/

package Package1;
import java.util.Scanner;

public class SearchanElementinanArray {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = {10, 20, 30, 40, 50};

        System.out.println("Enter a Number to Search:");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found");
        } 
        else {
            System.out.println("Element Not Found");
        }
    }
}

