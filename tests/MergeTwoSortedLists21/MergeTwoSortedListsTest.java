package MergeTwoSortedLists21;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    public void testEmptyNodes(){
        ListNode actualList = MergeTwoSortedLists.mergeTwoLists(null, null);

        assertEquals(null, actualList);
    }

    @Test
    public void testList1Empty(){
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(8);
        ListNode actualList = MergeTwoSortedLists.mergeTwoLists(null, list2);

        assertEquals("(5,8)", actualList.getListString());
    }

    @Test
    public void testList2Empty(){
        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(8);
        ListNode actualList = MergeTwoSortedLists.mergeTwoLists(list1, null);

        assertEquals("(5,8)", actualList.getListString());
    }

    @Test
    public void testAlternatingValues(){
        ListNode list1 = new ListNode(-10);
        list1.next = new ListNode(0);
        list1.next.next = new ListNode(1);

        ListNode list2 = new ListNode(-5);
        list2.next = new ListNode(1);
        list2.next.next = new ListNode(4);
        list2.next.next.next = new ListNode(50);

        ListNode actualList = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals("(-10,-5,0,1,1,4,50)", actualList.getListString());
    }
}