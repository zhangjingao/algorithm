package code18_9_16_面向题型;

import java.util.Arrays;

/**
 * 快速排序
 * 思想：
 *  选定一基准值，将比其小的放到左边，比其大的放到右边，重复此步骤
 * @author zjg
 * <p> 2018/10/6 17:55 </p>
 */
public class QuickSort {


    private static void sort (int [] arr, int left, int right) {
        if (left < right) {
            int i = left,j = right;
            int index = arr[left];
            while (i < j) {
                while (i < j && arr[j] >= index) {
                    j--;
                }
                if (i < j) {
                    arr[i++] = arr[j];
                }
                while (i < j && arr[i] <= index) {
                    i++;
                }
                if (i < j) {
                    arr[j--] = arr[i];
                }
            }
            arr[i] = index;
            sort(arr, left, i-1);
            sort(arr, i+1, right);
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,8,2,4,7,3,5};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


}
