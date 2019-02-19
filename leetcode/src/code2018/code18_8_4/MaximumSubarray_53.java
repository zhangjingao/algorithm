package code2018.code18_8_4;

/**
 * @author zjg
 * @date 2018/8/4 15:02
 * @Description
 */
public class MaximumSubarray_53 {

    /*public int maxSubArray(int[] nums) {
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                maxSum = scollWindow(i, j, nums, maxSum);
            }
        }
        return maxSum;
    }

    private int scollWindow (int startIndex, int endIndex, int[] nums, int maxSum) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += nums[i];
        }
        return sum > maxSum ? sum : maxSum;
    }*/



    public static void main(String[] args) {
        int [] nums = {-1};
        int maxSum = new MaximumSubarray_53().maxSubArray(nums);
        System.out.println(maxSum);
    }

    public int maxSubArray(int[] nums) {
        int [] maxSum = new int[nums.length];
        maxSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSum[i] = maxSum[i-1] + nums[i] > nums[i] ? maxSum[i-1] + nums[i] : nums[i];
        }
        int maxSumValue = maxSum[0];
        for (int i = 0; i < maxSum.length; i++ ) {
            maxSumValue = maxSumValue > maxSum[i] ? maxSumValue : maxSum[i];
        }
        return maxSumValue;
    }
}
