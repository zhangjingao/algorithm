package code2018.code18_8_23_94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/8/23 20:59 </p>
 */
public class BinaryTreeInorderTraversal_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        return getTree(root, integers);
    }

    private List<Integer> getTree (TreeNode treeNode, List<Integer> integers) {
        if (treeNode == null) {
            return integers;
        }
        if (treeNode.left == null) {
            integers.add(treeNode.val);
        } else {
            getTree(treeNode.left, integers);
            integers.add(treeNode.val);
        }
        if (treeNode.right != null) {
            getTree(treeNode.right, integers);
        }
        return integers;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}