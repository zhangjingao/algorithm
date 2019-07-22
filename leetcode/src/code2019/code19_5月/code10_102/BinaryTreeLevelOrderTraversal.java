package code2019.code19_5月.code10_102;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/10 11:33 </p>
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> nowRunNode = new LinkedList<>();
        nowRunNode.add(root);
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        //先将根放入结果集
        List<Integer> list = new ArrayList<>(1);
        list.add(root.val);
        result.add(list);

        work(nowRunNode, result);
        return result;
    }

    private void work(List<TreeNode> nowRunNode, List<List<Integer>> result) {
        if (nowRunNode.size() == 0) {
            return;
        }
        List<TreeNode> sunRunNode = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        while (nowRunNode.size() > 0) {
            TreeNode treeNodeLeft = nowRunNode.get(0).left;
            TreeNode treeNodeRight = nowRunNode.get(0).right;
            nowRunNode.remove(0);
            if (treeNodeLeft != null) {
                sunRunNode.add(treeNodeLeft);
                list.add(treeNodeLeft.val);
            }
            if (treeNodeRight != null) {
                list.add(treeNodeRight.val);
                sunRunNode.add(treeNodeRight);
            }
        }
        if (list.size() > 0) {
            result.add(list);
        }
        work(sunRunNode, result);
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