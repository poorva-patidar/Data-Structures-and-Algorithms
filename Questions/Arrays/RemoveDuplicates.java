package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {-1, -1, 0, 0, 1, 2, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int k = nums.length;
        int i = 1;
        while(i != k){
            if(nums[i - 1] == nums[i]){
                k--;
                remove(nums, i, k);
            } else{
                i++;
            }
        }

        return k;
    }

    public static void remove(int[] nums, int i, int k){
        for(int j = i; j < k; j++){
            nums[j] = nums[j + 1];
        }

        nums[k] = Integer.MIN_VALUE;
    }

    public int removeDuplicates2(int[] nums){
        int index = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                nums[index] = nums[i + 1];
                index++;
            }
        }

        return index;
    }


}
