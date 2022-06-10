import ClassImplementations.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversal102Test {

    @Test
    public void failingTest(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20),
                Arrays.asList(15, 7)), BinaryTreeLevelOrderTraversal102.levelOrder(root));
    }
}