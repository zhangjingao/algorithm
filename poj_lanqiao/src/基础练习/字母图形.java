package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/23 10:46
 * @Description
 */
public class 字母图形 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int max=n;
        if (n<m) {
            max = m;
        }
        char[][] array = new char[max][max];
        for (int i=0;i<max;i++) {
            for (int k=i-1;k>=0;k--) {
                array[i][k] = (char) ('B'+(i-k-1));
            }
            for (int j=i;j<max;j++) {
                array[i][j] = (char) ('A'+j-i);
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
