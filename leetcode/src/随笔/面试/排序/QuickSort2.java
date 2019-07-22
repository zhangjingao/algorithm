package 随笔.面试.排序;


import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/7/8 15:10 </p>
 */
public class QuickSort2 {


    private int[] quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = match(arr, left, right);
            sort(arr, left, mid - 1);
            sort(arr, mid + 1, right);
        }

    }

    private int match(int[] arr, int left, int right) {
        int mid = left;
        int leftTemp = mid + 1;
        for (int i = leftTemp; i < right; i++) {
            if (arr[i] < arr[mid]) {
                swap(arr, i, leftTemp++);
            }
        }
        swap(arr, mid, leftTemp - 1);
        return leftTemp - 1;
    }


    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 8, 2, 6, 4};
        System.out.println(
                Arrays.toString(new QuickSort2().quickSort(arr))
        );
    }

}
