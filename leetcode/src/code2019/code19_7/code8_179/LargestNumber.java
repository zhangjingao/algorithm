package code2019.code19_7.code8_179;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/7/8 10:26 </p>
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        int len = nums.length;
        StringBuilder result = new StringBuilder();
        int[][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {
            char[] temp = String.valueOf(nums[i]).toCharArray();
            int max = 0;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] - '0' > max) {
                    max = temp[j] - '0';
                }
            }
            arr[i][0] = max;
            arr[i][1] = i;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < len; i++) {
            int max = arr[i][0];
            int maxIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j][0] > max) {
                    max = arr[j][0];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int[] temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;

            }
        }
        for (int i = 0; i < len; i++) {
            result.append(nums[arr[i][1]]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        System.out.println(new LargestNumber().largestNumber(arr));
    }

}
