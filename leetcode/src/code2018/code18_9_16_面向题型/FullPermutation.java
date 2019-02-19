package code2018.code18_9_16_面向题型;

/**
 *
 * 全排列
 * @author zjg
 * <p> 2018/9/16 9:06 </p>
 *
 */

public class FullPermutation {

    static int count = 0;

    private static void permutation (int [] arr, int index) {
        if (index == arr.length-1) {
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
            count++;
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permutation(arr, index+1);
            swap(arr, i, index);
        }
    }

    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        permutation(arr, 0);
        System.out.println(count);
    }


}
