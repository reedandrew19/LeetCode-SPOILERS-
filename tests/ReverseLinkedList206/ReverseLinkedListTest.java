package ReverseLinkedList206;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    @Test
    public void testEmptyListBetter(){
        assertEquals(null, ReverseLinkedList.reverseListCleaner(null));
    }

    @Test
    public void testSingleNodeListBetter(){
        ListNode node = new ListNode(1);
        assertEquals("(1)", ReverseLinkedList.reverseListCleaner(node).getListString());
    }

    @Test
    public void testTwoNodeListBetter(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);

        assertEquals("(2,1)", ReverseLinkedList.reverseListCleaner(node).getListString());
    }

    @Test
    public void testMultiNodeListBetter(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(145);
        node.next.next = new ListNode(145);
        node.next.next.next = new ListNode(-23);
        node.next.next.next.next = new ListNode(0);

        assertEquals("(0,-23,145,145,1)", ReverseLinkedList.reverseListCleaner(node).getListString());
    }

    @Test
    public void testEmptyList(){
        assertEquals(null, ReverseLinkedList.reverseList(null));
    }

    @Test
    public void testSingleNodeList(){
        ListNode node = new ListNode(1);
        assertEquals("(1)", ReverseLinkedList.reverseList(node).getListString());
    }

    @Test
    public void testTwoNodeList(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);

        assertEquals("(2,1)", ReverseLinkedList.reverseList(node).getListString());
    }

    @Test
    public void testMultiNodeList(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(145);
        node.next.next = new ListNode(145);
        node.next.next.next = new ListNode(-23);
        node.next.next.next.next = new ListNode(0);

        assertEquals("(0,-23,145,145,1)", ReverseLinkedList.reverseList(node).getListString());
    }
}