package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/27 15:01
 * @Description
 */
public class 芯片测试 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [][] array = new int[n][n];
        int [] count = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sca.nextInt();
                if (array[i][j] == 1) {
                    count[j]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (count[i] > (n/2)) {
                System.out.print(i+1+" ");
            }
        }
    }
}
