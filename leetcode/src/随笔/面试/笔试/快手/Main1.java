package 随笔.面试.笔试.快手;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/30 19:45 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        List<int[]> arrs = new ArrayList<>();
        String temp = sca.next();
        String[] allTreeNode = temp.split(",");
        int len = allTreeNode.length;
        int index = 1;
        while (Math.pow(2, index) - 1 <= len) {
            int[] treeLen = new int[(int) Math.pow(2, index-1)];
            for (int i = 0; i < Math.pow(2, index-1); i++) {
                String tempStr = allTreeNode[(int) (Math.pow(2, index-1)-1)+ i];
                if ("None".equals(tempStr)) {
                    treeLen[i] = -1;
                } else {
                    treeLen[i] = Integer.parseInt(tempStr);
                }
            }
            arrs.add(treeLen);
            index++;
        }
        /*arrs.forEach(a->{
            System.out.println(Arrays.toString(a));
                }
        );*/
        judge(arrs, 1);
    }

    private static void judge(List<int[]> arrs, int row) {
        if (row >= arrs.size()) {
            System.out.println("True");
        } else {
            int[] arr = arrs.get(row);
            int len = (int)Math.pow(2, row);
            for (int i = 0; i < len; i+=2) {
                int leftTemp = arr[i];
                int rightTemp = arr[i+1];
                int fatherTemp = arrs.get(row-1)[i/2];
                if (leftTemp >= fatherTemp || rightTemp <= fatherTemp) {
                    System.out.println("False");
                    return;
                }
            }
            judge(arrs, row+1);

        }

    }

}
