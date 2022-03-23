package RemoveDuplicatesFromSortedList83;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {
    @Test
    public void testOneElementList(){
        assertEquals("(1)", RemoveDuplicatesFromSortedList.deleteDuplicates(new ListNode(1)).getListString());
    }

    @Test
    public void testOneDuplicate(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);

        assertEquals("(1)", RemoveDuplicatesFromSortedList.deleteDuplicates(list).getListString());
    }

    @Test
    public void testDuplicatePlusElements() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);

        assertEquals("(1,2)", RemoveDuplicatesFromSortedList.deleteDuplicates(list).getListString());
    }

    @Test
    public void testComplicated(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(2);
        list.next.next.next.next = new ListNode(2);
        list.next.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next.next = new ListNode(50);

        assertEquals("(1,2,5,50)", RemoveDuplicatesFromSortedList.deleteDuplicates(list).getListString());
    }
    
    @Test
    public void testOneElementListBetter(){
        assertEquals("(1)", RemoveDuplicatesFromSortedList.deleteDuplicatesBetter(new ListNode(1)).getListString());
    }

    @Test
    public void testOneDuplicateBetter(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);

        assertEquals("(1)", RemoveDuplicatesFromSortedList.deleteDuplicatesBetter(list).getListString());
    }

    @Test
    public void testDuplicatePlusElementsBetter(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);

        assertEquals("(1,2)", RemoveDuplicatesFromSortedList.deleteDuplicatesBetter(list).getListString());
    }

    @Test
    public void testComplicatedBetter(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(2);
        list.next.next.next.next = new ListNode(2);
        list.next.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next.next = new ListNode(50);

        assertEquals("(1,2,5,50)", RemoveDuplicatesFromSortedList.deleteDuplicatesBetter(list).getListString());
    }
}