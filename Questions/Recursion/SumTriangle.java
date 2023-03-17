package Recursion;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        sumTriangle(arr);

    }

    private static void sumTriangle(int[] arr) {
        // Base Condition to stop recursion
        // If there is no element left in the array then stop
        if(arr.length < 1)
            return;

        // Create new int array to store the sum of previous array's elements
        int[] arr2 = new int[arr.length - 1];

        // Fill the new array with the consecutive sum of element of previous array
        //for(int i = 0; i < arr2.length; i++)
            //arr2[i] = arr[i] + arr[i + 1];

        // Fill the new array with the consecutive sum of element of previous array using recursion
        fillArray(arr, arr2, 0);

        // Call the function again for the new array
        sumTriangle(arr2);

        // Print the previous array
        System.out.println(Arrays.toString(arr));

    }

    public static void fillArray(int[] arr, int[] arr2, int i){

        if(i == arr2.length)
            return;
        arr2[i] = arr[i] + arr[i + 1];
        fillArray(arr, arr2, i + 1);

    }
}
