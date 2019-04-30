package math.problems;

public class MakePyramid {


        /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */

        public static void printTringle (int n) {
            for (int i = 0; i < n; i++) {
                for (int j = n - i; j > 1; j--)
                    System.out.print(" ");

                }
            for  (int i =0; i<= i; i++) {

            System.out.println("* ");
            }

            }
    public static void main(String args []) {
        int n = 5;
        printTringle(n);


    }
}
