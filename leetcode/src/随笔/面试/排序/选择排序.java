package 随笔.面试.排序;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/20 9:57 </p>
 */
public class 选择排序 {

    private static int[] arrSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,4,7,2,4,3,4,7};
        System.out.println(
                Arrays.toString(arrSort(arr))
        );
    }

}
