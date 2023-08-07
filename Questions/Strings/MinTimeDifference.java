package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MinTimeDifference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("23:59");
        list.add("14:34");
        list.add("15:15");
        list.add("8:45");
        List<int[]> ans = time(list);

        for (int[] a: ans) System.out.println(Arrays.toString(a));

    }

    public static List<int[]> time(List<String> list){
        List<int[]> ans = new ArrayList<>();


        for(String str: list){
            int[] a = new int[2];
            String[] arr = str.split(":");
            a[0] = Integer.parseInt(arr[0]);
            a[1] = Integer.parseInt(arr[1]);
            ans.add(a);
        }

        return ans;
    }

//    public static int findMinDifference(List<String> timePoints) {
//
//    }
}
