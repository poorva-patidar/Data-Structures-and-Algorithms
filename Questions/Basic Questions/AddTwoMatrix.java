import java.util.Arrays;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 2, 1},
                {9, 2, 3}
        };

        int[][] arr2 = {
                {1, 7, 3},
                {8, 2, 3},
                {9, 1, 0}
        };

        int[][] result = new int[arr1.length][arr1.length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int[] a : result){
            System.out.println(Arrays.toString(a));
        }
    }
}
