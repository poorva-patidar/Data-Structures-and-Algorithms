package Arrays;

import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
     int[][] matrix = {
             {1,2,3,4},
             {5,0,7,8},
             {0,10,11,12},
             {13,14,15,0}
     };

     setZeroes(matrix);

     for (int[] a: matrix) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean checkRow = false;
        boolean checkCol = false;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                checkRow = true;
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[0][j] == 0){
                checkCol = true;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                 if(matrix[i][j] == 0){
                     matrix[i][0] = 0;
                     matrix[0][j] = 0;
                 }
            }
        }

        for (int r = 1; r < matrix.length; r++) {
            if(matrix[r][0] == 0){
                for (int i = 0; i < matrix[0].length; i++) {
                     matrix[r][i] = 0;
                }
            }
        }

        for (int c = 1; c < matrix[0].length; c++) {
            if(matrix[0][c] == 0){
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][c] = 0;
                }
            }
        }

        if(checkRow) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if(checkCol){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }

}
