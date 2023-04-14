class Solution {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        int MaximumProduct = maximumProduct(nums);
        System.out.println(MaximumProduct);
    }
    public static int maximumProduct(int[] nums) {
        int maxproduct = 1;
        for(int i = 0; i < 3; i++){
            int end = nums.length - i - 1;
            int max = Maximum(nums, 0 , end);
            swap(nums, max, end);
            maxproduct = maxproduct * nums[nums.length - i - 1];
        }
     return maxproduct;
    }
    
    
    
    public static int Maximum(int[] nums, int a, int b){
        int Max = a;
        for(int j = 1; j < nums.length; j++){
            if(nums[Max] < nums[j])
                Max = j;
        }
        return Max;
    }
    
    
    
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
        
}