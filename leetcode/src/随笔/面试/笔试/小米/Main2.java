package 随笔.面试.笔试.小米;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/6 19:39
 **/
public class Main2 {

    //前序遍历
    TreeNode pre = null;

    public String tree2str(TreeNode t) {
        if (t == null) return "";
        StringBuilder sb = new StringBuilder();
        helper(t, pre, sb);
        return sb.substring(1, sb.length() - 1);
    }

    private void helper(TreeNode root, TreeNode pre, StringBuilder sb) {
        if (root == null) return;
        //前序遍历
        //1.如果当前节点为父节点的右子树且左子树为空，括号不能省略
        if (pre != null && pre.left == null && pre.right == root) {
            sb.append("()");
        }
        sb.append("(").append(root.val);
        pre = root;
        helper(root.left, pre, sb);
        helper(root.right, pre, sb);
        //遍历完当前节点后关闭括号
        sb.append(")");
    }

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String solution(String input) {
        int index = 0;
        char[] tmp = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (tmp[i] == ',') {
                result.append(input.charAt(i));
                if (tmp[i-1] == '(') {
                    result.append(input.charAt(i - 1));
                }
            }
        }
        return null;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }

        res = solution(_input);
        System.out.println(res);
    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }