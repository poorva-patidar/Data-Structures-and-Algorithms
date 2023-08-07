package Strings;

public class LetterShifting {
    public static void main(String[] args) {
        int[] shifts = {26, 9, 17};
        System.out.println(shiftingLetters("ruu", shifts));
    }
    public static String shiftingLetters(String s, int[] shifts) {
        char[] ch = s.toCharArray();
        int sum = 0;


        for(int i = shifts.length - 1; i >= 0; i--){
            sum += shifts[i] % 26;
            ch[i] = (char)((ch[i] - 'a' + sum) % 26 + 'a');

        }


        StringBuilder sb = new StringBuilder();

        for(char c: ch){
            sb.append(c);
        }

        return sb.toString();
    }
}
