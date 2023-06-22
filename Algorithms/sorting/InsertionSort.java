package Algorithms.sorting;
/**
 * |----------------------------INSERTION SORT--------------------------------|
 * In this sorting algorithm, for every index it puts the element at the correct position
 * It sorts the array till current index
 * Time Complexity:- Base Case: O(N) // When array is sorted
 *                   Worst Case: O(N ^ 2) // When array is sorted in descending order
 * Space Complexity:- O(1) // In-place sorting algorithm
 * Stable sorting algorithm which means order is maintained when values are same
 * It is adaptive. Steps get reduced if array is partially sorted.
 * |-----------------------------------------------------------------------|
 */

public class InsertionSort {
    public void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j - 1 , j);
                } else{
                    break;
                }
            }
        }
    }

    private void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
