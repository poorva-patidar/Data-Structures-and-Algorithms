package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:59");
        timePoints.add("14:00");
        timePoints.add("18:45");
        timePoints.add("14:50");
        timePoints.add("13:23");
        System.out.println(findMinDifference(timePoints));
    }

    public static int findMinDifference(List<String> timePoints) {
        int length = timePoints.size();
        int[] minutes = new int[length];
        int i = 0;
        for(String s: timePoints){
            minutes[i] = Integer.parseInt("" + s.charAt(0) + s.charAt(1)) * 60 +
                    Integer.parseInt("" + s.charAt(3) + s.charAt(4));
            i++;
        }

        int minimum = Integer.MAX_VALUE;

        Arrays.sort(minutes);
        for(int j = 0; j < length - 1; j++){
            if(j == 0){
                minimum = Math.min(findDifference(minutes[0], minutes[1]), findDifference(minutes[0], minutes[length - 1]));
            } else {
                minimum = Math.min(minimum, findDifference(minutes[j], minutes[j + 1]));
            }
        }

        return minimum;

    }

    private static int findDifference(int f, int s){
        int abs = Math.abs(f - s);
        return Math.min(abs, 1440 - abs);
    }
}
