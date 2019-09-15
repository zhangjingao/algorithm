package 随笔.面试.笔试.同城58;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/12 20:44
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        if (n == 1) {
            System.out.println(1);
        }
        work(arr);
    }

    private static void work(int[] arr) {

        int[] bingan = new int[arr.length];
        bingan[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                bingan[i] = bingan[i - 1] + 1;
            } else {
                bingan[i] = 1;
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1] && bingan[j - 1] <= bingan[j]) {
                        bingan[j - 1] = bingan[j] + 1;
                    } else {
                        break;
                    }
                }
//                System.out.println(Arrays.toString(bingan)+"---"+ i);
            }
        }
        int result = 0;
        for (int value : bingan) {
//            System.out.print(value+" ");
            result += value;
        }
        System.out.println(result);
    }

}
