package string.problems;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter word here: ");
        String word = input.nextLine();
        String reverseWord = "";

        int wordLength = word.length();

        for (int i = (wordLength - 1); i >= 0; --i) {
            reverseWord = reverseWord + word.charAt(i);
        }
        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.println(word + " is a Palindrome.");
        }
        else {
            System.out.println(word + " is not a Palindrome.");
        }

    }
}
