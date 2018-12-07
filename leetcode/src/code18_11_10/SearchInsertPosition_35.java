package code18_11_10;

/**
 * @author zjg
 * <p> 2018/11/10 16:06 </p>
 */
public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

}
