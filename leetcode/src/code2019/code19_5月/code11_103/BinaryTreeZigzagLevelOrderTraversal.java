package code2019.code19_5月.code11_103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/11 16:54 </p>
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    //3ms
/*
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        //存放遍历的结点
        List<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        //false代表从左向右，true代表从右向左
        work(result, treeNodes, false);
        return result;
    }

    private void work(List<List<Integer>> result, List<TreeNode> treeNodes, boolean leftOrRight) {
        if (treeNodes.size() == 0) {
            return;
        }
        LinkedList<Integer> list = new LinkedList<>();
        List<TreeNode> newTreeNodes = new LinkedList<>();
        for (TreeNode root : treeNodes) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (left != null) {
                newTreeNodes.add(left);
            }
            if (right != null) {
                newTreeNodes.add(right);
            }
            if (!leftOrRight) {
                list.add(root.val);
            } else {
                list.addFirst(root.val);
            }
        }
        result.add(list);
        work(result, newTreeNodes, !leftOrRight);

    }
*/

    // 0ms
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root, result, 0);
        return result;
    }

    public void traverse(TreeNode root, List<List<Integer>> result, int level) {
        if (root != null) {
            LinkedList<Integer> list;
            if (result.size() <= level) {
                list = new LinkedList<Integer>();
                result.add(list);
            } else {
                list = (LinkedList<Integer>) result.get(level);
            }

            if (level % 2 == 0) {
                list.addLast(root.val);
            } else {
                list.addFirst(root.val);
            }
            traverse(root.left, result, level + 1);
            traverse(root.right, result, level + 1);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}