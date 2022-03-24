package LinkedListCycle141;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    public void testNullLinkedList(){
        assertFalse(LinkedListCycle.hasCycle(null));
    }

    @Test
    public void testSingleNodeNoCycle(){
        ListNode list = new ListNode(1);
        assertFalse(LinkedListCycle.hasCycle(list));
    }

    @Test
    public void testSingleNodeCyclePresent(){
        ListNode list = new ListNode(1);
        list.next = list;

        assertTrue(LinkedListCycle.hasCycle(list));
    }

    @Test
    public void testLongListNoCycle(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(1);
        list.next.next.next.next = new ListNode(1);
        list.next.next.next.next.next = new ListNode(1);

        assertFalse(LinkedListCycle.hasCycle(list));
    }

    @Test
    public void testLongListCyclePresent(){
        ListNode list = new ListNode(1);
        ListNode repeatedNode = new ListNode(2);

        list.next = new ListNode(1);
        list.next.next = repeatedNode;
        list.next.next.next = new ListNode(1);
        list.next.next.next.next = new ListNode(1);
        list.next.next.next.next.next = repeatedNode;

        assertTrue(LinkedListCycle.hasCycle(list));

    }
}