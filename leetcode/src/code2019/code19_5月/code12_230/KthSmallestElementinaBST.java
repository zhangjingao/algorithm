package code2019.code19_5月.code12_230;

/**
 * @author zjg
 * <p> 2019/5/12 17:34 </p>
 */
public class KthSmallestElementinaBST {

    int index = 0;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        leftCenterRight(root, k);
        return result;
    }

    private void leftCenterRight(TreeNode root, int k) {
        if (root.left != null || root.right != null) {
            if (root.left != null) {
                leftCenterRight(root.left, k);
            }
            index++;
            if (index == k) {
                result = root.val;
            } else if (root.right != null) {
                leftCenterRight(root.right, k);
            }
        } else {
            index++;
            if (index == k) {
                result = root.val;
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
