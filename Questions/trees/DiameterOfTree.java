package trees;

public class DiameterOfTree {
    public int diameterOfBinaryTree(Node root) {
        int[] ans = new int[1];
        height(root, ans);
        return ans[0];
    }

    public int height(Node node, int[] ans){
        if(node == null) {
            return 0;
        }

        int left = height(node.left, ans);
        int right = height(node.right, ans);

        ans[0] = Math.max(ans[0], left + right);

        return Math.max(left, right) + 1;
    }


}
