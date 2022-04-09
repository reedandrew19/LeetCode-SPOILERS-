package SymmetricTree101;

import ClassImplementations.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @Test
    public void testUnequalNodesRecursive(){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(15);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(64);
        tree.right.right = new TreeNode (64);
        tree.left.right = new TreeNode(13);
        tree.right.left = new TreeNode(84);

        assertFalse(SymmetricTree.isSymmetricRecursive(tree));
    }

    @Test
    public void testUnequalLengthTreesRecursive(){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(15);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(64);
        tree.right.right = new TreeNode (64);
        tree.left.right = new TreeNode(13);

        assertFalse(SymmetricTree.isSymmetricRecursive(tree));
    }

    @Test
    public void testSymmetricRecursive(){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(15);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(64);
        tree.right.right = new TreeNode (64);
        tree.left.right = new TreeNode(13);
        tree.right.left = new TreeNode(13);

        assertTrue(SymmetricTree.isSymmetricRecursive(tree));
    }

    @Test
    public void testUnequalNodesIterative(){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(15);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(64);
        tree.right.right = new TreeNode (64);
        tree.left.right = new TreeNode(13);
        tree.right.left = new TreeNode(84);
        
        assertFalse(SymmetricTree.isSymmetricIterative(tree));
    }
    
    @Test
    public void testUnequalLengthTreesIterative(){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(15);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(64);
        tree.right.right = new TreeNode (64);
        tree.left.right = new TreeNode(13);

        assertFalse(SymmetricTree.isSymmetricIterative(tree));
    }
    
    @Test
    public void testSymmetricIterative(){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(15);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(64);
        tree.right.right = new TreeNode (64);
        tree.left.right = new TreeNode(13);
        tree.right.left = new TreeNode(13);

        assertTrue(SymmetricTree.isSymmetricIterative(tree));
    }
}