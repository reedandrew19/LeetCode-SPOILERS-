package MergeTwoSortedLists21;

import ClassImplementations.ListNode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                prev.next = list1;
                list1 = list1.next;
            }else{
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        prev.next = list1 == null ? list2 : list1;

        return prehead.next;
    }
}
/**
 * My first LinkedList problem in over 3 years was... pretty rough. Hopefully I can take the lessons from this problem
 * and the next one or two will be easier. In particular, I had issues with how to save an initial node head and return
 * it without the value being null. The solution of having a prehead and returning prehead.next seems overly complicated
 * but the rest of my code was relatively spot on. I also didn't notice that after the initial while loop, you can just
 * append the rest of whichever list is not null. Overall, I feel I did okay objectively, but it still feels like a bit
 * of a letdown.
 */