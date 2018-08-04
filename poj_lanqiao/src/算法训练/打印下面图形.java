package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/30 10:08
 * @Description
 */
public class 打印下面图形 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        for (int k = 1; k <= n; k++) {
            for (int i = n-k; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*k-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
