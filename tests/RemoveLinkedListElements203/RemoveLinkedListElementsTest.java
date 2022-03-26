package RemoveLinkedListElements203;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {
    @Test
    public void testNoNodes(){
        assertEquals(null, RemoveLinkedListElements.removeElements(null, 1));
    }

    @Test
    public void testOneNodeNoMatch(){
        assertEquals("(3)", RemoveLinkedListElements.removeElements(new ListNode(3), 1).getListString());
    }

    @Test
    public void testOneNodeMatch(){
        assertEquals(null, RemoveLinkedListElements.removeElements(new ListNode(1), 1));

    }

    @Test
    public void testTwoNodesFirstMatch(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);

        assertEquals("(3)", RemoveLinkedListElements.removeElements(list, 1).getListString());
    }

    @Test
    public void testTwoNodesLastMatch(){
        ListNode list = new ListNode(3);
        list.next = new ListNode(1);

        assertEquals("(3)", RemoveLinkedListElements.removeElements(list, 1).getListString());
    }

    @Test
    public void testManyNodesManyMatches(){
        ListNode list = new ListNode(3);
        list.next = new ListNode(1);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(53);
        list.next.next.next.next = new ListNode(27);
        list.next.next.next.next.next = new ListNode(1);

        assertEquals("(3,53,27)", RemoveLinkedListElements.removeElements(list, 1).getListString());
    }

    @Test
    public void testManyNodesAllMatches(){
        ListNode list = new ListNode(17);
        list.next = new ListNode(17);
        list.next.next = new ListNode(17);
        list.next.next.next = new ListNode(17);
        list.next.next.next.next = new ListNode(17);
        list.next.next.next.next.next = new ListNode(17);

        assertEquals(null, RemoveLinkedListElements.removeElements(list, 17));
    }
}