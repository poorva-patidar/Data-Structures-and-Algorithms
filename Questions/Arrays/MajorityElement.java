package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] ans = {1, 4, 3, 4,  3, 4, 6, 4};
        System.out.println(majorityElement(ans));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }


        }

        int max = -1;
        int ans = -1;
        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            int key = ele.getKey();
            int value = ele.getValue();
            if(max < value){
                max = value;
                ans = key;
            }
        }

        return ans;
    }
}
