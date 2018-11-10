package code18_11_3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjg
 * <p> 2018/11/3 15:18 </p>
 */
public class MajorityElement_169 {

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length / 2;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                int temp = count.get(num) + 1;
                count.put(num, temp);
                if (count.get(num) > n) {
                    return num;
                }
            } else {
                count.put(num, 1);
            }
        }
        return 0;
    }

 /*
    leetcode大佬代码
    public int majorityElement(int[] nums) {
        int item = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == item) {
                count++;
            } else {
                if (count == 1) {
                    item = nums[i];
                } else {
                    count--;
                }
            }
        }
        return item;
    }*/

    public static void main(String[] args) {
        System.out.println(
                new MajorityElement_169().majorityElement(new int[]{2, 2, 1, 1, 3, 4, 1})
        );
    }

}
