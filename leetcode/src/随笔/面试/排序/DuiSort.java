import java.util.Arrays;

/**
 * 堆排序
 */
public class DuiSort {


    public static void sort (int[] arr, int curr, int len) {
        if (curr >= len) {
            return;
        }
        //建堆
        int max = curr;
        int leftChild = curr * 2 + 1;
        int rightChild = curr * 2 + 2;

        if (leftChild < len) {
            max = arr[max] > arr[leftChild] ? max : leftChild;
        }
        if (rightChild < len) {
            max = arr[max] > arr[rightChild] ? max : rightChild;
        }

        if (max != curr) {
            int temp = arr[max];
            arr[max] = arr[curr];
            arr[curr] = temp;
            sort(arr, max, len);
        }

    }

    public static void maxHeapify (int[] arr, int size) {
        for (int i = size - 1; i >= 0; i--) {
            sort(arr, i,size);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,3,1,12,9,5,4};
        for (int i = 0; i < arr.length; i++) {

            //每次建堆就可以排除一个元素了
            maxHeapify(arr, arr.length - i);

            //交换
            int temp = arr[0];
            arr[0] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }


}
