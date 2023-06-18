package Algorithms.sorting;

/**
 * |-----------------------SELECTION SORT------------------------|
 * It a sorting algorithm in which selects an element and places it to its correct position/index
 * With every pass, the largest or the smallest element is selected and placed at the end or the first position
 * Now second largest or smallest is selected and placed accordingly.
 * Time complexity: Best Case:  O(N ^ 2)
 *                  Worst Case: O(N ^ 2)
 * Space Complexity: O(1) // In-place sorting algorithm
 * Not a stable sorting algorithm
 * |-------------------------------------------------------------|
 */
public class SelectionSort {
    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
