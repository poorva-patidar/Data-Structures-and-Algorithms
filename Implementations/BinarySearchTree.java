package Implementation;

import trees.Node;

public class BinarySearchTree {
    private class Node {
        int val;
        int height;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }

        public int getVal(){
            return val;
        }
    }

    private static Node root;

    public BinarySearchTree(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int val){
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if(node == null){
            node = new Node(val);
            return node;
        }

        if(node.val == val){
            System.out.println("Element already present");
        } else if (node.val > val){
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean isBalanced(){
         return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if(node == null){
            return true;
        }

        return Math.abs(height(node.right) - height(node.left)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        display(this.root, "Root node: ");
    }

    private void display(Node node, String details) {
        if(node == null){
            return;
        }

        System.out.println(details + node.val);
        display(node.left, "Left of" + node.val + ": ");
        display(node.right, "Right of " + node.val + ": ");
    }

    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void populateSorted(int[] arr){
        populateSorted(arr, 0, arr.length);

    }

    private void populateSorted(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }

        int mid = start + (end - start) / 2;

        this.insert(arr[mid]);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);

    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] arr = { 4, 3, 6, 9, 8, 43, 5, 16, 7};
        tree.populate(arr);
        tree.display();
        tree.inorder();
    }

    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }


    public void preorder(){
        inorder(root);
    }
    private void preorder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }


}
