package Recursion;

public class StringConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aaaaabbbbccaadd";

        String ans = stringDuplicate(str, 0);

        System.out.println(ans);
    }

    private static String stringDuplicate(String str, int i) {

        String ans = "";
        if(str.length() - 1 == i)
            return "" + str.charAt(i);

        if(str.charAt(i) != str.charAt(i + 1)){
            ans = ans + str.charAt(i);
        }
        i = i + 1;
        return ans + stringDuplicate(str, i);
    }
}
