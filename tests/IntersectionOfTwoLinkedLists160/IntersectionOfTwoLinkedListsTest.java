package IntersectionOfTwoLinkedLists160;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsTest {
    
    @Test
    public void testOneNodeMatch(){
        ListNode node = new ListNode(1);
        assertEquals(node, IntersectionOfTwoLinkedLists.getIntersectionNode(node, node));
    }
    
    @Test
    public void testOneNodeNoMatch(){
        assertEquals(null, IntersectionOfTwoLinkedLists.getIntersectionNode(new ListNode(3), new ListNode(3)));
    }
    
    @Test
    public void testJoinedListManyNodesEqualSize(){
        ListNode joinedList = new ListNode(4);
        joinedList.next = new ListNode(63);

        ListNode listA = new ListNode(4);
        listA.next = new ListNode(14);
        listA.next.next = joinedList;

        ListNode listB = new ListNode(18);
        listB.next = new ListNode(28);
        listB.next.next = joinedList;

        assertEquals(joinedList, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
    }
    
    @Test
    public void testSeparateListManyNodesEqualSize(){
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(14);
        listA.next.next = new ListNode(53);

        ListNode listB = new ListNode(18);
        listB.next = new ListNode(28);
        listB.next.next = new ListNode(84);

        assertEquals(null, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
    }
    
    @Test
    public void testJoinedListManyNodesHeadALonger(){
        ListNode joinedList = new ListNode(4);
        joinedList.next = new ListNode(63);

        ListNode listA = new ListNode(4);
        listA.next = new ListNode(14);
        listA.next.next = joinedList;

        ListNode listB = new ListNode(18);
        listB.next = joinedList;

        assertEquals(joinedList, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
    }

    @Test
    public void testSeparateListManyNodesHeadALonger(){
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(14);
        listA.next.next = new ListNode(15);
        listA.next.next.next = new ListNode(0);

        ListNode listB = new ListNode(18);
        listB.next = new ListNode(19);

        assertEquals(null, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
    }

    @Test
    public void testJoinedListManyNodesHeadBLonger(){
        ListNode joinedList = new ListNode(4);
        joinedList.next = new ListNode(63);

        ListNode listB = new ListNode(4);
        listB.next = new ListNode(14);
        listB.next.next = joinedList;

        ListNode listA = new ListNode(18);
        listA.next = joinedList;

        assertEquals(joinedList, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
    }

    @Test
    public void testSeparateListManyNodesHeadBLonger(){
        ListNode listB = new ListNode(4);
        listB.next = new ListNode(14);
        listB.next.next = new ListNode(15);
        listB.next.next.next = new ListNode(0);

        ListNode listA = new ListNode(18);
        listA.next = new ListNode(19);

        assertEquals(null, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
    }
}