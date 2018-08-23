package code18_8_16_98;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/16 21:17
 * @Description
 */
public class ValidateBinarySearchTree_98 {


    public boolean isValidBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null) ) {
            return true;
        }
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs (TreeNode node, long low, long high) {
        if (node == null)
            return true;

        if (node.val > low && node.val < high) {
            return dfs(node.left,low,node.val) && dfs(node.right, node.val,high);
        } else
            return false;
    }

}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}