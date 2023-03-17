package StackAndQueue;

import java.util.Stack;

public class StackMid {

        //Function to delete middle element of a stack.
        public void deleteMid(Stack<Integer> s, int sizeOfStack){
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < sizeOfStack / 2; i++){
                stack.push(s.pop());
            }
            s.pop();

            while(!stack.isEmpty()){
                s.push(stack.pop());
            }
        }

}
