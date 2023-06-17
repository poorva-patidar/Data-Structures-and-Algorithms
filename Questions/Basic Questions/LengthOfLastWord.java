package basic;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Poorva is doing a easy problem on Leetcode   "));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if(s.charAt(i) != ' '){
                count++;
            } else {
                if(count != 0){
                    break;
                }
            }
        }
        return count;
    }
}
