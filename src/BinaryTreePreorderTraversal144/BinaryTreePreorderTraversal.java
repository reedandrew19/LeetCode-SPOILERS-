package BinaryTreePreorderTraversal144;

import ClassImplementations.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversalRecursive(TreeNode root){
        ArrayList<Integer> list = new ArrayList();

        helper(root, list);

        return list;
    }

    private static void helper(TreeNode node, ArrayList<Integer> list){
        if(node == null){
            return;
        }

        list.add(node.val);
        helper(node.left, list);
        helper(node.right, list);
    }

    public static List<Integer> preorderTraversalIterative(TreeNode root){
        ArrayList<Integer> list = new ArrayList();
        Stack<TreeNode> nodes = new Stack();

        while(root != null || !nodes.isEmpty()){
            while(root != null){
                list.add(root.val);
                nodes.add(root);
                root = root.left;
            }

            root = nodes.pop();
            root = root.right;
        }

        return list;
    }

    public static List<Integer> preorderTraversalIterativeFaster(TreeNode root){
        ArrayList<Integer> list = new ArrayList();
        Stack<TreeNode> nodes = new Stack();

        if(root == null){
            return list;
        }

        nodes.add(root);
        while(!nodes.isEmpty()){
            TreeNode node = nodes.pop();
            list.add(node.val);
            if(node.right != null){
                nodes.add(node.right);
            }
            if(node.left != null){
                nodes.add(node.left);

            }
        }

        return list;
    }

    public static List<Integer> preorderMorrisTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList();
        TreeNode preHead = null;

        while(root != null){
            list.add(root.val);

            if(root.left == null){
                root.left = root.right;
            }else{
                preHead = root.left;

                while(preHead.right != null){
                    preHead = preHead.right;
                }

                preHead.right = root.right;
            }

            root = root.left;
        }

        return list;
    }
}
/**
 * A few things I found interesting during today's problem:
 *
 * 1) I found the solution for the Morris traversal last night, but because I don't have my whiteboard with my notes in
 * front of my, I was working entirely by memory. I was too lazy to write out my solution by hand because I had already
 * found it, so I wound up making a few errors that I wouldn't have made if I had completed the problem when I found the
 * solution. Because of this, I've decided to write solutions for problems as soon as I work them out.
 *
 * 2) My iterative solution works in about 2N time instead of N time because I hadn't thought of how changing the order
 * of traversal would affect the stack algorithm. This has made me realize something: if I use another problem as a
 * springboard for a current problem, I should think about how we could possibly make the solution faster. Once a Node
 * is processed, we don't need it anymore, so try to find a way to toss out a node and never return to it again once you
 * have grabbed the data necessary from it.
 */