package 历届试题;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/5/24 21:19
 * @Description
 */
public class Main_斐波那契 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int p = sca.nextInt();
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        BigInteger fn = f2;
        BigInteger fm = f2;
        BigInteger sum = f1.add(f2);
            int max = n>m?n:m;
            int i = 2;
            while (++i <= max) {
                if (i <= n) {
                    fn = f1.add(f2);
                    sum = sum.add(fn);
                }
                if (i <= m) {
                    fm = f1.add(f2);
                }
                f1 = f2;
                f2 = fn.max(fm);
            }
            System.out.println(sum.mod(fm).mod(new BigInteger(String.valueOf(p))));
    }
}
