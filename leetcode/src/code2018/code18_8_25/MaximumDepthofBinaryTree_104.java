package code2018.code18_8_25;

/**
 * @author zjg
 * <p> 2018/8/25 15:53 </p>
 */
public class MaximumDepthofBinaryTree_104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return num(root, 1,0);
    }

    private int num (TreeNode treeNode, int depth, int max) {
        if (treeNode.left == null && treeNode.right == null) {
            return depth > max ? depth : max;
        }
        if (treeNode.left != null) {
            max = num(treeNode.left, depth+1, max);
        }
        if (treeNode.right != null) {
            max = num(treeNode.right, depth+1, max);
        }
        return max;
    }

}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}