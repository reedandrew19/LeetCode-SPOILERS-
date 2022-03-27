package PalindromeLinkedList234;

import ClassImplementations.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    @Test
    public void testSingleNode(){
        assertTrue(PalindromeLinkedList.isPalindrome(new ListNode(2)));
    }

    @Test
    public void testTwoNodesPalindrome(){
        ListNode list = new ListNode(24);
        list.next = new ListNode(24);

        assertTrue(PalindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testTwoNodesNonPalindrome(){
        ListNode list = new ListNode(52);
        list.next = new ListNode(24);

        assertFalse(PalindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testThreeNodesPalindrome(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(1);

        assertTrue(PalindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testThreeNodesNonPalindrome(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(47);

        assertFalse(PalindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testOddLengthPalindrome(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(62);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(1);

        assertTrue(PalindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testOddLengthNonPalindrome(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(62);
        list.next.next.next = new ListNode(-7);
        list.next.next.next.next = new ListNode(1);

        assertFalse(PalindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testEvenLengthPalindrome(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(62);
        list.next.next.next = new ListNode(62);
        list.next.next.next.next = new ListNode(3);
        list.next.next.next.next.next = new ListNode(1);

        assertTrue(PalindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testEvenLengthNonPalindrome(){
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(62);
        list.next.next.next = new ListNode(63);
        list.next.next.next.next = new ListNode(3);
        list.next.next.next.next.next = new ListNode(1);

        assertFalse(PalindromeLinkedList.isPalindrome(list));
    }
}