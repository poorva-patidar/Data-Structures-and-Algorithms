package trees;

public class Height {
    public int height(Node root){
        if(root == null){
            return 0;
        }

        int valLeft = 1 + height(root.left);
        int valRight = 1 + height(root.right);
        return Math.max(valLeft, valRight);

    }
}
