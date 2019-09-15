package 随笔.面试.排序;

import java.util.Arrays;

/**
 * @author zjg
 * @ClassName 快排
 * @Description TODO
 * @Date 2019/8/31 22:04
 **/
public class 快排 {

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 8, 4, 6};
        work(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void work(int[] arr) {
        sort(0, arr.length - 1, arr);
    }

    private static void sort(int left, int right, int[] arr) {
        if (left <= right) {
            int mid = lookMid(left, right, arr);
            sort(left, mid - 1, arr);
            sort(mid + 1, right, arr);
        }

    }

    private static int lookMid(int left, int right, int[] arr) {
        int mid = left;
        int leftTemp = mid + 1;
        for (int i = leftTemp; i <= right; i++) {
            if (arr[i] < arr[mid]) {
                swap(leftTemp++, i, arr);
            }
        }
        swap(mid, leftTemp - 1, arr);
        return leftTemp - 1;
    }

    private static void swap(int mid, int index, int[] arr) {
        int temp = arr[index];
        arr[index] = arr[mid];
        arr[mid] = temp;
    }


}
