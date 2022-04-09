package SameTree100;

import ClassImplementations.TreeNode;

import java.util.Stack;

public class SameTree {
    public static boolean isSameTreeRecursive(TreeNode p, TreeNode q){
        return helper(p, q);
    }

    private static boolean helper(TreeNode node1, TreeNode node2){
        if((node1 == null && node2 != null) ||
                (node1 != null && node2 == null)){
            return false;
        }else if(node1 == null && node2 == null){
            return true;
        }else if((node1.val != node2.val)){
            return false;
        }

        return helper(node1.left, node2.left) && helper(node1.right, node2.right);
    }

    public static boolean isSameTreeIterative(TreeNode p, TreeNode q){
        Stack<TreeNode> nodes = new Stack();

        nodes.add(p);
        nodes.add(q);

        while(!nodes.isEmpty()){
            TreeNode node1 = nodes.pop();
            TreeNode node2 = nodes.pop();

            if((node1 == null && node2 != null) ||
                    (node1 != null && node2 == null)){
                return false;
            }else if(node1 == null && node2 == null){
                continue;
            }else if(node1.val == node2.val){
                nodes.add(node1.right);
                nodes.add(node2.right);
                nodes.add(node1.left);
                nodes.add(node2.left);
            }else{
                return false;
            }
        }

        return true;
    }
}
/**
 * The iterative solution for this problem took a bit of time. I eventually was able to figure it out, but I needed to
 * learn the "continue" keyword which I NEVER use in my day to day life, but is good to know for problems like these.
 *
 * Recursive solutions are definitely easier to create, but it's nice to know how to solve these iteratively because I
 * get to learn stacks.
 */