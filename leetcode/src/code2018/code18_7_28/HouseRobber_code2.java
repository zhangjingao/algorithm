package code2018.code18_7_28;

/**
 * @author zjg
 * @date 2018/7/28 18:52
 * @Description
 */
public class HouseRobber_code2 {


    public int rob(int[] nums) {
        int len = nums.length;
        if (nums.length == 0) {
            return 0;
        } else if (nums .length == 1) {
            return nums[0];
        }
        int [] arr = new int[len];
        arr[0] = nums[0];
        arr[1] = nums[1] > nums[0] ? nums[1] : nums[0];
        for (int i = 2; i < len; i++) {
            arr[i] = Math.max(nums[i]+arr[i-2],arr[i-1]);
        }
        return arr[len-1];
    }

    public static void main(String[] args) {
        System.out.println(
                new HouseRobber_code2().rob(new int[]{1,1,1}));
    }

}
