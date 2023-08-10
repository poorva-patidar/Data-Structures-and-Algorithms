package Strings;

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(toPostfix("0-2147483647"));
       System.out.println(calculate("42"));
    }

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        List<String> list = toPostfix(s);
        for(String st: list){
            if(isOperation(st.charAt(0))){
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (st.charAt(0)) {
                    case '+' -> stack.push(val2 + val1);
                    case '-' -> stack.push(val2 - val1);
                    case '*' -> stack.push(val2 * val1);
                    case '/' -> stack.push(val2 / val1);
                }

            } else {
                stack.push(Integer.parseInt(st));
            }
        }

        return stack.pop();
    }

    public static List<String> toPostfix(String s){
        List<String> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == ' '){
                i++;
                continue;

            }
            if (isOperation(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    list.add("" + stack.pop());
                }
                stack.push(ch);
                i++;
            } else {
                int j = i;
                while (j < s.length() && Character.isDigit(s.charAt(j))){
                    j++;
                }
                list.add(s.substring(i, j));
                i = j;
            }

        }

        while (!stack.isEmpty()){
            list.add("" + stack.pop());
        }
        return list;
    }

    private static int precedence(char ch){
        switch (ch){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            default: return -1;
        }
    }

    private static boolean isOperation(char ch){
       return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
