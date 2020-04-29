package AddTwoNumbers2;

import ClassImplementations.ListNode;
/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 *
 * Created by Andrew on 5/24/2018.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnList = new ListNode(0);
        ListNode cursor = returnList;
        int carry = 0;

        while(l1 != null && l2 != null){
            cursor.val = (l1.val + l2.val + carry) % 10;

            carry = (l1.val + l2.val + carry) / 10;

            l1= l1.next;
            l2 = l2.next;

            if(l1 != null || l2 != null){
                cursor.next = new ListNode(0);
                cursor = cursor.next;
            }
        }

        if(l2 != null){
            while(l2 != null){
                cursor.val = (l2.val + carry) % 10;
                carry = (l2.val + carry) / 10;

                l2 = l2.next;

                if (l2 != null) {
                    cursor.next = new ListNode(0);
                    cursor = cursor.next;
                }
            }
        }

        if(l1 != null){
            while(l1 != null){
                cursor.val = (l1.val + carry) % 10;
                carry = (l1.val + carry) / 10;

                l1 = l1.next;

                if (l1 != null) {
                    cursor.next = new ListNode(0);
                    cursor = cursor.next;
                }
            }
        }

        if(carry > 0){
            cursor.next = new ListNode(carry);
        }

        return returnList;
    }

    public static ListNode addTwoNumbersCleaner(ListNode l1, ListNode l2) {
        ListNode returnList = new ListNode(0);
        ListNode cursor = returnList;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int list1Val = (l1 != null) ? l1.val : 0;
            int list2Val = (l2 != null) ? l2.val : 0;
            int sum = list1Val + list2Val + carry;

            carry = sum / 10;
            cursor.next = new ListNode(sum % 10);
            cursor = cursor.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0) {
            cursor.next = new ListNode(carry);
        }

        return returnList.next;
    }
}
