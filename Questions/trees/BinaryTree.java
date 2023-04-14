package trees;

import java.util.LinkedList;
import java.util.Queue;

/* Node structure
Node class
  public class Node {
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
*/

public class BinaryTree {
    private static int val;
    static Node root;

    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("Inorder traversal before insertion: ");
        inorder(root);

        insert(root, 12);
        insert(root, 13);
        insert(root, 56);
        insert(root, 10);

        System.out.print("\nInorder traversal after insertion: ");
        inorder(root);

    }

    public static void insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return;
        }

        //Using level order traversal to find an empty place OR we can say Breadth First Search
        Node temp = levelOrderSearch(root, val);

        if(temp.left == null){
            temp.left = new Node(val);
        } else if (temp.right == null) {
            temp.right = new Node(val);
        } else {
            return;
        }
    }

    public static Node levelOrderSearch(Node root, int val){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.remove();

            if(current.val == val){
                return current;
            }

            if(current.left != null){
                queue.add(current.left);
            }else{
                return current;
            }

            if(current.right != null){
                queue.add(current.right);
            }else{
                return current;
            }
        }
        return null;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
