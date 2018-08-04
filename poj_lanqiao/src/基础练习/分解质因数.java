package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/27 8:54
 * @Description
 */
public class 分解质因数 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int temp = 0;
        boolean boo;
        for (int i = a;i <= b;i++) {
            boo = false;
            System.out.print(i+"=");
            temp = i;
            for (int j = 2; j <= i/2; j++) {
                if (temp%j == 0) {
                    temp /= j;
                    boo = true;
                    System.out.print(j);
                    j--;
                    if (temp != 1) {
                        System.out.print("*");
                    }
                }
            }
            if (!boo) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
