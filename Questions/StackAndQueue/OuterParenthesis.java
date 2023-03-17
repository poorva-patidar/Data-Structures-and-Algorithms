package StackAndQueue;

import java.util.Stack;

public class OuterParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses2(s));
    }

    public static String removeOuterParentheses2(String s) {
        Stack<Character> stack = new Stack<>();
        String str = "";
        stack.push(s.charAt(0));
        char ch;
        String mainStr = "";

        for(int i = 1; i < s.length(); i++){
            ch = s.charAt(i);

            if(ch == ')'){
                char pop = stack.pop();
                if(!stack.isEmpty()){
                    if(s.charAt(i - 1) == ch){
                        str = pop + str + ch;
                    } else{
                        str = str + pop + ch;
                    }
                } else{
                    mainStr = mainStr + str;
                    str = "";
                }
            }else{
                stack.push(ch);
            }
        }

        return mainStr;
    }

    public static String removeOuterParentheses(String s){
        if(s.length() < 2){
            return "";
        }
        Stack<Character> stack = new Stack<>();
        String ans = "";
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(stack.isEmpty()){
                    start = i;
                }
                stack.push(ch);
            }
            else if(ch == ')'){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans += remove(s, start, i);
            }
        }

        return ans;
    }

    public static String remove(String s, int start, int end){
        return s.substring(start + 1, end);
    }

    public String removeOuterParenthesesBetter(String s) {

        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(counter != 0) sb.append(c);
                counter++;
            }
            else{
                counter--;
                if(counter != 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}

