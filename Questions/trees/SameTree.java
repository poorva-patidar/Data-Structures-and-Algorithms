package trees;

public class SameTree {
    public boolean isSameTree(Node p, Node q) {
            return sameCheck(p, q);
    }

    private boolean sameCheck(Node p, Node q) {
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        if(p.val == q.val){
            return sameCheck(p.left, q.left) && sameCheck(p.right, q.right);
        } else{
            return false;
        }
    }
}
