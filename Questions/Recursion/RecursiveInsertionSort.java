package Recursion;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 1, 0, -4};
        insertionSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int i) {

        if(i == arr.length - 1)
            return;

//        for(int j = i + 1; j > 0; j--){
//
//            if(arr[j - 1] > arr[j]){
//                int temp = arr[j - 1];
//                arr[j - 1] = arr[j];
//                arr[j] = temp;
//            }
//        }

        innerLoop(arr, i + 1);
        insertionSort(arr, i + 1);
    }

    private static void innerLoop(int[] arr, int j) {
         if(j <= 0)
             return;

        if(arr[j - 1] > arr[j]){
               int temp = arr[j - 1];
               arr[j - 1] = arr[j];
               arr[j] = temp;
           }
        innerLoop(arr, j - 1);
    }
}
