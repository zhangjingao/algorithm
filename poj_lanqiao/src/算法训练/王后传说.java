package 算法训练;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/23 21:22 </p>
 */
public class 王后传说 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int x = sca.nextInt();
        int y = sca.nextInt();
        sca.close();
        int[][] arr = new int[n][n];
        fillBoss(arr, x-1, y-1);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int result = 0;
        fillHou(arr, 0, result);
    }

    private static void fillHou(int[][] arr, int row, int result) {
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            if (arr[row][j] != 1) {
                int rowTemp = row;
                while (rowTemp > 0) {
                    for (int i = 0; i < len; i++) {
                        if (arr[rowTemp][i] == 2) {
                            if (j == i || Math.abs(rowTemp - row) == Math.abs(i - j)) {
                                return;
                            }
                        }
                    }
                }

            }
        }
    }



    private static void fillBoss(int[][] arr, int x, int y) {
        if (x < 1 && y < 1) {
            arr[0][0] = 1;
            arr[0][1] = 1;
            arr[1][1] = 1;
            arr[1][0] = 1;
        } else if (x < 1) {
            for (int i = x; i <= x + 1; i++) {
                for (int j = y-1; j <= y+1; j++) {
                    arr[i][j] = 1;
                }
            }
        } else if (y < 1) {
            for (int i = x-1; i <= x + 1; i++) {
                for (int j = y; j <= y+1; j++) {
                    arr[i][j] = 1;
                }
            }
        } else {
            for (int i = x-1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y+1; j++) {
                    arr[i][j] = 1;
                }
            }
        }
    }

}
