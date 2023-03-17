package Arrays;

import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };


        System.out.println(Arrays.toString(matrixReshape(mat, 4, 1)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length * mat[0].length != r * c){
            return mat;
        }

        int[][] result =  new int[r][c];
        int row = 0;
        int col = 0;

        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++){
                result[row][col] = mat[i][j];
                col++;

                if(col == c){
                    row++;
                    col = 0;
                }
            }
        }
       return result;
    }
}
