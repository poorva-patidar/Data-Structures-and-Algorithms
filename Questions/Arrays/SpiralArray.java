package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rlength = matrix.length;
        int clength = matrix[0].length;
        int cycle = 0;
        int min = Math.min(rlength, clength);
        if(min % 2 == 0){
            cycle = min / 2;
        } else{
            cycle = (min / 2) + 1;
        }


        for(int i = 0; i < cycle; i++) {
            int r = i, c = i;
            //  STEP 1
            while (c < clength - i) {
                list.add(matrix[r][c]);
                c++;
            }

            // STEP 2
            while(r + 1 < rlength - i){
                list.add(matrix[r + 1][c - 1]);
                r++;
            }

            // STEP 3
            while(c - 2 >= i && list.size() != rlength * clength){
                list.add(matrix[r][c - 2]);
                c--;
            }

            //STEP 4
            while (r - 1 > i && list.size() != rlength * clength){
                list.add(matrix[r - 1][c - 1]);
                r--;
            }

        }

        return list;
    }
}
