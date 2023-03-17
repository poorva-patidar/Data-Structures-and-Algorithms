package Linkedlist;

public class BinaryToDecimal {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        int length = 0;
        ListNode temp = head;

        while(temp != null){
           length++;
           temp = temp.next;
        }

        temp = head;

        while(temp != null){
            ans += temp.val * Math.pow(2, length - 1);
            length--;
            temp = temp.next;
        }

        return ans;
    }
}
