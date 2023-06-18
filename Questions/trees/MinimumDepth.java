package trees;

public class MinimumDepth {
    public int minDepth(Node root) {
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

        if(root.left == null){
            return valRight;
        }

        if(root.right == null){
            return valLeft;
        }

        return Math.min(valLeft, valRight);
    }


}
