package code2019.code19_5月.code20_1038;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/20 20:11 </p>
 */
public class BinarySearchTreetoGreaterSumTree {

    private static int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        work(lists, root);
        lists.sort(null);
        //每个数以及对应的新数
        int[][] arr = new int[lists.size()][2];
        arr[0][0] = lists.get(0);
        arr[0][1] = sum;
        for (int i = 1; i < lists.size(); i++) {
            arr[i][0] = lists.get(i);
            arr[i][1] = arr[i - 1][1] - arr[i - 1][0];
        }
        resetValue(arr, root);
        sum = 0;
        return root;
    }

    private void resetValue(int[][] arr, TreeNode root) {
        if (root != null) {
            int value = root.val;
            for (int[] anArr : arr) {
                if (value == anArr[0]) {
                    root.val = anArr[1];
                    break;
                }
            }
            resetValue(arr, root.left);
            resetValue(arr, root.right);
        }

    }

    private void work(List<Integer> lists, TreeNode root) {
        if (root != null) {
            sum += root.val;
            lists.add(root.val);
            work(lists, root.left);
            work(lists, root.right);
        }

    }

}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
