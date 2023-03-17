package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12};
        int target = 2;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        if(ans == -1)
            System.out.println("Element does not exist!");
        else
            System.out.println("Found at " + ans);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        int ans = -1;
        if(start > end)
            return ans;

        int mid = start + (end - start)/ 2;

        if(arr[mid] == target)
            return mid;
        else if(arr[mid] > target)
            return binarySearch(arr, target, start, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, end);
    }

}
