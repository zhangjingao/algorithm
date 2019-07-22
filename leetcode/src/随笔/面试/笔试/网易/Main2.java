package 随笔.面试.笔试.网易;

import java.util.Scanner;

/**
 * 46.15%
 * @author zjg
 * <p> 2019/4/2 19:40 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        zuhe(arr);
    }

    private static void zuhe(int[] arr) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i+1; j < len-1; j++) {
                for (int k = j+1; k < len; k++) {
                    if (judge(arr[i], arr[j], arr[k])) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean judge (int a, int b, int c) {
        int min = a < b ? a : b;
        min = min < c ? min : c;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                return false;
            }
        }
        return true;
    }


}
