package code2019.code19_8;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main
 * @Description TODO
 * @Date 2019/8/9 15:52
 **/
public class Main {

    private static int total = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int[] arr = new int[n];
        int[] ww = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        for (int i = 0; i < m; i++) {
            work(i, 0, i , arr, m, n, ww);
        }
        System.out.println(total);
    }

    private static void work(int start, int index, int step, int[] arr, int m, int n,int[] ww) {
        if (index == n) {
            if (ww[start] == 0) {
                total++;
                ww[start] = 1;
            }
            return;
        }
        //判断是否可向左
        if (step >= arr[index]) {
            work(start, index + 1, step - arr[index], arr, m, n,ww);
        }
        //是否向右
        if (step + arr[index] <  m) {
            work(start,index + 1, step + arr[index], arr, m, n,ww);
        }
    }


}
