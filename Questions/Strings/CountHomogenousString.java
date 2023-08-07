package Strings;

import java.util.Map;

public class CountHomogenousString {
    public static void main(String[] args) {
        System.out.println(countHomogenous("abbcccaa"));
    }

    public static int countHomogenous(String s) {
        char[] ch = s.toCharArray();
        long[] arr = new long[26];
        int mod = (int) (Math.pow(10, 9) + 7);
        int i = 0;
        int j = 0;
        int k  = 0;
        long sum = 0;

        while(i < ch.length){
            while (j < ch.length && ch[i] == ch[j]){
                j++;
            }

            sum = ((long) (j - i) * (j - i + 1)) / 2;
            k = ch[i] - 97;
            arr[k] += (sum % mod);
            i = j;
        }

        long ans = 0;
        for(long a: arr){
            ans += a;
        }

        return (int)((int)ans % mod);

    }


}
