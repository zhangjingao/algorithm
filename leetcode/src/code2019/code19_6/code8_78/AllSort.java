package code2019.code19_6.code8_78;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/6/8 11:05 </p>
 */
public class AllSort {


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        allSort(arr, 0);
    }

    private static void allSort(int[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index , i);
                allSort(arr, index+1);
                swap(arr, index , i);
            }

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
