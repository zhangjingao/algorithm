package code2019.code19_7.code23_105;

/**
 * @author zjg
 * @ClassName ConstructBinaryTreefromPreorderandInorderTraversal
 * @Description TODO
 * @Date 2019/7/23 20:11
 **/
public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[0]);
        creatTree(0, preorder.length - 1, preorder.length - 1,  preorder, inorder, treeNode);
        return treeNode;
    }

    private void creatTree(int preLeft, int inOrderIndex, int right, int[] preorder, int[] inorder, TreeNode treeNode) {
        for (int i = preLeft; i <= inOrderIndex; i++) {
            if (inorder[i] == preorder[preLeft]) {
                if ( i != preLeft) {
                    TreeNode leftTree = new TreeNode(preorder[preLeft + 1]);
                    treeNode.left = leftTree;
                    creatTree(preLeft, inOrderIndex - 1, right, preorder, inorder, leftTree);
                }
                if (i + 1 < preorder.length) {
                    TreeNode rightTree = new TreeNode(preorder[i + 1]);
                    treeNode.right = rightTree;
                    creatTree(inOrderIndex + 1, right, right, preorder, inorder, rightTree);
                }
                break;
            }
        }

    }


    public static void main(String[] args) {
//        int[] preOrder = {3, 9, 20, 15, 7};
//        int[] inOrder = {9, 3, 15, 20, 7};
        int[] preOrder = {1,2,3};
        int[] inOrder = {3,2,1};

        TreeNode treeNode = new ConstructBinaryTreefromPreorderandInorderTraversal()
                .buildTree(preOrder, inOrder);
        printfTree(treeNode);
    }

    private static void printfTree(TreeNode treeNode) {
        System.out.print(treeNode.val+" ");
        if (treeNode.left != null) {
            printfTree(treeNode.left);
        } else {
            System.out.print("null");
        }
        if (treeNode.right != null) {
            printfTree(treeNode.right);
        } else {
            System.out.print("null");
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