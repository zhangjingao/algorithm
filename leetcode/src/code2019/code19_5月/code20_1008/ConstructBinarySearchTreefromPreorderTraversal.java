package code2019.code19_5月.code20_1008;

/**
 * @author zjg
 * <p> 2019/5/20 17:07 </p>
 */
public class ConstructBinarySearchTreefromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            work(root, preorder[i]);
        }
        return root;
    }

    private void work(TreeNode root, int value) {
        if (value > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                work(root.right, value);
            }
        } else {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                work(root.left, value);
            }
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