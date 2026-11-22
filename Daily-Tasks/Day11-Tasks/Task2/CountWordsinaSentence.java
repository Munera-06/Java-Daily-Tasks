/*Question: Write a Java program to count the total number of words in a sentence entered by the user.*/

package Package1;
import java.util.Scanner;

public class CountWordsinaSentence {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence:");
        String str = sc.nextLine().trim();

        int count = 0;

        if (!str.isEmpty()) {
            String words[] = str.split("\\s+");
            count = words.length;
        }

        System.out.println("Total Words: " + count);
    }
}