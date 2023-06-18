package Arrays;
import java.util.Arrays;

public class FindDuplicates {
    // Method 1: Sort and search
    // Here we can also apply binary search aster sorting
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return nums[i];
            }
        }
        return -1;
    }

    // Method 2: Cyclic sort
    public int findDuplicate2(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != (i + 1)){
                int temp = nums[i];
                if(nums[i] == nums[temp - 1]){
                    return nums[i];
                }
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
                i--;
            }
        }
        return nums[nums.length - 1];
    }

    //Method 3: Slow-fast pointer method
    public int findDuplicate3(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
