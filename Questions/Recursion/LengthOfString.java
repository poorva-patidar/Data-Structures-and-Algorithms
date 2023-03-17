package Recursion;

import java.util.Arrays;

public class LengthOfString {
    public static void main(String[] args) {
        String S = "GEEKSFORGEEKS";
        int length = lengthOfString(S, 0);
        System.out.println("Length = "+ length);
    }

    private static int lengthOfString(String s, int i) {

        if(s.equals("")) {
            return i;
        }
        i++;
        String sub = s.substring(1);
        return lengthOfString(sub , i);
    }
}
