package BinaryTreePostorderTraversal145;

import ClassImplementations.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public static List<Integer> postorderTraversalRecursive(TreeNode root){
        ArrayList<Integer> list = new ArrayList();
        helper(root, list);
        return list;
    }

    private static void helper(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }

        helper(node.left, list);
        helper(node.right, list);
        list.add(node.val);
    }

    public static List<Integer> postorderTraversalIterative(TreeNode root){
        ArrayList<Integer> list = new ArrayList();
        Stack<TreeNode> nodes = new Stack();

        if(root == null){
            return list;
        }

        nodes.add(root);
        while(!nodes.isEmpty()){
            TreeNode node = nodes.pop();
            list.add(node.val);

            if(node.left != null){
                nodes.add(node.left);
            }

            if(node.right != null){
                nodes.add(node.right);
            }
        }

        Collections.reverse(list);
        return list;
    }

    public static List<Integer> postorderMorrisTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList();
        //this node will be the parent node of the current Node's left subtree
        TreeNode preNode = null;

        while(root != null){
            list.add(root.val);

            if(root.right == null){
                root.right = root.left;
            }else{
                preNode = root.right;
                while(preNode.left != null){
                    preNode = preNode.left;
                }

                preNode.left = root.left;
            }
            root = root.right;
        }

        Collections.reverse(list);
        return list;
    }
}
/**
 * This problem was interesting because I had to use the same reverse logic I discovered last night in order to answer
 * the stack solution for postorder traversal. The one thing I need to worry about is not trying to change up a solution
 * without thinking if I already know a correct, working solution. This led to me floundering with a new Morris
 * traversal algo that didn't require moving a tree from the left side to the right if the right side was null. This is
 * slightly slower, but much more readable in my opinion, though that may be a question to work out with the
 * intereviewer. If you want to try and optimize the algorithm, you MUST think through the consequences of minor changes
 * (or have unit tests). In addition, PLEASE remember Collections.reverse. SO helpful.
 */