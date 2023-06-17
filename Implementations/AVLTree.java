package Implementation;

public class AVLTree {
    Node root;
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(35);
        tree.insert(36);
        tree.preOrder(tree.root);
    }
    public static class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.height = 0;
            this.val = val;
        }

    }



    public void insert(int val){
        if(root == null){
            root = new Node(val);
            return;
        }

        root = insert(root, val);
    }

    private Node insert(Node node, int val){
        if(node == null){
            return new Node(val);
        }

        if(node.val > val){
            node.left = insert(node.left, val);
        }
        else if (node.val < val) {
            node.right = insert(node.right, val);
        }
        else {
            return node;
        }

        node.height = (int) Math.max(height(node.left), height(node.right)) + 1;
        int balanceFactor = getBalanceFactor(node);

        if(balanceFactor > 1 && node.left.val > val){
            return leftLeftRotation(node);
        }

        if(balanceFactor > 1 && node.left.val < val){
            node.left = rightRightRotation(node.left);
            return leftLeftRotation(node);
        }

        if(balanceFactor < -1 && node.right.val < val){
            return rightRightRotation(node);
        }

        if(balanceFactor < -1 && node.right.val > val){
            node.right = leftLeftRotation(node.right);
            return rightRightRotation(node);
        }
        return node;
    }

//    private boolean isBalanced(Node node) {
//        if(node == null){
//            return true;
//        }
//
//        return Math.abs(height(node.right) - height(node.left)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
//    }

    private Node leftLeftRotation(Node node) {
        Node temp1 = node.left;
        Node temp2 = temp1.right;
        temp1.right = node;
        node.left = temp2;
        node.height = (int) Math.max(height(node.left), height(node.right)) + 1;
        temp1.height = (int) Math.max(height(temp1.left), height(temp1.right)) + 1;
        return temp1;
    }

    public void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private Node rightRightRotation(Node node) {
        Node temp1 = node.right;
        Node temp2 = temp1.left;
        temp1.left = node;
        node.right = temp2;
        node.height = (int) Math.max(height(node.left), height(node.right)) + 1;
        temp1.height = (int) Math.max(height(temp1.left), height(temp1.right)) + 1;
        return temp1;
    }

    private int getBalanceFactor(Node node){
        if(node == null){
            return 0;
        }

        return height(node.left) - height(node.right);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }

        return node.height;
    }

    /**
     * Binary search for key
     * ADD the element
     * Increase height and check its ancestor's balance
     * If not balance , if balance factor is > 1 then it may be LL imbalance or LR imbalance
     * {if bf > 1 && node.left.val > key then go for LL }
     * {if bf > 1 && node.left.val < key then go for LR }
     * if balance factor is < -1 then it may be RR imbalance or RL imbalance
     * {if bf < -1 && node.right.val < key then go for RR }
     * {if bf < -1 && node.right.val > key then go for RL }
     * Apply rotation
     */


}
