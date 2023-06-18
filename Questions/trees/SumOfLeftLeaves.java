package trees;

// https://leetcode.com/problems/sum-of-left-leaves/
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(Node root) {
        return sumOfLeft(root, false);
    }

    public int sumOfLeft(Node root, boolean check){
        if(root == null){
            return 0;
        }

        if(check){
            if(root.left == null && root.right == null){
                return root.val;
            }
        }

        return sumOfLeft(root.left, true) + sumOfLeft(root.right, false);
    }
}
