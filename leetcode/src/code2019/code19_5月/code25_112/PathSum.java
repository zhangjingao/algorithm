package code2019.code19_5月.code25_112;

/**
 * @author zjg
 * <p> 2019/5/25 21:08 </p>
 */
public class PathSum {

    private static boolean boo;

    public boolean hasPathSum(TreeNode root, int sum) {
        boo = false;
        work(root, sum, 0);
        return boo;
    }

    private void work(TreeNode root, int sum, int pathSum) {
        if (boo || root == null) {
            return;
        }
        pathSum += root.val;
        if (root.left == null && root.right == null) {
            boo = pathSum == sum;
        } else {
            if (root.left != null) {
                work(root.left, sum, pathSum);
            }
            if (root.right != null) {
                work(root.right, sum, pathSum);
            }
        }
    }

}
class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}