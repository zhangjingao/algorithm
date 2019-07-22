package code2019.code19_7.code6_303;

/**
 * @author zjg
 * <p> 2019/7/6 16:59 </p>
 */
public class NumArray {

    int[] nums = null;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k < j; k++) {
            sum += nums[k];
        }
        return sum;
    }


}
