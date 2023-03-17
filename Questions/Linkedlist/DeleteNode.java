package Linkedlist;
// https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        while(temp != null){
            temp.val = temp.next.val;
            if(temp.next.next == null){
                temp.next = null;
            }
            temp = temp.next;
        }
    }
}
