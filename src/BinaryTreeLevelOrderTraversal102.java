import ClassImplementations.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {
    private static List<List<Integer>> recursiveReturnList = new LinkedList<>();

    public static List<List<Integer>> levelOrder(TreeNode root){
        LinkedList<TreeNode> currList = new LinkedList();
        LinkedList<TreeNode> nextList = new LinkedList();
        List<List<Integer>> returnList = new LinkedList();

        if(root != null){
            currList.add(root);
        }

        while(!currList.isEmpty()){
            List valuesList = new LinkedList();
            for(TreeNode node : currList){
                if(node.left != null){
                    nextList.add(node.left);
                }

                if(node.right != null){
                    nextList.add(node.right);
                }
                valuesList.add(node.val);
            }

            returnList.add(valuesList);
            currList = nextList;
            nextList = new LinkedList();
        }

        return returnList;
    }

    public static List<List<Integer>> levelOrderRecursive(TreeNode root){
        helper(root, 0);
        return recursiveReturnList;
    }

    private static void helper(TreeNode node, int level){
        if(node == null){
            return;
        }

        if(recursiveReturnList.size() < level + 1){
            recursiveReturnList.add(new LinkedList());
        }

        recursiveReturnList.get(level).add(node.val);

        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }
}
