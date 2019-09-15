package 随笔.面试.笔试.同城58;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main3
 * @Description TODO
 * @Date 2019/9/12 21:15
 **/
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sca.nextInt();
            }
        }
        int[][] minDp = new int[m][n];
        work(arr, minDp, m, n);
        
    }

    private static void work(int[][] arr, int[][] minDp, int m, int n) {
        minDp[0][0] = arr[0][0];
        for (int i = 1; i < m; i++) {
            minDp[i][n - 1] = arr[i][n - 1] + minDp[i - 1][n - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            minDp[0][i] = arr[0][i] + minDp[0][i + 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = n - 2; j >= 0; j--) {
                minDp[i][j] = Math.min(minDp[i - 1][j], minDp[i][j + 1]) + arr[i][j];
            }
        }
        System.out.println(minDp[m - 1][0]);
    }

}
