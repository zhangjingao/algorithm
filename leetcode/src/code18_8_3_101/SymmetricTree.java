package code18_8_3_101;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/3 21:39
 * @Description
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        //存放中序遍历结果
        List<Integer> treeVals = new ArrayList<>();
        int layer = 1;//当前所在层数，默认第一层
        treeVals = changeArr(root,treeVals,layer);
        for (int i = 0; i < treeVals.size()/2; i++) {
            if (treeVals.get(i) != treeVals.get(treeVals.size()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> changeArr (TreeNode root, List<Integer> treeVals,int layer) {

        if (root.left == null && root.right == null ) {
            treeVals.add(root.val+layer);
        } else if (root.left == null) { //左子树为null，右子树不为空
            treeVals.add(-127);
            treeVals.add(root.val+layer);
            changeArr(root.right,treeVals,layer+1);
        } else if (root.right == null)  { //左子树不为null，右子树为null
            changeArr(root.left,treeVals,layer+1);
            treeVals.add(root.val+layer);
            treeVals.add(-127);
        } else {  //左子树，右子树都不为null
            changeArr(root.left,treeVals,layer+1);
            treeVals.add(root.val+layer);
            changeArr(root.right,treeVals,layer+1);
        }

        return treeVals;
    }


}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }