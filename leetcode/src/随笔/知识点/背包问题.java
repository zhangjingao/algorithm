package 随笔.知识点;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/19 8:52 </p>
 */
public class 背包问题 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int weight = sca.nextInt();
        int n = sca.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sca.nextInt();
            arr[i][1] = sca.nextInt();
        }
        int[][] c = new int[n+1][weight+1];
        for (int i = 0; i < n+1; i++) {
            c[i][0] = 0;
        }
        for (int i = 0; i < weight+1; i++) {
            c[0][i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < weight+1; j++) {
                if (arr[i-1][0] <= j) {
                    c[i][j] = Math.max(c[i-1][j], c[i-1][j-arr[i-1][0]]+arr[i-1][1]);
                } else {
                    c[i][j] = c[i-1][j];
                }
            }
        }
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < weight+1; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

}
