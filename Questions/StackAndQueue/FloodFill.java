package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int[][] result = floodFill(image, 1, 1, 2);

        for (int[] a: result) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static class Inner{
        int i = 0;
        int j = 0;

        public Inner(int i, int j){
            this.i = i;
            this.j = j;
        }

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        Stack<Inner> stack = new Stack<>();
        stack.push( new Inner(sr, sc));
        Inner current;
        int a, b;

        while(!stack.isEmpty()){
            current = stack.pop();
            a = current.i;
            b = current.j;
            image[a][b] = color;

            if(isValid(a - 1, b, image) && image[a - 1][b] == original && image[a - 1][b] != color){
                stack.push(new Inner(a - 1, b));
            }
            if(isValid(a, b + 1, image) && image[a][b + 1] == original && image[a][b + 1] != color){
                stack.push(new Inner(a, b + 1));
            }
            if(isValid(a + 1, b, image) && image[a + 1][b] == original && image[a + 1][b] != color){
                stack.push(new Inner(a + 1, b));
            }
            if(isValid(a , b - 1, image) && image[a][b - 1] == original && image[a][b - 1] != color){
                stack.push(new Inner(a , b - 1));
            }
        }

        return image;
    }

    public static boolean isValid(int row, int col, int[][] matrix){
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
