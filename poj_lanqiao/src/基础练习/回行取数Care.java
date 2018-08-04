package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/25 14:48
 * @Description
 */
public class 回行取数Care {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int [][]array = new int[m][n];
        for (int i = 0 ;i < m;i++) {
            for (int j = 0;j < n;j++) {
                array[i][j] = sca.nextInt();
            }
        }
        int sum = m*n;
        int row = -1,col = 0,count = 0;
        while (count < sum) {
            while (row+1 < m && array[row+1][col] != -1) {
                System.out.print(array[++row][col]+" ");
                array[row][col] = -1;
                count++;
            }
            while (col+1 < n && array[row][col+1] != -1) {
                System.out.print(array[row][++col]+" ");
                array[row][col] = -1;
                count++;
            }
            while (row-1 >= 0 && array[row-1][col] != -1) {
                System.out.print(array[--row][col]+" ");
                array[row][col] = -1;
                count++;
            }
            while (col-1 > 0 && array[row][col-1] != -1) {
                System.out.print(array[row][--col]+" ");
                array[row][col] = -1;
                count++;
            }
            m--;
            n--;
        }
    }
}
