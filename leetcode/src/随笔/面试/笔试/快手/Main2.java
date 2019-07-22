package 随笔.面试.笔试.快手;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/30 20:47 </p>
 */
public class Main2 {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int k = sca.nextInt();
        int[][] arr = new int[m][n];
        work(arr, m, n, k);
        System.out.println(count);
    }

    private static void work(int[][] arr, int m, int n, int k) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                judge(arr, i, j, k);
            }

        }

    }

    private static void judge(int[][] arr, int i, int j, int k) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        while (j > 0) {
            sum += j % 10;
            j = j / 10;
        }
        if (sum <= k) {
            count++;
        }
    }

}
