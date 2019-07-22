package 随笔.面试.笔试.度小满;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/28 20:21 </p>
 */
public class Main {

    static int sum = 0, swap = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        work(arr, 0);
        System.out.println(sum + " " + swap);
    }

    private static void work(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        int start = index, end = index;
        while (index + 1 < arr.length) {
            //如果小于开头，那么跳出，是一段内容
            if (arr[index + 1] >= arr[start]) {
                end = index + 1;
                break;
            } else {
                index++;
            }
        }
//        System.out.println(start + " " + end + " "  + sum + " " + swap);
        if (start != end) {
            int min = arr[start];
            int max = arr[end];
            for (int i = start; i <= end; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
//            System.out.println(min +"----"+ max);
            swap += 2;
            sum += max - min;
        }
        if (index + 1 < arr.length) {
            work(arr, end + 1);
        }
    }


}
