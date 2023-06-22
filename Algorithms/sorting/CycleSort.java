package Algorithms.sorting;
/**
 * |----------------------------CYCLIC SORT--------------------------------|
 * This algorithm is used when numbers are given in a range for example [0, N]
 * Here it finds the correct index by the element and swap it with correct index
 * Time Complexity:- Base Case: O(N) // When array is sorted
 *                   Worst Case: O(N) // When array is sorted in descending order
 * Space Complexity:- O(1) // In-place sorting algorithm
 * |-----------------------------------------------------------------------|
 */

public class CycleSort {
    public void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;  //[1,N]
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
