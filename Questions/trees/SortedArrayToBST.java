package trees;

public class SortedArrayToBST {
    public Node sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;

        Node root = new Node(nums[mid]);
        Node temp = root;

        conversionToBST(temp, true, start, mid - 1, nums);
        conversionToBST(temp, false, mid + 1, end, nums);

        return root;
    }

    public void conversionToBST(Node temp, boolean check, int start, int end, int[] nums){
        if(start > end){
            return;
        }

        int mid  = start + (end - start) / 2;

        if(check){
            temp.left = new Node(nums[mid]);
            conversionToBST(temp.left, true, start, mid - 1, nums);
            conversionToBST(temp.left, false, mid + 1, end, nums);
        } else {
            temp.right = new Node(nums[mid]);
            conversionToBST(temp.right, true, start, mid - 1, nums);
            conversionToBST(temp.right, false, mid + 1, end, nums);
        }
    }
}
