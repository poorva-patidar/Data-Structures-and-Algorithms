package Strings;

// https://leetcode.com/problems/valid-palindrome/description/
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" 2222"));
    }
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        String str = s.toLowerCase();
        while(start < end){
            char st = str.charAt(start);
            char en = str.charAt(end);
            int asciiS = (int) st;
            int asciiE = (int) en;

            if(((asciiS >= 97 && asciiS <= 122) || (asciiS >= 48 &&
                    asciiS <= 57)) && ((asciiE >= 97 && asciiE <= 122) || (asciiE >= 48 &&
                    asciiE <= 57))){
                if(st == en){
                    start++;
                    end--;
                } else{
                    return false;
                }
            } else {
                if(st == ' ' || (!(asciiS >= 97 && asciiS <= 122) && !(asciiS >= 48 &&
                        asciiS <= 57))){
                    start++;
                } else {
                    end--;
                }
            }
        }
        return true;
    }
}
