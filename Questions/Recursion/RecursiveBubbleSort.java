package Recursion;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 3, -1 ,9};
        bubbleSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int i) {

        //Base condition
        if(i == arr.length - 1)
            return;

//       for(int j = 0; j < arr.length - 1; j++) {
//
//            if (arr[j] > arr[j + 1]) {
//                int temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//            }
//        }

        Boolean swapped = innerLoop(arr, 0, i , false);

        if(!swapped)
            return;
        bubbleSort(arr, i + 1);
    }

    private static Boolean innerLoop(int[] arr, int j, int i, boolean swap){

        if(j == arr.length - i - 2)
            return swap;

        if (arr[j] > arr[j + 1]) {
            swap = true;
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }

        return innerLoop(arr, j + 1 , i, swap);
    }

}
