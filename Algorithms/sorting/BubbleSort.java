package Algorithms.sorting;
/**
 * |----------------------------BUBBLE SORT--------------------------------|
 * Also known as Sinking Sort or Exchange Sort
 * It is a comparison sort method. In every step, we compare adjacent elements and swap if necessary and move on to next pair.
 * After every pass, the largest element gets placed to its correct position and length of array to be sorted reduces by 1.
 * Time Complexity:- Base Case: O(N) // When array is sorted
 *                   Worst Case: O(N ^ 2) // When array is sorted in descending order
 * Space Complexity:- O(1) // In-place sorting algorithm
 * This algorithm ends when no swapping occurs in a pass.
 * Stable sorting algorithm which means order is maintained when values are same
 * |-----------------------------------------------------------------------|
*/

public class BubbleSort {
    public void bubbleSort(int[] arr){
        boolean swapped;
        // Run the steps (n - 1) times
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            // After each pass, the largest element is at its correct position
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
