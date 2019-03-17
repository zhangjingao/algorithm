package 随笔.面试.笔试.模拟笔试;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/2/20 19:26 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        BigInteger x = sca.nextBigInteger();//租金
        BigInteger f = sca.nextBigInteger();//手中的苹果数
        BigInteger d = sca.nextBigInteger();//剩余d元钱
        BigInteger p = sca.nextBigInteger();//苹果的价钱
        // (d - f * x) / (p + x) + f
        System.out.println((d.subtract(f.multiply(x)).divide(p.add(x)).add(f)));
    }

}
