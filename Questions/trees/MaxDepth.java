package trees;

public class MaxDepth {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }

        return helper(root, 0);

    }

    public int helper(Node root, int val){
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
