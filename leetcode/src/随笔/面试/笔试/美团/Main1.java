package 随笔.面试.笔试.美团;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        if (n >= 1 && m <= 100000) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            cal(matrix, n, m);
        }
    }

    public static void cal(int[][] matrix, int n, int m) {
        int count = 0;
        boolean[][] booleans = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                booleans[i][j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= 1) {
                    if (matrix[i][j] == matrix[i - 1][j] && booleans[i][j] == false && booleans[i - 1][j] == false) {
                        booleans[i - 1][j] = true;
                        booleans[i][j] = true;
                        count++;
                    }
                }
                if (i < n - 1) {
                    if (matrix[i][j] == matrix[i + 1][j] && booleans[i][j] == false && booleans[i + 1][j] == false) {
                        booleans[i + 1][j] = true;
                        booleans[i][j] = true;
                        count++;
                    }
                }
                if (j >= 1) {
                    if (matrix[i][j] == matrix[i][j - 1] && booleans[i][j] == false && booleans[i][j - 1] == false) {
                        booleans[i][j - 1] = true;
                        booleans[i][j] = true;
                        count++;
                    }
                }
                if (j < n - 1) {
                    if (matrix[i][j] == matrix[i][j + 1] && booleans[i][j] == false && booleans[i][j + 1] == false) {
                        booleans[i][j + 1] = true;
                        booleans[i][j] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}