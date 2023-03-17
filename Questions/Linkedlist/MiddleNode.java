package Linkedlist;

public class MiddleNode {
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
