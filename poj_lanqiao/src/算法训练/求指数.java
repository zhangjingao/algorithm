package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/30 9:46
 * @Description
 */
public class 求指数 {

    static int result;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        for (int i = 1; i <= m; i++) {
            result = (int) Math.pow(n,i);
            outPut(result);
            if (i%5 == 0) {
                System.out.println();
            }
        }
    }

    private static void outPut (int result) {
        int length = (result+"").length();
        if (length < 12) {
            for (int i = 0; i < 12-length; i++) {
                System.out.print(" ");
            }
            System.out.print(result);
        }
    }
}
