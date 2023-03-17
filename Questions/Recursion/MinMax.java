package Recursion;

public class MinMax {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        // We can also take arr[0] as currentMin and currentMax
        int currentMin = Integer.MAX_VALUE;
        int currentMax = Integer.MIN_VALUE;
        int[] ans = findMinMax(arr, 0, currentMin , currentMax);
        System.out.println("Min = " + ans[0] + ", Max = " + ans[1]);

    }

    private static int[] findMinMax(int[] arr, int i, int currentMin, int currentMax) {

        // Array to store the min and max value
        int[] ans = {currentMin, currentMax};

        // Base condition to stop recursion
        // If there is no element left in the array then stop
        if(i == arr.length)
            return ans;

        // Checking if the element is less then currentMin
        if(arr[i] >= currentMax)
            currentMax = arr[i];

        // Checking if the element is greater then currentMax
        if(arr[i] <= currentMin)
            currentMin = arr[i];

        // Calling the function for next element of the array
        return findMinMax(arr, i + 1, currentMin, currentMax);

    }


}
