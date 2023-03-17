package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 3, 6};
        int[] nums2 = {2, 1, 3, 4, 5, 0, 6};
        System.out.println(Arrays.toString(nextGreaterElement2(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int pos;
        for(int i = 0; i < nums1.length; i++){
            pos = search(nums2, nums1[i]);
            int max = 0;
            if(pos != nums2.length - 1){
                max = getMax(nums2, pos);
               if(max == -1){
                   ans[i] = -1;
               } else{
                   ans[i] = nums2[max];
               }
            } else{
                ans[i] = -1;
            }
        }

        return ans;
    }

    public static int search(int[] arr, int ele){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                return i;
            }
        }

        return -1;
    }

    public static int getMax(int[] nums2, int pos){
        for(int i = pos + 1; i < nums2.length; i++){
            if(nums2[pos] < nums2[i]){
                return i;
            }
        }
        return -1;
    }

    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();

        int pos = -1;
        for(int i = 0; i < nums2.length; i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                pos = search(nums1, stack.pop());
                if(pos != -1){
                    result[pos] = nums2[i];
                }
            }
            stack.push(nums2[i]);
        }

        while(!stack.isEmpty()){
            pos = search(nums1, stack.pop());
            if(pos != -1){
                result[pos] = -1;
            }
        }

        return result;
    }
}
