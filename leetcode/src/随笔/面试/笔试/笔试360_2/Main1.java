package 随笔.面试.笔试.笔试360_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/26 20:00
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arr = new int[n][2];
        int[] speed = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sca.nextInt();
            arr[i][1] = sca.nextInt();
            speed[i] = arr[i][0] * arr[i][1];
        }
        double length = 0;
        double speedNow = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (speed[j] > speed[max]) {
                    max = j;
                }
            }
            speed[max] = 0;
            length += speedNow * arr[max][1] + 0.5 * arr[max][0] * arr[max][1] * arr[max][1];
            speedNow = speedNow + arr[max][0] * arr[max][1];
        }
        System.out.printf("%.1f", length);
    }

}
