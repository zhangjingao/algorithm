package code2019.code19_2_25_26;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/25 20:11 </p>
 */
public class RemoveDuplicatesfromSortedArray_26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        int[] arr = {1,1,2};
        System.out.println(
            new RemoveDuplicatesfromSortedArray_26().removeDuplicates(arr)
        );
    }

}
