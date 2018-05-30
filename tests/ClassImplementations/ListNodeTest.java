package ClassImplementations;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew on 5/24/2018.
 */
public class ListNodeTest {

    @Test
    public void TestListStringOneNode(){
        ListNode node = new ListNode(9);
        ListNode node2 = new ListNode(-1);

        assertEquals("(9)", node.getListString());
        assertEquals("(-1)", node2.getListString());
    }

    @Test
    public void TestListStringFullList(){
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(-65);

        ListNode list2 = new ListNode(500);
        list2.next = new ListNode(-54);
        list2.next.next = new ListNode(0);
        list2.next.next.next = new ListNode(1);

        assertEquals("(0,-65)", list1.getListString());
        assertEquals("(500,-54,0,1)", list2.getListString());
    }

}