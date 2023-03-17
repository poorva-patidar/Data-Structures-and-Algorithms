package Linkedlist;

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == headB){
            return headA;
        }
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        int diff = Math.abs(lengthA - lengthB);

        if(lengthA < lengthB){
            return intersectionNode(headA, headB, diff);
        } else{
            return intersectionNode(headB, headA, diff);
        }
    }

    public ListNode intersectionNode(ListNode nodeL, ListNode nodeH, int diff){

        for(int i = 0; i < diff; i++){
            nodeH = nodeH.next;
        }
        ListNode temp = null;
        while(nodeL != null){
            if(nodeH == nodeL){
                temp = nodeH;
                break;
            } else{
                nodeH = nodeH.next;
                nodeL = nodeL.next;
            }
        }
        return temp;
    }

    public int getLength(ListNode node){
        int length = 0;
        while(node != null){
            length++;
            node = node.next;
        }
        return length;
    }
}
