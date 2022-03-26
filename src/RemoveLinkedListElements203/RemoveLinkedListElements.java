package RemoveLinkedListElements203;

import ClassImplementations.ListNode;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val){
        ListNode curr = head;
        ListNode prehead = new ListNode(0);
        prehead.next = curr;
        ListNode prev = prehead;

        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }

        return prehead.next;
    }
}
/**
 * This is the first linked list problem that I've solved 100% correctly and I couldn't be happier :D
 */
