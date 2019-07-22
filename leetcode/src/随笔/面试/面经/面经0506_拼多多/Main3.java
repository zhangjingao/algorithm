package 随笔.面试.面经.面经0506_拼多多;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/6 16:17 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        Arrays.sort(arr);
        int index = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int sum;
        while (index < n/2) {
            sum = arr[index] + arr[n - index -1];
            max = sum > max ? sum : max;
            min = sum < min ? sum : min;
            index++;
        }
        System.out.println(max - min);
    }

}
