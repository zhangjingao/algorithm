package code2019.code19_5月.code21_95;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/21 17:06 </p>
 */
public class UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        return work(1, n);
    }

    private List<TreeNode> work(int start, int end) {
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        if (start > end) {
            arrayList.add(null);
            return arrayList;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTree = work(start, i - 1);
            List<TreeNode> rightTree = work(i + 1, end);
            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode t = new TreeNode(i);
                    t.left = left;
                    t.right = right;
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new UniqueBinarySearchTreesII().generateTrees(3).toArray()
                )
        );
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