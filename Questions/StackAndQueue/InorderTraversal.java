package StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

//class Node {
//    int data;
//    Node left, right;
//    Node(int item)    {
//        data = item;
//        left = right = null;
//    }
//}

public class InorderTraversal {
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;

        while(!stack.isEmpty()){
            current = stack.peek();

            if(current.left != null){
                stack.push(current.left);
                current.left = null;
            } else{
                result.add(stack.pop().data);
                if(current.right != null){
                    stack.push(current.right);
                    current.right = null;
                }
            }
        }

        return result;

    }
}
