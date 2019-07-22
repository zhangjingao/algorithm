package code2019.code19_5月.code25_113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/25 21:22 </p>
 */
public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root != null) {
            ArrayList<Integer> temp = new ArrayList<>();
            work(result, root, sum, 0, 0, temp);
        }
        return result;
    }

    private void work(LinkedList<List<Integer>> result, TreeNode root, int sum, int pathSum, int index, ArrayList<Integer> temp) {
        pathSum += root.val;
        if (temp.size() > index) {
            temp.set(index, root.val);
        } else {
            temp.add(root.val);
        }
        if (root.left == null && root.right == null) {
            if (pathSum == sum) {
                result.add(((List<Integer>) temp.clone()).subList(0, index + 1));
            }
        } else {
            if (root.left != null) {
                work(result, root.left, sum, pathSum, index + 1, temp);
            }
            if (root.right != null) {
                work(result, root.right, sum, pathSum, index + 1, temp);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.left = t9;
        t6.right = t10;
        new PathSumII().pathSum(t1, 22).forEach(w->{
            w.forEach(System.out::print);
            System.out.println();
        });

    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }