package trees;

//https://leetcode.com/problems/binary-tree-tilt/description/
public class FindTilt {
    public int findTilt(Node root) {
        tilt(root);
        return sum(root, 0);
    }

    public void tilt(Node node){
        if(node == null){
            return;
        }

        node.val = Math.abs(sum(node.left, 0) - sum(node.right, 0));
        tilt(node.left);
        tilt(node.right);
    }

    public int sum(Node root, int sum){
        if(root == null){
            return 0;
        }

        sum += root.val;
        return sum + sum(root.left , 0) + sum(root.right, 0);
    }
}
