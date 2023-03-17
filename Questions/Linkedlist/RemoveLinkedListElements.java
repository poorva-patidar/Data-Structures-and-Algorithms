package Linkedlist;

//https://leetcode.com/problems/remove-linked-list-elements/

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            if(temp.val == val){

                if(temp == head){
                    temp = temp.next;
                    head = temp;
                }
                else{
                    prev.next = temp.next;
                    temp = temp.next;
                }
            }
            else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
