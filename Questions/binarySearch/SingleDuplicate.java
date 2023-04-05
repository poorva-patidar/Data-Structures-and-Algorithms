package binarySearch;

public class SingleDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, 4, 5, 5, 6, 6};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int ele: nums){
            ans = ans ^ ele;
        }
        return ans;
    }
}
