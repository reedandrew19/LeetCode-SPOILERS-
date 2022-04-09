package SymmetricTree101;

import ClassImplementations.TreeNode;

import java.util.Stack;

public class SymmetricTree {
    public static boolean isSymmetricRecursive(TreeNode root){
        return helper(root.left, root.right);
    }

    private static boolean helper(TreeNode left, TreeNode right){
        if((left == null && right != null) || left != null && right == null){
            return false;
        }else if(left == null && right == null){
            return true;
        }else if(left.val == right.val){
            return helper(left.left, right.right) && helper(left.right, right.left);
        }else{
            return false;
        }
    }

    public static boolean isSymmetricIterative(TreeNode root){
        Stack<TreeNode> nodes = new Stack();

        nodes.add(root.right);
        nodes.add(root.left);
        while(!nodes.isEmpty()){
            TreeNode left = nodes.pop();
            TreeNode right = nodes.pop();

            if((left == null && right != null) || (left != null && right == null)){
                return false;
            }else if(left == null && right == null){ //don't add nodes or you will cause an NPE
                continue;
            }else if(left.val == right.val){
                nodes.add(left.left);
                nodes.add(right.right);
                nodes.add(left.right);
                nodes.add(right.left);
            }else{ // if left.val != right.val
                return false;
            }
        }

        return true;
    }
}
/**
 * First try successes. I think it's time to move on to a new topic. Probably graphs, maybe dynamic programming
 */
