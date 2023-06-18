package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,2,3,3, 1, 2};
        System.out.println(removeElement(arr, 2));
    }

    // It's using two pointers so that it can replace it with a non val value whenever get the chance to do so.
    public  static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
