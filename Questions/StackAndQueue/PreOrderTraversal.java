package StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
}

public class PreOrderTraversal {
    ArrayList<Integer> preOrder1(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;

        while(!stack.isEmpty()){
            current = stack.peek();

            if(current.left == null && current.right == null){
                result.add(stack.pop().data);
            }else{
                if(current.right != null){
                    stack.push(current.right);
                    current.right = null;
                }else{
                    if(current.left != null){
                        stack.push(current.left);
                        current.left = null;
                    }
                }
            }
        }

        return result; // You have to reverse the arrayList

    }

    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;

        while(!stack.isEmpty()){
            current = stack.pop();
            result.add(current.data);

            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }

        return result; // You have to reverse the arrayList

    }
}