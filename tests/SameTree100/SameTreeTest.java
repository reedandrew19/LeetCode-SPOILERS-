package SameTree100;

import ClassImplementations.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @Test
    public void testEmptyTreesRecursive(){
        assertTrue(SameTree.isSameTreeRecursive(null, null));
    }

    @Test
    public void testOneEmptyOneNonEmptyTreeRecursive(){
        assertFalse(SameTree.isSameTreeRecursive(null, new TreeNode(0)));
        assertFalse(SameTree.isSameTreeRecursive(new TreeNode(0), null));
    }

    @Test
    public void testLeafUnequalRecursive(){
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(54);
        tree1.right = new TreeNode(-34);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(64);
        tree2.right = new TreeNode(-34);

        assertFalse(SameTree.isSameTreeRecursive(tree1, tree2));
        assertFalse(SameTree.isSameTreeRecursive(tree2, tree1));
    }

    @Test
    public void testOneLeafNullRecursive(){
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(54);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(64);
        tree2.right = new TreeNode(-34);

        assertFalse(SameTree.isSameTreeRecursive(tree1, tree2));
        assertFalse(SameTree.isSameTreeRecursive(tree2, tree1));
    }

    @Test
    public void testEqualTreesRecursive(){
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(64);
        tree1.right = new TreeNode(-34);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(64);
        tree2.right = new TreeNode(-34);

        assertTrue(SameTree.isSameTreeRecursive(tree1, tree2));
        assertTrue(SameTree.isSameTreeRecursive(tree2, tree1));
    }

    @Test
    public void testEmptyTreesIterative(){
        assertTrue(SameTree.isSameTreeIterative(null, null));
    }

    @Test
    public void testOneEmptyOneNonEmptyTreeIterative(){
        assertFalse(SameTree.isSameTreeIterative(null, new TreeNode(0)));
        assertFalse(SameTree.isSameTreeIterative(new TreeNode(0), null));
    }

    @Test
    public void testLeafUnequalIterative(){
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(54);
        tree1.right = new TreeNode(-34);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(64);
        tree2.right = new TreeNode(-34);

        assertFalse(SameTree.isSameTreeIterative(tree1, tree2));
        assertFalse(SameTree.isSameTreeIterative(tree2, tree1));
    }

    @Test
    public void testOneLeafNullIterative(){
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(54);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(64);
        tree2.right = new TreeNode(-34);

        assertFalse(SameTree.isSameTreeIterative(tree1, tree2));
        assertFalse(SameTree.isSameTreeIterative(tree2, tree1));
    }

    @Test
    public void testEqualTreesIterative(){
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(64);
        tree1.right = new TreeNode(-34);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(64);
        tree2.right = new TreeNode(-34);

        assertTrue(SameTree.isSameTreeIterative(tree1, tree2));
        assertTrue(SameTree.isSameTreeIterative(tree2, tree1));
    }
}