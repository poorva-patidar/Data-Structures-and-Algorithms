package binarySearch;

public class SearchInRotatedArrayII {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if(nums[pivot] == target){
            return true;
        } else if (target > nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
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
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]){
                    return end;
                }
                end--;
            } else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return -1;
    }

    boolean binarySearch(int[] arr, int target, int start, int end) {

        int ans = -1;
        if(start > end)
            return false;

        int mid = start + (end - start)/ 2;

        if(arr[mid] == target)
            return true;
        else if(arr[mid] > target)
            return binarySearch(arr, target, start, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, end);
    }
}
