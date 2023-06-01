package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.left.left = new Node(7);
        root1.right = new Node(2);
        root1.right.right = new Node(7);


        System.out.println(isSymmetric(root1));
    }

    public static boolean isSymmetric(Node root) {
        if(root.left == null && root.right == null){
            return true;
        }
        return depthFirstSearch(root.left, root.right);
    }
    private static boolean depthFirstSearch(Node left, Node right){
        boolean check = false;
        Stack<Node> stackL = new Stack<>();
        Stack<Node> stackR = new Stack<>();

        if(left == null || right == null){
            return false;
        }

        stackL.push(left);
        stackR.push(right);

        while (!stackL.isEmpty() && !stackR.isEmpty()){
            Node currentL = stackL.pop();
            Node currentR = stackR.pop();

            if(currentL.val == currentR.val){
                check = true;
            } else{
                return false;
            }

            if(currentL.left != null && currentR.right != null){
                stackL.push(currentL.left);
                stackR.push(currentR.right);
            }

            if(currentL.right != null && currentR.left != null){
                stackL.push(currentL.right);
                stackR.push(currentR.left);
            }
        }

        return check;
    }

    //Recursive approach to solve it
    public boolean isSymmetric2(Node root) {
        if (root == null) {
            return true;
        }
        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && checkSymmetric(node1.left, node2.right) &&
                checkSymmetric(node1.right, node2.left);
    }
}
