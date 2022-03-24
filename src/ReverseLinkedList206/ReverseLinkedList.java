package ReverseLinkedList206;

import ClassImplementations.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        ListNode next = curr.next;

        while (next != null) {
            curr.next = next.next;
            next.next = head;
            head = next;
            next = curr.next;
        }

        return head;
    }

    public static ListNode reverseListCleaner(ListNode head){
        ListNode curr = head;
        head = null;

        while(curr != null){
            ListNode tempNode = curr.next;
            curr.next = head;
            head = curr;
            curr = tempNode;
        }

        return head;
    }
}
/**
 * This solution was a little upsetting, but it was the first problem that I worked like an actual coding interview. I
 * didn't write unit tests to do the work for me, I actually tested manually. It stunk reworking my algorithm when I got
 * it wrong the first time, especially when this algorithm is something I learned fairly early on in college. It hurt
 * worse when I realized there was a cleaner way to do it. But this is how the learning process works, and I was at
 * least able to work out the algorithm all by myself, instead of drawing on previous knowledge.
 */