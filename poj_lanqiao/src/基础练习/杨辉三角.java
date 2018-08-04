package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/22 17:56
 * @Description
 */
public class 杨辉三角 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [][] triangle = new int[n][n];
        triangle[0][0] = 1;
        for (int i = 1;i < n;i++) {
            triangle[i][0] = triangle[i][i] = 1;
        }
        for (int i=2;i<n;i++) {
            for (int j=1;j<=i-1;j++) {
                triangle[i][j] = triangle[i-1][j]+triangle[i-1][j-1];
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println(triangle[i][i]);
        }
    }
}
