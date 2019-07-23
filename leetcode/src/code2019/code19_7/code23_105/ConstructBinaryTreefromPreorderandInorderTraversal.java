package code23_105;

/**
 * @author zjg
 * @ClassName ConstructBinaryTreefromPreorderandInorderTraversal
 * @Description TODO
 * @Date 2019/7/23 20:11
 **/
public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode treeNode = new TreeNode(preorder[0]);
        creatTree(0, preorder.length - 1,  preorder, inorder, treeNode);
        return treeNode;
    }

    private void creatTree(int left, int right, int[] preorder, int[] inorder, TreeNode treeNode) {
        int leftNode = preorder[left];
        for (int i = left + 1; i <= right; i++) {
            if (inorder[i] == leftNode) {
                TreeNode leftTree = null;
                treeNode.left = leftTree;
                creatTree(left + 1, i, preorder, inorder, leftTree);

                TreeNode rightTree = null;
                treeNode.right = rightTree;
                creatTree(i + 1, right, preorder, inorder, rightTree);
                break;
            }
        }

    }


    public static void main(String[] args) {
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};
        TreeNode treeNode = new ConstructBinaryTreefromPreorderandInorderTraversal()
                .buildTree(preOrder, inOrder);

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