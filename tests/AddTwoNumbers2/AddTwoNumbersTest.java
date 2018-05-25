package AddTwoNumbers2;

import ClassImplementations.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew on 5/24/2018.
 */
public class AddTwoNumbersTest {
    @Test
    public void TestBothOneDigit(){
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(6);
        ListNode result = new ListNode(8);

        assertEquals(result.toString(), AddTwoNumbers.addTwoNumbers(list1,
                list2).toString());
    }
}