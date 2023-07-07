package Arrays;

import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {5,5,5,5,5};
        System.out.println(specialArray(nums));

    }
    public static int specialArray(int[] nums) {

        Arrays.sort(nums);
        int max = nums[nums.length -1];

        for(int i = 0; i <= max; i++){
            if(nums[0] > i){
                if(nums.length == i){
                    return i;
                }
            } else{
                int pos = binarySearch(nums, i);
                if(nums.length - pos == i){
                    return i;
                }

            }


        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
