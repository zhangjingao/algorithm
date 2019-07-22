package 随笔.面试.笔试.拼多多;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/6 19:02 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int k = sca.nextInt();
        int[] arr = new int[20000];
        int left, right;
        for (int i = 0; i < n; i++) {
            left = sca.nextInt();
            right = sca.nextInt();
            if (left < 0) {
                left = 0;
            }
            if (right < 0) {
                right = 0;
            }
            for (int j = left; j <= right; j++) {
                arr[j]++;
            }
        }
        List<int[]> list = new LinkedList<>();
        for (int i = 0; i <= 19999; i++) {
            if (arr[i] >= k) {
                int height = arr[i];
                int start = i;
                int end = i;
                for (int j = i + 1; j <= 19999; j++) {
                    if (arr[j] >= k && arr[j] == height) {
                        end = j;
                    } else {
                        break;
                    }
                }
                i = end + 1;
                list.add(new int[]{start, end});
            }
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            int[] arrTemp = list.get(i);
            System.out.println(arrTemp[0] +" " + arrTemp[1]);
        }
    }

}
