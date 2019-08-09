package sword_finger_offer;

import java.util.Arrays;

/**
 * @author zjg
 * @ClassName 排数组排成最小的数
 * @Description TODO
 * @Date 2019/8/7 19:34
 **/
public class 排数组排成最小的数 {

    public static void main(String[] args) {
        int[] arr = {91, 92, 49, 11, 13, 73, 18};
        sort(arr);

    }

    public static void sort (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (conpare(j, minIndex, arr)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean conpare(int j, int minIndex, int[] arr) {
        String a = String.valueOf(arr[j]).concat(String.valueOf(arr[minIndex]));
        String b = String.valueOf(arr[minIndex]).concat(String.valueOf(arr[j]));
        return Integer.valueOf(a) < Integer.valueOf(b);
    }


}
