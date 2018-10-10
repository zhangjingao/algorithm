package code18_10_6;

/**
 * @author zjg
 * <p> 2018/10/6 15:12 </p>
 */
public class SingleNumber_136 {

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            int j = i+1;
            for (; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 0;
                    break;
                }
            }
            if (j == nums.length) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

}
