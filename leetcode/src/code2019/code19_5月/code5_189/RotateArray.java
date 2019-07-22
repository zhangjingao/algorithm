package code2019.code19_5月.code5_189;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/5/5 15:38 </p>
 */
public class RotateArray {

   /* public void rotate(int[] nums, int k) {
        if (k == 0 || nums.length <= 1) {
            return;
        }
        int[] arr = new int[k];
        int index = 0;
        int next;
        for (int i = 0; i < nums.length; i++) {
            index = index == k ? 0 : index;
            next = i + k >= nums.length ? (i + k) % nums.length : i + k;
            if (arr[index] == 0) {
                if (next <= nums.length) {
                    arr[index++] = nums[next];
                }
                nums[next] = nums[i];
            } else {
                int temp = nums[next];
                nums[next] = arr[index];
                if (next <= nums.length) {
                    arr[index++] = temp;
                }
            }
            System.out.println(Arrays.toString(nums)+" "+ Arrays.toString(arr));
        }
    }*/

    public void rotate(int[] nums, int k) {
        int[] arr = nums.clone();
        int next;
        for (int i = 0; i < nums.length; i++) {
            next = k + i >= nums.length ? (k + i) % nums.length : k + i;
            nums[next] = arr[i];
        }
    }


    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 5, 6};
        new RotateArray().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));

    }

}
