package code2019.code19_5月.code12_671;

/**
 * @author zjg
 * <p> 2019/5/12 17:00 </p>
 */
public class SecondMinimumNodeInaBinaryTree {

    //最小的数
    int lastMin = 0;
    //第二小的数
    int newMin = 0;

    public int findSecondMinimumValue(TreeNode root) {
        lastMin = root.val;
        newMin = -1;
        work(root);
        return newMin;
    }

    private void work(TreeNode root) {
        //此节点大于newMin，代表子节点也大于
        if (root.val < newMin || newMin == -1) {
            if (root.val > lastMin) {
                newMin = root.val;
            } else if (root.val == lastMin) {
                if (root.left != null) {
                    work(root.left);
                    work(root.right);
                }
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