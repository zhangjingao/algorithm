package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/24 9:24
 * @Description
 */
public class 皇后问题2nUN {

    static int n,row = 0,col=0,count = 0;
    static boolean aBoolean;
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        n = sca.nextInt();
        int [][] array = new int[n][n];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                array[i][j] = sca.nextInt();
            }
        }
        System.out.println(s(array));
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int s (int [][] array) {
        if (row == n-1&&col == n-1) {
            row = 0;
            col = 0;
            return ++count;
        }
        if (col == n) {
            row++;
            col = 0;
        }
        if (array[row][col] == 1) {
            aBoolean = sort(array);
            if (aBoolean) {
                array[row][col] = 2;//作为可以存放皇后的位置
                row++;
                col = 0;
            } else {
                if (col == n-1) {
                    row = 0;
                    col = 0;
                } else {
                    col++;
                }
            }
        } else {
            col++;
        }
        return s(array);
    }

    public static boolean sort(int [][] array) {
        boolean boo = true;
        if (row == 0) {
            boo = true;
        } else {
            for (int i = row-1;i >= 0;i--) {
                for (int j = 0;j < n;j++) {
                    if (array[i][j] == 2) {
                        if (i==row||j==col||(row-i==col-j)||(row==j&&col==i)) {//||(row==j&&col==i)
                            boo = false;
                        }
                    }
                }
            }
        }
        return boo;
    }
}
