package 入门训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date  2018/3/20 21:40
 * @Description fibonacci数列
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int in = sca.nextInt();
        int f1 = 1,f2 = 1,fn = 0;
        for (int i = 3;i<=in;i++) {
            fn = (f1+f2)%10007;
            f1 = f2;
            f2 = fn;
        }
        if (in < 3) {
            System.out.println(1);
        } else {
            System.out.println(fn%10007);
        }
    }
}
