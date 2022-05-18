package math.problems;
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //FACTORIAL USING RECURSION

        // n! = n * (n-1)
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a number: ");
        int n = sc.nextInt();
        long factorial = x(n);
        System.out.println("Factorial of " + n + " recursive method" + " = " + factorial);
    }
    public static long x(int n)
    {
        if (n >= 1)
            return n * x(n - 1);
        else
            return 1;
    }
}

