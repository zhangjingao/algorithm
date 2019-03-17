package 随笔.面试.排序;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/20 8:49 </p>
 */
public class 计数排序 {

    private static int[] countSort (int[] arr) {
        int min=arr[0],max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int len = max - min + 1;
        int[] arrB = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arrB[arr[i]-min]++;
        }
        int index = 0;
        for (int i = 0; i < arrB.length; i++) {
            while (arrB[i]-- > 0) {
                arr[index++] = i+min;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,4,7,2,4,3,4,7};
        System.out.println(
                Arrays.toString(countSort(arr))
        );
    }

}
