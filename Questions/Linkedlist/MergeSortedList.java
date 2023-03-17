package Linkedlist;

public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;

        if(list1 != null && list2 != null){
            if(list1.val > list2.val){
                head = list2;
                list2 = list2.next;
            } else{
                head = list1;
                list1 = list1.next;
            }
        }

        ListNode temp = head;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                temp.next = list2;
                list2 = list2.next;
            } else{
                temp.next = list1;
                list1 = list1.next;
            }
            if(temp.next != null){
                temp = temp.next;
            }
        }

        while(list1 != null){
            temp.next = list1;
            list2 = list1.next;
            temp = temp.next;
        }

        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return head;
    }
}
