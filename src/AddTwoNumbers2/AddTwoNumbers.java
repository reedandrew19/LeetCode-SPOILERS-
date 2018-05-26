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
        ListNode returnList = new ListNode(0);
        ListNode cursor = returnList;
        int carry = 0;

        while(l1 != null && l2 != null){
            cursor.val = l1.val + l2.val + carry;

            if(cursor.val > 9){
                cursor.val -= 10;
                carry = 1;
            }else{
                carry = 0;
            }

            l1= l1.next;
            l2 = l2.next;

            if(l1 != null || l2 != null){
                cursor.next = new ListNode(0);
                cursor = cursor.next;
            }
        }

        if(l1 == null){
            while(l2 != null){
                cursor.val = l2.val;
                l2 = l2.next;

                if (l2 != null) {
                    cursor.next = new ListNode(0);
                    cursor = cursor.next;
                }
            }
        }

        if(l2 == null){
            while(l1 != null){
                cursor.val = l1.val;
                l1 = l1.next;

                if (l1 != null) {
                    cursor.next = new ListNode(0);
                    cursor = cursor.next;
                }
            }
        }

        return returnList;
    }
}
