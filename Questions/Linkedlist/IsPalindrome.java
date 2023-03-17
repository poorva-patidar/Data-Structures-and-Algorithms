package Linkedlist;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode midHead = reverseList(getMid(head));
        ListNode temp = head;

        while(midHead != null){
            if(temp.val != midHead.val){
                return false;
            }
            temp = temp.next;
            midHead = midHead.next;
        }

        return true;
    }

    public ListNode getMid(ListNode node){
        ListNode slow = node;
        ListNode fast = node;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode node){
        if(node == null){
            return node;
        }
        ListNode prev = null;
        ListNode present = node;
        ListNode next = node.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;

            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
