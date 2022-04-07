package BinaryTreeInorderTraversal94;

import ClassImplementations.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList list = new ArrayList();

        if (root == null) {
            return list;
        }

        inorderTraversal(list, root);

        return list;

    }

    private static void inorderTraversal(List<Integer> list, TreeNode node) {
        if (node.left != null) {
            inorderTraversal(list, node.left);
        }

        list.add(node.val);

        if (node.right != null) {
            inorderTraversal(list, node.right);
        }
    }

    public static List<Integer> inorderTraversalCleaner(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        helper(list, root);
        return list;
    }

    private static void helper(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        helper(list, node.left);
        list.add(node.val);
        helper(list, node.right);
    }

    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        Stack<TreeNode> nodes = new Stack();

        while (root != null || !nodes.isEmpty()) {
            while (root != null) {
                nodes.push(root);
                root = root.left;
            }
            root = nodes.pop();
            list.add(root.val);
            root = root.right;
        }

        return list;
    }

    public static List<Integer> inorderTraversalIterativeBest(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        TreeNode preRoot = null;

        while (root != null) {
            if (root.left == null) {
                list.add(root.val);
                root = root.right;
            }else{
                preRoot = root.left;
                while(preRoot.right != null){
                    preRoot = preRoot.right;
                }
                TreeNode temp = root;
                preRoot.right = root;
                root = root.left;
                temp.left = null;
            }
        }

        return list;
    }
}
/**
 * I was able to get the general idea first try, but I didn't find the cleaner way to code. I'll code the iterative way
 * tomorrow.
 *
 * After refamiliarizing myself with stacks and trees, I found the stack solution didn't take much time to figure out.
 * The Morris Traversal, however, was VERY interesting and tricky. Even reading it out, I couldn't understand how it
 * worked until I wrote a very large example on my white board. This also makes me wonder how difficult it would be to
 * implement pre and post order traversal with constant space complexity.
 *
 * There are a few things that seem to be giving me difficulty when it comes to node based data structures:
 *
 *
 * 1) I have difficulty conceptualizing the algorithms for these problems because I think of them in terms of a whole
 * data structure that will exist and need to maintain its order after the function is complete. THIS IS NOT TRUE
 * HOWEVER. For Example, in both this Morris Traversal solution and finding if a linked list is a palindrome or not with
 * constant space, I got hung up on the question "How do I make sure the first half of the linked list is still
 * correctly attached to the second part of the linked list after I reverse the linked list in place?" or "how do I
 * reconnect the head of the new tree I've created to the previous leaves of the whole tree?" However, because we will
 * never need that information again, you don't NEED to have a fully formed data structure. You have all the tools
 * necessary to complete the problem while chopping up your data, leaving behind what you don't need but maintaining the
 * order of only the data you still DO need. This is a concept that is very hard for me to wrap my head around as
 * someone who mainly uses concrete data structures in day to day use, not smaller, singular node-like objects that link
 * together to form my own implementations. In the future, especially on leetcode, I'll be wary of this idea to leave
 * behind unnecessary information that may overly complicate a solution.
 *
 * 2) Dealing with test cases are becoming more difficult and tedious to implement solely on a computer. Because I've
 * been through a Google phone interview before, I've been practicing for interviews as if I were needed to program on a
 * google doc. All of my test examples have been typed out in such a fashion:
 * 1 2 3 4 5    for a linked list
 *     1
 *    3  3      for a tree
 *  4 5  7 6
 *
 * These examples are becoming more tedious to write out when coming up with my initial algorithm as the datastructures
 * become harder to visualize on one line or in only one step. Because of this I'm losing a bit of steam. Should I
 * practice on my whiteboard more in order to understand the algorithms better, hoping it becomes second nature by the
 * time I reach phone interviews? Or should I continue to do practice problems on the computer to simulate a real phone
 * interview setting in order to grow accustomed to that system?
 *
 * Similarly, the test cases are becoming more tedious to write out. With trees, it at least doubles the amount of
 * test cases I need to worry about compared to linked lists, and those were already annoying enough when some test
 * cases required writing code like this:
 *
 *         ListNode list = new ListNode(1);
 *         list.next = new ListNode(2);
 *         list.next.next = new ListNode(3);
 *         list.next.next.next = new ListNode(4);
 *         list.next.next.next.next = new ListNode(5);
 *         list.next.next.next.next.next = new ListNode(6);
 *
 *         assertEquals(4, MiddleOfTheLinkedList.middleNode(list).val);
 *
 * It's becoming more mechanical work than mental work to test my code. I may instead choose to just jot down test cases
 * like a to-do list and walk through them mentally like I would have to in a real interview. This could help me both
 * with practice as well as with boredom.
 */