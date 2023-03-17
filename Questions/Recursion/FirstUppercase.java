package Recursion;

public class FirstUppercase {

    public static void main(String[] args) {

        String S = "geeksforGeeKS";
        System.out.println(firstUppercase(S, 0));
    }

    private static char firstUppercase(String s, int i) {

        char ch = 0;

        // Base Condition to stop the recursion
        if(i == s.length())
            return ch;

        // Checking if the character is Uppercase or not
        // If it is Uppercase return that character else call the function again for the next character
        if(Character.isUpperCase(s.charAt(i)))
            return s.charAt(i);
        else
            return firstUppercase(s, i + 1);

    }
}
