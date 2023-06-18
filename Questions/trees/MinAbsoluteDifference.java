package trees;

import java.util.ArrayList;
import java.util.List;

public class MinAbsoluteDifference {
    Node prev;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(Node root) {
        dfs(root);
        return ans;
    }

    public void dfs(Node node){
        if(node == null){
            return;
        }
        dfs(node.left);

        if(prev != null){
            ans = Math.min(ans, node.val - prev.val);
        }
        prev = node;
        dfs(node.right);
    }

    //2nd solution
    public int getMinimumDifference2(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < list.size() - 1; i++){
            int diff = Math.abs(list.get(i) - list.get(i + 1));
            if(minDiff > diff){
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public void inorder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }
}
