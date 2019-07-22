package 随笔.面试.笔试.字节跳动2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/7/2 19:40 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextBigInteger();
        }
        Arrays.sort(arr);
        BigInteger people = arr[0];
        BigInteger num = new BigInteger(String.valueOf(0));
        for (int i = 0; i < n; i++) {
            num.add(arr[i].multiply(people));
//            num += arr[i] / people;
//            if (arr[i] % people != 0) {
//                num += 1;
//            }
        }
        System.out.println(num);
    }

}
