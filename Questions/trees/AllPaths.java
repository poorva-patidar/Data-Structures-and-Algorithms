package trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-paths/
public class AllPaths {
    public List<String> binaryTreePaths(Node root) {
        if(root == null){
            return null;
        }
        List<String> list = new ArrayList<>();
        traversal(root, "", list);
        return list;
    }

    public void traversal(Node root, String ans, List<String> list){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            ans = ans + root.val;
            list.add(ans);
            return;
        }

        ans = ans + root.val + "->";

        traversal(root.left, ans, list);
        traversal(root.right, ans, list);
    }
}
