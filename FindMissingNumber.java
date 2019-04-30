package math.problems;
import java.util.Arrays;


public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(array1);
        Arrays.sort(array2);
        int dif1 = array1[1] - array1[0];
        for (int t = 2; t != array2.length; t++) {
            dif1 = Math.min(dif1, array1[t] - array1[t - 1]);

            System.out.println("Lowest difference are in array 1= " + dif1 + "\n");
            int dif2 = array2[1] - array2[0];
            for (int u = 2; u != array2.length; u++) {
                dif2 = Math.min(dif2, array2[u] - array2[u - 1]);

                System.out.println("Lowest difference are in array 2= " + dif2);

                if (dif1 > dif2) {
                    System.out.println("Lowest difference in array are :- " + dif2);
                } else if (dif2 == dif1) {
                    System.out.println("Lowest difference in array are :- " + dif1);
                } else if (dif1 == dif2) {
                    System.out.println("Lowest difference in array are :- " + dif1);
                }
            }
        }
    }
}