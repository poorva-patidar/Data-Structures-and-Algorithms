package Strings;

// https://leetcode.com/problems/multiply-strings/
public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();

        // Array to store the result
        int[] result = new int[n1 + n2];

        for(int i = n1 - 1; i >= 0; i--){
            for(int j = n2 - 1; j >= 0; j--){
                int m = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int pos1 = i + j;
                int pos2 = i + j + 1;
                int sum = m + result[pos2];

                result[pos1] += sum / 10;
                result[pos2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int ans: result){
            if(!(sb.length() == 0 && ans == 0)){
                sb.append(ans);
            }
        }

        if(sb.length() == 0) return "0";
        return sb.toString();
    }
}
