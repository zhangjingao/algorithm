package 随笔.面试.笔试.笔试360;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/7 19:40 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        Arrays.sort(arr);
        if (n == m) {
            System.out.println(arr[n-1]);
        } else if (n == m * 2) {
            System.out.println(arr[n-1] + arr[0]);
        } else {
            int single = n - m;
            int max = arr[0] + arr[2 * single - 1];
            for (int i = 0; i < single; i++) {
                if (max < arr[i] + arr[2 * single - 1 - i]) {
                    max = arr[i] + arr[2 * single - 1 - i];
                }
            }
            System.out.println(max);
        }

    }

}
