package MiddleOfTheLinkedList876;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {
    @Test
    public void testSingleNodeList(){
        assertEquals(1, MiddleOfTheLinkedList.middleNode(new ListNode(1)).val);
    }

    @Test
    public void testOddSizeList(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        assertEquals(3, MiddleOfTheLinkedList.middleNode(list).val);
    }

    @Test
    public void testEvenSizeList(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);

        assertEquals(4, MiddleOfTheLinkedList.middleNode(list).val);
    }
}