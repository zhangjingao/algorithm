package 随笔.面试.笔试.拼多多;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/6 19:02 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        long n = sca.nextLong();
        int k = sca.nextInt();
        long[] arr =  new long[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sca.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < k - 1; i++) {
            sum += arr[i] + arr[i+1] - n;
        }
        System.out.println(sum);
    }

}
