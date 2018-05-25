package AddTwoNumbers2;

import ClassImplementations.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * Created by Andrew on 5/24/2018.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode(l1.val + l2.val);
    }
}
