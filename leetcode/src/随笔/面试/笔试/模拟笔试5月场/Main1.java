package 随笔.面试.笔试.模拟笔试5月场;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/15 19:28 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[] arr = new int[13];
        for (int i = 0; i < 13; i++) {
            arr[i] = 4;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            int temp = sca.nextInt();
            sum1 += temp;
            arr[temp - 1]--;

        }
        for (int i = 0; i < 3; i++) {
            int temp = sca.nextInt();
            sum2 += temp;
            arr[temp - 1]--;
        }
        int between = Math.abs(sum1 - sum2);
        if (sum1 >= sum2) {
            int fenzZi = 0;
            for (int i = 0; i < 13; i++) {
                for (int j = i + between + 1; j < 13; j++) {

                }
            }

        }
    }

}
