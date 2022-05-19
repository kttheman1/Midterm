package string.problems;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static Set<String> getPermutation(String word) {

        Set<String> permutations = new HashSet<String>();

        if (word == null) {
            return null;
        }
        else if (word.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = word.charAt(0);
        String sub = word.substring(1);

        Set<String> words = getPermutation(sub);

        for (String wordNew : words) {
            for (int i = 0; i <= wordNew.length(); i++) {
                permutations.add(wordNew.substring(0, i) + first + wordNew.substring(i));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string here: ");
        String data = input.nextLine();
        System.out.println("These are the permutations of " + data + ": \n" + getPermutation(data));

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */



    }
}
