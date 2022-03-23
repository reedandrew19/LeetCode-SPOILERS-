package RemoveDuplicatesFromSortedList83;

import ClassImplementations.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head){
        ListNode prehead = new ListNode(-101);
        ListNode prev = prehead;
        prev.next = head;

        while(head != null){
            if(head.val == prev.val){
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }

        return prehead.next;
    }

    public static ListNode deleteDuplicatesBetter(ListNode head){
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        return head;
    }
}
/**
 * Pros and cons with this practice problem: I managed to get a solution by myself. However, there was a cleaner
 * solution possible. Two things to keep in mind here:
 *
 * 1) We only need one cursor when iterating over one list. Because my previous question dealt with merging lists, and
 * we didn't know where the head starts, we had to create a prehead in order to allow either of the two list heads to be
 * the head node. This isn't necessary with only one list as the problem input.
 *
 * 2) There are two ways to delete a node. The first is using a prev and a curr cursor, point the prev node to curr.next
 * and then moving the curr node forward. This keeps prev in place, to keep track of a previous value and shifts the
 * curr node. Similarly, we can keep the curr node static, making curr.next == curr.next.next. This keeps the current
 * node in place while shifting the next node. Using the second technique, however, we don't have to keep track of a
 * prev node! There will need to be an extra null check for current.next, but this may lead to more readable code.
 */