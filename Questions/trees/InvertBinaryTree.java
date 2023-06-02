package trees;

// https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if(root == null){
            return root;
        }
        invert(root);
        return root;
    }

    public void invert(Node root){
        if(root == null){
            return;
        }

        if(root.left != null && root.right != null){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        } else if(root.left == null){
            root.left = root.right;
            root.right = null;
        } else{
            root.right = root.left;
            root.left = null;
        }

        invert(root.left);
        invert(root.right);
    }

    // More simple way
    public Node invertTree2(Node root) {
        if (root == null) {
            return null;
        }

        Node left = invertTree2(root.left);
        Node right = invertTree2(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

}
