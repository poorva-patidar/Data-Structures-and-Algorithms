package Strings;

public class NoOfStringWith1 {
    public static void main(String[] args) {
        System.out.println(numSub("00000000000000000000000000000"));
    }

    public static int numSub(String s) {
        long sum = 0;
        int i = 0;
        int j = 0;
        int mod = (int) (Math.pow(10, 9) + 7);

        while(i < s.length() && j < s.length()){
            if(s.charAt(i) == '1'){
                while(j < s.length() && s.charAt(j) == '1'){
                    j++;
                }

                int n = j - i;
                sum = (sum % mod) + (n * (n + 1)) / 2;
                i = j;

            } else {
                i++;
                j = i;
            }
        }

        return (int) sum % mod;
    }
}
