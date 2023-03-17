package StackAndQueue;

import java.util.ArrayList;

class MinStack {
    Node head;
    class Node{
        private int min;
        private int val;
        Node next;

        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(2);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin());

    }

    public MinStack() {

    }

    public void push(int val) {
        if(head == null){
            head = new Node(val, val, null);
        } else{
            head = new Node(val, Math.min(val, head.min), head);
        }
    }

    public void pop() {
        if(head != null){
            head = head.next;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

}
