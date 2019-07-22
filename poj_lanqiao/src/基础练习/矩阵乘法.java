package 基础练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/19 16:57 </p>
 */
public class 矩阵乘法 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sca.nextInt();
            }
        }
        sca.close();
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print(1+" ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
        } else {
            int[][] arrTemp = new int[n][n];
            arrTemp = clone(arr, arrTemp, n);
            int[][] arrTemp2 = new int[n][n];
            while (m-- > 1) {
                arrTemp2 = clone(arr, arrTemp2, n);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int sum = 0;
                        for (int num = 0; num < n; num++) {
                            sum += arr[i][num] * arrTemp[num][j];
                        }
                        arrTemp2[i][j] = sum;
                    }
                }
                arr = clone(arrTemp2, arr, n);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    protected static int[][] clone (int[][] arr, int[][] temp, int n) {
        for (int i = 0; i < n; i++) {
            System.arraycopy(arr[i], 0, temp[i], 0, n);
        }
        return temp;
    }

}
