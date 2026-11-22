/*Question:

Write a Java program to count the number of vowels and consonants in a string entered by the user. Ignore spaces and special characters while counting.*/

package Package1;
import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } 
                else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
