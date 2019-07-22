package code2019.code19_7.code6_128;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/7/6 16:24 </p>
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int len = 1;
        int index = -1;
        int tempLen = 1;
        while (++index < nums.length - 1) {
            if (nums[index] == nums[index+1]) {
                continue;
            }
            if (nums[index] + 1 == nums[index+1]) {
                tempLen++;
            } else {
                if (tempLen > len) {
                    len = tempLen;
                }
                tempLen = 1;
            }
        }
        if (tempLen > len) {
            len = tempLen;
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1};
        new LongestConsecutiveSequence().longestConsecutive(arr);
    }

}
