package 随笔.面试.排序;

import java.util.Arrays;

/**
 * @author zjg
 * @ClassName 堆排序
 * @Description TODO
 * @Date 2019/9/1 9:09
 **/
public class 堆排序 {

    public static void main(String[] args) {
        int[] arr = {10,3,1,12,9,5,4};
        for (int i = 0; i < arr.length; i++) {
            createHeap(arr, arr.length - i);
            int temp = arr[0];
            arr[0] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void createHeap(int[] arr, int size) {
        for (int i = size - 1; i >= 0; i--) {
            maxHead(arr, i, size);
        }

    }

    private static void maxHead(int[] arr, int curr, int size) {
        if (curr >= size) {
            return;
        }
        //建堆
        int max = curr;
        int leftChild = curr * 2 + 1;
        int rightChild = curr * 2 + 2;

        if (leftChild < size) {
            max = arr[max] > arr[leftChild] ? max : leftChild;
        }
        if (rightChild < size) {
            max = arr[max] > arr[rightChild] ? max : rightChild;
        }

        if (max != curr) {
            int temp = arr[curr];
            arr[curr] = arr[max];
            arr[max] = temp;
            maxHead(arr, max, size);
        }
    }

}
