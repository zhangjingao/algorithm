package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/29 21:14
 * @Description
 */
public class 递归求二进制表示位数 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int a;//二进制当前位的数
        int t = 0;
        while (n != 0) {
            a = n % 2;
            n /= 2;
            t++;
        }
        System.out.println(t);
    }
}
