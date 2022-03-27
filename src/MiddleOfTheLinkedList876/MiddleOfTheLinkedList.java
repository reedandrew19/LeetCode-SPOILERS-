package MiddleOfTheLinkedList876;

import ClassImplementations.ListNode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head){
        ListNode fastRunner = head;
        ListNode slowRunner = head;

        while(fastRunner != null && fastRunner.next != null){
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
        }

        return slowRunner;
    }
}

/**
 * A second LinkedList problem that I got perfectly correct on my first try! Well, kind of. I had a bug where I was
 * using "or" for the predicate instead of "and" which gave a null pointer, and I didn't catch it until I ran tests
 * instead of before running them, but that's a small mistake and I got the algorithm as a whole correct!
 */