package 随笔.面试.笔试.模拟笔试3月场;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/14 19:20 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int k = sca.nextInt();
        sca.close();
        walk(n, k, 1, 0, "");
    }

    private static void walk(int n, int k, int index, int sum, String path) {
        if (k == 0) {
            if (sum == n) {
                System.out.print(path);
                System.exit(0);
            }
        } else {
            walk(n, k-1,2 * index, sum + index, path + index + " +\n");
            walk(n, k-1,2 * index, sum - index, path + index + " -\n");
            walk(n, k-1,2 * index + 1, sum + index, path + index  + " +\n");
            walk(n, k-1,2 * index + 1, sum - index, path + index  + " -\n");
        }

    }


}
