package 随笔.面试.笔试.面经_字节跳动;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/2/28 22:10 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        int num = sca.nextInt();
        for (int i = 0; i < num; i++) {
            count(arr,sca.nextInt(), sca.nextInt(), sca.nextInt());
        }

    }

    private static void count(int[] arr, int l, int r, int k) {
        int counr = 0;
        for (int i = l -1; i < r; i++) {
            if (arr[i] == k) {
                counr++;
            }
        }
        System.out.println(counr);
    }

}
