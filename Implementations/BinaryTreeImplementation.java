package Implementation;

import java.util.Scanner;

public class BinaryTreeImplementation {
    public BinaryTreeImplementation(){

    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    //Populating the binary tree
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the right of " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of " + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    //Displaying the tree
    public void display(){
        display(root, " ");
    }

    //indent is just the space we are providing
    private void display(Node node, String indent) {
        if(node == null){
            return;
        }

        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(){
        if(root == null){
            return;
        }
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right, level + 1);
        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.val);
        } else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTreeImplementation tree = new BinaryTreeImplementation();
        tree.populate(scanner);
        tree.prettyDisplay();
    }




}
