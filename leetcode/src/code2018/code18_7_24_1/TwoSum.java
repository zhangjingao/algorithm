package code2018.code18_7_24_1;

/**
 * @author zjg
 * @date 2018/7/24 20:08
 * @Description
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target ) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
