package sword_finger_offer;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName 斐波那契数列
 * @Description TODO
 * @Date 2019/8/8 11:54
 **/
public class 斐波那契数列 {


    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        forwordToFor (n);
        int result = forwordToRecursive(n);
        System.out.println(result);
    }

    private static int forwordToRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return forwordToRecursive(n - 1) + forwordToRecursive(n - 2);
    }

    private static void forwordToFor(int n) {
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i <= n; i++) {
            int temp = f2;
            f2 = f1 + f2;
            f1 = temp;
        }
        System.out.println(f2);
    }




}
