package code2019.code19_8.code9_179;

/**
 * @author zjg
 * @ClassName LargestNumber
 * @Description TODO
 * @Date 2019/8/9 16:27
 **/
public class LargestNumber {

    public String largestNumber(int[] nums) {
        if (nums.length == 0) {
            return "0";
        }
        for (int i = 0; i < nums.length; i++) {
            int max = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (compare(nums, max, j)) {
                    max = j;
                }
            }
            if (max != i) {
                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : nums) {
            stringBuilder.append(a);
        }
        String result = stringBuilder.toString();
        if (result.startsWith("0")) {
            return "0";
        }
        return result;
    }

    private boolean compare(int[] nums, int max, int j) {
        long maxNow = Long.parseLong(nums[max]+""+nums[j]);
        long now = Long.parseLong(nums[j]+""+nums[max]);
        return maxNow < now;
    }


}
