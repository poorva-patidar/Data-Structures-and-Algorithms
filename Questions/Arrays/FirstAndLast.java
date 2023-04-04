package Arrays;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {2, 7, 7, 7, 8, 9};
        System.out.println(Arrays.toString(searchRange(arr, 7)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = binarySearchInRange(nums, target, true);
        ans[1] = binarySearchInRange(nums, target, false);

        return ans;
    }

    public static int binarySearchInRange(int[] nums, int target, boolean firstOccurence){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                ans = mid;
                if(firstOccurence){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return ans;
    }
}
