package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotate(nums, 4);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate1(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0 , k - 1);
        reverse(nums, k, nums.length - 1);

    }
    public void reverse(int[] nums, int start, int end){
        int temp = 0;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void rotate(int[] nums, int k) {
        if(k >= nums.length){
            k = k % nums.length;
        }

        int[] arr = new int[nums.length];
        int length =  nums.length - k;
        int next = 0;

        for (int i = 0; i < nums.length; i++) {
            if(length < nums.length){
                arr[i] = nums[length];
                length++;
            } else {
                arr[i] = nums[next];
                next++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];

        }
    }
}
