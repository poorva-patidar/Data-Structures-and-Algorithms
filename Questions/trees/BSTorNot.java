package trees;

import java.util.ArrayList;

public class BSTorNot {
    // First method by using recursion
    private static boolean isBST(Node root){
        if(root == null){
            return true;
        }

        return isAllSmaller(root.left, root.val) && isAllBigger(root.right, root.val) && isBST(root.left) && isBST(root.right);
    }

    private static boolean isAllSmaller(Node root, int data){
        if(root == null){
            return true;
        }

        boolean left = isAllSmaller(root.left, data);
        boolean right = isAllSmaller(root.right,data);
        return root.val <= data && left && right;
    }

    private static boolean isAllBigger(Node root, int val){
        if(root == null){
            return true;
        }

        boolean left = isAllBigger(root.left, val);
        boolean right = isAllBigger(root.right, val);
        return root.val >= val && left && right;
    }

    // 2nd method by using inorder traversal
    static boolean checkBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        boolean check = false;
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) < list.get(i + 1)){
                check = true;
            }else{
                return false;
            }
        }

        return check;
    }

    static void inorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }
}
