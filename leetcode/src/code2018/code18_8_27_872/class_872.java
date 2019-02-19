package code2018.code18_8_27_872;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/8/27 19:22 </p>
 */
public class class_872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        List<Integer> root1Tree = new ArrayList<>();
        List<Integer> root2Tree = new ArrayList<>();

        root1Tree = getTree(root1, root1Tree);
        root2Tree = getTree(root2, root2Tree);
        if (root1Tree.size() != root2Tree.size()) {
            return false;
        }
        for (int i = 0; i < root1Tree.size(); i++) {
            if (root1Tree.get(i).intValue() != root2Tree.get(i).intValue()) {
                return false;
            }
        }

        return true;
    }

    private List<Integer> getTree (TreeNode treeNode, List<Integer> integers) {
        if (treeNode.left == null && treeNode.right == null) {
            integers.add(treeNode.val);
        }
        if (treeNode.left != null) {
            getTree(treeNode.left, integers);
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

    TreeNode(int x) {
        val = x;
    }
}