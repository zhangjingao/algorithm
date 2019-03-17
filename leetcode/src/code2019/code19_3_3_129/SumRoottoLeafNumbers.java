package code2019.code19_3_3_129;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/3/3 15:50 </p>
 */
public class SumRoottoLeafNumbers {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<String> paths = new ArrayList<>();
        count(root, "", paths);
        int sum = 0;
        for (String s : paths) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    private void count (TreeNode root, String path, List<String> arr) {
        path += root.val;
        if (root.left == null && root.right == null) {
            arr.add(path);
            return;
        }
        if (root.left != null) {
            count(root.left, path, arr);
        }
        if (root.right != null) {
            count(root.right, path, arr);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println(
                new SumRoottoLeafNumbers().sumNumbers(treeNode1)
        );
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}