package math.problems;
import java.util.*;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        // Given
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int x = array1.length;
        int y = array2.length;

        System.out.println("The lowest difference between the two array cells: " + minDiff(array1, array2, x, y));

    }
    static int minDiff(int [] array1, int [] array2, int x, int y) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int A1 = 0;
        int A2 = 0;

        int result = Integer.MAX_VALUE;

        while (A1 < x && A2 < y) {
            if (Math.abs(array1[A1] - array2[A2]) < result)
                result = Math.abs(array1[A1] - array2[A2]);

            if (array1[A1] < array2[A2])
                A1++;
            else
                A2++;

        }
        return result;




            }
        }






