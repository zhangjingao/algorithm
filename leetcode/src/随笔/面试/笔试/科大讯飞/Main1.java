package 随笔.面试.笔试.科大讯飞;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/2/23 14:27 </p>
 */
public class Main1 {

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
        int[] indexs = new int[n];
        for (int i = 0; i < arrsResplace.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arrsResplace[i]) {
                    arr[j] = -1;
                    if (i < A) {
                        indexs[j] = 1;
                    } else {
                        indexs[j] = 2;
                    }
                    break;
                }
            }
        }
        for (int i : indexs) {
            System.out.print(i+" ");
        }

    }


}
