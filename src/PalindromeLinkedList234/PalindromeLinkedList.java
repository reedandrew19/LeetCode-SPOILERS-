package PalindromeLinkedList234;

import ClassImplementations.ListNode;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head){
        ListNode prev = new ListNode(0);
        prev.next = head;

        ListNode startSecondHalf = findSecondHalfStart(head);
        ListNode reversedSecondHalf = reverse(startSecondHalf);
        return isPalindrome(head, reversedSecondHalf);
    }

    private static ListNode findSecondHalfStart(ListNode head) {
        ListNode curr = head;
        ListNode fastRunner = head;

        while(fastRunner != null && fastRunner.next != null){
            curr = curr.next;
            fastRunner = fastRunner.next.next;
        }

        if(fastRunner != null){
            curr = curr.next;
        }

        return curr;
    }

    private static ListNode reverse(ListNode startSecondHalf) {
        ListNode curr = startSecondHalf;
        ListNode head = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = head;
            head = curr;
            curr = temp;
        }

        return head;
    }

    private static boolean isPalindrome(ListNode head, ListNode reversedSecondHalf) {
        while(reversedSecondHalf != null){
            if(head.val != reversedSecondHalf.val){
                return false;
            }

            reversedSecondHalf = reversedSecondHalf.next;
            head = head.next;
        }

        return true;
    }
}
/**
 * I understood how to do this problem, I got all of the steps correct, but I messed up reversing a linked list AGAIN.
 * I also messed up because I tried to reverse the second half of the linked list in place, connecting the first and the
 * second half, which you don't need to do. Realizing that made this problem much easier, but messing up the link list
 * reversing added an extra hour to my programming time and really had a big blow on my moral. I'm going to look at link
 * list reversal every day until I understand it
 */