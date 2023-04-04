package Arrays;

import java.util.Arrays;

public class MakeSpiral2DArray {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(2);

        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] generateMatrix(int n) {
        int cycle = 0;
        int[][] matrix = new int[n][n];
        if(n % 2 == 0){
            cycle = n / 2;
        } else{
            cycle = (n / 2) + 1;
        }
        int num = 1;

        for(int i = 0; i < cycle; i++) {
            int r = i, c = i;
            //  STEP 1
            while (c < n - i) {
                matrix[r][c] = num;
                num++;
                c++;
            }

            // STEP 2
            while(r + 1 < n - i){
                matrix[r + 1][c - 1] = num;
                num++;
                r++;
            }

            // STEP 3
            while(c - 2 >= i && num <= n * n){
                matrix[r][c - 2] = num;
                num++;
                c--;
            }

            //STEP 4
            while (r - 1 > i && num <= n * n){
                matrix[r - 1][c - 1] = num;
                num++;
                r--;
            }

        }

        return matrix;
    }
}
