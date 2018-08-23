package code18_8_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/11 15:13
 * @Description
 */
public class SetMismatch_645 {

    public int[] findErrorNums(int[] nums) {
        int [] arr = new int[2];

        int len = nums.length;
        arr[0] = sort(nums);

        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] != i+1) {
                if (i < len-1 && nums[i+1] == i+1) {
                    continue;
                }
                arr[1] = i+1;
                break;
            }
        }
        return arr;
    }

    private int sort (int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int []result = new SetMismatch_645().findErrorNums(new int[]{1,1});
        System.out.println(result[0]+" "+result[1]);
    }

}
