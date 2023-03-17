package StackAndQueue;

import java.util.Queue;
import java.util.Stack;

public class ReverseKElementQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();

        while(k > 0 && !q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
         for(int i = 0; i < q.size() - k; i++){
             q.add(q.remove());
         }

         return q;
    }
}
