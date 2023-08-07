package Strings;

import java.util.Arrays;

public class MaximumRemovals {
    public static void main(String[] args) {
        int[] indexes = {8,1, 0};
        System.out.println(maximumRemovals("aaaaaaaabcdef", "aaaabdf", indexes));
    }

    public static int maximumRemovals(String s, String p, int[] removable) {
        int start = -1;
        int end = removable.length;
        int mid = 0;
        int l = -1;
        char[] chs = s.toCharArray();
        char[] chp = p.toCharArray();

        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            if(possible(chs, chp, removable, l+ 1, mid)){
                start = mid;
                l = start;
            } else {
                end = mid;
                chs = s.toCharArray();
                l = -1;
            }
        }

        return start + 1;
    }

    public static boolean possible(char[] chs , char[] chp , int[] indexes,int l, int mid){
        int i = 0;
        int j = 0;
        for (int k = l; k <= mid; k++) {
            chs[indexes[k]] = '0';
        }


        while(i < chs.length && j < chp.length){
            if(chs[i] == chp[j]){
                    j++;
            }
            i++;
        }

        return j == chp.length;
    }
}
