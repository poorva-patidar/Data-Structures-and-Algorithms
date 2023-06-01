package trees;

import java.util.ArrayList;
import java.util.Stack;

public class SumPath {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(3);
        root.right = new Node(8);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);

        System.out.println(hasPathSum(root, 22));
    }
    public static boolean hasPathSum(Node root, int targetSum) {
        ArrayList<Integer> list = new ArrayList<>();
        pathSum(root, 0, list);
        return false;
    }

    private static void pathSum(Node root, int sum, ArrayList<Integer> list) {

    }
}
