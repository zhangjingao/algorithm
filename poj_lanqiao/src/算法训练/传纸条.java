package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/22 15:39 </p>
 */
public class 传纸条 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int[][] arr = new int[52][52];
        int[][][][] re = new int[52][52][52][52];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sca.nextInt();
            }
        }
        int x1, y1, x2, y2;
        for (x1 = 1; x1 <= m; x1++) {
            for (y1 = 1; y1 <= n; y1++) {
                for (x2 = 1; x2 <= m; x2++) {
                    if (x1 + y1 - x2 > 0) {
                        y2 = x1 + y1 - x2;
                    } else continue;
                    re[x1][y1][x2][y2] = Math.max(Math.max(re[x1-1][y1][x2-1][y2],re[x1][y1-1][x2-1][y2]),
                            Math.max(re[x1][y1-1][x2][y2-1],re[x1-1][y1][x2][y2-1]))
                            + arr[x1][y1] + arr[x2][y2];
                    if (x1 == x2 && y1 == y2) {
                        re[x1][y1][x2][y2] -= arr[x1][y1];
                    }
                }
            }
        }
//        printf("%d", re[m][n][m][n]);
        System.out.println(re[m][n][m][n]);

    }

}
