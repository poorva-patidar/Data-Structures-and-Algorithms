package Arrays;

//https://leetcode.com/problems/sort-array-by-parity-ii/
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        while(j < nums.length){
            if(i % 2 == 0){
                if(nums[i] % 2 == 0){
                    i++;
                    j++;
                } else if (nums[j] % 2 == 0) {
                    swap(nums, i, j);
                    i += 2;
                    j = i + 1;
                } else {
                    j++;
                }
            } else {
                if (nums[i] % 2 != 0){
                    i++;
                    j++;
                } else if (nums[j] % 2 != 0) {
                    swap(nums, i, j);
                    i += 2;
                    j = i + 1;
                } else {
                    j++;
                }
            }
        }

        return nums;
    }

    private void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
