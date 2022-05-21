package string.problems;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        Scanner input = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String x = input.nextLine();
        System.out.print("Enter second word: ");
        String y = input.nextLine();

        if(x.length() == y.length()) {

            char[] charArray1 = x.toCharArray();
            char[] charArray2 = y.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(x + " and " + y + " are anagrams.");
            }
            else {
                System.out.println(x + " and " + y + " are not anagrams.");
            }
            input.close();
        }
    }
}
