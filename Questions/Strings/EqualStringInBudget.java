package Strings;

import java.util.Arrays;
import java.util.Map;

public class EqualStringInBudget {
    public static void main(String[] args) {
        //equalSubstring("abcd", "cdef", 4);
       System.out.println(equalSubstring("befgcccccccccccccccccccccd", "wxyzccccccccccccccccccccdf", 3));
    }
    public static int equalSubstring(String s, String t, int maxCost) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int j = 0;
        int i = 0;

        while(j < ch1.length){
            sum += Math.abs(ch1[j] - ch2[j]);

            if(sum <= maxCost){
                max = Math.max(max, j - i + 1);
            } else {
                while(sum > maxCost){
                    sum-= Math.abs(ch1[i] - ch2[i]);
                    i++;
                }
            }

            j++;
        }

        return max;

    }
}
