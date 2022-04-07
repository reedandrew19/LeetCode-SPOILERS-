package IntersectionOfTwoLinkedLists160;

import ClassImplementations.ListNode;

public class IntersectionOfTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int lengthA = findListLength(headA);
        int lengthB = findListLength(headB);

        if(lengthA - lengthB > 0){
            for(int i = 0; i < lengthA - lengthB; i++){
                headA = headA.next;
            }
        } else if(lengthB - lengthA > 0){
            for(int i = 0; i < lengthB - lengthA; i++){
                headB = headB.next;
            }
        }

        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    private static int findListLength(ListNode node) {
        ListNode curr = node;
        int count = 0;

        while(curr != null){
            curr = curr.next;
            count += 1;
        }

        return count;
    }
}
