package 随笔.面试.笔试.字节跳动;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/14 10:01 </p>
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sca.nextInt();
            }
        }
        int min = 0;
        //走过的点，走过为1
        int[] after = new int[n];
        after[0] = 1;
        work(arr, min , after);

    }

    private static void work(int[][] arr, int min, int[] after) {
        int index = 0;
        int minNode = -1;
        while (++index < arr.length) {
            int shuidejiedian = 0;
            //找最小花销
            int minTemp = Integer.MAX_VALUE;
            minNode = -1;
            for (int i = 0; i < after.length; i++) {
                //找已走过的点的路径
                if (after[i] == 1) {
                    for (int j = 0; j < arr.length; j++) {
                        //花销最小且未走过的结点
                        if (arr[i][j] != 0 && arr[i][j] < minTemp && after[j] == 0) {
                            minNode = j;
                            shuidejiedian = i;
                            minTemp = arr[i][j];
                        }
                    }
                }
            }
            after[minNode] = 1;
            arr[shuidejiedian][minNode] = 0;
            min += minTemp;

            for (int i = 0; i < 4; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println("--");
        }
        min += arr[minNode][0];
        System.out.println(min);
    }


}
