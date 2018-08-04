package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/28 21:52
 * @Description
 */
public class 最大最小公倍数Care {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        long n = sca.nextLong();
        getThree(n);
    }

    private static void getThree (long n) {
        if (n<3) {
            System.out.println(0);
        }
        if (n%2 == 1) {
            System.out.println(n*(n-1)*(n-2));
        } else if (n%3 == 0) {
            System.out.println((n-1)*(n-2)*(n-3));
        } else {
            System.out.println(n*(n-1)*(n-3));
        }
    }
}
