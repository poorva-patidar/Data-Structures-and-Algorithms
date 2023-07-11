package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public static void main(String[] args) {
        int[] nums = {2, 4};
        System.out.println(canSumDP(70, nums));
    }

    private static boolean canSum(int targetSum, int[] nums) {
        if(targetSum == 0){
            return true;
        }

        // Or we can do it like this
        // if(targetSum < 0) return false;

        for(int ele: nums){
            // int rem = targetSum - ele;
            // if(canSum(rem, nums)) return true;
            // OR
            if(ele <= targetSum){
                if(canSum(targetSum - ele, nums)){
                    return true;
                }
            }
        }

        return false;
    }

    // now by dynamic programming
    public static boolean canSumDP(int targetSum, int[] nums){
        Map<Integer, Boolean> map = new HashMap<>();
        return canSumDP(targetSum, nums, map);
    }

    private static boolean canSumDP(int targetSum, int[] nums, Map<Integer, Boolean> map) {
        if(map.containsKey(targetSum)) return map.get(targetSum);
        if(targetSum == 0) return true;

        for (int ele: nums){
            if(ele <= targetSum){
                if(canSumDP(targetSum - ele, nums, map)){
                    map.put(targetSum, true);
                    return true;
                }
            }
        }
        map.put(targetSum, false);
        return false;
    }
}
