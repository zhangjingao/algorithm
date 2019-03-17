package 随笔.面试.排序;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/20 10:32 </p>
 */
public class 快速排序 {

    /**
     * 采用分治策略
     *
     * 性能分析：
     * 平均状况下：O(nlogn)次比较
     * 最坏状况：O（n^2）次比较
     *
     */

    private static int[] arrSort (int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partion(arr, left, right);
            sort(arr, left, index - 1);
            sort(arr, index + 1, right);
        }
    }

    private static int partion (int[] arr, int left, int right) {
        int mid = left;
        int leftTemp = mid + 1;
        for (int i = leftTemp; i <= right; i++) {
            if (arr[i] < arr[mid]) {
                swap(arr, i, leftTemp++);
            }
        }
        swap(arr, mid, leftTemp-1);
        return leftTemp-1;
    }

    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,4,7,2,4,3,4,7};
        System.out.println(
                Arrays.toString(arrSort(arr))
        );
    }


}
