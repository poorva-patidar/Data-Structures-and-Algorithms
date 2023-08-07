package Patterns;
/**
 1.  *****
     *****
     *****
     *****
     *****

 2.  *
     **
     ***
     ****
     *****

 3.  *****
     ****
     ***
     **
     *

 4.  1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5

 5.  *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *

 6.      *
        **
       ***
      ****
     *****

 7.  *****
      ****
       ***
        **
         *


 8.      *
        ***
       *****
      *******
     *********


 9.  *********
      *******
       *****
        ***
         *


 10.      *
         * *
        * * *
       * * * *
      * * * * *


 11.  * * * * *
       * * * *
        * * *
         * *
          *


 12.  * * * * *
      * * * *
      * * *
      * *
      *
      *
      * *
      * * *
      * * * *
      * * * * *


 13.      *
         * *
        *   *
       *     *
      *********


 14.  *********
       *     *
        *   *
         * *
          *

 15.      *
         * *
        *   *
       *     *
      *       *
       *     *
        *   *
         * *
          *

 */

public class PatternQuestions1 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int row = 1; row <  2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(col <= n - row){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col < row){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n + row; col++) {
                if(col < n - row - 1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
