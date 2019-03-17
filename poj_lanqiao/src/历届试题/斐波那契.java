package 历届试题;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/11 9:38 </p>
 */
public class 斐波那契 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int p = sca.nextInt();
        sca.close();
        long f1 = 1, f2 = 1;
        int index = 3;
        long fm = 0, fn = 2;
        while (index <= n || index <= m) {
            long temp = f2;
            f2 = f1 + f2;
            f1 = temp;
            if (index == m) {
                fm = f2;
            }
            if (index <= n) {
                fn = fn + f2;
            }
            index++;
        }
        System.out.println(fn%fm%p);
    }

}
