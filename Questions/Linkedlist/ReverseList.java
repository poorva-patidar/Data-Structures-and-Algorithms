package Linkedlist;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
         if(head == null){
             return head;
         }

         ListNode prev = null;
         ListNode current = head;
         ListNode next = head.next;

         while(current != null){
             current.next = prev;
             prev = current;
             current = next;
             if(next != null){
                 next = next.next;
             }
         }

         head = prev;
         return head;
    }
}
