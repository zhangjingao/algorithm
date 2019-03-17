package 随笔.面试.笔试.科大讯飞;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/2/23 14:27 </p>
 */
public class Main1Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int A = sca.nextInt();
        int B = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        int[] arrsResplace = Arrays.copyOf(arr, n);
        Arrays.sort(arrsResplace);
        int mid = 0;
        int[] indexs = new int[n];
        if (A <= B) {
            mid = arrsResplace[B];
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= mid && num < B) {
                    indexs[i] = 2;

                    num++;
                } else {
                    indexs[i] = 1;
                }
            }
        } else {
            mid = arrsResplace[A];
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= mid && num < A) {
                    indexs[i] = 1;
                    num++;
                } else {
                    indexs[i] = 2;
                }
            }

        }

        for (int i : indexs) {
            System.out.print(i+" ");
        }

    }


}
