package Arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {
                23,-869,478,-238,-375,-741,-970,-990,802,-173,-977,464,-801,
                -408,-77,694,-58,-796,-599,-918,643,-651,-555,864,-274,102,24,-461,-146
        };
        System.out.println(threeSumClosest(nums, -711));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int minSum = 0;
        int minDiff =  Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k =  nums.length - 1;

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target){
                    return sum;
                }else {
                    if(Math.abs(sum - target) < minDiff){
                        minDiff = Math.abs(sum - target);
                        minSum = sum;
                    }
                }

                if(sum <= target){
                    j++;
                    while(j < k && nums[j] == nums[j - 1]){
                        j++;
                    }
                } else {
                    k--;
                }

            }
        }

        return minSum;
    }
}
