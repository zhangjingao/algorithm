package 随笔.面试.笔试.有赞;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;



/**
 * 80
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/10/8 19:16
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        work(arr, n);
    }

    private static void work(int[] arr, int n) {
        int minStep = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        if (arr[n - 1] - arr[0] == 0) {
            System.out.println(0);
            return;
        }
        int tempIndex = 0;
        int firstDisten = 0;
        if (arr[n - 1] - arr[0] == 1) {
            firstDisten++;
        }
        while (min != 0) {
            int minElem1 = getMinElem(arr);
            int maxElem1 = getMaxElem(arr);
            arr[minElem1]++;
            arr[maxElem1]--;
            int minElem = getMinElem(arr);
            int maxElem = getMaxElem(arr);
            int temp = arr[maxElem] - arr[minElem];
            tempIndex++;
            if (temp < min) {
                min = temp;
                minStep = tempIndex;
            }
            if (temp == 1 || temp == -1) {
                firstDisten++;
            }
//            System.out.println(Arrays.toString(arr)+" "+ temp+" "+firstDisten);
            if (firstDisten == 2) {
                minStep = tempIndex - 1;
                break;
            }
        }
        System.out.println(minStep);
    }

    private static int getMaxElem(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int getMinElem(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

}
