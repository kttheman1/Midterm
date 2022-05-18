package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int x = 1;
       int n = 40;
       int firstNumber = 0;
       int secondNumber = 1;

       System.out.println("Fibonacci numbers till " + n + "'th number");

       while ( x <= n ) {
           System.out.print(firstNumber + ", ");

           int nextNumber = firstNumber + secondNumber;
           firstNumber = secondNumber;
           secondNumber = nextNumber;

           x++;
       }

    }
}
