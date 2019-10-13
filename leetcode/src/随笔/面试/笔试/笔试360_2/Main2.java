package 随笔.面试.笔试.笔试360_2;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/26 20:11
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        if (m == 0) {
            System.out.println(0);
            return;
        }
        int max = 0;
        for (int i = 0; i < m; i++) {
            max += arr[i];
        }
        int temp = max;
        for (int i = 1; i <= n - m; i++) {
            temp = temp - arr[i - 1] + arr[i + m - 1];
            if (temp > max) {
                max = temp;
            }
        }
        double maxDouble = max;
        System.out.printf("%.3f",maxDouble / m);
    }


}
