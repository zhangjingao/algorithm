package code18_8_22_215;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2018/8/23 21:22 </p>
 */
public class KthLargestElementinanArray_215 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }


}
