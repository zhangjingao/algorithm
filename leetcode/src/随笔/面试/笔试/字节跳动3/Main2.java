package 随笔.面试.笔试.字节跳动3;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/15 16:09
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sca.nextInt();
            arr[i][1] = sca.nextInt();
        }
        work(arr, n);
    }

    private static void work(int[][] arr, int n) {
        int beforeC = 0;
        int maxC = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            //当前累计作业
            int currC = arr[i][1] + beforeC;
            maxC = currC > maxC ? currC : maxC;
            int temp = currC;
            if (i != n - 1) {
                temp = temp - (arr[i + 1][0] - arr[i][0]);
            }
            beforeC = temp > 0 ? temp : 0;
//            System.out.println(currC +" "+ maxC +" "+beforeC);
        }
        System.out.println((arr[n-1][0] + beforeC) + " " + maxC);
    }

}
