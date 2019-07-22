package 随笔.面试.排序;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/20 16:41 </p>
 */
public class 插入排序 {

    private static int[] arrSort (int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[index]) {
                    swap(arr, index, j);
                    index = j;
                } else {
                    break;
                }
            }
        }
        return arr;
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
