package binarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        return binarySearch(nums, target, start, end);

    }

    //recursive approach to find a number using binary search
    int binarySearch(int[] arr, int target, int start, int end) {

        int ans = -1;
        if(start > end)
            return ans;

        int mid = start + (end - start)/ 2;

        if(arr[mid] == target)
            return mid;
        else if(arr[mid] > target)
            return binarySearch(arr, target, start, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, end);
    }
}
