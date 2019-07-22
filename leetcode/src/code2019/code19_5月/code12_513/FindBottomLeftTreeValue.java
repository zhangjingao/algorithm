package code2019.code19_5月.code12_513;

/**
 * @author zjg
 * <p> 2019/5/12 16:42 </p>
 */
public class FindBottomLeftTreeValue {

    //最终结果
    int result = 0;
    //结果值的深度
    int step = 0;


    public int findBottomLeftValue(TreeNode root) {
        //当前深度
        int nowStep = 1;
        beforeWork(root, nowStep);
        return result;
    }

    private void beforeWork(TreeNode root, int nowStep) {
        if (root.left == null && root.right == null && nowStep > step) {
            result = root.val;
            step = nowStep;
        } else {
            if (root.left != null) {
                beforeWork(root.left, nowStep + 1);
            }
            if (root.right != null) {
                beforeWork(root.right, nowStep + 1);
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