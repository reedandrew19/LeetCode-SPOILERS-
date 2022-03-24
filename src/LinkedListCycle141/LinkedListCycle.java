package LinkedListCycle141;

import ClassImplementations.ListNode;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        ListNode fastRunner = head;

        while(fastRunner != null && fastRunner.next != null && fastRunner.next.next != null){
            fastRunner = fastRunner.next.next;

            if(fastRunner == head){
                return true;
            }

            head = head.next;
        }

        return false;
    }
}
/**
 * This algorithm is ALMOST perfect. You don't actually need to check for if fastRunner.next.next is null because that
 * will be done automatically during the next while loop comparison if you only increment the fastRunner twice. Luckily
 * I remembered this algorithm I've never used once since I've joined the work force.
 */
