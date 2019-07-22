package 随笔.面试.面经;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/18 15:58 </p>
 */
public class 旋转数组 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length;
        int k = 3;
        int count = len;
        int i = 0, temp, tempValue = arr[i];
        while (count > 0) {
            if (i + k < len) {
                temp = arr[i + k];
                arr[i + k] = tempValue;
                i = i + k;
            } else {
                temp = arr[i + k - len];
                arr[i + k - len] = tempValue;
                i = i + k - len;
            }
            tempValue = temp;
            count--;
        }
        System.out.println(Arrays.toString(arr));

    }

}
