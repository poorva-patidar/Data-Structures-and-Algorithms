package Arrays;

import java.util.Arrays;

public class ArrayProductExceptItself {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = product;
            product = product * nums[i];
        }

        product = 1;
        for (int j = nums.length - 1; j >= 0 ; j--) {
            answer[j] = answer[j] * product;
            product = product * nums[j];
        }

        return answer;
    }
}
