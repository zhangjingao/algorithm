package 随笔.面试.笔试.网易;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/2 20:06 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int weight = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> queue = new ArrayList<>(n);
        for (int i = 0; i < n/2; i++) {
            queue.add(arr[i]);
            queue.add(arr[n-i-1]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (queue.get(i) + queue.get(i+1) <= weight) {
                i++;
            }
            count++;
        }
        System.out.println(count);
    }

}
