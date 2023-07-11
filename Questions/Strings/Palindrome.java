package Strings;

/**
 * 1st Way: Reverse the string and check whether it is equal to original string or not
 * 2nd Way: Take two pointer at start and end and check whether they are equal or not till they meet or cross each other
 * if yes true else false OR run a for loop till thr middle of string and check for each character
 * Time complexity: O(N)
 */
public class Palindrome {
    public boolean isPalindrome(String str){
        // ask the interviewer for this edge case
        if(str == null){
            return true;
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
