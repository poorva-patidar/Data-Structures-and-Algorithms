package binarySearch;

public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return pivot + 1;
    }

    public int findPivot(int[] arr){
        int start = 0;
        int end  = arr.length - 1;
        while(start <= end ){
            int  mid = start + (end  - start)/2;

            //CASE I
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            //CASE II
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            //CASE III
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else{ //CASE IV
                start = mid + 1;
            }
        }

        return -1;
    }
}
