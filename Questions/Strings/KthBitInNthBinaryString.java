package Strings;

public class KthBitInNthBinaryString {
    public static void main(String[] args) {
        System.out.println(findKthBit(4, 14));
    }
    public static char findKthBit(int n, int k) {
        String s = construct(n);
        return s.charAt(k - 1);
    }

    public static String construct(int n){
        if(n == 1){
            return "0";
        }

        String s = construct(n - 1);
        StringBuilder sb = new StringBuilder(invert(s));
        sb.reverse();
        return s + "1" + sb.toString();
    }

    private static String invert(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch =='1'){
                sb.append("" + 0);
            } else {
                sb.append("" + '1');
            }
        }

        return sb.toString();
    }
}
