package 随笔.面试.笔试.模拟笔试5月场;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/15 19:28 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] starts = new int[n][2];
        for (int i = 0; i < n; i++) {
            starts[i][0] = sca.nextInt();
            starts[i][1] = sca.nextInt();
        }
        int m = sca.nextInt();
        for (int i = 0; i < m; i++) {
            int ax = sca.nextInt();
            int ay = sca.nextInt();
            int bx = sca.nextInt();
            int by = sca.nextInt();
            work(ax, ay, bx, by, starts);
        }
    }

    private static void work(int ax, int ay, int bx, int by, int[][] starts) {
        int maxx = ax >= bx ? ax : bx;
        int minx = ax < bx ? ax : bx;
        int maxy = ay >= by ? ay : by;
        int miny = ay < by ? ay : by;
        int count = 0;
        for (int j = 0; j < starts.length; j++) {
            if (starts[j][0] >= minx && starts[j][0] <= maxx &&
                    starts[j][1] >= miny && starts[j][1] <= maxy) {
                count++;
            }
        }
        System.out.println(count);
    }

}
