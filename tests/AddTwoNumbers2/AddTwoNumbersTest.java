package AddTwoNumbers2;

import ClassImplementations.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Andrew on 5/24/2018.
 */
public class AddTwoNumbersTest {
    @Test
    public void TestBothOneDigit(){
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(6);

        assertEquals("(8)", AddTwoNumbers.addTwoNumbersCleaner(list1,
                list2).getListString());
    }

    @Test
    public void TestBothMultipleDigits(){
        ListNode list1 = new ListNode(4);
        list1.next = new ListNode(7);

        ListNode list2 = new ListNode(4);
        list2.next = new ListNode(2);

        assertEquals("(8,9)", AddTwoNumbers.addTwoNumbersCleaner(list1, list2)
                .getListString());
    }

    @Test
    public void TestOneListLonger(){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(9);

        ListNode list2 = new ListNode(3);

        assertEquals("(4,9)", AddTwoNumbers.addTwoNumbersCleaner(list1, list2)
                .getListString());
        assertEquals("(4,9)", AddTwoNumbers.addTwoNumbersCleaner(list2, list1)
                .getListString());
    }

    @Test
    public void TestBothOneDigitCarry(){
        ListNode list1 = new ListNode(9);
        ListNode list2 = new ListNode(9);

        assertEquals("(8,1)", AddTwoNumbers.addTwoNumbersCleaner(list1, list2)
                .getListString());
    }

    @Test
    public void TestCarryNoOverflow(){
        ListNode list1 = new ListNode(8);
        list1.next = new ListNode(4);

        ListNode list2 = new ListNode(7);
        list2.next = new ListNode(3);

        assertEquals("(5,8)", AddTwoNumbers.addTwoNumbersCleaner(list1, list2)
                .getListString());
    }

    @Test
    public void TestCarryOneListBigger(){
        ListNode list1 = new ListNode(8);
        list1.next = new ListNode(4);

        ListNode list2 = new ListNode(7);

        assertEquals("(5,5)", AddTwoNumbers.addTwoNumbersCleaner(list1, list2)
                .getListString());
        assertEquals("(5,5)", AddTwoNumbers.addTwoNumbersCleaner(list2, list1)
                .getListString());
    }

    @Test
    public void TestDoubleCarry(){
        ListNode list1 = new ListNode(9);
        list1.next = new ListNode(9);

        ListNode list2 = new ListNode(1);

        assertEquals("(0,0,1)", AddTwoNumbers.addTwoNumbersCleaner(list1, list2)
                .getListString());
    }
}