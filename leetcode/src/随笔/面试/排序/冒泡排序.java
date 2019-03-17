package 随笔.面试.排序;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/20 9:49 </p>
 */
public class 冒泡排序 {

    private static int[] arrSort (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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
