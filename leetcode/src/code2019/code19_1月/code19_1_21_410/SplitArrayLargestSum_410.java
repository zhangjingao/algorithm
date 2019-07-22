package code2019.code19_1月.code19_1_21_410;

/**
 * @author zjg
 * <p> 2019/1/21 15:43 </p>
 */
public class SplitArrayLargestSum_410 {

    public int splitArray(int[] nums, int m) {
        long left = 0, right = 0;
        for (int n: nums) {
            right += n;
        }
        if (m == 1) {
            return (int)right;
        }
        long result = 0;
        long mid;
        while (left <= right) {
            mid = left+right >> 1;
            if (judge(mid, nums, m)) {
                result = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return (int)result;
    }

    private boolean judge(long mid, int[] nums, int m) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > mid) {
                return false;
            }
            if (sum + nums[i] > mid) {
                sum = nums[i];
                m--;
            } else {
                sum += nums[i];
            }
        }
        return m >= 1;
    }

    public static void main(String[] args) {
        /*System.out.println(
                new SplitArrayLargestSum_410().splitArray(new int[]{2,3,1,2,4,3}, 5)
        )*/;
    }

}
