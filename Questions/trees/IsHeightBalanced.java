package trees;

public class IsHeightBalanced {
    private static int val;
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);
        root.right.right = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println(isBalanced1(root));

    }

    //efficient way
    public static boolean isBalanced1(Node root) {
        if(root == null){
            return true;
        }

        if(Math.abs(height(root.left) - height(root.right)) > 1){
            return false;
        }

        return isBalanced1(root.left) && isBalanced1(root.right);

    }


    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int valLeft = 1 + height(root.left);
        int valRight = 1 + height(root.right);
        return Math.max(valLeft, valRight);

    }

    // Not very efficient
    public static boolean isBalanced2(Node root) {
        if(root == null){
            return true;
        }
        return isNodeBalanced(root);

    }

    public static boolean isNodeBalanced(Node root){
        boolean check = false;
        if(root == null){
            return true;
        }

        int left = helper(root.left, 0);
        int right = helper(root.right, 0);

        if(Math.abs(left - right) == 0 || Math.abs(left - right) == 1 ){
            check = true;
        }

        return isNodeBalanced(root.left) && isNodeBalanced(root.right) && check;
    }

    public static int helper(Node root, int val){
        val += 1;
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return val;
        }

        int valLeft = helper(root.left, val);
        int valRight = helper(root.right, val);
        int max = Math.max(valLeft, valRight);

        return Math.max(val, max);
    }
}
