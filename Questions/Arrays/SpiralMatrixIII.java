package Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/spiral-matrix-iii/
public class SpiralMatrixIII {
    public static void main(String[] args) {
        int[][] ans = spiralMatrixIII(4, 5, 2, 1);

        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int count;
    static int[][] matrix;

    private static void add (int r, int c, int rows, int cols) {
        if (r >= rows || r < 0 || c >= cols || c < 0) return;
        matrix[count][0] = r;
        matrix[count][1] = c;
        count++;
    }

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int r = rStart, c = cStart, len = 1;
        matrix = new int[rows * cols][2];
        while (count < (rows * cols)) {
            for (int k = 0; k < len; k++){
                add(r, c, rows, cols);
                c++;
            }
            for (int k = 0; k < len; k++) {
                add(r, c, rows, cols);
                r++;
            }
            len++;
            for (int k = 0; k < len; k++) {
                add(r, c, rows, cols);
                c--;
            }
            for (int k = 0; k < len; k++) {
                add(r, c, rows, cols);
                r--;
            }
            len++;
        }
        return matrix;
    }
}
