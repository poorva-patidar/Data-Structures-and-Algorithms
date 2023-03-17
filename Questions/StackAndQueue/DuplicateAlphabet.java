package StackAndQueue;

import java.util.Stack;

public class DuplicateAlphabet {
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";

        for (char ch : s.toCharArray()) {
            if(!stack.isEmpty() && ch == stack.peek()){
                stack.pop();
            } else{
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }

        return ans;
    }
}
